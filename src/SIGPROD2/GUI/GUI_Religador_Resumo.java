package SIGPROD2.GUI;

import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Auxiliar.Grafico;
import SIGPROD2.DAO.ReligadorDao;
import SIGPROD2.Modelo.PontoCurva;
import SIGPROD2.Modelo.Religador;
import SIGPROD2.Modelo.ReligadorDigital;
import SIGPROD2.Modelo.ReligadorEletromecanico;
import SIGPROD2.Modelo.Tabelas.CaracteristicasTableModel;
import SIGPROD2.Modelo.Tabelas.PontoCurvaTableModel;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author rafael
 * @version 25/04/2016
 */
public class GUI_Religador_Resumo extends javax.swing.JDialog {

    private CaracteristicasTableModel modeloFaseCaracteristicas;
    private CaracteristicasTableModel modeloNeutroCaracteristicas;
    private PontoCurvaTableModel modeloFasePontoCurva;
    private PontoCurvaTableModel modeloNeutroPontoCurva;
    private final Religador religador;
    private final boolean digital;

    public GUI_Religador_Resumo(java.awt.Frame parent, boolean modal, Religador religador) {
        super(parent, modal);
        this.religador = religador;
        this.digital = religador.isDigital();
        this.initComponents();
        this.configurarTabelas();
        this.configurarCardLayout();
        this.carregarInformacoesReligador();
    }

    private void configurarTabelas() {
        this.configurarTabelasDigitais();
        this.configurarTabelasEletromecanicas();
    }

    private void configurarTabelasDigitais() {
        this.modeloFaseCaracteristicas = new CaracteristicasTableModel();
        this.modeloNeutroCaracteristicas = new CaracteristicasTableModel();

        this.tabelaCaracteristicasFase.setModel(this.modeloFaseCaracteristicas);
        this.tabelaCaracteristicasNeutro.setModel(this.modeloNeutroCaracteristicas);
    }

    private void configurarTabelasEletromecanicas() {
        this.modeloFasePontoCurva = new PontoCurvaTableModel();
        this.modeloNeutroPontoCurva = new PontoCurvaTableModel();

        this.tabelaPontoCurvaFase.setModel(this.modeloFasePontoCurva);
        this.tabelaPontoCurvaNeutro.setModel(this.modeloNeutroPontoCurva);
        this.tabelaPontoCurvaFase.setEnabled(false);
        this.tabelaPontoCurvaNeutro.setEnabled(false);
    }

    private void configurarCardLayout() {
        CardLayout card1 = (CardLayout) this.PanelItens.getLayout();
        card1.addLayoutComponent(this.panelDigital, "panelDigital");
        card1.addLayoutComponent(this.panelEletromecanico, "panelEletromecanico");
        if (this.digital) {
            card1.show(this.PanelItens, "panelDigital");
        } else {
            card1.show(this.PanelItens, "panelEletromecanico");
        }
    }

    private void carregarInformacoesReligador() {
        this.labelFabricante.setText(this.religador.getFabricante());
        this.labelModelo.setText(this.religador.getModelo());
        if (this.digital) {
            this.setTitle("Religador Digital");
            this.carregarInformacoesReligadorDigital();
        } else {
            this.setTitle("Religador Eletromecânico");
            this.carregarInformacoesReligadorEletromecanico();
        }
    }

    private void carregarInformacoesReligadorDigital() {
        ReligadorDigital religadorDigital = (ReligadorDigital) this.religador;

        if (this.religador.existeCurva(Religador.INVERSA_FASE)) {
            this.labelFatorInversaFaseDigital.setText(String.valueOf(this.religador.getFatorInicio(Religador.INVERSA_FASE)));
            this.carregarCorrentePickupDigital(religadorDigital, Religador.INVERSA_FASE);
            this.carregarTemposDigital(religadorDigital, Religador.INVERSA_FASE);
            this.carregaTabelaDigitais(religadorDigital, Religador.INVERSA_FASE);
        } else {
            for (Component c : this.panelInversaFaseDigital.getComponents()) {
                c.setEnabled(false);
            }
        }
        if (this.religador.existeCurva(Religador.INVERSA_NEUTRO)) {
            this.labelFatorInversaNeutroDigital.setText(String.valueOf(this.religador.getFatorInicio(Religador.INVERSA_NEUTRO)));
            this.carregarCorrentePickupDigital(religadorDigital, Religador.INVERSA_NEUTRO);
            this.carregarTemposDigital(religadorDigital, Religador.INVERSA_NEUTRO);
            this.carregaTabelaDigitais(religadorDigital, Religador.INVERSA_NEUTRO);

        } else {
            for (Component c : this.panelInversaNeutroDigital.getComponents()) {
                c.setEnabled(false);
            }
        }
        if (this.religador.existeCurva(Religador.DEFINIDO_FASE)) {
            this.labelFatorDefinidaFaseDigital.setText(String.valueOf(this.religador.getFatorInicio(Religador.DEFINIDO_FASE)));
            this.carregarCorrentePickupDigital(religadorDigital, Religador.DEFINIDO_FASE);
            this.carregarTemposDigital(religadorDigital, Religador.DEFINIDO_FASE);

        } else {
            for (Component c : this.panelDefinidaFaseDigital.getComponents()) {
                c.setEnabled(false);
            }
        }
        if (this.religador.existeCurva(Religador.DEFINIDO_NEUTRO)) {
            this.labelFatorDefinidaNeutroDigital.setText(String.valueOf(this.religador.getFatorInicio(Religador.DEFINIDO_NEUTRO)));
            this.carregarCorrentePickupDigital(religadorDigital, Religador.DEFINIDO_NEUTRO);
            this.carregarTemposDigital(religadorDigital, Religador.DEFINIDO_NEUTRO);
        } else {
            for (Component c : this.panelDefinidaNeutroDigital.getComponents()) {
                c.setEnabled(false);
            }
        }
    }

    private void carregarInformacoesReligadorEletromecanico() {
        ReligadorEletromecanico religadorMecanico = (ReligadorEletromecanico) this.religador;

        if (this.religador.existeCurva(Religador.INVERSA_FASE)) {
            this.labelFatorInversaFaseMecan.setText(String.valueOf(this.religador.getFatorInicio(Religador.INVERSA_FASE)));
            this.carregarCorrentesInversaEletromecanico(religadorMecanico, Religador.INVERSA_FASE);
        } else {
            for (Component c : this.panelInversaFaseEletromecanico.getComponents()) {
                c.setEnabled(false);
            }
        }
        if (this.religador.existeCurva(Religador.INVERSA_NEUTRO)) {
            this.labelFatorInversaNeutroMecan.setText(String.valueOf(this.religador.getFatorInicio(Religador.INVERSA_NEUTRO)));
            this.carregarCorrentesInversaEletromecanico(religadorMecanico, Religador.INVERSA_NEUTRO);
        } else {
            for (Component c : this.panelInversaNeutroEletromecanico.getComponents()) {
                c.setEnabled(false);
            }
        }
        if (this.religador.existeCurva(Religador.DEFINIDO_FASE)) {
            this.labelFatorDefinidaFaseMecan.setText(String.valueOf(this.religador.getFatorInicio(Religador.DEFINIDO_FASE)));
            this.carregarCorrentesDefinidaEletromecanico(religadorMecanico, Religador.DEFINIDO_FASE);
            this.carregarTemposDeAtuacaoEletromecanico(religadorMecanico, Religador.DEFINIDO_FASE);
        } else {
            for (Component c : this.panelDefinidaFaseEletromecanico.getComponents()) {
                c.setEnabled(false);
            }
        }
        if (this.religador.existeCurva(Religador.DEFINIDO_NEUTRO)) {
            this.labelFatorDefinidaNeutroMecan.setText(String.valueOf(this.religador.getFatorInicio(Religador.DEFINIDO_NEUTRO)));
            this.carregarCorrentesDefinidaEletromecanico(religadorMecanico, Religador.DEFINIDO_NEUTRO);
            this.carregarTemposDeAtuacaoEletromecanico(religadorMecanico, Religador.DEFINIDO_NEUTRO);
        } else {
            for (Component c : this.panelDefinidaNeutroEletromecanico.getComponents()) {
                c.setEnabled(false);
            }
        }
    }

    private void carregarCorrentePickupDigital(ReligadorDigital religadorDigital, int tipo) {
        switch (tipo) {
            case Religador.INVERSA_FASE:
                this.labelPickupMinimoInversaFase.setText(String.valueOf(religadorDigital.getCorrenteMin(tipo)));
                this.labelPickupMaximoInversaFase.setText(String.valueOf(religadorDigital.getCorrenteMax(tipo)));
                this.labelPickupPassoInversaFase.setText(String.valueOf(religadorDigital.getCorrentePasso(tipo)));
                break;
            case Religador.INVERSA_NEUTRO:
                this.labelPickupMinimoInversaNeutro.setText(String.valueOf(religadorDigital.getCorrenteMin(tipo)));
                this.labelPickupMaximoInversaNeutro.setText(String.valueOf(religadorDigital.getCorrenteMax(tipo)));
                this.labelPickupPassoInversaNeutro.setText(String.valueOf(religadorDigital.getCorrentePasso(tipo)));
                break;
            case Religador.DEFINIDO_FASE:
                this.labelPickupMinimoDefinidaFase.setText(String.valueOf(religadorDigital.getCorrenteMin(tipo)));
                this.labelPickupMaximoDefinidaFase.setText(String.valueOf(religadorDigital.getCorrenteMax(tipo)));
                this.labelPickupPassoDefinidaFase.setText(String.valueOf(religadorDigital.getCorrentePasso(tipo)));
                break;
            case Religador.DEFINIDO_NEUTRO:
                this.labelPickupMinimoDefinidaNeutro.setText(String.valueOf(religadorDigital.getCorrenteMin(tipo)));
                this.labelPickupMaximoDefinidaNeutro.setText(String.valueOf(religadorDigital.getCorrenteMax(tipo)));
                this.labelPickupPassoDefinidaNeutro.setText(String.valueOf(religadorDigital.getCorrentePasso(tipo)));
                break;
            default:
                break;
        }
    }

    private void carregarTemposDigital(ReligadorDigital religadorDigital, int tipo) {
        boolean rapida;
        switch (tipo) {
            case Religador.INVERSA_FASE:
                rapida = this.botaoInversaFaseRapidaDigital.isSelected();
                this.labelTempoMaximoInversaFase.setText(String.valueOf(religadorDigital.getTempoMax(tipo, rapida)));
                this.labelTempoMinimoInversaFase.setText(String.valueOf(religadorDigital.getTempoMin(tipo, rapida)));
                this.labelTempoPassoInversaFase.setText(String.valueOf(religadorDigital.getTempoPasso(tipo, rapida)));
                break;
            case Religador.INVERSA_NEUTRO:
                rapida = this.botaoInversaNeutroRapidaDigital.isSelected();
                this.labelTempoMaximoInversaNeutro.setText(String.valueOf(religadorDigital.getTempoMax(tipo, rapida)));
                this.labelTempoMinimoInversaNeutro.setText(String.valueOf(religadorDigital.getTempoMin(tipo, rapida)));
                this.labelTempoPassoInversaNeutro.setText(String.valueOf(religadorDigital.getTempoPasso(tipo, rapida)));
                break;
            case Religador.DEFINIDO_FASE:
                rapida = this.botaoDefinidaFaseRapidaDigital.isSelected();
                this.labelTempoDefinidoFaseMaximo.setText(String.valueOf(religadorDigital.getTempoMax(tipo, rapida)));
                this.labelTempoDefinidoFaseMinimo.setText(String.valueOf(religadorDigital.getTempoMin(tipo, rapida)));
                this.labelTempoDefinidoFasePasso.setText(String.valueOf(religadorDigital.getTempoPasso(tipo, rapida)));
                break;
            case Religador.DEFINIDO_NEUTRO:
                rapida = this.botaoDefinidaNeutroRapidaDigital.isSelected();
                this.labelTempoDefinidoNeutroMaximo.setText(String.valueOf(religadorDigital.getTempoMax(tipo, rapida)));
                this.labelTempoDefinidoNeutroMinimo.setText(String.valueOf(religadorDigital.getTempoMin(tipo, rapida)));
                this.labelTempoDefinidoNeutroPasso.setText(String.valueOf(religadorDigital.getTempoPasso(tipo, rapida)));
                break;
            default:
                break;
        }
    }

    private void carregarTemposDeAtuacaoEletromecanico(ReligadorEletromecanico religadorMecanico, int tipo) {
        DefaultListModel<Double> modelo;
        boolean rapida;
        if (tipo == Religador.DEFINIDO_FASE) {
            rapida = botaoDefinidaFaseRapidaEletromecanica.isSelected();
            modelo = (DefaultListModel<Double>) this.listaTempoDefinidaFase.getModel();

        } else {
            rapida = botaoDefinidaNeutroRapidaEletromecanica.isSelected();
            modelo = (DefaultListModel<Double>) this.listaTempoDefinidaNeutro.getModel();
        }
        religadorMecanico.getTempoAtuacao(tipo, rapida).forEach(corrente -> {
            modelo.addElement(corrente);
        });
    }

    private void carregarCorrentesDefinidaEletromecanico(ReligadorEletromecanico religadorMecanico, int tipo) {
        DefaultListModel<Double> modelo;
        if (tipo == Religador.DEFINIDO_FASE) {
            modelo = (DefaultListModel<Double>) this.listaPickupDefinidaFase.getModel();

        } else {
            modelo = (DefaultListModel<Double>) this.listaPickupDefinidaNeutro.getModel();
        }
        religadorMecanico.getCorrentePickup(tipo).forEach(corrente -> {
            modelo.addElement(corrente);
        });
    }

    private void carregarCorrentesInversaEletromecanico(ReligadorEletromecanico religadorMecanico, int tipo) {
        religadorMecanico.getCorrentePickup(tipo).forEach(corrente -> {
            if (tipo == Religador.INVERSA_FASE) {
                this.listaPickupInversaFase.addItem(corrente);
            } else {
                this.listaPickupInversaNeutro.addItem(corrente);
            }
        });
    }

    private void carregaTabelaDigitais(ReligadorDigital religadorDigital, int tipo) {
        boolean rapida;
        switch (tipo) {
            case Religador.INVERSA_FASE:
                rapida = this.botaoInversaFaseRapidaDigital.isSelected();
                this.modeloFaseCaracteristicas.add(rapida ? religadorDigital.getListaRapidaFase() : religadorDigital.getListaLentaFase());
                this.modeloFaseCaracteristicas.fireTableDataChanged();
                break;
            case Religador.INVERSA_NEUTRO:
                rapida = this.botaoInversaNeutroRapidaDigital.isSelected();
                this.modeloNeutroCaracteristicas.add(rapida ? religadorDigital.getListaRapidaNeutro() : religadorDigital.getListaLentaNeutro());
                this.modeloNeutroCaracteristicas.fireTableDataChanged();
                break;
            default:
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoInversaFaseEletromecanica = new javax.swing.ButtonGroup();
        grupoInversaNeutroEletromecanica = new javax.swing.ButtonGroup();
        grupoDefinidaNeutroEletromecanica = new javax.swing.ButtonGroup();
        grupoDefinidaFaseEletromecanica = new javax.swing.ButtonGroup();
        grupoInversaNeutroDigital = new javax.swing.ButtonGroup();
        grupoInversaFaseDigital = new javax.swing.ButtonGroup();
        grupoDefinidaFaseDigital = new javax.swing.ButtonGroup();
        grupoDefinidaNeutroDigital = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelFabricante = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        PanelItens = new javax.swing.JPanel();
        panelDigital = new javax.swing.JPanel();
        panelInversaFaseDigital = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelFatorInversaFaseDigital = new javax.swing.JLabel();
        labelPickupMinimoInversaFase = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelPickupMaximoInversaFase = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelPickupPassoInversaFase = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        labelTempoPassoInversaFase = new javax.swing.JLabel();
        labelTempoMaximoInversaFase = new javax.swing.JLabel();
        labelTempoMinimoInversaFase = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaCaracteristicasFase = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        botaoInversaFaseRapidaDigital = new javax.swing.JRadioButton();
        botaoInversaFaseLentaDigital = new javax.swing.JRadioButton();
        panelDefinidaFaseDigital = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        labelPickupMaximoDefinidaFase = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        labelPickupMinimoDefinidaFase = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        labelPickupPassoDefinidaFase = new javax.swing.JLabel();
        labelFatorDefinidaFaseDigital = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        labelTempoDefinidoFaseMinimo = new javax.swing.JLabel();
        labelTempoDefinidoFaseMaximo = new javax.swing.JLabel();
        labelTempoDefinidoFasePasso = new javax.swing.JLabel();
        botaoDefinidaFaseRapidaDigital = new javax.swing.JRadioButton();
        botaoDefinidaFaseLentaDigital = new javax.swing.JRadioButton();
        panelInversaNeutroDigital = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        labelFatorInversaNeutroDigital = new javax.swing.JLabel();
        labelPickupMinimoInversaNeutro = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        labelPickupMaximoInversaNeutro = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        labelPickupPassoInversaNeutro = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        labelTempoPassoInversaNeutro = new javax.swing.JLabel();
        labelTempoMaximoInversaNeutro = new javax.swing.JLabel();
        labelTempoMinimoInversaNeutro = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaCaracteristicasNeutro = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        botaoInversaNeutroRapidaDigital = new javax.swing.JRadioButton();
        botaoInversaNeutroLentaDigital = new javax.swing.JRadioButton();
        panelDefinidaNeutroDigital = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        labelPickupMaximoDefinidaNeutro = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        labelPickupMinimoDefinidaNeutro = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        labelPickupPassoDefinidaNeutro = new javax.swing.JLabel();
        labelFatorDefinidaNeutroDigital = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        labelTempoDefinidoNeutroMinimo = new javax.swing.JLabel();
        labelTempoDefinidoNeutroMaximo = new javax.swing.JLabel();
        labelTempoDefinidoNeutroPasso = new javax.swing.JLabel();
        botaoDefinidaNeutroRapidaDigital = new javax.swing.JRadioButton();
        botaoDefinidaNeutroLentaDigital = new javax.swing.JRadioButton();
        panelEletromecanico = new javax.swing.JPanel();
        panelInversaFaseEletromecanico = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelFatorInversaFaseMecan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        listaPickupInversaFase = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        listaDialInversaFase = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPontoCurvaFase = new javax.swing.JTable();
        botaoGraficoFase = new javax.swing.JButton();
        botaoInversaFaseRapidaEletromecanica = new javax.swing.JRadioButton();
        botaoInversaFaseLentaEletromecanica = new javax.swing.JRadioButton();
        panelInversaNeutroEletromecanico = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelFatorInversaNeutroMecan = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        listaPickupInversaNeutro = new javax.swing.JComboBox<>();
        listaDialInversaNeutro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPontoCurvaNeutro = new javax.swing.JTable();
        botaoGraficoNeutro = new javax.swing.JButton();
        botaoInversaNeutroRapidaEletromecanica = new javax.swing.JRadioButton();
        botaoInversaNeutroLentaEletromecanica = new javax.swing.JRadioButton();
        panelDefinidaFaseEletromecanico = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelFatorDefinidaFaseMecan = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPickupDefinidaFase = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaTempoDefinidaFase = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        botaoDefinidaFaseRapidaEletromecanica = new javax.swing.JRadioButton();
        botaoDefinidaFaseLentaEletromecanica = new javax.swing.JRadioButton();
        panelDefinidaNeutroEletromecanico = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaTempoDefinidaNeutro = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        labelFatorDefinidaNeutroMecan = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaPickupDefinidaNeutro = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        botaoDefinidaNeutroRapidaEletromecanica = new javax.swing.JRadioButton();
        botaoDefinidaNeutroLentaEletromecanica = new javax.swing.JRadioButton();
        botaoSalvar = new javax.swing.JButton();
        botaoRetornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Fabricante:");

        jLabel3.setText("Modelo:");

        labelFabricante.setText("jLabel4");

        labelModelo.setText("jLabel5");

        PanelItens.setLayout(new java.awt.CardLayout());

        panelInversaFaseDigital.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva Inversa de Fase"));

        jLabel15.setText("Fator de Início de Curva:");

        jLabel16.setText("Corrente de Pickup:");

        jLabel17.setText("Mínimo (A):");

        labelFatorInversaFaseDigital.setText("jLabel18");

        labelPickupMinimoInversaFase.setText("jLabel18");

        jLabel18.setText("Máximo (A):");

        labelPickupMaximoInversaFase.setText("jLabel19");

        jLabel20.setText("Passo (A):");

        labelPickupPassoInversaFase.setText("jLabel21");

        jLabel19.setText("Multiplicador de Tempo:");

        jLabel21.setText("Mínimo (A):");

        jLabel22.setText("Máximo (A):");

        jLabel23.setText("Passo (A):");

        labelTempoPassoInversaFase.setText("jLabel21");

        labelTempoMaximoInversaFase.setText("jLabel19");

        labelTempoMinimoInversaFase.setText("jLabel18");

        tabelaCaracteristicasFase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tabelaCaracteristicasFase);

        jLabel24.setText("Características da Curva:");

        grupoInversaFaseDigital.add(botaoInversaFaseRapidaDigital);
        botaoInversaFaseRapidaDigital.setText("Curva Rápida");

        grupoInversaFaseDigital.add(botaoInversaFaseLentaDigital);
        botaoInversaFaseLentaDigital.setText("Curva Lenta");

        javax.swing.GroupLayout panelInversaFaseDigitalLayout = new javax.swing.GroupLayout(panelInversaFaseDigital);
        panelInversaFaseDigital.setLayout(panelInversaFaseDigitalLayout);
        panelInversaFaseDigitalLayout.setHorizontalGroup(
            panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInversaFaseDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelInversaFaseDigitalLayout.createSequentialGroup()
                        .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel24)
                            .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelInversaFaseDigitalLayout.createSequentialGroup()
                                    .addComponent(botaoInversaFaseRapidaDigital)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoInversaFaseLentaDigital))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInversaFaseDigitalLayout.createSequentialGroup()
                                    .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addGroup(panelInversaFaseDigitalLayout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel20)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel22)
                                                .addComponent(jLabel23))))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelTempoPassoInversaFase)
                                        .addComponent(labelPickupMinimoInversaFase)
                                        .addComponent(labelFatorInversaFaseDigital)
                                        .addComponent(labelPickupMaximoInversaFase)
                                        .addComponent(labelPickupPassoInversaFase)
                                        .addComponent(labelTempoMinimoInversaFase)
                                        .addComponent(labelTempoMaximoInversaFase)))))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInversaFaseDigitalLayout.setVerticalGroup(
            panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInversaFaseDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(labelFatorInversaFaseDigital))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupMinimoInversaFase)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupMaximoInversaFase)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupPassoInversaFase)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInversaFaseRapidaDigital)
                    .addComponent(botaoInversaFaseLentaDigital))
                .addGap(12, 12, 12)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(labelTempoMinimoInversaFase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(labelTempoMaximoInversaFase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(labelTempoPassoInversaFase))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDefinidaFaseDigital.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva Definida de Fase"));

        jLabel26.setText("Corrente de Pickup:");

        jLabel28.setText("Máximo (A):");

        labelPickupMaximoDefinidaFase.setText("jLabel19");

        jLabel29.setText("Passo (A):");

        jLabel27.setText("Mínimo (A):");

        labelPickupMinimoDefinidaFase.setText("jLabel18");

        jLabel25.setText("Fator de Início de Curva:");

        labelPickupPassoDefinidaFase.setText("jLabel21");

        labelFatorDefinidaFaseDigital.setText("jLabel18");

        jLabel45.setText("Tempo de Atuação:");

        jLabel47.setText("Mínimo (s):");

        jLabel48.setText("Máximo (s):");

        jLabel49.setText("Passo (s):");

        labelTempoDefinidoFaseMinimo.setText("jLabel53");

        labelTempoDefinidoFaseMaximo.setText("jLabel54");

        labelTempoDefinidoFasePasso.setText("jLabel55");

        grupoDefinidaFaseDigital.add(botaoDefinidaFaseRapidaDigital);
        botaoDefinidaFaseRapidaDigital.setText("Curva Rápida");

        grupoDefinidaFaseDigital.add(botaoDefinidaFaseLentaDigital);
        botaoDefinidaFaseLentaDigital.setText("Curva Lenta");

        javax.swing.GroupLayout panelDefinidaFaseDigitalLayout = new javax.swing.GroupLayout(panelDefinidaFaseDigital);
        panelDefinidaFaseDigital.setLayout(panelDefinidaFaseDigitalLayout);
        panelDefinidaFaseDigitalLayout.setHorizontalGroup(
            panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefinidaFaseDigitalLayout.createSequentialGroup()
                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDefinidaFaseDigitalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDefinidaFaseDigitalLayout.createSequentialGroup()
                                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDefinidaFaseDigitalLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel29)))
                                    .addComponent(jLabel25))
                                .addGap(18, 18, 18)
                                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPickupPassoDefinidaFase)
                                    .addComponent(labelPickupMaximoDefinidaFase)
                                    .addComponent(labelPickupMinimoDefinidaFase)
                                    .addComponent(labelFatorDefinidaFaseDigital)
                                    .addComponent(labelTempoDefinidoFaseMinimo)
                                    .addComponent(labelTempoDefinidoFaseMaximo)
                                    .addComponent(labelTempoDefinidoFasePasso)))
                            .addComponent(jLabel26)
                            .addComponent(jLabel45)))
                    .addGroup(panelDefinidaFaseDigitalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel47)
                            .addComponent(jLabel49)))
                    .addGroup(panelDefinidaFaseDigitalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoDefinidaFaseRapidaDigital)
                        .addGap(34, 34, 34)
                        .addComponent(botaoDefinidaFaseLentaDigital)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelDefinidaFaseDigitalLayout.setVerticalGroup(
            panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefinidaFaseDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(labelFatorDefinidaFaseDigital))
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupMinimoDefinidaFase)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupMaximoDefinidaFase)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupPassoDefinidaFase)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDefinidaFaseRapidaDigital)
                    .addComponent(botaoDefinidaFaseLentaDigital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(labelTempoDefinidoFaseMinimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(labelTempoDefinidoFaseMaximo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDefinidaFaseDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(labelTempoDefinidoFasePasso))
                .addContainerGap())
        );

        panelInversaNeutroDigital.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva Inversa de Neutro"));

        jLabel30.setText("Fator de Início de Curva:");

        jLabel31.setText("Corrente de Pickup:");

        jLabel32.setText("Mínimo (A):");

        labelFatorInversaNeutroDigital.setText("jLabel18");

        labelPickupMinimoInversaNeutro.setText("jLabel18");

        jLabel33.setText("Máximo (A):");

        labelPickupMaximoInversaNeutro.setText("jLabel19");

        jLabel34.setText("Passo (A):");

        labelPickupPassoInversaNeutro.setText("jLabel21");

        jLabel35.setText("Multiplicador de Tempo:");

        jLabel36.setText("Mínimo (A):");

        jLabel37.setText("Máximo (A):");

        jLabel38.setText("Passo (A):");

        labelTempoPassoInversaNeutro.setText("jLabel21");

        labelTempoMaximoInversaNeutro.setText("jLabel19");

        labelTempoMinimoInversaNeutro.setText("jLabel18");

        tabelaCaracteristicasNeutro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(tabelaCaracteristicasNeutro);

        jLabel39.setText("Características da Curva:");

        grupoInversaNeutroDigital.add(botaoInversaNeutroRapidaDigital);
        botaoInversaNeutroRapidaDigital.setText("Curva Rápida");

        grupoInversaNeutroDigital.add(botaoInversaNeutroLentaDigital);
        botaoInversaNeutroLentaDigital.setText("Curva Lenta");

        javax.swing.GroupLayout panelInversaNeutroDigitalLayout = new javax.swing.GroupLayout(panelInversaNeutroDigital);
        panelInversaNeutroDigital.setLayout(panelInversaNeutroDigitalLayout);
        panelInversaNeutroDigitalLayout.setHorizontalGroup(
            panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInversaNeutroDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelInversaNeutroDigitalLayout.createSequentialGroup()
                        .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel35)
                            .addComponent(jLabel39)
                            .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInversaNeutroDigitalLayout.createSequentialGroup()
                                    .addComponent(botaoInversaNeutroRapidaDigital)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoInversaNeutroLentaDigital))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInversaNeutroDigitalLayout.createSequentialGroup()
                                    .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel30)
                                        .addGroup(panelInversaNeutroDigitalLayout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel34)
                                                .addComponent(jLabel33)
                                                .addComponent(jLabel32)
                                                .addComponent(jLabel36)
                                                .addComponent(jLabel37)
                                                .addComponent(jLabel38))))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelTempoPassoInversaNeutro)
                                        .addComponent(labelPickupMinimoInversaNeutro)
                                        .addComponent(labelFatorInversaNeutroDigital)
                                        .addComponent(labelPickupMaximoInversaNeutro)
                                        .addComponent(labelPickupPassoInversaNeutro)
                                        .addComponent(labelTempoMinimoInversaNeutro)
                                        .addComponent(labelTempoMaximoInversaNeutro)))))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInversaNeutroDigitalLayout.setVerticalGroup(
            panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInversaNeutroDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(labelFatorInversaNeutroDigital))
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupMinimoInversaNeutro)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupMaximoInversaNeutro)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupPassoInversaNeutro)
                    .addComponent(jLabel34))
                .addGap(1, 1, 1)
                .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInversaNeutroRapidaDigital)
                    .addComponent(botaoInversaNeutroLentaDigital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(labelTempoMinimoInversaNeutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(labelTempoMaximoInversaNeutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(labelTempoPassoInversaNeutro))
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDefinidaNeutroDigital.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva Definida de Neutro"));

        jLabel40.setText("Corrente de Pickup:");

        jLabel41.setText("Máximo (A):");

        labelPickupMaximoDefinidaNeutro.setText("jLabel19");

        jLabel42.setText("Passo (A):");

        jLabel43.setText("Mínimo (A):");

        labelPickupMinimoDefinidaNeutro.setText("jLabel18");

        jLabel44.setText("Fator de Início de Curva:");

        labelPickupPassoDefinidaNeutro.setText("jLabel21");

        labelFatorDefinidaNeutroDigital.setText("jLabel18");

        jLabel46.setText("Tempo de Atuação:");

        jLabel52.setText("Passo (s):");

        jLabel51.setText("Máximo (s):");

        jLabel50.setText("Mínimo (s):");

        labelTempoDefinidoNeutroMinimo.setText("jLabel56");

        labelTempoDefinidoNeutroMaximo.setText("jLabel57");

        labelTempoDefinidoNeutroPasso.setText("jLabel58");

        grupoDefinidaNeutroDigital.add(botaoDefinidaNeutroRapidaDigital);
        botaoDefinidaNeutroRapidaDigital.setText("Curva Rápida");

        grupoDefinidaNeutroDigital.add(botaoDefinidaNeutroLentaDigital);
        botaoDefinidaNeutroLentaDigital.setText("Curva Lenta");

        javax.swing.GroupLayout panelDefinidaNeutroDigitalLayout = new javax.swing.GroupLayout(panelDefinidaNeutroDigital);
        panelDefinidaNeutroDigital.setLayout(panelDefinidaNeutroDigitalLayout);
        panelDefinidaNeutroDigitalLayout.setHorizontalGroup(
            panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefinidaNeutroDigitalLayout.createSequentialGroup()
                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDefinidaNeutroDigitalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDefinidaNeutroDigitalLayout.createSequentialGroup()
                                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDefinidaNeutroDigitalLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel42)))
                                    .addComponent(jLabel44))
                                .addGap(18, 18, 18)
                                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPickupPassoDefinidaNeutro)
                                    .addComponent(labelPickupMaximoDefinidaNeutro)
                                    .addComponent(labelPickupMinimoDefinidaNeutro)
                                    .addComponent(labelFatorDefinidaNeutroDigital)
                                    .addComponent(labelTempoDefinidoNeutroMinimo)
                                    .addComponent(labelTempoDefinidoNeutroMaximo)
                                    .addComponent(labelTempoDefinidoNeutroPasso)))
                            .addComponent(jLabel40)
                            .addGroup(panelDefinidaNeutroDigitalLayout.createSequentialGroup()
                                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botaoDefinidaNeutroRapidaDigital)
                                    .addComponent(jLabel46))
                                .addGap(18, 18, 18)
                                .addComponent(botaoDefinidaNeutroLentaDigital))))
                    .addGroup(panelDefinidaNeutroDigitalLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel50)
                            .addComponent(jLabel52))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelDefinidaNeutroDigitalLayout.setVerticalGroup(
            panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefinidaNeutroDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(labelFatorDefinidaNeutroDigital))
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupMinimoDefinidaNeutro)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupMaximoDefinidaNeutro)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPickupPassoDefinidaNeutro)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addGap(1, 1, 1)
                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDefinidaNeutroRapidaDigital)
                    .addComponent(botaoDefinidaNeutroLentaDigital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(labelTempoDefinidoNeutroMinimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(labelTempoDefinidoNeutroMaximo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDefinidaNeutroDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(labelTempoDefinidoNeutroPasso))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout panelDigitalLayout = new javax.swing.GroupLayout(panelDigital);
        panelDigital.setLayout(panelDigitalLayout);
        panelDigitalLayout.setHorizontalGroup(
            panelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInversaFaseDigital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDefinidaFaseDigital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInversaNeutroDigital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDefinidaNeutroDigital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDigitalLayout.setVerticalGroup(
            panelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDigitalLayout.createSequentialGroup()
                        .addComponent(panelInversaNeutroDigital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelDefinidaNeutroDigital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDigitalLayout.createSequentialGroup()
                        .addComponent(panelInversaFaseDigital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelDefinidaFaseDigital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelItens.add(panelDigital, "card3");

        panelInversaFaseEletromecanico.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva Inversa de Fase"));

        jLabel1.setText("Fator de Início de Curva:");

        labelFatorInversaFaseMecan.setText("jLabel4");

        jLabel5.setText("Corrente de Pickup:");

        listaPickupInversaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPickupInversaFaseActionPerformed(evt);
            }
        });

        jLabel6.setText("Dial de Tempo:");

        listaDialInversaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDialInversaFaseActionPerformed(evt);
            }
        });

        tabelaPontoCurvaFase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaPontoCurvaFase);

        botaoGraficoFase.setText("Gráfico");
        botaoGraficoFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGraficoFaseActionPerformed(evt);
            }
        });

        grupoInversaFaseEletromecanica.add(botaoInversaFaseRapidaEletromecanica);
        botaoInversaFaseRapidaEletromecanica.setText("Curva Rápida");

        grupoInversaFaseEletromecanica.add(botaoInversaFaseLentaEletromecanica);
        botaoInversaFaseLentaEletromecanica.setText("Curva Lenta");

        javax.swing.GroupLayout panelInversaFaseEletromecanicoLayout = new javax.swing.GroupLayout(panelInversaFaseEletromecanico);
        panelInversaFaseEletromecanico.setLayout(panelInversaFaseEletromecanicoLayout);
        panelInversaFaseEletromecanicoLayout.setHorizontalGroup(
            panelInversaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInversaFaseEletromecanicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoGraficoFase)
                .addContainerGap())
            .addGroup(panelInversaFaseEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInversaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInversaFaseEletromecanicoLayout.createSequentialGroup()
                        .addComponent(botaoInversaFaseRapidaEletromecanica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoInversaFaseLentaEletromecanica))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelInversaFaseEletromecanicoLayout.createSequentialGroup()
                        .addGroup(panelInversaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(panelInversaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(listaPickupInversaFase, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFatorInversaFaseMecan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(listaDialInversaFase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInversaFaseEletromecanicoLayout.setVerticalGroup(
            panelInversaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInversaFaseEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInversaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelFatorInversaFaseMecan))
                .addGap(3, 3, 3)
                .addGroup(panelInversaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInversaFaseRapidaEletromecanica)
                    .addComponent(botaoInversaFaseLentaEletromecanica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInversaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaPickupInversaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelInversaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaDialInversaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botaoGraficoFase)
                .addContainerGap())
        );

        panelInversaNeutroEletromecanico.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva Inversa de Neutro"));

        jLabel4.setText("Fator de Início de Curva:");

        labelFatorInversaNeutroMecan.setText("jLabel5");

        jLabel7.setText("Corrente de Pickup:");

        listaPickupInversaNeutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPickupInversaNeutroActionPerformed(evt);
            }
        });

        listaDialInversaNeutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDialInversaNeutroActionPerformed(evt);
            }
        });

        jLabel8.setText("Dial de Tempo:");

        tabelaPontoCurvaNeutro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaPontoCurvaNeutro);

        botaoGraficoNeutro.setText("Gráfico");
        botaoGraficoNeutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGraficoNeutroActionPerformed(evt);
            }
        });

        grupoInversaNeutroEletromecanica.add(botaoInversaNeutroRapidaEletromecanica);
        botaoInversaNeutroRapidaEletromecanica.setText("Curva Rápida");

        grupoInversaNeutroEletromecanica.add(botaoInversaNeutroLentaEletromecanica);
        botaoInversaNeutroLentaEletromecanica.setText("Curva Lenta");

        javax.swing.GroupLayout panelInversaNeutroEletromecanicoLayout = new javax.swing.GroupLayout(panelInversaNeutroEletromecanico);
        panelInversaNeutroEletromecanico.setLayout(panelInversaNeutroEletromecanicoLayout);
        panelInversaNeutroEletromecanicoLayout.setHorizontalGroup(
            panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInversaNeutroEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelInversaNeutroEletromecanicoLayout.createSequentialGroup()
                        .addGroup(panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(50, 50, 50)
                        .addGroup(panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaDialInversaNeutro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listaPickupInversaNeutro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInversaNeutroEletromecanicoLayout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInversaNeutroEletromecanicoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(labelFatorInversaNeutroMecan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoGraficoNeutro, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelInversaNeutroEletromecanicoLayout.createSequentialGroup()
                        .addComponent(botaoInversaNeutroRapidaEletromecanica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoInversaNeutroLentaEletromecanica)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        panelInversaNeutroEletromecanicoLayout.setVerticalGroup(
            panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInversaNeutroEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelFatorInversaNeutroMecan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInversaNeutroRapidaEletromecanica)
                    .addComponent(botaoInversaNeutroLentaEletromecanica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(listaPickupInversaNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInversaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(listaDialInversaNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoGraficoNeutro)
                .addContainerGap())
        );

        panelDefinidaFaseEletromecanico.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva Definida de Fase"));

        jLabel9.setText("Fator de Início de Curva:");

        labelFatorDefinidaFaseMecan.setText("jLabel10");

        jLabel10.setText("Correntes de Pickup:");

        listaPickupDefinidaFase.setModel(new DefaultListModel<Double>()
        );
        jScrollPane3.setViewportView(listaPickupDefinidaFase);

        listaTempoDefinidaFase.setModel(new DefaultListModel<Double>());
        jScrollPane4.setViewportView(listaTempoDefinidaFase);

        jLabel11.setText("Tempo de Atuação");

        grupoDefinidaFaseEletromecanica.add(botaoDefinidaFaseRapidaEletromecanica);
        botaoDefinidaFaseRapidaEletromecanica.setText("Curva Rápida");

        grupoDefinidaFaseEletromecanica.add(botaoDefinidaFaseLentaEletromecanica);
        botaoDefinidaFaseLentaEletromecanica.setText("Curva Lenta");

        javax.swing.GroupLayout panelDefinidaFaseEletromecanicoLayout = new javax.swing.GroupLayout(panelDefinidaFaseEletromecanico);
        panelDefinidaFaseEletromecanico.setLayout(panelDefinidaFaseEletromecanicoLayout);
        panelDefinidaFaseEletromecanicoLayout.setHorizontalGroup(
            panelDefinidaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefinidaFaseEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDefinidaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(botaoDefinidaFaseRapidaEletromecanica)
                    .addComponent(botaoDefinidaFaseLentaEletromecanica))
                .addGap(18, 18, 18)
                .addGroup(panelDefinidaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelFatorDefinidaFaseMecan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDefinidaFaseEletromecanicoLayout.setVerticalGroup(
            panelDefinidaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefinidaFaseEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDefinidaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelFatorDefinidaFaseMecan))
                .addGap(18, 18, 18)
                .addGroup(panelDefinidaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDefinidaFaseEletromecanicoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelDefinidaFaseEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDefinidaFaseEletromecanicoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoDefinidaFaseRapidaEletromecanica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoDefinidaFaseLentaEletromecanica))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelDefinidaNeutroEletromecanico.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva Definida de Neutro"));

        listaTempoDefinidaNeutro.setModel(new DefaultListModel<Double>());
        jScrollPane5.setViewportView(listaTempoDefinidaNeutro);

        jLabel13.setText("Correntes de Pickup:");

        labelFatorDefinidaNeutroMecan.setText("jLabel10");

        jLabel12.setText("Tempo de Atuação");

        listaPickupDefinidaNeutro.setModel(new DefaultListModel<Double>());
        jScrollPane6.setViewportView(listaPickupDefinidaNeutro);

        jLabel14.setText("Fator de Início de Curva:");

        grupoDefinidaNeutroEletromecanica.add(botaoDefinidaNeutroRapidaEletromecanica);
        botaoDefinidaNeutroRapidaEletromecanica.setText("Curva Rápida");

        grupoDefinidaNeutroEletromecanica.add(botaoDefinidaNeutroLentaEletromecanica);
        botaoDefinidaNeutroLentaEletromecanica.setText("Curva Lenta");

        javax.swing.GroupLayout panelDefinidaNeutroEletromecanicoLayout = new javax.swing.GroupLayout(panelDefinidaNeutroEletromecanico);
        panelDefinidaNeutroEletromecanico.setLayout(panelDefinidaNeutroEletromecanicoLayout);
        panelDefinidaNeutroEletromecanicoLayout.setHorizontalGroup(
            panelDefinidaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefinidaNeutroEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDefinidaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(botaoDefinidaNeutroRapidaEletromecanica)
                    .addComponent(botaoDefinidaNeutroLentaEletromecanica))
                .addGap(18, 18, 18)
                .addGroup(panelDefinidaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labelFatorDefinidaNeutroMecan, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDefinidaNeutroEletromecanicoLayout.setVerticalGroup(
            panelDefinidaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefinidaNeutroEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDefinidaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(labelFatorDefinidaNeutroMecan))
                .addGap(18, 18, 18)
                .addGroup(panelDefinidaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDefinidaNeutroEletromecanicoLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelDefinidaNeutroEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDefinidaNeutroEletromecanicoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoDefinidaNeutroRapidaEletromecanica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoDefinidaNeutroLentaEletromecanica))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelEletromecanicoLayout = new javax.swing.GroupLayout(panelEletromecanico);
        panelEletromecanico.setLayout(panelEletromecanicoLayout);
        panelEletromecanicoLayout.setHorizontalGroup(
            panelEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDefinidaFaseEletromecanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInversaFaseEletromecanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelInversaNeutroEletromecanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDefinidaNeutroEletromecanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEletromecanicoLayout.setVerticalGroup(
            panelEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEletromecanicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInversaFaseEletromecanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInversaNeutroEletromecanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDefinidaFaseEletromecanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDefinidaNeutroEletromecanico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PanelItens.add(panelEletromecanico, "card2");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoRetornar.setText("Retornar");
        botaoRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFabricante)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(labelModelo))
                            .addComponent(PanelItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRetornar)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelFabricante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoRetornar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaPickupInversaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPickupInversaFaseActionPerformed
        double corrente = this.listaPickupInversaFase.getItemAt(this.listaPickupInversaFase.getSelectedIndex());
        boolean rapida = this.botaoInversaFaseRapidaEletromecanica.isSelected();
        List<Double> listaDial = ((ReligadorEletromecanico) this.religador).getDialDeTempo(Religador.INVERSA_FASE, rapida, corrente);

        this.listaDialInversaFase.removeAllItems();
        listaDial.forEach(dial -> this.listaDialInversaFase.addItem(dial));
    }//GEN-LAST:event_listaPickupInversaFaseActionPerformed

    private void listaPickupInversaNeutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPickupInversaNeutroActionPerformed
        double corrente = this.listaPickupInversaNeutro.getItemAt(this.listaPickupInversaNeutro.getSelectedIndex());
        boolean rapida = this.botaoInversaNeutroRapidaEletromecanica.isSelected();
        List<Double> listaDial = ((ReligadorEletromecanico) this.religador).getDialDeTempo(Religador.INVERSA_NEUTRO, rapida, corrente);

        this.listaDialInversaNeutro.removeAllItems();
        listaDial.forEach(dial -> this.listaDialInversaNeutro.addItem(dial));
    }//GEN-LAST:event_listaPickupInversaNeutroActionPerformed

    private void listaDialInversaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDialInversaFaseActionPerformed
        if (this.listaDialInversaFase.getItemAt(this.listaDialInversaFase.getSelectedIndex()) != null) {
            double corrente = this.listaPickupInversaFase.getItemAt(this.listaPickupInversaFase.getSelectedIndex());
            double dialTempo = this.listaDialInversaFase.getItemAt(this.listaDialInversaFase.getSelectedIndex());
            boolean rapida = this.botaoInversaFaseRapidaEletromecanica.isSelected();
            List<PontoCurva> listaPontos;
            try {
                listaPontos = ((ReligadorEletromecanico) this.religador).getPontosDialDeTempo(corrente, dialTempo, Religador.INVERSA_FASE, rapida);

                this.modeloFasePontoCurva.removeTodos();
                this.modeloFasePontoCurva.add((ArrayList<PontoCurva>) listaPontos);
                this.modeloFasePontoCurva.fireTableDataChanged();
            } catch (NumberFormatException e) {
                this.modeloFasePontoCurva.removeTodos();
                this.modeloFasePontoCurva.fireTableDataChanged();
            }
        }
    }//GEN-LAST:event_listaDialInversaFaseActionPerformed

    private void listaDialInversaNeutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDialInversaNeutroActionPerformed
        if (this.listaDialInversaNeutro.getItemAt(this.listaDialInversaNeutro.getSelectedIndex()) != null) {
            double corrente = this.listaPickupInversaNeutro.getItemAt(this.listaPickupInversaNeutro.getSelectedIndex());
            double dialTempo = this.listaDialInversaNeutro.getItemAt(this.listaDialInversaNeutro.getSelectedIndex());
            boolean rapida = this.botaoInversaNeutroRapidaEletromecanica.isSelected();
            List<PontoCurva> listaPontos;
            try {
                listaPontos = ((ReligadorEletromecanico) this.religador).getPontosDialDeTempo(corrente, dialTempo, Religador.INVERSA_NEUTRO, rapida);

                this.modeloNeutroPontoCurva.removeTodos();
                this.modeloNeutroPontoCurva.add((ArrayList<PontoCurva>) listaPontos);
                this.modeloNeutroPontoCurva.fireTableDataChanged();
            } catch (NumberFormatException e) {
                this.modeloNeutroPontoCurva.removeTodos();
                this.modeloNeutroPontoCurva.fireTableDataChanged();
            }
        }
    }//GEN-LAST:event_listaDialInversaNeutroActionPerformed

    private void botaoRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetornarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoRetornarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        try {
            ReligadorDao.insereReligador(religador);
            this.dispose();
            ((JFrame) this.getParent()).dispose();
        } catch (SQLException ex) {
            Erro.mostraMensagemSQL((JFrame) this.getParent(), ex);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoGraficoFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGraficoFaseActionPerformed
        double corrente = this.listaPickupInversaFase.getItemAt(this.listaPickupInversaFase.getSelectedIndex());
        double dialTempo = this.listaDialInversaFase.getItemAt(this.listaDialInversaFase.getSelectedIndex());
        boolean rapida = this.botaoInversaFaseRapidaEletromecanica.isSelected();
        this.setModal(false);
        Grafico.criarGrafico(((ReligadorEletromecanico) this.religador).getDial(Religador.INVERSA_FASE, rapida, corrente, dialTempo), this).setVisible(true);
        this.setModal(true);
    }//GEN-LAST:event_botaoGraficoFaseActionPerformed

    private void botaoGraficoNeutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGraficoNeutroActionPerformed
        double corrente = this.listaPickupInversaNeutro.getItemAt(this.listaPickupInversaNeutro.getSelectedIndex());
        double dialTempo = this.listaDialInversaNeutro.getItemAt(this.listaDialInversaNeutro.getSelectedIndex());
        boolean rapida = this.botaoInversaFaseRapidaEletromecanica.isSelected();
        this.setModal(false);
        Grafico.criarGrafico(((ReligadorEletromecanico) this.religador).getDial(Religador.INVERSA_NEUTRO, rapida, corrente, dialTempo), this).setVisible(true);
        this.setModal(true);
    }//GEN-LAST:event_botaoGraficoNeutroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Religador_Resumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Religador_Resumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Religador_Resumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Religador_Resumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelItens;
    private javax.swing.JRadioButton botaoDefinidaFaseLentaDigital;
    private javax.swing.JRadioButton botaoDefinidaFaseLentaEletromecanica;
    private javax.swing.JRadioButton botaoDefinidaFaseRapidaDigital;
    private javax.swing.JRadioButton botaoDefinidaFaseRapidaEletromecanica;
    private javax.swing.JRadioButton botaoDefinidaNeutroLentaDigital;
    private javax.swing.JRadioButton botaoDefinidaNeutroLentaEletromecanica;
    private javax.swing.JRadioButton botaoDefinidaNeutroRapidaDigital;
    private javax.swing.JRadioButton botaoDefinidaNeutroRapidaEletromecanica;
    private javax.swing.JButton botaoGraficoFase;
    private javax.swing.JButton botaoGraficoNeutro;
    private javax.swing.JRadioButton botaoInversaFaseLentaDigital;
    private javax.swing.JRadioButton botaoInversaFaseLentaEletromecanica;
    private javax.swing.JRadioButton botaoInversaFaseRapidaDigital;
    private javax.swing.JRadioButton botaoInversaFaseRapidaEletromecanica;
    private javax.swing.JRadioButton botaoInversaNeutroLentaDigital;
    private javax.swing.JRadioButton botaoInversaNeutroLentaEletromecanica;
    private javax.swing.JRadioButton botaoInversaNeutroRapidaDigital;
    private javax.swing.JRadioButton botaoInversaNeutroRapidaEletromecanica;
    private javax.swing.JButton botaoRetornar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup grupoDefinidaFaseDigital;
    private javax.swing.ButtonGroup grupoDefinidaFaseEletromecanica;
    private javax.swing.ButtonGroup grupoDefinidaNeutroDigital;
    private javax.swing.ButtonGroup grupoDefinidaNeutroEletromecanica;
    private javax.swing.ButtonGroup grupoInversaFaseDigital;
    private javax.swing.ButtonGroup grupoInversaFaseEletromecanica;
    private javax.swing.ButtonGroup grupoInversaNeutroDigital;
    private javax.swing.ButtonGroup grupoInversaNeutroEletromecanica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel labelFabricante;
    private javax.swing.JLabel labelFatorDefinidaFaseDigital;
    private javax.swing.JLabel labelFatorDefinidaFaseMecan;
    private javax.swing.JLabel labelFatorDefinidaNeutroDigital;
    private javax.swing.JLabel labelFatorDefinidaNeutroMecan;
    private javax.swing.JLabel labelFatorInversaFaseDigital;
    private javax.swing.JLabel labelFatorInversaFaseMecan;
    private javax.swing.JLabel labelFatorInversaNeutroDigital;
    private javax.swing.JLabel labelFatorInversaNeutroMecan;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPickupMaximoDefinidaFase;
    private javax.swing.JLabel labelPickupMaximoDefinidaNeutro;
    private javax.swing.JLabel labelPickupMaximoInversaFase;
    private javax.swing.JLabel labelPickupMaximoInversaNeutro;
    private javax.swing.JLabel labelPickupMinimoDefinidaFase;
    private javax.swing.JLabel labelPickupMinimoDefinidaNeutro;
    private javax.swing.JLabel labelPickupMinimoInversaFase;
    private javax.swing.JLabel labelPickupMinimoInversaNeutro;
    private javax.swing.JLabel labelPickupPassoDefinidaFase;
    private javax.swing.JLabel labelPickupPassoDefinidaNeutro;
    private javax.swing.JLabel labelPickupPassoInversaFase;
    private javax.swing.JLabel labelPickupPassoInversaNeutro;
    private javax.swing.JLabel labelTempoDefinidoFaseMaximo;
    private javax.swing.JLabel labelTempoDefinidoFaseMinimo;
    private javax.swing.JLabel labelTempoDefinidoFasePasso;
    private javax.swing.JLabel labelTempoDefinidoNeutroMaximo;
    private javax.swing.JLabel labelTempoDefinidoNeutroMinimo;
    private javax.swing.JLabel labelTempoDefinidoNeutroPasso;
    private javax.swing.JLabel labelTempoMaximoInversaFase;
    private javax.swing.JLabel labelTempoMaximoInversaNeutro;
    private javax.swing.JLabel labelTempoMinimoInversaFase;
    private javax.swing.JLabel labelTempoMinimoInversaNeutro;
    private javax.swing.JLabel labelTempoPassoInversaFase;
    private javax.swing.JLabel labelTempoPassoInversaNeutro;
    private javax.swing.JComboBox<Double> listaDialInversaFase;
    private javax.swing.JComboBox<Double> listaDialInversaNeutro;
    private javax.swing.JList<Double> listaPickupDefinidaFase;
    private javax.swing.JList<Double> listaPickupDefinidaNeutro;
    private javax.swing.JComboBox<Double> listaPickupInversaFase;
    private javax.swing.JComboBox<Double> listaPickupInversaNeutro;
    private javax.swing.JList<Double> listaTempoDefinidaFase;
    private javax.swing.JList<Double> listaTempoDefinidaNeutro;
    private javax.swing.JPanel panelDefinidaFaseDigital;
    private javax.swing.JPanel panelDefinidaFaseEletromecanico;
    private javax.swing.JPanel panelDefinidaNeutroDigital;
    private javax.swing.JPanel panelDefinidaNeutroEletromecanico;
    private javax.swing.JPanel panelDigital;
    private javax.swing.JPanel panelEletromecanico;
    private javax.swing.JPanel panelInversaFaseDigital;
    private javax.swing.JPanel panelInversaFaseEletromecanico;
    private javax.swing.JPanel panelInversaNeutroDigital;
    private javax.swing.JPanel panelInversaNeutroEletromecanico;
    private javax.swing.JTable tabelaCaracteristicasFase;
    private javax.swing.JTable tabelaCaracteristicasNeutro;
    private javax.swing.JTable tabelaPontoCurvaFase;
    private javax.swing.JTable tabelaPontoCurvaNeutro;
    // End of variables declaration//GEN-END:variables
}
