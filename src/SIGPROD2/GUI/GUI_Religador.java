package SIGPROD2.GUI;

import SIGPROD2.Auxiliar.Arquivo;
import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Auxiliar.Perguntas;
import SIGPROD2.Auxiliar.StringUtils;
import SIGPROD2.Modelo.CaracteristicasCurva;
import SIGPROD2.Modelo.PontoCurva;
import SIGPROD2.Modelo.Religador;
import SIGPROD2.Modelo.ReligadorDigital;
import SIGPROD2.Modelo.ReligadorEletromecanico;
import SIGPROD2.Modelo.Tabelas.CaracteristicasTableModel;
import SIGPROD2.Modelo.Tabelas.PontoCurvaTableModel;
import com.google.gson.Gson;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GUI_Religador extends javax.swing.JFrame {

    private CaracteristicasTableModel modeloFaseCaracteristicas;
    private CaracteristicasTableModel modeloNeutroCaracteristicas;
    private CaracteristicasTableModel modeloFaseCaracteristicasRapida;
    private CaracteristicasTableModel modeloNeutroCaracteristicasRapida;
    private PontoCurvaTableModel modeloFaseCriarDial;
    private PontoCurvaTableModel modeloFaseExistenteDial;
    private PontoCurvaTableModel modeloNeutroCriaDial;
    private PontoCurvaTableModel modeloNeutroExistenteDial;
    private PontoCurvaTableModel modeloFaseCriarDialRapido;
    private PontoCurvaTableModel modeloNeutroCriaDialRapido;
    private PontoCurvaTableModel modeloFaseExistenteDialRapido;
    private PontoCurvaTableModel modeloNeutroExistenteDialRapido;
    private Religador newReligador;
    private boolean[] paineis;

    public GUI_Religador() {
        this.initComponents();
        this.configurarTabelas();
        this.desabilitarPaineis(0);
        this.selectCheckBox();
    }

    private void cancelOption() {
        if (Perguntas.perguntaCancelar(this) == JOptionPane.OK_OPTION) {
            dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoDeEquipamento = new javax.swing.ButtonGroup();
        tabbedPane = new javax.swing.JTabbedPane();
        Painel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fabricante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        curvaInversaFase = new javax.swing.JCheckBox();
        curvaInversaNeutro = new javax.swing.JCheckBox();
        curvaTempoFase = new javax.swing.JCheckBox();
        curvaTempoNeutro = new javax.swing.JCheckBox();
        avancarDadosGerais = new javax.swing.JButton();
        cancelarDadosGerais = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        eletromecanico = new javax.swing.JRadioButton();
        digital = new javax.swing.JRadioButton();
        temporizadaFase = new javax.swing.JTabbedPane();
        correntePickup = new javax.swing.JPanel();
        cardLayout1 = new javax.swing.JPanel();
        faseCorrenteFirst = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        inversaFaseCorrenteValores = new javax.swing.JTextField();
        faseCorrenteSecond = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        faseCorrenteMinimo = new javax.swing.JTextField();
        faseCorrenteMaximo = new javax.swing.JTextField();
        faseCorrentePasso = new javax.swing.JTextField();
        avancarInversaFaseCorrente = new javax.swing.JButton();
        retornarInversaFaseCorrente = new javax.swing.JButton();
        cancelarInversaFaseCorrente = new javax.swing.JButton();
        InversaFaseCorrenteFator = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cardLayout2 = new javax.swing.JPanel();
        faseCurvaFirst = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        faseCurvaDial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        faseCurvaPrimeira = new javax.swing.JTable();
        faseCurvaGrafico = new javax.swing.JButton();
        faseCurvaRemovePrimeira = new javax.swing.JButton();
        faseCurvaAdicionaPrimeira = new javax.swing.JButton();
        faseCurvaSalvar = new javax.swing.JButton();
        faseCurvaCorrenteCadastro = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane0 = new javax.swing.JScrollPane();
        faseCurvaSegunda = new javax.swing.JTable();
        faseCurvaDialExistente = new javax.swing.JComboBox();
        faseCurvaCorrenteExistente = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        faseCurvaSecond = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        faseCurvaMinimo = new javax.swing.JTextField();
        faseCurvaMaximo = new javax.swing.JTextField();
        faseCurvaPasso = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        faseCurvaCaracteristicas = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        faseCurvaAdicionaCaracteristicas = new javax.swing.JButton();
        faseCurvaRemoveCaracteristicas = new javax.swing.JButton();
        avancarFaseCurva = new javax.swing.JButton();
        cancelarFaseCurva = new javax.swing.JButton();
        retornarFaseCurva = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        cardLayout8 = new javax.swing.JPanel();
        faseCurvaRapidaFirst = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        faseCurvaRapidaDial = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        faseCurvaRapidaPrimeira = new javax.swing.JTable();
        faseCurvaRapidaGrafico = new javax.swing.JButton();
        faseCurvaRapidaRemovePrimeira = new javax.swing.JButton();
        faseCurvaRapidaAdicionaPrimeira = new javax.swing.JButton();
        faseCurvaRapidaSalvar = new javax.swing.JButton();
        faseCurvaRapidaCorrenteCadastro = new javax.swing.JComboBox();
        jLabel55 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        faseCurvaRapidaSegunda = new javax.swing.JTable();
        faseCurvaRapidaDialExistente = new javax.swing.JComboBox();
        faseCurvaRapidaCorrenteExistente = new javax.swing.JComboBox();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        faseCurvaRapidaSecond = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        faseCurvaRapidaMinimo = new javax.swing.JTextField();
        faseCurvaRapidaMaximo = new javax.swing.JTextField();
        faseCurvaRapidaPasso = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        faseCurvaRapidaCaracteristicas = new javax.swing.JTable();
        jLabel62 = new javax.swing.JLabel();
        faseCurvaRapidaAdicionaCaracteristicas = new javax.swing.JButton();
        faseCurvaRapidaRemoveCaracteristicas = new javax.swing.JButton();
        avancarFaseCurvaRapida = new javax.swing.JButton();
        cancelarFaseCurvaRapida = new javax.swing.JButton();
        retornarFaseCurvaRapida = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        correntePickup3 = new javax.swing.JPanel();
        cardLayout4 = new javax.swing.JPanel();
        neutroCorrenteFirst = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        inversaNeutroCorrenteValores = new javax.swing.JTextField();
        neutroCorrenteSecond = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        neutroCorrenteMinimo = new javax.swing.JTextField();
        neutroCorrenteMaximo = new javax.swing.JTextField();
        neutroCorrentePasso = new javax.swing.JTextField();
        avancarInversaNeutroCorrente = new javax.swing.JButton();
        retornarInversaNeutroCorrente = new javax.swing.JButton();
        cancelarInversaNeutroCorrente = new javax.swing.JButton();
        inversaNeutroCorrenteFator = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        cardLayout5 = new javax.swing.JPanel();
        neutroCurvaSecond = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        neutroCurvaMinimo = new javax.swing.JTextField();
        neutroCurvaMaximo = new javax.swing.JTextField();
        neutroCurvaPasso = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        neutroCurvaCaracteristicas = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        neutroCurvaAdicionaCaracteristicas = new javax.swing.JButton();
        neutroCurvaRemoveCaracteristicas = new javax.swing.JButton();
        neutroCurvaFirst = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        neutroCurvaDial = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        neutroCurvaPrimeira = new javax.swing.JTable();
        neutroCurvaGrafico = new javax.swing.JButton();
        neutroCurvaRemovePrimeira = new javax.swing.JButton();
        neutroCurvaAdicionaPrimeira = new javax.swing.JButton();
        neutroCurvaSalvar = new javax.swing.JButton();
        neutroCurvaCorrenteCadastro = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        neutroCurvaSegunda = new javax.swing.JTable();
        neutroCurvaDialExistente = new javax.swing.JComboBox();
        neutroCurvaCorrenteExistente = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        avancarNeutroCurva = new javax.swing.JButton();
        cancelarNeutroCurva = new javax.swing.JButton();
        retornarNeutroCurva = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        cardLayout7 = new javax.swing.JPanel();
        neutroCurvaRapidaSecond = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        neutroCurvaRapidaMinimo = new javax.swing.JTextField();
        neutroCurvaRapidaMaximo = new javax.swing.JTextField();
        neutroCurvaRapidaPasso = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        neutroCurvaRapidaCaracteristicas = new javax.swing.JTable();
        jLabel89 = new javax.swing.JLabel();
        neutroCurvaAdicionaCaracteristicas2 = new javax.swing.JButton();
        neutroCurvaRemoveCaracteristicas2 = new javax.swing.JButton();
        neutroCurvaRapidaFirst = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        neutroCurvaRapidaDial = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        neutroCurvaRapidaPrimeira = new javax.swing.JTable();
        neutroCurvaRapidaGrafico = new javax.swing.JButton();
        neutroCurvaRapidaRemovePrimeira = new javax.swing.JButton();
        neutroCurvaRapidaAdicionaPrimeira = new javax.swing.JButton();
        neutroCurvaRapidaSalvar = new javax.swing.JButton();
        neutroCurvaRapidaCorrenteCadastro = new javax.swing.JComboBox();
        jLabel91 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        neutroCurvaRapidaSegunda = new javax.swing.JTable();
        neutroCurvaRapidaDialExistente = new javax.swing.JComboBox();
        neutroCurvaRapidaCorrenteExistente = new javax.swing.JComboBox();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        avancarNeutroCurvaRapida = new javax.swing.JButton();
        cancelarNeutroCurvaRapida = new javax.swing.JButton();
        retornarNeutroCurvaRapida = new javax.swing.JButton();
        Painel3 = new javax.swing.JPanel();
        correntePickup1 = new javax.swing.JPanel();
        cardLayout3 = new javax.swing.JPanel();
        faseInstantaneaFirst = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        definidaFaseCorrenteValores = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        definidaFaseTempoLenta = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        definidaFaseTempoRapida = new javax.swing.JTextField();
        faseInstantaneaSecond = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        faseMinimo = new javax.swing.JTextField();
        faseMaximo = new javax.swing.JTextField();
        fasePasso = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        faseMinimoRapido = new javax.swing.JTextField();
        faseMaximoRapido = new javax.swing.JTextField();
        fasePassoRapido = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        faseMinimoLenta = new javax.swing.JTextField();
        faseMaximoLenta = new javax.swing.JTextField();
        fasePassoLenta = new javax.swing.JTextField();
        avancarDefinidaFase = new javax.swing.JButton();
        retornarDefinidaFase = new javax.swing.JButton();
        cancelarDefinidaFase = new javax.swing.JButton();
        definidaFaseFator = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        correntePickup2 = new javax.swing.JPanel();
        cardLayout6 = new javax.swing.JPanel();
        neutroInstantaneaFirst = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        definidaNeutroCorrenteValores = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        definidaNeutroTempoLenta = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        definidaNeutroTempoRapida = new javax.swing.JTextField();
        neutroInstantaneaSecond = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        neutroMinimo = new javax.swing.JTextField();
        neutroMaximo = new javax.swing.JTextField();
        neutroPasso = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        neutroMinimoLento = new javax.swing.JTextField();
        neutroMaximoLento = new javax.swing.JTextField();
        neutroPassoLento = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        neutroMinimoRapido = new javax.swing.JTextField();
        neutroMaximoRapido = new javax.swing.JTextField();
        neutroPassoRapido = new javax.swing.JTextField();
        avancarDefinidaNeutro = new javax.swing.JButton();
        retornarDefinidaNeutro = new javax.swing.JButton();
        cancelarDefinidaNeutro = new javax.swing.JButton();
        definidaNeutroFator = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Religador");

        tabbedPane.setPreferredSize(new java.awt.Dimension(880, 580));

        jLabel1.setText("Fabricante :");

        jLabel2.setText("Modelo :");

        jLabel3.setText("Curva inversa : ");

        jLabel4.setText("Curva de tempo definido:");

        curvaInversaFase.setText("Fase");

        curvaInversaNeutro.setText("Neutro");

        curvaTempoFase.setText("Fase");

        curvaTempoNeutro.setText("Neutro");

        avancarDadosGerais.setText("Avançar");
        avancarDadosGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarDadosGeraisActionPerformed(evt);
            }
        });

        cancelarDadosGerais.setText("Cancelar");
        cancelarDadosGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarDadosGeraisActionPerformed(evt);
            }
        });

        jLabel41.setText("Tipo de equipamento :");

        tipoDeEquipamento.add(eletromecanico);
        eletromecanico.setText("Eletromecânico");

        tipoDeEquipamento.add(digital);
        digital.setText("Digital");

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarDadosGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avancarDadosGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(Painel1Layout.createSequentialGroup()
                                    .addComponent(eletromecanico, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(digital))
                                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addGroup(Painel1Layout.createSequentialGroup()
                                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(6, 6, 6)
                                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(Painel1Layout.createSequentialGroup()
                                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(6, 6, 6)
                                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel1Layout.createSequentialGroup()
                                        .addComponent(curvaInversaFase)
                                        .addGap(6, 6, 6)
                                        .addComponent(curvaInversaNeutro))
                                    .addGroup(Painel1Layout.createSequentialGroup()
                                        .addComponent(curvaTempoFase)
                                        .addGap(6, 6, 6)
                                        .addComponent(curvaTempoNeutro)))))
                        .addGap(0, 525, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eletromecanico)
                    .addComponent(digital))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(curvaInversaFase)
                    .addComponent(curvaInversaNeutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(curvaTempoFase)
                    .addComponent(curvaTempoNeutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarDadosGerais)
                    .addComponent(cancelarDadosGerais))
                .addContainerGap())
        );

        tabbedPane.addTab("Dados gerais", Painel1);

        temporizadaFase.setPreferredSize(new java.awt.Dimension(880, 553));

        cardLayout1.setLayout(new java.awt.CardLayout());

        jLabel11.setText("Valores separados por vírgula :");

        javax.swing.GroupLayout faseCorrenteFirstLayout = new javax.swing.GroupLayout(faseCorrenteFirst);
        faseCorrenteFirst.setLayout(faseCorrenteFirstLayout);
        faseCorrenteFirstLayout.setHorizontalGroup(
            faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCorrenteFirstLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(inversaFaseCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        faseCorrenteFirstLayout.setVerticalGroup(
            faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCorrenteFirstLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(inversaFaseCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(350, 350, 350))
        );

        cardLayout1.add(faseCorrenteFirst, "faseCorrenteFirst");

        jLabel5.setText("Mínimo (A) :");

        jLabel9.setText("Máximo (A) :");

        jLabel10.setText("Passo (A) :");

        javax.swing.GroupLayout faseCorrenteSecondLayout = new javax.swing.GroupLayout(faseCorrenteSecond);
        faseCorrenteSecond.setLayout(faseCorrenteSecondLayout);
        faseCorrenteSecondLayout.setHorizontalGroup(
            faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCorrenteSecondLayout.createSequentialGroup()
                .addGroup(faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addGroup(faseCorrenteSecondLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel10)))
                .addGap(3, 3, 3)
                .addGroup(faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faseCorrentePasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCorrenteMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCorrenteMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        faseCorrenteSecondLayout.setVerticalGroup(
            faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCorrenteSecondLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(faseCorrenteMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCorrenteMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(faseCorrentePasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        cardLayout1.add(faseCorrenteSecond, "faseCorrenteSecond");

        avancarInversaFaseCorrente.setText("Avançar");
        avancarInversaFaseCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarInversaFaseCorrenteActionPerformed(evt);
            }
        });

        retornarInversaFaseCorrente.setText("Retornar");
        retornarInversaFaseCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarInversaFaseCorrenteActionPerformed(evt);
            }
        });

        cancelarInversaFaseCorrente.setText("Cancelar");
        cancelarInversaFaseCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInversaFaseCorrenteActionPerformed(evt);
            }
        });

        jLabel43.setText("Fator de início da curva :");

        javax.swing.GroupLayout correntePickupLayout = new javax.swing.GroupLayout(correntePickup);
        correntePickup.setLayout(correntePickupLayout);
        correntePickupLayout.setHorizontalGroup(
            correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickupLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardLayout1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(correntePickupLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InversaFaseCorrenteFator, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarInversaFaseCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarInversaFaseCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarInversaFaseCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        correntePickupLayout.setVerticalGroup(
            correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickupLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InversaFaseCorrenteFator, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarInversaFaseCorrente)
                    .addComponent(retornarInversaFaseCorrente)
                    .addComponent(cancelarInversaFaseCorrente))
                .addContainerGap())
        );

        temporizadaFase.addTab("Corrente de pickup", correntePickup);

        jPanel5.setPreferredSize(new java.awt.Dimension(875, 526));

        cardLayout2.setLayout(new java.awt.CardLayout());

        faseCurvaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar dial de tempo"));
        jPanel4.setVerifyInputWhenFocusTarget(false);

        jLabel8.setText("Dial de tempo :");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane1.setViewportView(faseCurvaPrimeira);

        faseCurvaGrafico.setText("Gráfico");
        faseCurvaGrafico.setPreferredSize(new java.awt.Dimension(84, 26));

        faseCurvaRemovePrimeira.setText("-");
        faseCurvaRemovePrimeira.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaRemovePrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRemovePrimeiraActionPerformed(evt);
            }
        });

        faseCurvaAdicionaPrimeira.setText("+");
        faseCurvaAdicionaPrimeira.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaAdicionaPrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaAdicionaPrimeiraActionPerformed(evt);
            }
        });

        faseCurvaSalvar.setText("Salvar");
        faseCurvaSalvar.setPreferredSize(new java.awt.Dimension(78, 26));
        faseCurvaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaSalvarActionPerformed(evt);
            }
        });

        jLabel7.setText("Corrente de pickup :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(faseCurvaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(faseCurvaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(faseCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(faseCurvaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faseCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(faseCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(faseCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(faseCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Dial de tempo cadastrados"));
        jPanel7.setPreferredSize(new java.awt.Dimension(424, 432));

        jScrollPane0.setViewportView(faseCurvaSegunda);

        faseCurvaDialExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaDialExistenteActionPerformed(evt);
            }
        });

        faseCurvaCorrenteExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaCorrenteExistenteActionPerformed(evt);
            }
        });

        jLabel33.setText("Corrente de pickup :");

        jLabel34.setText("Dial de tempo :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(49, 49, 49)
                        .addComponent(faseCurvaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(6, 6, 6)
                        .addComponent(faseCurvaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane0, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane0, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout faseCurvaFirstLayout = new javax.swing.GroupLayout(faseCurvaFirst);
        faseCurvaFirst.setLayout(faseCurvaFirstLayout);
        faseCurvaFirstLayout.setHorizontalGroup(
            faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        faseCurvaFirstLayout.setVerticalGroup(
            faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        cardLayout2.add(faseCurvaFirst, "faseCurvaFirst");

        jLabel13.setText("Multiplicador de tempo :");

        jLabel14.setText("Mínimo (A) :");
        jLabel14.setPreferredSize(new java.awt.Dimension(85, 15));

        jLabel15.setText("Máximo (A) :");

        jLabel16.setText("Passo (A) :");
        jLabel16.setPreferredSize(new java.awt.Dimension(85, 15));

        jScrollPane2.setViewportView(faseCurvaCaracteristicas);

        jLabel17.setText("Características da curva :");

        faseCurvaAdicionaCaracteristicas.setText("+");
        faseCurvaAdicionaCaracteristicas.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaAdicionaCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaAdicionaCaracteristicasActionPerformed(evt);
            }
        });

        faseCurvaRemoveCaracteristicas.setText("-");
        faseCurvaRemoveCaracteristicas.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaRemoveCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRemoveCaracteristicasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout faseCurvaSecondLayout = new javax.swing.GroupLayout(faseCurvaSecond);
        faseCurvaSecond.setLayout(faseCurvaSecondLayout);
        faseCurvaSecondLayout.setHorizontalGroup(
            faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(faseCurvaSecondLayout.createSequentialGroup()
                        .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faseCurvaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17)
                    .addGroup(faseCurvaSecondLayout.createSequentialGroup()
                        .addComponent(faseCurvaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        faseCurvaSecondLayout.setVerticalGroup(
            faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(faseCurvaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        cardLayout2.add(faseCurvaSecond, "faseCurvaSecond");

        avancarFaseCurva.setText("Avançar");
        avancarFaseCurva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarFaseCurvaActionPerformed(evt);
            }
        });

        cancelarFaseCurva.setText("Cancelar");
        cancelarFaseCurva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFaseCurvaActionPerformed(evt);
            }
        });

        retornarFaseCurva.setText("Retornar");
        retornarFaseCurva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarFaseCurvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarFaseCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarFaseCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarFaseCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(cardLayout2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(cardLayout2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarFaseCurva)
                    .addComponent(cancelarFaseCurva)
                    .addComponent(retornarFaseCurva))
                .addContainerGap())
        );

        temporizadaFase.addTab("Curvas lentas", jPanel5);

        jPanel14.setPreferredSize(new java.awt.Dimension(875, 526));

        cardLayout8.setLayout(new java.awt.CardLayout());

        faseCurvaRapidaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar dial de tempo"));
        jPanel17.setVerifyInputWhenFocusTarget(false);

        jLabel54.setText("Dial de tempo :");

        jScrollPane3.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane3.setViewportView(faseCurvaRapidaPrimeira);

        faseCurvaRapidaGrafico.setText("Gráfico");
        faseCurvaRapidaGrafico.setPreferredSize(new java.awt.Dimension(84, 26));

        faseCurvaRapidaRemovePrimeira.setText("-");
        faseCurvaRapidaRemovePrimeira.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaRapidaRemovePrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRapidaRemovePrimeiraActionPerformed(evt);
            }
        });

        faseCurvaRapidaAdicionaPrimeira.setText("+");
        faseCurvaRapidaAdicionaPrimeira.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaRapidaAdicionaPrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRapidaAdicionaPrimeiraActionPerformed(evt);
            }
        });

        faseCurvaRapidaSalvar.setText("Salvar");
        faseCurvaRapidaSalvar.setPreferredSize(new java.awt.Dimension(78, 26));
        faseCurvaRapidaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRapidaSalvarActionPerformed(evt);
            }
        });

        jLabel55.setText("Corrente de pickup :");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(6, 6, 6)
                                .addComponent(faseCurvaRapidaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(6, 6, 6)
                                .addComponent(faseCurvaRapidaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(faseCurvaRapidaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(faseCurvaRapidaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faseCurvaRapidaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(faseCurvaRapidaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaRapidaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(12, 12, 12)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaRapidaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(faseCurvaRapidaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRapidaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(faseCurvaRapidaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRapidaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Dial de tempo cadastrados"));
        jPanel18.setPreferredSize(new java.awt.Dimension(424, 432));

        jScrollPane7.setViewportView(faseCurvaRapidaSegunda);

        faseCurvaRapidaDialExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRapidaDialExistenteActionPerformed(evt);
            }
        });

        faseCurvaRapidaCorrenteExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRapidaCorrenteExistenteActionPerformed(evt);
            }
        });

        jLabel56.setText("Corrente de pickup :");

        jLabel57.setText("Dial de tempo :");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(49, 49, 49)
                        .addComponent(faseCurvaRapidaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(6, 6, 6)
                        .addComponent(faseCurvaRapidaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaRapidaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(12, 12, 12)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaRapidaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout faseCurvaRapidaFirstLayout = new javax.swing.GroupLayout(faseCurvaRapidaFirst);
        faseCurvaRapidaFirst.setLayout(faseCurvaRapidaFirstLayout);
        faseCurvaRapidaFirstLayout.setHorizontalGroup(
            faseCurvaRapidaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaRapidaFirstLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        faseCurvaRapidaFirstLayout.setVerticalGroup(
            faseCurvaRapidaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaRapidaFirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(faseCurvaRapidaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faseCurvaRapidaFirstLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
                .addContainerGap())
        );

        cardLayout8.add(faseCurvaRapidaFirst, "faseCurvaRapidaFirst");

        jLabel58.setText("Multiplicador de tempo :");

        jLabel59.setText("Mínimo (A) :");
        jLabel59.setPreferredSize(new java.awt.Dimension(85, 15));

        jLabel60.setText("Máximo (A) :");

        jLabel61.setText("Passo (A) :");
        jLabel61.setPreferredSize(new java.awt.Dimension(85, 15));

        faseCurvaRapidaCaracteristicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(faseCurvaRapidaCaracteristicas);

        jLabel62.setText("Características da curva :");

        faseCurvaRapidaAdicionaCaracteristicas.setText("+");
        faseCurvaRapidaAdicionaCaracteristicas.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaRapidaAdicionaCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRapidaAdicionaCaracteristicasActionPerformed(evt);
            }
        });

        faseCurvaRapidaRemoveCaracteristicas.setText("-");
        faseCurvaRapidaRemoveCaracteristicas.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaRapidaRemoveCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRapidaRemoveCaracteristicasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout faseCurvaRapidaSecondLayout = new javax.swing.GroupLayout(faseCurvaRapidaSecond);
        faseCurvaRapidaSecond.setLayout(faseCurvaRapidaSecondLayout);
        faseCurvaRapidaSecondLayout.setHorizontalGroup(
            faseCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaRapidaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(faseCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addGroup(faseCurvaRapidaSecondLayout.createSequentialGroup()
                        .addGroup(faseCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(faseCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faseCurvaRapidaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaRapidaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaRapidaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel62)
                    .addGroup(faseCurvaRapidaSecondLayout.createSequentialGroup()
                        .addComponent(faseCurvaRapidaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRapidaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        faseCurvaRapidaSecondLayout.setVerticalGroup(
            faseCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaRapidaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRapidaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(faseCurvaRapidaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaRapidaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaRapidaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRapidaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        cardLayout8.add(faseCurvaRapidaSecond, "faseCurvaRapidaSecond");

        avancarFaseCurvaRapida.setText("Avançar");
        avancarFaseCurvaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarFaseCurvaRapidaActionPerformed(evt);
            }
        });

        cancelarFaseCurvaRapida.setText("Cancelar");
        cancelarFaseCurvaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFaseCurvaRapidaActionPerformed(evt);
            }
        });

        retornarFaseCurvaRapida.setText("Retornar");
        retornarFaseCurvaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarFaseCurvaRapidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarFaseCurvaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarFaseCurvaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarFaseCurvaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(cardLayout8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(cardLayout8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarFaseCurvaRapida)
                    .addComponent(cancelarFaseCurvaRapida)
                    .addComponent(retornarFaseCurvaRapida))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        temporizadaFase.addTab("Curvas rápidas", jPanel10);

        tabbedPane.addTab("Inversa de fase", temporizadaFase);

        cardLayout4.setLayout(new java.awt.CardLayout());

        jLabel36.setText("Valores separados por vírgula :");

        javax.swing.GroupLayout neutroCorrenteFirstLayout = new javax.swing.GroupLayout(neutroCorrenteFirst);
        neutroCorrenteFirst.setLayout(neutroCorrenteFirstLayout);
        neutroCorrenteFirstLayout.setHorizontalGroup(
            neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteFirstLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel36)
                .addGap(6, 6, 6)
                .addComponent(inversaNeutroCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        neutroCorrenteFirstLayout.setVerticalGroup(
            neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteFirstLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(inversaNeutroCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(356, Short.MAX_VALUE))
        );

        cardLayout4.add(neutroCorrenteFirst, "neutroCorrenteFirst");

        jLabel20.setText("Mínimo (A) :");

        jLabel21.setText("Máximo (A) :");

        jLabel22.setText("Passo (A) :");

        javax.swing.GroupLayout neutroCorrenteSecondLayout = new javax.swing.GroupLayout(neutroCorrenteSecond);
        neutroCorrenteSecond.setLayout(neutroCorrenteSecondLayout);
        neutroCorrenteSecondLayout.setHorizontalGroup(
            neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteSecondLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addGroup(neutroCorrenteSecondLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel22)))
                .addGap(3, 3, 3)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(neutroCorrentePasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCorrenteMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCorrenteMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        neutroCorrenteSecondLayout.setVerticalGroup(
            neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteSecondLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(neutroCorrenteMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCorrenteMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(6, 6, 6)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(neutroCorrentePasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        cardLayout4.add(neutroCorrenteSecond, "neutroCorrenteSecond");

        avancarInversaNeutroCorrente.setText("Avançar");
        avancarInversaNeutroCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarInversaNeutroCorrenteActionPerformed(evt);
            }
        });

        retornarInversaNeutroCorrente.setText("Retornar");
        retornarInversaNeutroCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarInversaNeutroCorrenteActionPerformed(evt);
            }
        });

        cancelarInversaNeutroCorrente.setText("Cancelar");
        cancelarInversaNeutroCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInversaNeutroCorrenteActionPerformed(evt);
            }
        });

        jLabel49.setText("Fator de início da curva :");

        javax.swing.GroupLayout correntePickup3Layout = new javax.swing.GroupLayout(correntePickup3);
        correntePickup3.setLayout(correntePickup3Layout);
        correntePickup3Layout.setHorizontalGroup(
            correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup3Layout.createSequentialGroup()
                .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(correntePickup3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(correntePickup3Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inversaNeutroCorrenteFator, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cardLayout4, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup3Layout.createSequentialGroup()
                        .addContainerGap(549, Short.MAX_VALUE)
                        .addComponent(cancelarInversaNeutroCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retornarInversaNeutroCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(avancarInversaNeutroCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        correntePickup3Layout.setVerticalGroup(
            correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inversaNeutroCorrenteFator, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(correntePickup3Layout.createSequentialGroup()
                        .addComponent(cardLayout4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup3Layout.createSequentialGroup()
                        .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avancarInversaNeutroCorrente)
                            .addComponent(retornarInversaNeutroCorrente)
                            .addComponent(cancelarInversaNeutroCorrente))
                        .addGap(12, 12, 12))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correntePickup3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correntePickup3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("Corrente de pickup", jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(870, 526));

        jPanel6.setPreferredSize(new java.awt.Dimension(875, 526));

        cardLayout5.setLayout(new java.awt.CardLayout());

        jLabel39.setText("Multiplicador de tempo :");

        jLabel40.setText("Mínimo (A) :");
        jLabel40.setPreferredSize(new java.awt.Dimension(85, 15));

        jLabel50.setText("Máximo (A) :");

        jLabel51.setText("Passo (A) :");
        jLabel51.setPreferredSize(new java.awt.Dimension(85, 15));

        jScrollPane6.setViewportView(neutroCurvaCaracteristicas);

        jLabel52.setText("Características da curva :");

        neutroCurvaAdicionaCaracteristicas.setText("+");
        neutroCurvaAdicionaCaracteristicas.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaAdicionaCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaAdicionaCaracteristicasActionPerformed(evt);
            }
        });

        neutroCurvaRemoveCaracteristicas.setText("-");
        neutroCurvaRemoveCaracteristicas.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaRemoveCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaRemoveCaracteristicasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout neutroCurvaSecondLayout = new javax.swing.GroupLayout(neutroCurvaSecond);
        neutroCurvaSecond.setLayout(neutroCurvaSecondLayout);
        neutroCurvaSecondLayout.setHorizontalGroup(
            neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addGroup(neutroCurvaSecondLayout.createSequentialGroup()
                        .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroCurvaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel52)
                    .addGroup(neutroCurvaSecondLayout.createSequentialGroup()
                        .addComponent(neutroCurvaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        neutroCurvaSecondLayout.setVerticalGroup(
            neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(neutroCurvaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        cardLayout5.add(neutroCurvaSecond, "neutroCurvaSecond");

        neutroCurvaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar dial de tempo"));
        jPanel8.setPreferredSize(new java.awt.Dimension(420, 432));

        jLabel30.setText("Dial de tempo :");

        jScrollPane4.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane4.setViewportView(neutroCurvaPrimeira);

        neutroCurvaGrafico.setText("Gráfico");
        neutroCurvaGrafico.setPreferredSize(new java.awt.Dimension(84, 26));

        neutroCurvaRemovePrimeira.setText("-");
        neutroCurvaRemovePrimeira.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaRemovePrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaRemovePrimeiraActionPerformed(evt);
            }
        });

        neutroCurvaAdicionaPrimeira.setText("+");
        neutroCurvaAdicionaPrimeira.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaAdicionaPrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaAdicionaPrimeiraActionPerformed(evt);
            }
        });

        neutroCurvaSalvar.setText("Salvar");
        neutroCurvaSalvar.setPreferredSize(new java.awt.Dimension(78, 26));
        neutroCurvaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaSalvarActionPerformed(evt);
            }
        });

        jLabel29.setText("Corrente de pickup :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(6, 6, 6)
                        .addComponent(neutroCurvaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(6, 6, 6)
                        .addComponent(neutroCurvaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(neutroCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(neutroCurvaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(neutroCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(neutroCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Dial de tempo cadastrados"));
        jPanel9.setPreferredSize(new java.awt.Dimension(424, 432));

        jScrollPane9.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane9.setViewportView(neutroCurvaSegunda);

        neutroCurvaDialExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaDialExistenteActionPerformed(evt);
            }
        });

        neutroCurvaCorrenteExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaCorrenteExistenteActionPerformed(evt);
            }
        });

        jLabel31.setText("Corrente de pickup :");

        jLabel32.setText("Dial de tempo :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel31)
                        .addGap(6, 6, 6)
                        .addComponent(neutroCurvaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(neutroCurvaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout neutroCurvaFirstLayout = new javax.swing.GroupLayout(neutroCurvaFirst);
        neutroCurvaFirst.setLayout(neutroCurvaFirstLayout);
        neutroCurvaFirstLayout.setHorizontalGroup(
            neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        neutroCurvaFirstLayout.setVerticalGroup(
            neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardLayout5.add(neutroCurvaFirst, "neutroCurvaFirst");

        avancarNeutroCurva.setText("Avançar");
        avancarNeutroCurva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarNeutroCurvaActionPerformed(evt);
            }
        });

        cancelarNeutroCurva.setText("Cancelar");
        cancelarNeutroCurva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarNeutroCurvaActionPerformed(evt);
            }
        });

        retornarNeutroCurva.setText("Retornar");
        retornarNeutroCurva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarNeutroCurvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarNeutroCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarNeutroCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarNeutroCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addComponent(cardLayout5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(cardLayout5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retornarNeutroCurva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(avancarNeutroCurva)
                        .addComponent(cancelarNeutroCurva)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Curvas lentas", jPanel3);

        jPanel11.setPreferredSize(new java.awt.Dimension(875, 526));

        cardLayout7.setLayout(new java.awt.CardLayout());

        jLabel85.setText("Multiplicador de tempo :");

        jLabel86.setText("Mínimo (A) :");
        jLabel86.setPreferredSize(new java.awt.Dimension(85, 15));

        jLabel87.setText("Máximo (A) :");

        jLabel88.setText("Passo (A) :");
        jLabel88.setPreferredSize(new java.awt.Dimension(85, 15));

        jScrollPane8.setViewportView(neutroCurvaRapidaCaracteristicas);

        jLabel89.setText("Características da curva :");

        neutroCurvaAdicionaCaracteristicas2.setText("+");
        neutroCurvaAdicionaCaracteristicas2.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaAdicionaCaracteristicas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaAdicionaCaracteristicas2ActionPerformed(evt);
            }
        });

        neutroCurvaRemoveCaracteristicas2.setText("-");
        neutroCurvaRemoveCaracteristicas2.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaRemoveCaracteristicas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaRemoveCaracteristicas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout neutroCurvaRapidaSecondLayout = new javax.swing.GroupLayout(neutroCurvaRapidaSecond);
        neutroCurvaRapidaSecond.setLayout(neutroCurvaRapidaSecondLayout);
        neutroCurvaRapidaSecondLayout.setHorizontalGroup(
            neutroCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaRapidaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(neutroCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85)
                    .addGroup(neutroCurvaRapidaSecondLayout.createSequentialGroup()
                        .addGroup(neutroCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(neutroCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroCurvaRapidaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaRapidaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaRapidaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel89)
                    .addGroup(neutroCurvaRapidaSecondLayout.createSequentialGroup()
                        .addComponent(neutroCurvaAdicionaCaracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaRemoveCaracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        neutroCurvaRapidaSecondLayout.setVerticalGroup(
            neutroCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaRapidaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaRapidaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(neutroCurvaRapidaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaRapidaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaRapidaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaAdicionaCaracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaRemoveCaracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        cardLayout7.add(neutroCurvaRapidaSecond, "neutroCurvaRapidaSecond");

        neutroCurvaRapidaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar dial de tempo"));
        jPanel12.setPreferredSize(new java.awt.Dimension(420, 432));

        jLabel90.setText("Dial de tempo :");

        jScrollPane5.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane5.setViewportView(neutroCurvaRapidaPrimeira);

        neutroCurvaRapidaGrafico.setText("Gráfico");
        neutroCurvaRapidaGrafico.setPreferredSize(new java.awt.Dimension(84, 26));

        neutroCurvaRapidaRemovePrimeira.setText("-");
        neutroCurvaRapidaRemovePrimeira.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaRapidaRemovePrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaRapidaRemovePrimeiraActionPerformed(evt);
            }
        });

        neutroCurvaRapidaAdicionaPrimeira.setText("+");
        neutroCurvaRapidaAdicionaPrimeira.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaRapidaAdicionaPrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaRapidaAdicionaPrimeiraActionPerformed(evt);
            }
        });

        neutroCurvaRapidaSalvar.setText("Salvar");
        neutroCurvaRapidaSalvar.setPreferredSize(new java.awt.Dimension(78, 26));
        neutroCurvaRapidaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaRapidaSalvarActionPerformed(evt);
            }
        });

        jLabel91.setText("Corrente de pickup :");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addGap(6, 6, 6)
                        .addComponent(neutroCurvaRapidaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addGap(6, 6, 6)
                        .addComponent(neutroCurvaRapidaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(neutroCurvaRapidaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaRapidaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroCurvaRapidaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaRapidaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(neutroCurvaRapidaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaRapidaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90))
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(neutroCurvaRapidaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaRapidaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(neutroCurvaRapidaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaRapidaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Dial de tempo cadastrados"));
        jPanel13.setPreferredSize(new java.awt.Dimension(424, 432));

        jScrollPane10.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane10.setViewportView(neutroCurvaRapidaSegunda);

        neutroCurvaRapidaDialExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaRapidaDialExistenteActionPerformed(evt);
            }
        });

        neutroCurvaRapidaCorrenteExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaRapidaCorrenteExistenteActionPerformed(evt);
            }
        });

        jLabel92.setText("Corrente de pickup :");

        jLabel93.setText("Dial de tempo :");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel92)
                        .addGap(6, 6, 6)
                        .addComponent(neutroCurvaRapidaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(neutroCurvaRapidaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaRapidaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92))
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaRapidaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout neutroCurvaRapidaFirstLayout = new javax.swing.GroupLayout(neutroCurvaRapidaFirst);
        neutroCurvaRapidaFirst.setLayout(neutroCurvaRapidaFirstLayout);
        neutroCurvaRapidaFirstLayout.setHorizontalGroup(
            neutroCurvaRapidaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaRapidaFirstLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        neutroCurvaRapidaFirstLayout.setVerticalGroup(
            neutroCurvaRapidaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaRapidaFirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(neutroCurvaRapidaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardLayout7.add(neutroCurvaRapidaFirst, "neutroCurvaRapidaFirst");

        avancarNeutroCurvaRapida.setText("Avançar");
        avancarNeutroCurvaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarNeutroCurvaRapidaActionPerformed(evt);
            }
        });

        cancelarNeutroCurvaRapida.setText("Cancelar");
        cancelarNeutroCurvaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarNeutroCurvaRapidaActionPerformed(evt);
            }
        });

        retornarNeutroCurvaRapida.setText("Retornar");
        retornarNeutroCurvaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarNeutroCurvaRapidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarNeutroCurvaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarNeutroCurvaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarNeutroCurvaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addComponent(cardLayout7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(cardLayout7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarNeutroCurvaRapida)
                    .addComponent(retornarNeutroCurvaRapida)
                    .addComponent(cancelarNeutroCurvaRapida))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Curvas rápidas", jPanel11);

        tabbedPane.addTab("Inversa de neutro", jTabbedPane1);

        cardLayout3.setLayout(new java.awt.CardLayout());

        jLabel44.setText("Valores separados por vírgula :");

        jLabel23.setText("Corrente de pickup");

        jLabel24.setText("Tempo de atuação de curva lenta");

        jLabel25.setText("Valores separados por vírgula:");

        jLabel83.setText("Tempo de atuação de curva rápida");

        jLabel84.setText("Valores separados por vírgula:");

        javax.swing.GroupLayout faseInstantaneaFirstLayout = new javax.swing.GroupLayout(faseInstantaneaFirst);
        faseInstantaneaFirst.setLayout(faseInstantaneaFirstLayout);
        faseInstantaneaFirstLayout.setHorizontalGroup(
            faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(6, 6, 6)
                        .addComponent(definidaFaseCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(definidaFaseTempoRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel83)
                    .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(6, 6, 6)
                        .addComponent(definidaFaseTempoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        faseInstantaneaFirstLayout.setVerticalGroup(
            faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(6, 6, 6)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(definidaFaseCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel25)
                    .addComponent(definidaFaseTempoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(definidaFaseTempoRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cardLayout3.add(faseInstantaneaFirst, "faseInstantaneaFirst");

        jLabel6.setText("Mínimo (A) :");

        jLabel12.setText("Máximo (A) :");

        jLabel42.setText("Passo (A) :");

        jLabel38.setText("Corrente de pickup");

        jLabel53.setText("Multiplicador de tempo de curva rápida");

        jLabel67.setText("Minimo (A) :");

        jLabel68.setText("Máximo (A) :");

        jLabel69.setText("Passo (A) :");

        jLabel70.setText("Multiplicador de tempo de curva lenta");

        jLabel71.setText("Mínimo (A) :");

        jLabel72.setText("Máximo (A) :");

        jLabel73.setText("Passo (A) :");

        javax.swing.GroupLayout faseInstantaneaSecondLayout = new javax.swing.GroupLayout(faseInstantaneaSecond);
        faseInstantaneaSecond.setLayout(faseInstantaneaSecondLayout);
        faseInstantaneaSecondLayout.setHorizontalGroup(
            faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel42)))
                        .addGap(3, 3, 3)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fasePasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(193, 193, 193)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseMinimoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseMinimoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel53)
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fasePassoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseMaximoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel70)
                    .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, faseInstantaneaSecondLayout.createSequentialGroup()
                            .addComponent(jLabel73)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fasePassoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                            .addComponent(jLabel72)
                            .addGap(9, 9, 9)
                            .addComponent(faseMaximoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        faseInstantaneaSecondLayout.setVerticalGroup(
            faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(faseMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(faseMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(fasePasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(faseMinimoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(faseMaximoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(fasePassoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(jLabel70)
                .addGap(6, 6, 6)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faseMinimoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseMaximoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73)
                    .addComponent(fasePassoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        cardLayout3.add(faseInstantaneaSecond, "faseInstantaneaSecond");

        avancarDefinidaFase.setText("Avançar");
        avancarDefinidaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarDefinidaFaseActionPerformed(evt);
            }
        });

        retornarDefinidaFase.setText("Retornar");
        retornarDefinidaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarDefinidaFaseActionPerformed(evt);
            }
        });

        cancelarDefinidaFase.setText("Cancelar");
        cancelarDefinidaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarDefinidaFaseActionPerformed(evt);
            }
        });

        jLabel45.setText("Fator de início da curva :");

        javax.swing.GroupLayout correntePickup1Layout = new javax.swing.GroupLayout(correntePickup1);
        correntePickup1.setLayout(correntePickup1Layout);
        correntePickup1Layout.setHorizontalGroup(
            correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardLayout3, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(correntePickup1Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(definidaFaseFator, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelarDefinidaFase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarDefinidaFase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(avancarDefinidaFase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        correntePickup1Layout.setVerticalGroup(
            correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(definidaFaseFator, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retornarDefinidaFase)
                    .addComponent(cancelarDefinidaFase)
                    .addComponent(avancarDefinidaFase))
                .addContainerGap())
        );

        javax.swing.GroupLayout Painel3Layout = new javax.swing.GroupLayout(Painel3);
        Painel3.setLayout(Painel3Layout);
        Painel3Layout.setHorizontalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correntePickup1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Painel3Layout.setVerticalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correntePickup1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Definida de fase", Painel3);

        cardLayout6.setLayout(new java.awt.CardLayout());

        jLabel46.setText("Valores separados por vírgula :");

        definidaNeutroCorrenteValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definidaNeutroCorrenteValoresActionPerformed(evt);
            }
        });

        jLabel26.setText("Corrente de pickup");

        jLabel27.setText("Tempo de atuação da curva lenta");

        jLabel28.setText("Valores separados por vírgula:");

        jLabel35.setText("Tempo de atuação da curva rápida");

        jLabel37.setText("Valores separados por vírgula:");

        javax.swing.GroupLayout neutroInstantaneaFirstLayout = new javax.swing.GroupLayout(neutroInstantaneaFirst);
        neutroInstantaneaFirst.setLayout(neutroInstantaneaFirstLayout);
        neutroInstantaneaFirstLayout.setHorizontalGroup(
            neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(6, 6, 6)
                        .addComponent(definidaNeutroCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26))
                .addGap(28, 28, 28)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel35)
                    .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                            .addComponent(jLabel37)
                            .addGap(6, 6, 6)
                            .addComponent(definidaNeutroTempoRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(6, 6, 6)
                            .addComponent(definidaNeutroTempoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        neutroInstantaneaFirstLayout.setVerticalGroup(
            neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(definidaNeutroCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(definidaNeutroTempoLenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(definidaNeutroTempoRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
        );

        cardLayout6.add(neutroInstantaneaFirst, "neutroInstantaneaFirst");

        jLabel18.setText("Mínimo (A) :");

        jLabel19.setText("Máximo (A) :");

        jLabel47.setText("Passo (A) :");

        jLabel74.setText("Corrente de pickup");

        jLabel75.setText("Multiplicador de tempo de curva lenta");

        jLabel76.setText("Máximo (A) :");

        jLabel77.setText("Mínimo (A) :");

        jLabel78.setText("Passo (A) :");

        neutroMinimoLento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroMinimoLentoActionPerformed(evt);
            }
        });

        jLabel79.setText("Multiplicador de tempo de curva rápida");

        jLabel80.setText("Mínimo (A) :");

        jLabel81.setText("Máximo (A) :");

        jLabel82.setText("Passo (A) :");

        javax.swing.GroupLayout neutroInstantaneaSecondLayout = new javax.swing.GroupLayout(neutroInstantaneaSecond);
        neutroInstantaneaSecond.setLayout(neutroInstantaneaSecondLayout);
        neutroInstantaneaSecondLayout.setHorizontalGroup(
            neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, neutroInstantaneaSecondLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74)
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, neutroInstantaneaSecondLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroMinimoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel79)
                    .addComponent(jLabel75)
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroMinimoLento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                            .addComponent(jLabel78)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(neutroPassoLento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                            .addComponent(jLabel76)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(neutroMaximoLento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroMaximoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroPassoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(151, 151, 151))
        );
        neutroInstantaneaSecondLayout.setVerticalGroup(
            neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(neutroMinimoLento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(neutroMaximoLento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(neutroPassoLento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(neutroMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(neutroMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(neutroPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))))
                .addGap(61, 61, 61)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(neutroMinimoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(neutroMaximoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(neutroPassoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        cardLayout6.add(neutroInstantaneaSecond, "neutroInstantaneaSecond");

        avancarDefinidaNeutro.setText("Avançar");
        avancarDefinidaNeutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarDefinidaNeutroActionPerformed(evt);
            }
        });

        retornarDefinidaNeutro.setText("Retornar");
        retornarDefinidaNeutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarDefinidaNeutroActionPerformed(evt);
            }
        });

        cancelarDefinidaNeutro.setText("Cancelar");
        cancelarDefinidaNeutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarDefinidaNeutroActionPerformed(evt);
            }
        });

        jLabel48.setText("Fator de início da curva :");

        javax.swing.GroupLayout correntePickup2Layout = new javax.swing.GroupLayout(correntePickup2);
        correntePickup2.setLayout(correntePickup2Layout);
        correntePickup2Layout.setHorizontalGroup(
            correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarDefinidaNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarDefinidaNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarDefinidaNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(correntePickup2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardLayout6, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(correntePickup2Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(definidaNeutroFator, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        correntePickup2Layout.setVerticalGroup(
            correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(definidaNeutroFator, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout6, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avancarDefinidaNeutro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(retornarDefinidaNeutro)
                        .addComponent(cancelarDefinidaNeutro)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correntePickup2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correntePickup2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Definida de neutro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarDadosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarDadosGeraisActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarDadosGeraisActionPerformed

    private void retornarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarFaseCurvaActionPerformed
        if (this.newReligador.getTipo() == Religador.ELETROMECANICO) {
            ((ReligadorEletromecanico) this.newReligador).removeDialDeTempo(Religador.INVERSA_FASE, false);
            this.faseCurvaDialExistente.removeAllItems();
        }
        int selecionado = this.temporizadaFase.getSelectedIndex();

        this.temporizadaFase.setSelectedIndex(selecionado - 1);
    }//GEN-LAST:event_retornarFaseCurvaActionPerformed

    private void cancelarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFaseCurvaActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarFaseCurvaActionPerformed

    private void avancarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarFaseCurvaActionPerformed
        if (!this.isEletromecanico()) {
            String min = this.faseCurvaMinimo.getText();
            String max = this.faseCurvaMaximo.getText();
            String pas = this.faseCurvaPasso.getText();

            if (!min.equals("") && !max.equals("") && !pas.equals("")) {
                double minimo = Double.parseDouble(min);
                double maximo = Double.parseDouble(max);
                double passo = Double.parseDouble(pas);

                if (StringUtils.verificaExpressao(minimo, maximo, passo)) {
                    ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.INVERSA_FASE, minimo, maximo, passo, false);
                    ((ReligadorDigital) this.newReligador).setListaFaseLenta(this.modeloFaseCaracteristicas.getArrayList());
                    int selecionado = this.temporizadaFase.getSelectedIndex();

                    this.temporizadaFase.setSelectedIndex(selecionado + 1);
                } else {
                    Erro.expressaoInvalida(this);
                }
            } else {
                Erro.camposVazios(this);
            }
        } else {
            int selecionado = this.temporizadaFase.getSelectedIndex();

            this.temporizadaFase.setSelectedIndex(selecionado + 1);
        }
    }//GEN-LAST:event_avancarFaseCurvaActionPerformed

    private void cancelarInversaFaseCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInversaFaseCorrenteActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarInversaFaseCorrenteActionPerformed

    private void retornarInversaFaseCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarInversaFaseCorrenteActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_retornarInversaFaseCorrenteActionPerformed

    private void avancarInversaFaseCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarInversaFaseCorrenteActionPerformed
        String f = this.InversaFaseCorrenteFator.getText();

        if (!f.equals("")) {
            if (this.isEletromecanico()) {
                String valores = this.inversaFaseCorrenteValores.getText();

                if (!valores.equals("")) {
                    ArrayList<Double> list = this.separaValores(valores);
                    double fator = Double.parseDouble(f);

                    ((ReligadorEletromecanico) this.newReligador).addCorrentePickup(list, Religador.INVERSA_FASE);
                    this.newReligador.setFatorInicio(fator, Religador.INVERSA_FASE);
                    this.addCorrentePickupFase(list);
                    int selecionado = this.temporizadaFase.getSelectedIndex();

                    this.temporizadaFase.setSelectedIndex(selecionado + 1);
                } else {
                    Erro.camposVazios(this);
                }
            } else {
                String min = this.faseCorrenteMinimo.getText();
                String max = this.faseCorrenteMaximo.getText();
                String pas = this.faseCorrentePasso.getText();

                if (!min.equals("") && !max.equals("") && !pas.equals("")) {
                    double minimo = Double.parseDouble(min);
                    double maximo = Double.parseDouble(max);
                    double passo = Double.parseDouble(pas);
                    double fator = Double.parseDouble(f);

                    if (StringUtils.verificaExpressao(minimo, maximo, passo)) {
                        this.newReligador.setFatorInicio(fator, Religador.INVERSA_FASE);
                        ((ReligadorDigital) this.newReligador).setValuesCorrente(Religador.INVERSA_FASE, minimo, maximo, passo);
                        int selecionado = this.temporizadaFase.getSelectedIndex();

                        this.temporizadaFase.setSelectedIndex(selecionado + 1);
                    } else {
                        Erro.expressaoInvalida(this);
                    }
                } else {
                    Erro.camposVazios(this);
                }
            }
        } else {
            Erro.camposVazios(this);
        }
    }//GEN-LAST:event_avancarInversaFaseCorrenteActionPerformed

    private void avancarDefinidaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarDefinidaFaseActionPerformed
        String f = this.definidaFaseFator.getText();

        if (!f.equals("")) {
            if (this.isEletromecanico()) {
                String c = this.definidaFaseCorrenteValores.getText();
                String t_1 = this.definidaFaseTempoLenta.getText();
                String t_2 = this.definidaFaseTempoRapida.getText();
                double fator = Double.parseDouble(f);

                if (!c.equals("") && !t_1.equals("") && !t_2.equals("")) {
                    this.newReligador.setFatorInicio(fator, Religador.DEFINIDO_FASE);
                    ArrayList<Double> lista_corrente = this.separaValores(c);
                    ArrayList<Double> tempoLento = this.separaValores(t_1);
                    ArrayList<Double> tempoRapido = this.separaValores(t_2);

                    ((ReligadorEletromecanico) this.newReligador).addCorrentePickup(lista_corrente, Religador.DEFINIDO_FASE);
                    ((ReligadorEletromecanico) this.newReligador).addTempoDeAtuacao(Religador.DEFINIDO_FASE, tempoLento, false);
                    ((ReligadorEletromecanico) this.newReligador).addTempoDeAtuacao(Religador.DEFINIDO_FASE, tempoRapido, true);
                    this.avancarTela();
                } else {
                    Erro.camposVazios(this);
                }
            } else {
                String minimo_corrente = this.faseMinimo.getText();
                String maximo_corrente = this.faseMaximo.getText();
                String passo_corrente = this.fasePasso.getText();

                String minimo_tempoRapido = this.faseMinimoRapido.getText();
                String maximo_tempoRapido = this.faseMaximoRapido.getText();
                String passo_tempoRapido = this.fasePassoRapido.getText();

                String minimo_tempoLento = this.faseMinimoLenta.getText();
                String maximo_tempoLento = this.faseMaximoLenta.getText();
                String passo_tempoLento = this.fasePassoLenta.getText();

                double fator = Double.parseDouble(f);

                if ((!minimo_corrente.equals("") && !maximo_corrente.equals("") && !passo_corrente.equals(""))
                    && (!minimo_tempoLento.equals("") && !maximo_tempoLento.equals("") && !passo_tempoLento.equals(""))
                    && (!minimo_tempoRapido.equals("") && !maximo_tempoRapido.equals("") && !passo_tempoRapido.equals(""))) {

                    double min_c = Double.parseDouble(minimo_corrente);
                    double max_c = Double.parseDouble(maximo_corrente);
                    double pas_c = Double.parseDouble(passo_corrente);

                    double min_tl = Double.parseDouble(minimo_tempoLento);
                    double max_tl = Double.parseDouble(maximo_tempoLento);
                    double pas_tl = Double.parseDouble(passo_tempoLento);

                    double min_tr = Double.parseDouble(minimo_tempoRapido);
                    double max_tr = Double.parseDouble(maximo_tempoRapido);
                    double pas_tr = Double.parseDouble(passo_tempoRapido);

                    if (StringUtils.verificaExpressao(min_c, max_c, pas_c)
                            && StringUtils.verificaExpressao(min_tl, max_tl, pas_tl)
                            && StringUtils.verificaExpressao(min_tr, max_tr, pas_tr)) {

                        this.newReligador.setFatorInicio(fator, Religador.DEFINIDO_FASE);

                        ((ReligadorDigital) this.newReligador).setValuesCorrente(Religador.DEFINIDO_FASE, min_c, max_c, pas_c);

                        ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.DEFINIDO_FASE, min_tl, max_tl, pas_tl, false);

                        ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.DEFINIDO_FASE, min_tr, max_tr, pas_tr, true);

                        this.avancarTela();
                    } else {
                        Erro.expressaoInvalida(this);
                    }
                } else {
                    Erro.camposVazios(this);
                }
            }
        }
    }//GEN-LAST:event_avancarDefinidaFaseActionPerformed

    private void retornarDefinidaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarDefinidaFaseActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_retornarDefinidaFaseActionPerformed

    private void cancelarDefinidaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarDefinidaFaseActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarDefinidaFaseActionPerformed

    private void avancarDefinidaNeutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarDefinidaNeutroActionPerformed
        String f = this.definidaNeutroFator.getText();

        if (!f.equals("")) {

            if (this.isEletromecanico()) {
                String c = this.definidaNeutroCorrenteValores.getText();
                String t_1 = this.definidaNeutroTempoLenta.getText();
                String t_2 = this.definidaNeutroTempoRapida.getText();
                double fator = Double.parseDouble(f);

                if (!c.equals("") && !t_1.equals("") && !t_2.equals("")) {
                    List<Double> lista_corrente = this.separaValores(c);
                    List<Double> lista_tempoLenta = this.separaValores(t_1);
                    List<Double> lista_tempoRapida = this.separaValores(t_2);
                    
                    this.newReligador.setFatorInicio(fator, Religador.DEFINIDO_NEUTRO);
                    ((ReligadorEletromecanico) this.newReligador).addCorrentePickup(lista_corrente, Religador.DEFINIDO_NEUTRO);
                    ((ReligadorEletromecanico) this.newReligador).addTempoDeAtuacao(Religador.DEFINIDO_NEUTRO, (ArrayList<Double>) lista_tempoLenta,  false);
                    ((ReligadorEletromecanico) this.newReligador).addTempoDeAtuacao(Religador.DEFINIDO_NEUTRO, (ArrayList<Double>) lista_tempoRapida, true);

                    Gson g = new Gson();
                    Arquivo a = new Arquivo("Gson.ini");
                    String s = g.toJson(this.newReligador);
                    a.escreverArquivo(s);
                    /*try {
                     ReligadorDao.insereReligador(this.newReligador);
                     } catch (SQLException ex) {
                     Erro.mostraMensagemSQL(this);
                     ex.printStackTrace();
                     }*/

                } else {
                    Erro.camposVazios(this);
                }
            } else {
                String minimo_corrente = this.neutroMinimo.getText();
                String maximo_corrente = this.neutroMaximo.getText();
                String passo_corrente = this.neutroPasso.getText();

                String minimo_tempoRapido = this.neutroMinimoRapido.getText();
                String maximo_tempoRapido = this.neutroMaximoRapido.getText();
                String passo_tempoRapido = this.neutroPassoRapido.getText();

                String minimo_tempoLento = this.neutroMinimoLento.getText();
                String maximo_tempoLento = this.neutroMaximoLento.getText();
                String passo_tempoLento = this.neutroPassoLento.getText();

                double fator = Double.parseDouble(f);

                if (!minimo_corrente.equals("") && !maximo_corrente.equals("") && !passo_corrente.equals("")
                        && !minimo_tempoLento.equals("") && !maximo_tempoLento.equals("") && !passo_tempoLento.equals("")
                        && !minimo_tempoRapido.equals("") && !maximo_tempoRapido.equals("") && !passo_tempoRapido.equals("")) {

                    double min_c = Double.parseDouble(minimo_corrente);
                    double max_c = Double.parseDouble(maximo_corrente);
                    double pas_c = Double.parseDouble(passo_corrente);

                    double min_tl = Double.parseDouble(minimo_tempoLento);
                    double max_tl = Double.parseDouble(maximo_tempoLento);
                    double pas_tl = Double.parseDouble(passo_tempoLento);

                    double min_tr = Double.parseDouble(minimo_tempoRapido);
                    double max_tr = Double.parseDouble(maximo_tempoRapido);
                    double pas_tr = Double.parseDouble(passo_tempoRapido);

                    if (StringUtils.verificaExpressao(min_c, max_c, pas_c)
                            && StringUtils.verificaExpressao(min_tl, max_tl, pas_tl)
                            && StringUtils.verificaExpressao(min_tr, max_tr, pas_tr)) {

                        this.newReligador.setFatorInicio(fator, Religador.DEFINIDO_NEUTRO);

                        ((ReligadorDigital) this.newReligador).setValuesCorrente(Religador.DEFINIDO_NEUTRO, min_c, max_c, pas_c);

                        ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.DEFINIDO_NEUTRO, min_tl, max_tl, pas_tl, false);

                        ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.DEFINIDO_NEUTRO, min_tr, max_tr, pas_tr, true);

                        this.avancarTela();
                    } else {
                        Erro.expressaoInvalida(this);
                    }
                } else {
                    Erro.camposVazios(this);
                }
            }
        }
    }//GEN-LAST:event_avancarDefinidaNeutroActionPerformed

    private void retornarDefinidaNeutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarDefinidaNeutroActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_retornarDefinidaNeutroActionPerformed

    private void cancelarDefinidaNeutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarDefinidaNeutroActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarDefinidaNeutroActionPerformed

    private void avancarNeutroCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarNeutroCurvaActionPerformed
        if (!this.isEletromecanico()) {
            String min = this.neutroCurvaMinimo.getText();
            String max = this.neutroCurvaMaximo.getText();
            String pas = this.neutroCurvaPasso.getText();

            if (!min.equals("") && !max.equals("") && !pas.equals("")) {
                double minimo = Double.parseDouble(this.neutroCurvaMinimo.getText());
                double maximo = Double.parseDouble(this.neutroCurvaMaximo.getText());
                double passo = Double.parseDouble(this.neutroCurvaPasso.getText());

                if (StringUtils.verificaExpressao(minimo, maximo, passo)) {
                    ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.INVERSA_NEUTRO, minimo, maximo, passo, false);
                    ((ReligadorDigital) this.newReligador).setListaNeutroLenta(this.modeloNeutroCaracteristicas.getArrayList());
                    int selecionado = this.jTabbedPane1.getSelectedIndex();

                    this.jTabbedPane1.setSelectedIndex(selecionado + 1);
                }
            }
        } else {
            int selecionado = this.jTabbedPane1.getSelectedIndex();

            this.jTabbedPane1.setSelectedIndex(selecionado + 1);
        }
    }//GEN-LAST:event_avancarNeutroCurvaActionPerformed

    private void cancelarNeutroCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarNeutroCurvaActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarNeutroCurvaActionPerformed

    private void retornarNeutroCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarNeutroCurvaActionPerformed
        if (this.newReligador.getTipo() == Religador.ELETROMECANICO) {
            ((ReligadorEletromecanico) this.newReligador).removeDialDeTempo(Religador.INVERSA_NEUTRO, false);
        }
        int selecionado = this.jTabbedPane1.getSelectedIndex();

        this.jTabbedPane1.setSelectedIndex(selecionado - 1);
    }//GEN-LAST:event_retornarNeutroCurvaActionPerformed

    private void cancelarInversaNeutroCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInversaNeutroCorrenteActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarInversaNeutroCorrenteActionPerformed

    private void retornarInversaNeutroCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarInversaNeutroCorrenteActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_retornarInversaNeutroCorrenteActionPerformed

    private void avancarInversaNeutroCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarInversaNeutroCorrenteActionPerformed
        String f = this.inversaNeutroCorrenteFator.getText();

        if (!f.equals("")) {
            if (this.isEletromecanico()) {
                String v = this.inversaNeutroCorrenteValores.getText();
                double fator = Double.parseDouble(f);

                if (!v.equals("")) {
                    this.newReligador.setFatorInicio(fator, Religador.INVERSA_NEUTRO);
                    List<Double> lista = this.separaValores(v);

                    ((ReligadorEletromecanico) this.newReligador).addCorrentePickup(lista, Religador.INVERSA_NEUTRO);
                    this.addCorrentePickupNeutro(lista);
                    int selecionado = this.jTabbedPane1.getSelectedIndex();

                    this.jTabbedPane1.setSelectedIndex(selecionado + 1);
                }
            } else {
                String min = this.neutroCorrenteMinimo.getText();
                String max = this.neutroCorrenteMaximo.getText();
                String pas = this.neutroCorrentePasso.getText();
                double fator = Double.parseDouble(f);

                if (!min.equals("") && !max.equals("") && !pas.equals("")) {
                    double minimo = Double.parseDouble(this.neutroCorrenteMinimo.getText());
                    double maximo = Double.parseDouble(this.neutroCorrenteMaximo.getText());
                    double passo = Double.parseDouble(this.neutroCorrentePasso.getText());

                    if (StringUtils.verificaExpressao(minimo, maximo, passo)) {
                        this.newReligador.setFatorInicio(fator, Religador.INVERSA_NEUTRO);
                        ((ReligadorDigital) this.newReligador).setValuesCorrente(Religador.INVERSA_NEUTRO, minimo, maximo, passo);
                        int selecionado = this.jTabbedPane1.getSelectedIndex();

                        this.jTabbedPane1.setSelectedIndex(selecionado + 1);
                    }
                }
            }
        }
    }//GEN-LAST:event_avancarInversaNeutroCorrenteActionPerformed

    private void neutroCurvaAdicionaCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaAdicionaCaracteristicasActionPerformed
        this.modeloNeutroCaracteristicas.add(new CaracteristicasCurva("-", 0.0, 0.0, 0.0));
        this.modeloNeutroCaracteristicas.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaAdicionaCaracteristicasActionPerformed

    private void faseCurvaAdicionaCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaAdicionaCaracteristicasActionPerformed
        this.modeloFaseCaracteristicas.add(new CaracteristicasCurva("-", 0.0, 0.0, 0.0));
        this.modeloFaseCaracteristicas.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaAdicionaCaracteristicasActionPerformed

    private void faseCurvaRemoveCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRemoveCaracteristicasActionPerformed
        int selecionado = this.faseCurvaCaracteristicas.getSelectedRow();

        this.modeloFaseCaracteristicas.remove(selecionado);
        this.modeloFaseCaracteristicas.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaRemoveCaracteristicasActionPerformed

    private void faseCurvaAdicionaPrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaAdicionaPrimeiraActionPerformed
        this.modeloFaseCriarDial.add(new PontoCurva(0, 0));
        this.modeloFaseCriarDial.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaAdicionaPrimeiraActionPerformed

    private void faseCurvaRemovePrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRemovePrimeiraActionPerformed
        int selecionado = this.faseCurvaPrimeira.getSelectedRow();

        this.modeloFaseCriarDial.remove(selecionado);
        this.modeloFaseCriarDial.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaRemovePrimeiraActionPerformed

    private void neutroCurvaRemoveCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRemoveCaracteristicasActionPerformed
        int selecionado = this.neutroCurvaCaracteristicas.getSelectedRow();

        this.modeloNeutroCaracteristicas.remove(selecionado);
        this.modeloNeutroCaracteristicas.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaRemoveCaracteristicasActionPerformed

    private void definidaNeutroCorrenteValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definidaNeutroCorrenteValoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_definidaNeutroCorrenteValoresActionPerformed

    private void faseCurvaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaSalvarActionPerformed
        salvarFaseDialCadastradoComPontos();
    }//GEN-LAST:event_faseCurvaSalvarActionPerformed

    private void salvarFaseDialCadastradoComPontos() {
        String c = String.valueOf(this.faseCurvaCorrenteCadastro.getSelectedItem());
        String d = this.faseCurvaDial.getText();

        if (!c.equals("") && !d.equals("")) {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            List<PontoCurva> pontos = this.modeloFaseCriarDial.getArrayList();
            List<Double> valores = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_FASE, false, corrente);

            if (valores.isEmpty() || valores.indexOf(dial) == -1) {
                ((ReligadorEletromecanico) this.newReligador).addDialDeTempo(Religador.INVERSA_FASE, false, corrente, dial, (ArrayList<PontoCurva>) pontos);
                this.faseCurvaDial.setText("");
                this.modeloFaseCriarDial.removeTodos();
                this.modeloFaseCriarDial.fireTableDataChanged();
            } else {
                Erro.valorCadastrado(this);
            }
        } else {
            Erro.camposVazios(this);
        }
    }

    private void salvarNeutroDialCadastradoComPontos() {
        String c = String.valueOf(this.neutroCurvaCorrenteCadastro.getSelectedItem());
        String d = this.neutroCurvaDial.getText();

        if (!c.equals("") && !d.equals("")) {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            ArrayList<PontoCurva> pontos = this.modeloNeutroCriaDial.getArrayList();
            List<Double> valores = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_NEUTRO, false, corrente);

            if (valores.isEmpty() || valores.indexOf(dial) == -1) {
                ((ReligadorEletromecanico) this.newReligador).addDialDeTempo(Religador.INVERSA_NEUTRO, false, corrente, dial, pontos);
                this.neutroCurvaDial.setText("");
                this.modeloNeutroCriaDial.removeTodos();
                this.modeloNeutroCriaDial.fireTableDataChanged();
            } else {
                Erro.valorCadastrado(this);
            }
        } else {
            Erro.camposVazios(this);
        }

    }

    private void faseCurvaCorrenteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaCorrenteExistenteActionPerformed
        try {
            carregarFaseDialCadastradoEmCorrente();
        } catch (NullPointerException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_faseCurvaCorrenteExistenteActionPerformed

    private void carregarFaseDialCadastradoEmCorrente() throws NullPointerException {
        String str = String.valueOf(this.faseCurvaCorrenteExistente.getSelectedItem());

        if (str.equals("null")) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(str);

            List<Double> dial;
            dial = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_FASE, false, corrente);
            System.out.println(dial.size());
            this.faseCurvaDialExistente.removeAllItems();
            for (Double d : dial) {
                this.faseCurvaDialExistente.addItem(d);
            }
        }
    }

    private void carregaDialCadastradoEmCorrente(int tipo) {
        String str = String.valueOf(this.neutroCurvaCorrenteExistente.getSelectedItem());
        double corrente = Double.parseDouble(str);

        List<Double> dial = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(tipo, false, corrente);
        this.neutroCurvaDialExistente.removeAllItems();
        for (Double d : dial) {
            this.neutroCurvaDialExistente.addItem(d);
        }
    }

    private void faseCurvaDialExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaDialExistenteActionPerformed
        try {
            carregarFasePontosDeDial();
        } catch (NullPointerException e) {
            this.modeloFaseExistenteDial.removeTodos();
            this.modeloFaseExistenteDial.fireTableDataChanged();
        }
    }//GEN-LAST:event_faseCurvaDialExistenteActionPerformed

    private void carregarFasePontosDeDial() throws NullPointerException {
        String c = String.valueOf(this.faseCurvaCorrenteExistente.getSelectedItem());
        String d = String.valueOf(this.faseCurvaDialExistente.getSelectedItem());

        if (c.equals("null") || d.equals("null")) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            List<PontoCurva> list;
            list = ((ReligadorEletromecanico) this.newReligador).getPontosDialDeTempo(corrente, dial, Religador.INVERSA_FASE, false);

            this.modeloFaseExistenteDial.removeTodos();
            this.modeloFaseExistenteDial.add((ArrayList<PontoCurva>) list);
            this.modeloFaseExistenteDial.fireTableDataChanged();
        }
    }

    private void carregarNeutroPontosDeDial() throws NullPointerException {
        String c = String.valueOf(this.neutroCurvaCorrenteExistente.getSelectedItem());
        String d = String.valueOf(this.neutroCurvaDialExistente.getSelectedItem());

        if (c.equals("null") || d.equals("null")) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            List<PontoCurva> list;
            list = ((ReligadorEletromecanico) this.newReligador).getPontosDialDeTempo(corrente, dial, Religador.INVERSA_NEUTRO, false);

            this.modeloNeutroExistenteDial.removeTodos();
            this.modeloNeutroExistenteDial.add((ArrayList<PontoCurva>) list);
            this.modeloNeutroExistenteDial.fireTableDataChanged();
        }

    }

    private void neutroCurvaRemovePrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRemovePrimeiraActionPerformed
        int selecionado = this.neutroCurvaPrimeira.getSelectedRow();

        this.modeloNeutroCriaDial.remove(selecionado);
        this.modeloNeutroCriaDial.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaRemovePrimeiraActionPerformed

    private void neutroCurvaAdicionaPrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaAdicionaPrimeiraActionPerformed
        this.modeloNeutroCriaDial.add(new PontoCurva(0, 0));
        this.modeloNeutroCriaDial.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaAdicionaPrimeiraActionPerformed

    private void neutroCurvaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaSalvarActionPerformed
        this.salvarNeutroDialCadastradoComPontos();
    }//GEN-LAST:event_neutroCurvaSalvarActionPerformed

    private void neutroCurvaDialExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaDialExistenteActionPerformed
        try {
            carregarNeutroPontosDeDial();
        } catch (NullPointerException e) {
            this.modeloNeutroExistenteDial.removeTodos();
            this.modeloNeutroExistenteDial.fireTableDataChanged();
        }
    }//GEN-LAST:event_neutroCurvaDialExistenteActionPerformed

    private void neutroCurvaCorrenteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaCorrenteExistenteActionPerformed
        try {
            carregarNeutroDialCadastradoEmCorrente();
        } catch (NullPointerException e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_neutroCurvaCorrenteExistenteActionPerformed

    private void carregarNeutroDialCadastradoEmCorrente() throws NullPointerException {
        String c = String.valueOf(this.neutroCurvaCorrenteExistente.getSelectedItem());

        if (c.equals("null")) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(c);
            List<Double> dial;
            dial = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_NEUTRO, false, corrente);

            this.neutroCurvaDialExistente.removeAllItems();
            for (Double d : dial) {
                this.neutroCurvaDialExistente.addItem(d);
            }
        }
    }

    private void neutroCurvaAdicionaCaracteristicas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaAdicionaCaracteristicas2ActionPerformed
        this.modeloNeutroCaracteristicasRapida.add(new CaracteristicasCurva("-", 0.0, 0.0, 0.0));
        this.modeloNeutroCaracteristicasRapida.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaAdicionaCaracteristicas2ActionPerformed

    private void neutroCurvaRemoveCaracteristicas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRemoveCaracteristicas2ActionPerformed
        int selecionado = this.neutroCurvaRapidaCaracteristicas.getSelectedRow();

        this.modeloNeutroCaracteristicasRapida.remove(selecionado);
        this.modeloNeutroCaracteristicasRapida.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaRemoveCaracteristicas2ActionPerformed

    private void neutroCurvaRapidaRemovePrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRapidaRemovePrimeiraActionPerformed
        int selecionado = this.neutroCurvaRapidaPrimeira.getSelectedRow();

        this.modeloNeutroCriaDialRapido.remove(selecionado);
        this.modeloNeutroCriaDialRapido.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaRapidaRemovePrimeiraActionPerformed

    private void neutroCurvaRapidaAdicionaPrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRapidaAdicionaPrimeiraActionPerformed
        this.modeloNeutroCriaDialRapido.add(new PontoCurva(0, 0));
        this.modeloNeutroCriaDialRapido.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaRapidaAdicionaPrimeiraActionPerformed

    private void neutroCurvaRapidaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRapidaSalvarActionPerformed
        this.salvarNeutroDialCadastradoComPontosRapido();
    }//GEN-LAST:event_neutroCurvaRapidaSalvarActionPerformed

    private void salvarNeutroDialCadastradoComPontosRapido() {
        String c = String.valueOf(this.neutroCurvaRapidaCorrenteCadastro.getSelectedItem());
        String d = this.neutroCurvaRapidaDial.getText();

        if (!c.equals("") && !d.equals("")) {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            List<PontoCurva> pontos = this.modeloNeutroCriaDialRapido.getArrayList();
            List<Double> valores = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_NEUTRO, true, corrente);
            
            if (valores.isEmpty() || valores.indexOf(dial) == -1) {
                ((ReligadorEletromecanico) this.newReligador).addDialDeTempo(Religador.INVERSA_NEUTRO, true, corrente, dial, (ArrayList<PontoCurva>) pontos);
                this.neutroCurvaRapidaDial.setText("");
                this.modeloNeutroCriaDialRapido.removeTodos();
                this.modeloNeutroCriaDialRapido.fireTableDataChanged();
            } else {
                Erro.valorCadastrado(this);
            }
        } else {
            Erro.camposVazios(this);
        }
    }
    
    private void neutroCurvaRapidaDialExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRapidaDialExistenteActionPerformed
        try {
            carregarNeutroPontosDeDialRapido();
        } catch (NullPointerException e) {
            this.modeloNeutroExistenteDialRapido.removeTodos();
            this.modeloNeutroExistenteDialRapido.fireTableDataChanged();
        }
    }//GEN-LAST:event_neutroCurvaRapidaDialExistenteActionPerformed

    private void carregarNeutroPontosDeDialRapido() throws NullPointerException {
        String c = String.valueOf(this.neutroCurvaRapidaCorrenteExistente.getSelectedItem());
        String d = String.valueOf(this.neutroCurvaRapidaDialExistente.getSelectedItem());

        if (c.equals("null") || d.equals("null")) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            List<PontoCurva> list;
            list = ((ReligadorEletromecanico) this.newReligador).getPontosDialDeTempo(corrente, dial, Religador.INVERSA_NEUTRO, true);

            this.modeloNeutroExistenteDialRapido.removeTodos();
            this.modeloNeutroExistenteDialRapido.add((ArrayList<PontoCurva>) list);
            this.modeloNeutroExistenteDialRapido.fireTableDataChanged();
        }
    }
    
    private void neutroCurvaRapidaCorrenteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRapidaCorrenteExistenteActionPerformed
        try {
            carregarNeutroDialCadastradoEmCorrenteRapida();
        } catch (NullPointerException e) {
            System.out.println("error");
        }
    }//GEN-LAST:event_neutroCurvaRapidaCorrenteExistenteActionPerformed

    private void carregarNeutroDialCadastradoEmCorrenteRapida() throws NullPointerException {
        String c = String.valueOf(this.neutroCurvaRapidaCorrenteExistente.getSelectedItem());

        if (c.equals("null")) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(c);
            List<Double> dial;
            dial = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_NEUTRO, true, corrente);

            this.neutroCurvaRapidaDialExistente.removeAllItems();
            for (Double d : dial) {
                this.neutroCurvaRapidaDialExistente.addItem(d);
            }
        }
    }
    
    private void avancarNeutroCurvaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarNeutroCurvaRapidaActionPerformed
        if (!this.isEletromecanico()) {
            String minimo = this.neutroCurvaRapidaMinimo.getText();
            String maximo = this.neutroCurvaRapidaMaximo.getText();
            String passo = this.neutroCurvaRapidaPasso.getText();

            if (!minimo.equals("") && !maximo.equals("") && !passo.equals("")) {
                double min = Double.parseDouble(this.neutroCurvaRapidaMinimo.getText());
                double max = Double.parseDouble(this.neutroCurvaRapidaMaximo.getText());
                double pas = Double.parseDouble(this.neutroCurvaRapidaPasso.getText());

                if (StringUtils.verificaExpressao(min, max, pas)) {
                    ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.INVERSA_NEUTRO, min, max, pas, true);
                    ((ReligadorDigital) this.newReligador).setListaNeutroRapida(this.modeloNeutroCaracteristicasRapida.getArrayList());
                    this.avancarTela();
                }
            }
        } else {
            this.avancarTela();
        }
    }//GEN-LAST:event_avancarNeutroCurvaRapidaActionPerformed

    private void cancelarNeutroCurvaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarNeutroCurvaRapidaActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarNeutroCurvaRapidaActionPerformed

    private void retornarNeutroCurvaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarNeutroCurvaRapidaActionPerformed
        if (this.newReligador.getTipo() == Religador.ELETROMECANICO) {
            ((ReligadorEletromecanico) this.newReligador).removeDialDeTempo(Religador.INVERSA_NEUTRO, true);
        }
        int selecionado = this.jTabbedPane1.getSelectedIndex();

        this.jTabbedPane1.setSelectedIndex(selecionado - 1);
    }//GEN-LAST:event_retornarNeutroCurvaRapidaActionPerformed

    private void avancarDadosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarDadosGeraisActionPerformed
        String fab = this.fabricante.getText();
        String mod = this.modelo.getText();

        if (!fab.equals("") && !mod.equals("")) {
            if (this.isEletromecanico()) {
                this.newReligador = new ReligadorEletromecanico();
            } else {
                this.newReligador = new ReligadorDigital();
            }
            this.newReligador.setFabricante(fab);
            this.newReligador.setModelo(mod);
            this.configurarPaineis();
            this.selecionarCards();
            this.avancarTela();
        } else {
            Erro.camposVazios(this);
        }
    }//GEN-LAST:event_avancarDadosGeraisActionPerformed

    private void faseCurvaRapidaRemovePrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRapidaRemovePrimeiraActionPerformed
        int selecionado = this.faseCurvaRapidaPrimeira.getSelectedRow();

        this.modeloFaseCriarDialRapido.remove(selecionado);
        this.modeloFaseCriarDialRapido.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaRapidaRemovePrimeiraActionPerformed

    private void faseCurvaRapidaAdicionaPrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRapidaAdicionaPrimeiraActionPerformed
        this.modeloFaseCriarDialRapido.add(new PontoCurva(0, 0));
        this.modeloFaseCriarDialRapido.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaRapidaAdicionaPrimeiraActionPerformed

    private void faseCurvaRapidaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRapidaSalvarActionPerformed
        salvarFaseDialCadastradoComPontosRapidos();
    }//GEN-LAST:event_faseCurvaRapidaSalvarActionPerformed

    private void salvarFaseDialCadastradoComPontosRapidos() {
        String c = String.valueOf(this.faseCurvaRapidaCorrenteCadastro.getSelectedItem());
        String d = String.valueOf(this.faseCurvaRapidaDial.getText());

        if (!c.equals("") && !d.equals("")) {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            ArrayList<PontoCurva> pontos = this.modeloFaseCriarDialRapido.getArrayList();
            List<Double> valores = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_FASE, false, corrente);

            if (valores.isEmpty() || valores.indexOf(dial) == -1) {
                ((ReligadorEletromecanico) this.newReligador).addDialDeTempo(Religador.INVERSA_FASE, true, corrente, dial, (ArrayList<PontoCurva>) pontos);
                this.faseCurvaRapidaDial.setText("");
                this.modeloFaseCriarDialRapido.removeTodos();
                this.modeloFaseCriarDialRapido.fireTableDataChanged();
            } else {
                Erro.valorCadastrado(this);
            }
        } else {
            Erro.camposVazios(this);
        }
    }


    private void faseCurvaRapidaDialExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRapidaDialExistenteActionPerformed
        try {
            carregarFasePontosDeDialRapido();
        } catch (NullPointerException e) {
            this.modeloFaseExistenteDialRapido.removeTodos();
            this.modeloFaseExistenteDialRapido.fireTableDataChanged();
        }
    }//GEN-LAST:event_faseCurvaRapidaDialExistenteActionPerformed

    private void carregarFasePontosDeDialRapido() throws NullPointerException {
        String c = String.valueOf(this.faseCurvaRapidaCorrenteExistente.getSelectedItem());
        String d = String.valueOf(this.faseCurvaRapidaDialExistente.getSelectedItem());

        System.out.println(c + " " + d);

        if (c.equals("null") || d.equals("null")) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            List<PontoCurva> list;
            list = ((ReligadorEletromecanico) this.newReligador).getPontosDialDeTempo(corrente, dial, Religador.INVERSA_FASE, true);

            this.modeloFaseExistenteDialRapido.removeTodos();
            this.modeloFaseExistenteDialRapido.add((ArrayList<PontoCurva>) list);
            this.modeloFaseExistenteDialRapido.fireTableDataChanged();
        }
    }

    private void faseCurvaRapidaCorrenteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRapidaCorrenteExistenteActionPerformed
        try {
            carregarFaseDialCadastradoEmCorrenteRapida();
        } catch (NullPointerException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_faseCurvaRapidaCorrenteExistenteActionPerformed

    private void carregarFaseDialCadastradoEmCorrenteRapida() throws NullPointerException {
        String str = String.valueOf(this.faseCurvaRapidaCorrenteExistente.getSelectedItem());

        if (str.equals("null")) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(str);

            List<Double> dial;
            dial = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_FASE, true, corrente);
            this.faseCurvaRapidaDialExistente.removeAllItems();
            for (Double d : dial) {
                this.faseCurvaRapidaDialExistente.addItem(d);
            }
        }
    }

    private void faseCurvaRapidaAdicionaCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRapidaAdicionaCaracteristicasActionPerformed
        this.modeloFaseCaracteristicasRapida.add(new CaracteristicasCurva("-", 0.0, 0.0, 0.0));
        this.modeloFaseCaracteristicasRapida.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaRapidaAdicionaCaracteristicasActionPerformed

    private void faseCurvaRapidaRemoveCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRapidaRemoveCaracteristicasActionPerformed
        int selecionado = this.faseCurvaRapidaCaracteristicas.getSelectedRow();

        this.modeloFaseCaracteristicasRapida.remove(selecionado);
        this.modeloFaseCaracteristicasRapida.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaRapidaRemoveCaracteristicasActionPerformed

    private void avancarFaseCurvaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarFaseCurvaRapidaActionPerformed
        if (!this.isEletromecanico()) {
            String min = this.faseCurvaRapidaMinimo.getText();
            String max = this.faseCurvaRapidaMaximo.getText();
            String pas = this.faseCurvaRapidaPasso.getText();

            if (!min.equals("") && !max.equals("") && !pas.equals("")) {
                double minimo = Double.parseDouble(min);
                double maximo = Double.parseDouble(max);
                double passo = Double.parseDouble(pas);

                if (StringUtils.verificaExpressao(minimo, maximo, passo)) {
                    ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.INVERSA_FASE, minimo, maximo, passo, true);
                    ((ReligadorDigital) this.newReligador).setListaFaseRapida(this.modeloFaseCaracteristicasRapida.getArrayList());
                    this.avancarTela();
                } else {
                    Erro.expressaoInvalida(this);
                }
            }
        } else {
            this.avancarTela();
        }
    }//GEN-LAST:event_avancarFaseCurvaRapidaActionPerformed

    private void cancelarFaseCurvaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFaseCurvaRapidaActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarFaseCurvaRapidaActionPerformed

    private void retornarFaseCurvaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarFaseCurvaRapidaActionPerformed
        if (this.newReligador.getTipo() == Religador.ELETROMECANICO) {
            ((ReligadorEletromecanico) this.newReligador).removeDialDeTempo(Religador.INVERSA_FASE, true);
            this.faseCurvaRapidaDialExistente.removeAllItems();
        }
        int selecionado = this.temporizadaFase.getSelectedIndex();

        this.temporizadaFase.setSelectedIndex(selecionado - 1);
    }//GEN-LAST:event_retornarFaseCurvaRapidaActionPerformed

    private void neutroMinimoLentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroMinimoLentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroMinimoLentoActionPerformed

    private void configurarPaineis() {
        boolean faseTemporizada = this.curvaInversaFase.isSelected();
        boolean faseInstantanea = this.curvaTempoFase.isSelected();
        boolean neutroTemporizada = this.curvaInversaNeutro.isSelected();
        boolean neutroInstantanea = this.curvaTempoNeutro.isSelected();
        this.paineis = new boolean[5];

        this.paineis[0] = true;
        this.paineis[1] = faseTemporizada;
        this.paineis[2] = faseInstantanea;
        this.paineis[3] = neutroTemporizada;
        this.paineis[4] = neutroInstantanea;
    }

    private void desabilitarPaineis(int selecionado) {
        int tabs = this.tabbedPane.getTabCount();

        for (int i = 0; i < tabs; i++) {
            if (i == selecionado) {
                tabbedPane.setEnabledAt(i, true);
            } else {
                this.tabbedPane.setEnabledAt(i, false);
            }
        }
    }

    private void selecionarCards() {
        CardLayout card1 = (CardLayout) this.cardLayout1.getLayout();
        CardLayout card2 = (CardLayout) this.cardLayout2.getLayout();
        CardLayout card3 = (CardLayout) this.cardLayout3.getLayout();
        CardLayout card4 = (CardLayout) this.cardLayout4.getLayout();
        CardLayout card5 = (CardLayout) this.cardLayout5.getLayout();
        CardLayout card6 = (CardLayout) this.cardLayout6.getLayout();
        CardLayout card7 = (CardLayout) this.cardLayout7.getLayout();
        CardLayout card8 = (CardLayout) this.cardLayout8.getLayout();

        if (this.eletromecanico.isSelected()) {
            card1.show(this.cardLayout1, "faseCorrenteFirst");
            card2.show(this.cardLayout2, "faseCurvaFirst");
            card3.show(this.cardLayout3, "faseInstantaneaFirst");
            card4.show(this.cardLayout4, "neutroCorrenteFirst");
            card5.show(this.cardLayout5, "neutroCurvaFirst");
            card6.show(this.cardLayout6, "neutroInstantaneaFirst");
            card7.show(this.cardLayout7, "neutroCurvaRapidaFirst");
            card8.show(this.cardLayout8, "faseCurvaRapidaFirst");
        } else {
            card1.show(this.cardLayout1, "faseCorrenteSecond");
            card2.show(this.cardLayout2, "faseCurvaSecond");
            card3.show(this.cardLayout3, "faseInstantaneaSecond");
            card4.show(this.cardLayout4, "neutroCorrenteSecond");
            card5.show(this.cardLayout5, "neutroCurvaSecond");
            card6.show(this.cardLayout6, "neutroInstantaneaSecond");
            card7.show(this.cardLayout7, "neutroCurvaRapidaSecond");
            card8.show(this.cardLayout8, "faseCurvaRapidaSecond");
        }
    }

    private void avancarTela() {
        while (true && this.getSelected() < this.tabbedPane.getComponentCount()) {
            int selecionado = this.getSelected() + 1;

            this.tabbedPane.setSelectedIndex(selecionado);
            if (this.paineis[selecionado]) {
                this.desabilitarPaineis(selecionado);
                break;
            }
        }
    }

    private void retornarTela() {
        while (true && this.getSelected() > 0) {
            int selecionado = this.getSelected() - 1;

            this.tabbedPane.setSelectedIndex(selecionado);
            if (this.paineis[selecionado]) {
                this.desabilitarPaineis(selecionado);
                break;
            }
        }
    }

    private void configurarTabelas() {
        this.configuraTabelasDigital();
        this.configurarTabelasEletromecanica();
    }

    private void configuraTabelasDigital() {
        this.modeloNeutroCaracteristicas = new CaracteristicasTableModel();
        this.modeloFaseCaracteristicas = new CaracteristicasTableModel();
        this.modeloNeutroCaracteristicasRapida = new CaracteristicasTableModel();
        this.modeloFaseCaracteristicasRapida = new CaracteristicasTableModel();

        this.neutroCurvaCaracteristicas.setModel(modeloNeutroCaracteristicas);
        this.faseCurvaCaracteristicas.setModel(modeloFaseCaracteristicas);
        this.neutroCurvaRapidaCaracteristicas.setModel(modeloNeutroCaracteristicasRapida);
        this.faseCurvaRapidaCaracteristicas.setModel(modeloFaseCaracteristicasRapida);
    }

    private void configurarTabelasEletromecanica() {
        this.modeloFaseCriarDial = new PontoCurvaTableModel();
        this.modeloNeutroCriaDial = new PontoCurvaTableModel();
        this.modeloFaseExistenteDial = new PontoCurvaTableModel();
        this.modeloNeutroExistenteDial = new PontoCurvaTableModel();

        this.modeloFaseCriarDialRapido = new PontoCurvaTableModel();
        this.modeloNeutroCriaDialRapido = new PontoCurvaTableModel();
        this.modeloFaseExistenteDialRapido = new PontoCurvaTableModel();
        this.modeloNeutroExistenteDialRapido = new PontoCurvaTableModel();

        this.faseCurvaPrimeira.setModel(modeloFaseCriarDial);
        this.neutroCurvaPrimeira.setModel(modeloNeutroCriaDial);
        this.faseCurvaSegunda.setModel(modeloFaseExistenteDial);
        this.neutroCurvaSegunda.setModel(modeloNeutroExistenteDial);

        this.faseCurvaRapidaPrimeira.setModel(modeloFaseCriarDialRapido);
        this.neutroCurvaRapidaPrimeira.setModel(modeloNeutroCriaDialRapido);
        this.faseCurvaRapidaSegunda.setModel(modeloFaseExistenteDialRapido);
        this.neutroCurvaRapidaSegunda.setModel(modeloNeutroExistenteDialRapido);
    }

    private void selectCheckBox() {
        this.curvaTempoFase.setSelected(true);
        this.curvaTempoNeutro.setSelected(true);
        this.curvaInversaFase.setSelected(true);
        this.curvaInversaNeutro.setSelected(true);
        this.tipoDeEquipamento.setSelected(this.eletromecanico.getModel(), true);
    }

    private ArrayList<Double> separaValores(String valores) {
        String[] s = valores.split(",");
        ArrayList<Double> a = new ArrayList();

        for (String item : s) {
            if (!item.isEmpty()) {
                String valor = item.trim();
                double d = Double.parseDouble(valor);
                a.add(Double.parseDouble(valor));
            }
        }
        return a;
    }

    private void addCorrentePickupFase(List<Double> valores) {
        this.faseCurvaCorrenteCadastro.removeAllItems();
        this.faseCurvaCorrenteExistente.removeAllItems();
        this.faseCurvaRapidaCorrenteCadastro.removeAllItems();
        this.faseCurvaRapidaCorrenteExistente.removeAllItems();
        for (double d : valores) {
            this.faseCurvaCorrenteCadastro.addItem(d);
            this.faseCurvaCorrenteExistente.addItem(d);
            this.faseCurvaRapidaCorrenteCadastro.addItem(d);
            this.faseCurvaRapidaCorrenteExistente.addItem(d);
        }
    }

    private void addCorrentePickupNeutro(List<Double> valores) {
        this.neutroCurvaCorrenteCadastro.removeAllItems();
        this.neutroCurvaCorrenteExistente.removeAllItems();
        this.neutroCurvaRapidaCorrenteCadastro.removeAllItems();
        this.neutroCurvaRapidaCorrenteExistente.removeAllItems();
        for (Double d : valores) {
            this.neutroCurvaCorrenteCadastro.addItem(d);
            this.neutroCurvaCorrenteExistente.addItem(d);
            this.neutroCurvaRapidaCorrenteCadastro.addItem(d);
            this.neutroCurvaRapidaCorrenteExistente.addItem(d);
        }
    }

    private int getSelected() {
        return this.tabbedPane.getSelectedIndex();
    }

    private boolean isEletromecanico() {
        return this.eletromecanico.isSelected();
    }

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
            java.util.logging.Logger.getLogger(GUI_Religador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Religador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Religador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Religador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Religador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InversaFaseCorrenteFator;
    private javax.swing.JPanel Painel1;
    private javax.swing.JPanel Painel3;
    private javax.swing.JButton avancarDadosGerais;
    private javax.swing.JButton avancarDefinidaFase;
    private javax.swing.JButton avancarDefinidaNeutro;
    private javax.swing.JButton avancarFaseCurva;
    private javax.swing.JButton avancarFaseCurvaRapida;
    private javax.swing.JButton avancarInversaFaseCorrente;
    private javax.swing.JButton avancarInversaNeutroCorrente;
    private javax.swing.JButton avancarNeutroCurva;
    private javax.swing.JButton avancarNeutroCurvaRapida;
    private javax.swing.JButton cancelarDadosGerais;
    private javax.swing.JButton cancelarDefinidaFase;
    private javax.swing.JButton cancelarDefinidaNeutro;
    private javax.swing.JButton cancelarFaseCurva;
    private javax.swing.JButton cancelarFaseCurvaRapida;
    private javax.swing.JButton cancelarInversaFaseCorrente;
    private javax.swing.JButton cancelarInversaNeutroCorrente;
    private javax.swing.JButton cancelarNeutroCurva;
    private javax.swing.JButton cancelarNeutroCurvaRapida;
    private javax.swing.JPanel cardLayout1;
    private javax.swing.JPanel cardLayout2;
    private javax.swing.JPanel cardLayout3;
    private javax.swing.JPanel cardLayout4;
    private javax.swing.JPanel cardLayout5;
    private javax.swing.JPanel cardLayout6;
    private javax.swing.JPanel cardLayout7;
    private javax.swing.JPanel cardLayout8;
    private javax.swing.JPanel correntePickup;
    private javax.swing.JPanel correntePickup1;
    private javax.swing.JPanel correntePickup2;
    private javax.swing.JPanel correntePickup3;
    private javax.swing.JCheckBox curvaInversaFase;
    private javax.swing.JCheckBox curvaInversaNeutro;
    private javax.swing.JCheckBox curvaTempoFase;
    private javax.swing.JCheckBox curvaTempoNeutro;
    private javax.swing.JTextField definidaFaseCorrenteValores;
    private javax.swing.JTextField definidaFaseFator;
    private javax.swing.JTextField definidaFaseTempoLenta;
    private javax.swing.JTextField definidaFaseTempoRapida;
    private javax.swing.JTextField definidaNeutroCorrenteValores;
    private javax.swing.JTextField definidaNeutroFator;
    private javax.swing.JTextField definidaNeutroTempoLenta;
    private javax.swing.JTextField definidaNeutroTempoRapida;
    private javax.swing.JRadioButton digital;
    private javax.swing.JRadioButton eletromecanico;
    private javax.swing.JTextField fabricante;
    private javax.swing.JPanel faseCorrenteFirst;
    private javax.swing.JTextField faseCorrenteMaximo;
    private javax.swing.JTextField faseCorrenteMinimo;
    private javax.swing.JTextField faseCorrentePasso;
    private javax.swing.JPanel faseCorrenteSecond;
    private javax.swing.JButton faseCurvaAdicionaCaracteristicas;
    private javax.swing.JButton faseCurvaAdicionaPrimeira;
    private javax.swing.JTable faseCurvaCaracteristicas;
    private javax.swing.JComboBox faseCurvaCorrenteCadastro;
    private javax.swing.JComboBox faseCurvaCorrenteExistente;
    private javax.swing.JTextField faseCurvaDial;
    private javax.swing.JComboBox faseCurvaDialExistente;
    private javax.swing.JPanel faseCurvaFirst;
    private javax.swing.JButton faseCurvaGrafico;
    private javax.swing.JTextField faseCurvaMaximo;
    private javax.swing.JTextField faseCurvaMinimo;
    private javax.swing.JTextField faseCurvaPasso;
    private javax.swing.JTable faseCurvaPrimeira;
    private javax.swing.JButton faseCurvaRapidaAdicionaCaracteristicas;
    private javax.swing.JButton faseCurvaRapidaAdicionaPrimeira;
    private javax.swing.JTable faseCurvaRapidaCaracteristicas;
    private javax.swing.JComboBox faseCurvaRapidaCorrenteCadastro;
    private javax.swing.JComboBox faseCurvaRapidaCorrenteExistente;
    private javax.swing.JTextField faseCurvaRapidaDial;
    private javax.swing.JComboBox faseCurvaRapidaDialExistente;
    private javax.swing.JPanel faseCurvaRapidaFirst;
    private javax.swing.JButton faseCurvaRapidaGrafico;
    private javax.swing.JTextField faseCurvaRapidaMaximo;
    private javax.swing.JTextField faseCurvaRapidaMinimo;
    private javax.swing.JTextField faseCurvaRapidaPasso;
    private javax.swing.JTable faseCurvaRapidaPrimeira;
    private javax.swing.JButton faseCurvaRapidaRemoveCaracteristicas;
    private javax.swing.JButton faseCurvaRapidaRemovePrimeira;
    private javax.swing.JButton faseCurvaRapidaSalvar;
    private javax.swing.JPanel faseCurvaRapidaSecond;
    private javax.swing.JTable faseCurvaRapidaSegunda;
    private javax.swing.JButton faseCurvaRemoveCaracteristicas;
    private javax.swing.JButton faseCurvaRemovePrimeira;
    private javax.swing.JButton faseCurvaSalvar;
    private javax.swing.JPanel faseCurvaSecond;
    private javax.swing.JTable faseCurvaSegunda;
    private javax.swing.JPanel faseInstantaneaFirst;
    private javax.swing.JPanel faseInstantaneaSecond;
    private javax.swing.JTextField faseMaximo;
    private javax.swing.JTextField faseMaximoLenta;
    private javax.swing.JTextField faseMaximoRapido;
    private javax.swing.JTextField faseMinimo;
    private javax.swing.JTextField faseMinimoLenta;
    private javax.swing.JTextField faseMinimoRapido;
    private javax.swing.JTextField fasePasso;
    private javax.swing.JTextField fasePassoLenta;
    private javax.swing.JTextField fasePassoRapido;
    private javax.swing.JTextField inversaFaseCorrenteValores;
    private javax.swing.JTextField inversaNeutroCorrenteFator;
    private javax.swing.JTextField inversaNeutroCorrenteValores;
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
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField modelo;
    private javax.swing.JPanel neutroCorrenteFirst;
    private javax.swing.JTextField neutroCorrenteMaximo;
    private javax.swing.JTextField neutroCorrenteMinimo;
    private javax.swing.JTextField neutroCorrentePasso;
    private javax.swing.JPanel neutroCorrenteSecond;
    private javax.swing.JButton neutroCurvaAdicionaCaracteristicas;
    private javax.swing.JButton neutroCurvaAdicionaCaracteristicas2;
    private javax.swing.JButton neutroCurvaAdicionaPrimeira;
    private javax.swing.JTable neutroCurvaCaracteristicas;
    private javax.swing.JComboBox neutroCurvaCorrenteCadastro;
    private javax.swing.JComboBox neutroCurvaCorrenteExistente;
    private javax.swing.JTextField neutroCurvaDial;
    private javax.swing.JComboBox neutroCurvaDialExistente;
    private javax.swing.JPanel neutroCurvaFirst;
    private javax.swing.JButton neutroCurvaGrafico;
    private javax.swing.JTextField neutroCurvaMaximo;
    private javax.swing.JTextField neutroCurvaMinimo;
    private javax.swing.JTextField neutroCurvaPasso;
    private javax.swing.JTable neutroCurvaPrimeira;
    private javax.swing.JButton neutroCurvaRapidaAdicionaPrimeira;
    private javax.swing.JTable neutroCurvaRapidaCaracteristicas;
    private javax.swing.JComboBox neutroCurvaRapidaCorrenteCadastro;
    private javax.swing.JComboBox neutroCurvaRapidaCorrenteExistente;
    private javax.swing.JTextField neutroCurvaRapidaDial;
    private javax.swing.JComboBox neutroCurvaRapidaDialExistente;
    private javax.swing.JPanel neutroCurvaRapidaFirst;
    private javax.swing.JButton neutroCurvaRapidaGrafico;
    private javax.swing.JTextField neutroCurvaRapidaMaximo;
    private javax.swing.JTextField neutroCurvaRapidaMinimo;
    private javax.swing.JTextField neutroCurvaRapidaPasso;
    private javax.swing.JTable neutroCurvaRapidaPrimeira;
    private javax.swing.JButton neutroCurvaRapidaRemovePrimeira;
    private javax.swing.JButton neutroCurvaRapidaSalvar;
    private javax.swing.JPanel neutroCurvaRapidaSecond;
    private javax.swing.JTable neutroCurvaRapidaSegunda;
    private javax.swing.JButton neutroCurvaRemoveCaracteristicas;
    private javax.swing.JButton neutroCurvaRemoveCaracteristicas2;
    private javax.swing.JButton neutroCurvaRemovePrimeira;
    private javax.swing.JButton neutroCurvaSalvar;
    private javax.swing.JPanel neutroCurvaSecond;
    private javax.swing.JTable neutroCurvaSegunda;
    private javax.swing.JPanel neutroInstantaneaFirst;
    private javax.swing.JPanel neutroInstantaneaSecond;
    private javax.swing.JTextField neutroMaximo;
    private javax.swing.JTextField neutroMaximoLento;
    private javax.swing.JTextField neutroMaximoRapido;
    private javax.swing.JTextField neutroMinimo;
    private javax.swing.JTextField neutroMinimoLento;
    private javax.swing.JTextField neutroMinimoRapido;
    private javax.swing.JTextField neutroPasso;
    private javax.swing.JTextField neutroPassoLento;
    private javax.swing.JTextField neutroPassoRapido;
    private javax.swing.JButton retornarDefinidaFase;
    private javax.swing.JButton retornarDefinidaNeutro;
    private javax.swing.JButton retornarFaseCurva;
    private javax.swing.JButton retornarFaseCurvaRapida;
    private javax.swing.JButton retornarInversaFaseCorrente;
    private javax.swing.JButton retornarInversaNeutroCorrente;
    private javax.swing.JButton retornarNeutroCurva;
    private javax.swing.JButton retornarNeutroCurvaRapida;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTabbedPane temporizadaFase;
    private javax.swing.ButtonGroup tipoDeEquipamento;
    // End of variables declaration//GEN-END:variables

}
