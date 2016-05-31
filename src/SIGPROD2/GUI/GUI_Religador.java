package SIGPROD2.GUI;

import SIGPROD2.Auxiliar.Arquivo;
import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Auxiliar.Perguntas;
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

    private CaracteristicasTableModel modeloFaseRapidaCaracteristicas;
    private CaracteristicasTableModel modeloNeutroRapidaCaracteristicas;
    private CaracteristicasTableModel modeloFaseLentaCaracteristicas;
    private CaracteristicasTableModel modeloNeutroLentaCaracteristicas;
    private PontoCurvaTableModel modeloFaseCriarDial;
    private PontoCurvaTableModel modeloFaseExistenteDial;
    private PontoCurvaTableModel modeloNeutroCriaDial;
    private PontoCurvaTableModel modeloNeutroExistenteDial;
    private Religador newReligador;
    private boolean[] panels;

    public GUI_Religador() {
        this.initComponents();
        this.configurarTabelas();
        this.desabilitarPaineis(0);
        this.selectCheckBox();
        this.selecionaCardInicial();
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
        cardLayout10 = new javax.swing.JPanel();
        painelDigital = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        painelEletromecanico = new javax.swing.JPanel();
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
        avancarFaseCurva = new javax.swing.JButton();
        cancelarFaseCurva = new javax.swing.JButton();
        retornarFaseCurva = new javax.swing.JButton();
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
        faseCurvaLentaMinimo = new javax.swing.JTextField();
        faseCurvaLentaMaximo = new javax.swing.JTextField();
        faseCurvaLentaPasso = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        faseCurvaLentaCaracteristicas = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        faseCurvaAdicionaCaracteristicas = new javax.swing.JButton();
        faseCurvaRemoveCaracteristicas = new javax.swing.JButton();
        faseCurvaFirst4 = new javax.swing.JPanel();
        cardLayout8 = new javax.swing.JPanel();
        faseCurvaFirst1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        faseCurvaDial1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        faseCurvaPrimeira1 = new javax.swing.JTable();
        faseCurvaGrafico1 = new javax.swing.JButton();
        faseCurvaRemovePrimeira1 = new javax.swing.JButton();
        faseCurvaAdicionaPrimeira1 = new javax.swing.JButton();
        faseCurvaSalvar1 = new javax.swing.JButton();
        faseCurvaCorrenteCadastro1 = new javax.swing.JComboBox();
        jLabel55 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        faseCurvaSegunda1 = new javax.swing.JTable();
        faseCurvaDialExistente1 = new javax.swing.JComboBox();
        faseCurvaCorrenteExistente1 = new javax.swing.JComboBox();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        faseCurvaSecond1 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        faseCurvaRapidaMinimo = new javax.swing.JTextField();
        faseCurvaRapidaMaximo = new javax.swing.JTextField();
        faseCurvaRapidaPasso = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        faseCurvaRapidaCaracteristicas = new javax.swing.JTable();
        jLabel97 = new javax.swing.JLabel();
        faseCurvaAdicionaCaracteristicas1 = new javax.swing.JButton();
        faseCurvaRemoveCaracteristicas1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        neutroCurvaSecond2 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        neutroCurvaMinimo2 = new javax.swing.JTextField();
        neutroCurvaMaximo2 = new javax.swing.JTextField();
        neutroCurvaPasso2 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        neutroCurvaCaracteristicas2 = new javax.swing.JTable();
        jLabel89 = new javax.swing.JLabel();
        neutroCurvaAdicionaCaracteristicas2 = new javax.swing.JButton();
        neutroCurvaRemoveCaracteristicas2 = new javax.swing.JButton();
        neutroCurvaFirst1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        neutroCurvaDial1 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        neutroCurvaPrimeira1 = new javax.swing.JTable();
        neutroCurvaGrafico1 = new javax.swing.JButton();
        neutroCurvaRemovePrimeira1 = new javax.swing.JButton();
        neutroCurvaAdicionaPrimeira1 = new javax.swing.JButton();
        neutroCurvaSalvar1 = new javax.swing.JButton();
        neutroCurvaCorrenteCadastro1 = new javax.swing.JComboBox();
        jLabel91 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        neutroCurvaSegunda1 = new javax.swing.JTable();
        neutroCurvaDialExistente1 = new javax.swing.JComboBox();
        neutroCurvaCorrenteExistente1 = new javax.swing.JComboBox();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        avancarNeutroCurva1 = new javax.swing.JButton();
        cancelarNeutroCurva1 = new javax.swing.JButton();
        retornarNeutroCurva1 = new javax.swing.JButton();
        Painel3 = new javax.swing.JPanel();
        correntePickup1 = new javax.swing.JPanel();
        cardLayout3 = new javax.swing.JPanel();
        faseInstantaneaFirst = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        definidaFaseCorrenteValores = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        definidaFaseTempoValores = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        definidaFaseTempoValores1 = new javax.swing.JTextField();
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
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
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
        definidaNeutroTempoValores = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        definidaNeutroTempoValores1 = new javax.swing.JTextField();
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
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        avancarDefinidaNeutro = new javax.swing.JButton();
        retornarDefinidaNeutro = new javax.swing.JButton();
        cancelarDefinidaNeutro = new javax.swing.JButton();
        definidaNeutroFator = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        eletromecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eletromecanicoActionPerformed(evt);
            }
        });

        tipoDeEquipamento.add(digital);
        digital.setText("Digital");
        digital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalActionPerformed(evt);
            }
        });

        cardLayout10.setLayout(new java.awt.CardLayout());

        jLabel58.setText("Tempo de religamento");

        jLabel59.setText("Mínimo (A) :");

        jLabel60.setText("Máximo (A) :");

        jLabel61.setText("Passo (A) :");

        javax.swing.GroupLayout painelDigitalLayout = new javax.swing.GroupLayout(painelDigital);
        painelDigital.setLayout(painelDigitalLayout);
        painelDigitalLayout.setHorizontalGroup(
            painelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addGroup(painelDigitalLayout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDigitalLayout.createSequentialGroup()
                            .addComponent(jLabel61)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDigitalLayout.createSequentialGroup()
                            .addComponent(jLabel60)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        painelDigitalLayout.setVerticalGroup(
            painelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDigitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        cardLayout10.add(painelDigital, "digital");

        javax.swing.GroupLayout painelEletromecanicoLayout = new javax.swing.GroupLayout(painelEletromecanico);
        painelEletromecanico.setLayout(painelEletromecanicoLayout);
        painelEletromecanicoLayout.setHorizontalGroup(
            painelEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        painelEletromecanicoLayout.setVerticalGroup(
            painelEletromecanicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        cardLayout10.add(painelEletromecanico, "eletromecanico");

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
                                        .addComponent(curvaTempoNeutro))))
                            .addComponent(cardLayout10, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 325, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(cardLayout10, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
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
                .addGap(344, 344, 344))
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
                .addContainerGap(207, Short.MAX_VALUE))
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

        faseCurvaCorrenteCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaCorrenteCadastroActionPerformed(evt);
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
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(faseCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardLayout2.add(faseCurvaFirst, "faseCurvaFirst");

        jLabel13.setText("Multiplicador de tempo :");

        jLabel14.setText("Mínimo (A) :");
        jLabel14.setPreferredSize(new java.awt.Dimension(85, 15));

        jLabel15.setText("Máximo (A) :");

        jLabel16.setText("Passo (A) :");
        jLabel16.setPreferredSize(new java.awt.Dimension(85, 15));

        jScrollPane2.setViewportView(faseCurvaLentaCaracteristicas);

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
                            .addComponent(faseCurvaLentaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaLentaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaLentaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17)
                    .addGroup(faseCurvaSecondLayout.createSequentialGroup()
                        .addComponent(faseCurvaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        faseCurvaSecondLayout.setVerticalGroup(
            faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaLentaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(faseCurvaLentaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaLentaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        cardLayout2.add(faseCurvaSecond, "faseCurvaSecond");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarFaseCurva)
                    .addComponent(cancelarFaseCurva)
                    .addComponent(retornarFaseCurva))
                .addContainerGap())
        );

        temporizadaFase.addTab("Curvas lentas", jPanel5);

        faseCurvaFirst4.setPreferredSize(new java.awt.Dimension(423, 433));

        cardLayout8.setLayout(new java.awt.CardLayout());

        faseCurvaFirst1.setPreferredSize(new java.awt.Dimension(423, 433));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar dial de tempo"));
        jPanel10.setVerifyInputWhenFocusTarget(false);

        jLabel54.setText("Dial de tempo :");

        jScrollPane3.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane3.setViewportView(faseCurvaPrimeira1);

        faseCurvaGrafico1.setText("Gráfico");
        faseCurvaGrafico1.setPreferredSize(new java.awt.Dimension(84, 26));

        faseCurvaRemovePrimeira1.setText("-");
        faseCurvaRemovePrimeira1.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaRemovePrimeira1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRemovePrimeira1ActionPerformed(evt);
            }
        });

        faseCurvaAdicionaPrimeira1.setText("+");
        faseCurvaAdicionaPrimeira1.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaAdicionaPrimeira1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaAdicionaPrimeira1ActionPerformed(evt);
            }
        });

        faseCurvaSalvar1.setText("Salvar");
        faseCurvaSalvar1.setPreferredSize(new java.awt.Dimension(78, 26));
        faseCurvaSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaSalvar1ActionPerformed(evt);
            }
        });

        faseCurvaCorrenteCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaCorrenteCadastro1ActionPerformed(evt);
            }
        });

        jLabel55.setText("Corrente de pickup :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(6, 6, 6)
                                .addComponent(faseCurvaDial1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(6, 6, 6)
                                .addComponent(faseCurvaCorrenteCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(faseCurvaGrafico1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(faseCurvaSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faseCurvaAdicionaPrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(faseCurvaRemovePrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaCorrenteCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaDial1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(faseCurvaAdicionaPrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRemovePrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(faseCurvaGrafico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Dial de tempo cadastrados"));
        jPanel14.setPreferredSize(new java.awt.Dimension(424, 432));

        jScrollPane7.setViewportView(faseCurvaSegunda1);

        faseCurvaDialExistente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaDialExistente1ActionPerformed(evt);
            }
        });

        faseCurvaCorrenteExistente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaCorrenteExistente1ActionPerformed(evt);
            }
        });

        jLabel56.setText("Corrente de pickup :");

        jLabel57.setText("Dial de tempo :");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(49, 49, 49)
                        .addComponent(faseCurvaDialExistente1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(6, 6, 6)
                        .addComponent(faseCurvaCorrenteExistente1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaCorrenteExistente1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(12, 12, 12)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaDialExistente1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout faseCurvaFirst1Layout = new javax.swing.GroupLayout(faseCurvaFirst1);
        faseCurvaFirst1.setLayout(faseCurvaFirst1Layout);
        faseCurvaFirst1Layout.setHorizontalGroup(
            faseCurvaFirst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirst1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        faseCurvaFirst1Layout.setVerticalGroup(
            faseCurvaFirst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirst1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(faseCurvaFirst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardLayout8.add(faseCurvaFirst1, "faseCurvaFirst");

        jLabel62.setText("Multiplicador de tempo :");

        jLabel94.setText("Mínimo (A) :");
        jLabel94.setPreferredSize(new java.awt.Dimension(85, 15));

        jLabel95.setText("Máximo (A) :");

        jLabel96.setText("Passo (A) :");
        jLabel96.setPreferredSize(new java.awt.Dimension(85, 15));

        jScrollPane13.setViewportView(faseCurvaRapidaCaracteristicas);

        jLabel97.setText("Características da curva :");

        faseCurvaAdicionaCaracteristicas1.setText("+");
        faseCurvaAdicionaCaracteristicas1.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaAdicionaCaracteristicas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaAdicionaCaracteristicas1ActionPerformed(evt);
            }
        });

        faseCurvaRemoveCaracteristicas1.setText("-");
        faseCurvaRemoveCaracteristicas1.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaRemoveCaracteristicas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRemoveCaracteristicas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout faseCurvaSecond1Layout = new javax.swing.GroupLayout(faseCurvaSecond1);
        faseCurvaSecond1.setLayout(faseCurvaSecond1Layout);
        faseCurvaSecond1Layout.setHorizontalGroup(
            faseCurvaSecond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaSecond1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(faseCurvaSecond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addGroup(faseCurvaSecond1Layout.createSequentialGroup()
                        .addGroup(faseCurvaSecond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95)
                            .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(faseCurvaSecond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faseCurvaRapidaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaRapidaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaRapidaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel97)
                    .addGroup(faseCurvaSecond1Layout.createSequentialGroup()
                        .addComponent(faseCurvaAdicionaCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRemoveCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        faseCurvaSecond1Layout.setVerticalGroup(
            faseCurvaSecond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaSecond1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRapidaMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(faseCurvaRapidaMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaRapidaPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaSecond1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaAdicionaCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRemoveCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        cardLayout8.add(faseCurvaSecond1, "faseCurvaSecond");

        jButton1.setText("Cancelar");

        jButton2.setText("Retornar");

        jButton3.setText("Avançar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout faseCurvaFirst4Layout = new javax.swing.GroupLayout(faseCurvaFirst4);
        faseCurvaFirst4.setLayout(faseCurvaFirst4Layout);
        faseCurvaFirst4Layout.setHorizontalGroup(
            faseCurvaFirst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, faseCurvaFirst4Layout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(faseCurvaFirst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(faseCurvaFirst4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cardLayout8, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        faseCurvaFirst4Layout.setVerticalGroup(
            faseCurvaFirst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirst4Layout.createSequentialGroup()
                .addContainerGap(489, Short.MAX_VALUE)
                .addGroup(faseCurvaFirst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
            .addGroup(faseCurvaFirst4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(faseCurvaFirst4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cardLayout8, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        temporizadaFase.addTab("Curvas rápidas", faseCurvaFirst4);

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        neutroCurvaMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaMaximoActionPerformed(evt);
            }
        });

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

        neutroCurvaCorrenteCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaCorrenteCadastroActionPerformed(evt);
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarNeutroCurva)
                    .addComponent(retornarNeutroCurva)
                    .addComponent(cancelarNeutroCurva))
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

        neutroCurvaMaximo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaMaximo2ActionPerformed(evt);
            }
        });

        jScrollPane8.setViewportView(neutroCurvaCaracteristicas2);

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

        javax.swing.GroupLayout neutroCurvaSecond2Layout = new javax.swing.GroupLayout(neutroCurvaSecond2);
        neutroCurvaSecond2.setLayout(neutroCurvaSecond2Layout);
        neutroCurvaSecond2Layout.setHorizontalGroup(
            neutroCurvaSecond2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaSecond2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(neutroCurvaSecond2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85)
                    .addGroup(neutroCurvaSecond2Layout.createSequentialGroup()
                        .addGroup(neutroCurvaSecond2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(neutroCurvaSecond2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroCurvaPasso2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaMaximo2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaMinimo2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel89)
                    .addGroup(neutroCurvaSecond2Layout.createSequentialGroup()
                        .addComponent(neutroCurvaAdicionaCaracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaRemoveCaracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        neutroCurvaSecond2Layout.setVerticalGroup(
            neutroCurvaSecond2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaSecond2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecond2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaMinimo2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecond2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(neutroCurvaMaximo2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecond2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaPasso2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecond2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaAdicionaCaracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaRemoveCaracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        cardLayout7.add(neutroCurvaSecond2, "neutroCurvaSecond");

        neutroCurvaFirst1.setPreferredSize(new java.awt.Dimension(423, 433));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar dial de tempo"));
        jPanel12.setPreferredSize(new java.awt.Dimension(420, 432));

        jLabel90.setText("Dial de tempo :");

        jScrollPane5.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane5.setViewportView(neutroCurvaPrimeira1);

        neutroCurvaGrafico1.setText("Gráfico");
        neutroCurvaGrafico1.setPreferredSize(new java.awt.Dimension(84, 26));

        neutroCurvaRemovePrimeira1.setText("-");
        neutroCurvaRemovePrimeira1.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaRemovePrimeira1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaRemovePrimeira1ActionPerformed(evt);
            }
        });

        neutroCurvaAdicionaPrimeira1.setText("+");
        neutroCurvaAdicionaPrimeira1.setPreferredSize(new java.awt.Dimension(44, 26));
        neutroCurvaAdicionaPrimeira1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaAdicionaPrimeira1ActionPerformed(evt);
            }
        });

        neutroCurvaSalvar1.setText("Salvar");
        neutroCurvaSalvar1.setPreferredSize(new java.awt.Dimension(78, 26));
        neutroCurvaSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaSalvar1ActionPerformed(evt);
            }
        });

        neutroCurvaCorrenteCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaCorrenteCadastro1ActionPerformed(evt);
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
                        .addComponent(neutroCurvaCorrenteCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addGap(6, 6, 6)
                        .addComponent(neutroCurvaDial1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(neutroCurvaGrafico1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroCurvaAdicionaPrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaRemovePrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(neutroCurvaCorrenteCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaDial1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90))
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(neutroCurvaAdicionaPrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaRemovePrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(neutroCurvaGrafico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Dial de tempo cadastrados"));
        jPanel13.setPreferredSize(new java.awt.Dimension(424, 432));

        jScrollPane10.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane10.setViewportView(neutroCurvaSegunda1);

        neutroCurvaDialExistente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaDialExistente1ActionPerformed(evt);
            }
        });

        neutroCurvaCorrenteExistente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaCorrenteExistente1ActionPerformed(evt);
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
                        .addComponent(neutroCurvaCorrenteExistente1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(neutroCurvaDialExistente1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(neutroCurvaCorrenteExistente1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92))
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaDialExistente1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout neutroCurvaFirst1Layout = new javax.swing.GroupLayout(neutroCurvaFirst1);
        neutroCurvaFirst1.setLayout(neutroCurvaFirst1Layout);
        neutroCurvaFirst1Layout.setHorizontalGroup(
            neutroCurvaFirst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaFirst1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        neutroCurvaFirst1Layout.setVerticalGroup(
            neutroCurvaFirst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaFirst1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(neutroCurvaFirst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardLayout7.add(neutroCurvaFirst1, "neutroCurvaFirst");

        avancarNeutroCurva1.setText("Avançar");
        avancarNeutroCurva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarNeutroCurva1ActionPerformed(evt);
            }
        });

        cancelarNeutroCurva1.setText("Cancelar");
        cancelarNeutroCurva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarNeutroCurva1ActionPerformed(evt);
            }
        });

        retornarNeutroCurva1.setText("Retornar");
        retornarNeutroCurva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarNeutroCurva1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarNeutroCurva1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarNeutroCurva1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarNeutroCurva1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addComponent(cardLayout7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(cardLayout7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarNeutroCurva1)
                    .addComponent(retornarNeutroCurva1)
                    .addComponent(cancelarNeutroCurva1))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Curvas rápidas", jPanel11);

        tabbedPane.addTab("Inversa de neutro", jTabbedPane1);

        cardLayout3.setLayout(new java.awt.CardLayout());

        jLabel44.setText("Valores separados por vírgula :");

        definidaFaseCorrenteValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definidaFaseCorrenteValoresActionPerformed(evt);
            }
        });

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
                        .addComponent(definidaFaseTempoValores1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel83)
                    .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(6, 6, 6)
                        .addComponent(definidaFaseTempoValores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(definidaFaseTempoValores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(definidaFaseTempoValores1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel53)
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel70)
                    .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, faseInstantaneaSecondLayout.createSequentialGroup()
                            .addComponent(jLabel73)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                            .addComponent(jLabel72)
                            .addGap(9, 9, 9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(jLabel70)
                .addGap(6, 6, 6)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(definidaNeutroTempoValores1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(6, 6, 6)
                            .addComponent(definidaNeutroTempoValores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(definidaNeutroTempoValores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(definidaNeutroTempoValores1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel79)
                    .addComponent(jLabel75)
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                            .addComponent(jLabel78)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                            .addComponent(jLabel76)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(0, 17, Short.MAX_VALUE))
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
            this.configurePanels();
            this.selecionarCards();
            this.avancarTela();
        } else {
            Erro.camposVazios(this);
        }
    }//GEN-LAST:event_avancarDadosGeraisActionPerformed

    private void retornarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarFaseCurvaActionPerformed
        if (this.newReligador.getTipo() == Religador.ELETROMECANICO) {
            ((ReligadorEletromecanico) this.newReligador).removeDialDeTempo(Religador.INVERSA_FASE);
        }
        int selecionado = this.temporizadaFase.getSelectedIndex();

        this.temporizadaFase.setSelectedIndex(selecionado - 1);
    }//GEN-LAST:event_retornarFaseCurvaActionPerformed

    private void cancelarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFaseCurvaActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarFaseCurvaActionPerformed

    private void avancarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarFaseCurvaActionPerformed
        if (!this.isEletromecanico()) {
            String minimo = this.faseCurvaLentaMinimo.getText();
            String maximo = this.faseCurvaLentaMaximo.getText();
            String passo = this.faseCurvaLentaPasso.getText();

            if (!minimo.equals("") && !maximo.equals("") && !passo.equals("")) {
                double min = Double.parseDouble(minimo);
                double max = Double.parseDouble(maximo);
                double pas = Double.parseDouble(passo);

                if (this.verificaExpressao(min, max, pas)) {
                    ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.INVERSA_FASE, min, max, pas);
                    ((ReligadorDigital) this.newReligador).setListaFaseLenta(this.modeloFaseLentaCaracteristicas.getArrayList());
                    this.avancarTela();
                }
            }
        } else {
            this.avancarTela();
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
                String valor = this.inversaFaseCorrenteValores.getText();

                if (!valor.equals("")) {
                    ArrayList<Double> valores = this.separaValores(valor);
                    double d = Double.parseDouble(f);

                    ((ReligadorEletromecanico) this.newReligador).setCorrentePickup(valores, Religador.INVERSA_FASE);
                    this.newReligador.setFatorInicio(d, Religador.INVERSA_FASE);
                    this.addCorrentePickupFase(valores);
                    int selecionado = this.temporizadaFase.getSelectedIndex();

                    this.temporizadaFase.setSelectedIndex(selecionado + 1);
                } else {
                    Erro.camposVazios(this);
                }
            } else {
                String minimo = this.faseCorrenteMinimo.getText();
                String maximo = this.faseCorrenteMaximo.getText();
                String passo = this.faseCorrentePasso.getText();
                double fator = Double.parseDouble(f);

                if (!minimo.equals("") && !maximo.equals("") && !passo.equals("")) {
                    double min = Double.parseDouble(minimo);
                    double max = Double.parseDouble(maximo);
                    double pas = Double.parseDouble(passo);

                    if (this.verificaExpressao(min, max, pas)) {
                        this.newReligador.setFatorInicio(fator, Religador.INVERSA_FASE);
                        ((ReligadorDigital) this.newReligador).setValuesCorrente(Religador.INVERSA_FASE, min, max, pas);
                        int selecionado = this.temporizadaFase.getSelectedIndex();

                        this.temporizadaFase.setSelectedIndex(selecionado + 1);
                    }
                } else {
                    Erro.camposVazios(this);
                }
            }
        }


    }//GEN-LAST:event_avancarInversaFaseCorrenteActionPerformed

    private void avancarDefinidaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarDefinidaFaseActionPerformed
        String f = this.definidaFaseFator.getText();

        if (!f.equals("")) {
            if (this.isEletromecanico()) {
                String c = this.definidaFaseCorrenteValores.getText();
                String t = this.definidaFaseTempoValores.getText();
                double fator = Double.parseDouble(f);

                if (!c.equals("") && !t.equals("")) {
                    this.newReligador.setFatorInicio(fator, Religador.DEFINIDO_FASE);
                    ArrayList<Double> lista_corrente = this.separaValores(c);
                    ArrayList<Double> lista_tempo = this.separaValores(t);

                    ((ReligadorEletromecanico) this.newReligador).setCorrentePickup(lista_corrente, Religador.DEFINIDO_FASE);
                    ((ReligadorEletromecanico) this.newReligador).setTempoDeAtuacao(lista_tempo, Religador.DEFINIDO_FASE);
                    this.avancarTela();
                } else {
                    Erro.camposVazios(this);
                }
            } else {
                String minimo = this.faseMinimo.getText();
                String maximo = this.faseMaximo.getText();
                String passo = this.fasePasso.getText();
                double fator = Double.parseDouble(f);

                if (!minimo.equals("") && !maximo.equals("") && !passo.equals("")) {
                    double min = Double.parseDouble(minimo);
                    double max = Double.parseDouble(maximo);
                    double pas = Double.parseDouble(passo);

                    if (this.verificaExpressao(min, max, pas)) {
                        this.newReligador.setFatorInicio(fator, Religador.DEFINIDO_FASE);
                        ((ReligadorDigital) this.newReligador).setValuesCorrente(Religador.DEFINIDO_FASE, min, max, pas);
                        this.avancarTela();
                    }
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
            double fator = Double.parseDouble(f);

            if (this.isEletromecanico()) {
                String c = this.definidaNeutroCorrenteValores.getText();
                String t = this.definidaNeutroTempoValores.getText();

                if (!c.equals("") && !t.equals("")) {
                    ArrayList<Double> lista_corrente = this.separaValores(c);
                    ArrayList<Double> lista_tempo = this.separaValores(t);

                    this.newReligador.setFatorInicio(fator, Religador.DEFINIDO_NEUTRO);
                    ((ReligadorEletromecanico) this.newReligador).setCorrentePickup(lista_corrente, Religador.DEFINIDO_NEUTRO);
                    ((ReligadorEletromecanico) this.newReligador).setTempoDeAtuacao(lista_tempo, Religador.DEFINIDO_NEUTRO);

                    Gson g = new Gson();
                    Arquivo a = new Arquivo("Gson.ini");
                    String s = g.toJson(this.newReligador);
                    a.escreverArquivo(s);
                    /*try {
                     ReleDao.insereRele(this.newReligador);
                     } catch (SQLException ex) {
                     Erro.mostraMensagemSQL(this);
                     ex.printStackTrace();
                     }*/

                } else {
                    Erro.camposVazios(this);
                }
            } else {
                String minimo = this.neutroMinimo.getText();
                String maximo = this.neutroMaximo.getText();
                String passo = this.neutroPasso.getText();

                if (!minimo.equals("") && !maximo.equals("") && !passo.equals("")) {
                    double min = Double.parseDouble(minimo);
                    double max = Double.parseDouble(this.neutroMaximo.getText());
                    double pas = Double.parseDouble(this.neutroPasso.getText());

                    if (this.verificaExpressao(min, max, pas)) {
                        ((ReligadorDigital) this.newReligador).setValuesCorrente(Religador.DEFINIDO_NEUTRO, min, max, pas);
                    }

                    Gson g = new Gson();
                    Arquivo a = new Arquivo("Gson.ini");
                    String s = g.toJson(this.newReligador);
                    a.escreverArquivo(s);
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
            String minimo = this.neutroCurvaMinimo.getText();
            String maximo = this.neutroCurvaMaximo.getText();
            String passo = this.neutroCurvaPasso.getText();

            if (!minimo.equals("") && !maximo.equals("") && !passo.equals("")) {
                double min = Double.parseDouble(this.neutroCurvaMinimo.getText());
                double max = Double.parseDouble(this.neutroCurvaMaximo.getText());
                double pas = Double.parseDouble(this.neutroCurvaPasso.getText());

                if (this.verificaExpressao(min, max, pas)) {
                    ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.INVERSA_NEUTRO, min, max, pas);
                    ((ReligadorDigital) this.newReligador).setListaNeutroRapida(this.modeloNeutroCaracteristicas.getArrayList());
                    this.avancarTela();
                }
            }
        } else {
            this.avancarTela();
        }
    }//GEN-LAST:event_avancarNeutroCurvaActionPerformed

    private void cancelarNeutroCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarNeutroCurvaActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarNeutroCurvaActionPerformed

    private void retornarNeutroCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarNeutroCurvaActionPerformed
        if (this.newReligador.getTipo() == Religador.ELETROMECANICO) {
            ((ReligadorEletromecanico) this.newReligador).removeDialDeTempo(WIDTH);
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
                    ArrayList<Double> lista = this.separaValores(v);

                    ((ReligadorEletromecanico) this.newReligador).setCorrentePickup(lista, Religador.INVERSA_NEUTRO);
                    this.addCorrentePickupNeutro(lista);
                    int selecionado = this.jTabbedPane1.getSelectedIndex();

                    this.jTabbedPane1.setSelectedIndex(selecionado + 1);
                }
            } else {
                String minimo = this.neutroCorrenteMinimo.getText();
                String maximo = this.neutroCorrenteMaximo.getText();
                String passo = this.neutroCorrentePasso.getText();
                double fator = Double.parseDouble(f);

                if (!minimo.equals("") && !maximo.equals("") && !passo.equals("")) {
                    double min = Double.parseDouble(this.neutroCorrenteMinimo.getText());
                    double max = Double.parseDouble(this.neutroCorrenteMaximo.getText());
                    double pas = Double.parseDouble(this.neutroCorrentePasso.getText());

                    if (this.verificaExpressao(min, max, pas)) {
                        this.newReligador.setFatorInicio(fator, Religador.INVERSA_NEUTRO);
                        ((ReligadorDigital) this.newReligador).setValuesCorrente(Religador.INVERSA_NEUTRO, min, max, pas);
                        int selecionado = this.jTabbedPane1.getSelectedIndex();

                        this.jTabbedPane1.setSelectedIndex(selecionado + 1);
                    }
                }

            }
        }


    }//GEN-LAST:event_avancarInversaNeutroCorrenteActionPerformed

    private void neutroCurvaMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaMaximoActionPerformed

    private void neutroCurvaAdicionaCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaAdicionaCaracteristicasActionPerformed
        this.modeloNeutroCaracteristicas.add(new CaracteristicasCurva("-", 0.0, 0.0, 0.0));
        this.modeloNeutroCaracteristicas.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaAdicionaCaracteristicasActionPerformed

    private void faseCurvaAdicionaCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaAdicionaCaracteristicasActionPerformed
        this.modeloFaseCaracteristicas.add(new CaracteristicasCurva("-", 0.0, 0.0, 0.0));
        this.modeloFaseCaracteristicas.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaAdicionaCaracteristicasActionPerformed

    private void faseCurvaRemoveCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRemoveCaracteristicasActionPerformed
        int selecionado = this.faseCurvaLentaCaracteristicas.getSelectedRow();

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
            ArrayList<PontoCurva> pontos = this.modeloFaseCriarDial.getArrayList();
            ArrayList<Double> values = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_FASE, corrente);

            if (values.isEmpty() || values.indexOf(d) != -1) {
                ((ReligadorEletromecanico) this.newReligador).addDialDeTempo(Religador.INVERSA_FASE, corrente, dial, pontos);
            } else {
                Erro.valorCadastrado(this);
            }
        } else {
            Erro.camposVazios(this);
        }
    }

    private void salvarNeutroDialCadastradoComPontos() {
        String c = String.valueOf(this.neutroCurvaCorrenteCadastro.getSelectedItem());
        double corrente = Double.parseDouble(c);
        String d = this.neutroCurvaDial.getText();
        double dial = Double.parseDouble(d);
        ArrayList<PontoCurva> pontos = this.modeloNeutroCriaDial.getArrayList();

        ((ReligadorEletromecanico) this.newReligador).addDialDeTempo(Religador.INVERSA_NEUTRO, corrente, dial, pontos);
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

            ArrayList<Double> dial = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_FASE, corrente);
            this.faseCurvaDialExistente.removeAllItems();
            for (Double d : dial) {
                this.faseCurvaDialExistente.addItem(d);
            }
        }
    }

    private void carregarNeutroDialCadastradoEmCorrente() {
        String str = String.valueOf(this.neutroCurvaCorrenteExistente.getSelectedItem());
        double corrente = Double.parseDouble(str);

        ArrayList<Double> dial = ((ReligadorEletromecanico) this.newReligador).getDialDeTempo(Religador.INVERSA_NEUTRO, corrente);
        this.neutroCurvaDialExistente.removeAllItems();
        for (Double d : dial) {
            this.neutroCurvaDialExistente.addItem(d);
        }
    }

    private void faseCurvaDialExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaDialExistenteActionPerformed
        try {
            carregarFasePontosDeDial();
        } catch (NullPointerException e) {
            System.out.println("Error");
        }

    }//GEN-LAST:event_faseCurvaDialExistenteActionPerformed

    private void carregarFasePontosDeDial() throws NullPointerException {
        String str = String.valueOf(this.faseCurvaCorrenteExistente.getSelectedItem());
        String srt = String.valueOf(this.faseCurvaDialExistente.getSelectedItem());

        if (str.equals("null") || srt.equals("null")) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(str);
            double dial = Double.parseDouble(srt);
            ArrayList<PontoCurva> a;
            a = ((ReligadorEletromecanico) this.newReligador).getPontosDialDeTempo(corrente, dial, Religador.INVERSA_FASE);

            this.modeloFaseExistenteDial.removeTodos();
            this.modeloFaseExistenteDial.add(a);
            this.modeloFaseExistenteDial.fireTableDataChanged();
            this.modeloFaseExistenteDial.removeTodos();
            this.modeloFaseExistenteDial.fireTableDataChanged();
        }
    }

    private void carregarNeutroPontosDeDial() {
        String str = String.valueOf(this.neutroCurvaCorrenteExistente.getSelectedItem());
        String srt = String.valueOf(this.neutroCurvaDialExistente.getSelectedItem());

        try {
            double corrente = Double.parseDouble(str);
            double dial = Double.parseDouble(srt);
            ArrayList<PontoCurva> a;
            a = ((ReligadorEletromecanico) this.newReligador).getPontosDialDeTempo(corrente, dial, Religador.INVERSA_NEUTRO);

            this.modeloNeutroExistenteDial.removeTodos();
            this.modeloNeutroExistenteDial.add(a);
            this.modeloNeutroExistenteDial.fireTableDataChanged();
        } catch (NumberFormatException e) {
            this.modeloNeutroExistenteDial.removeTodos();
            this.modeloNeutroExistenteDial.fireTableDataChanged();
        }
    }

    private void faseCurvaCorrenteCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaCorrenteCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaCorrenteCadastroActionPerformed

    private void definidaFaseCorrenteValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definidaFaseCorrenteValoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_definidaFaseCorrenteValoresActionPerformed

    private void neutroCurvaCorrenteCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaCorrenteCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaCorrenteCadastroActionPerformed

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
        carregarNeutroPontosDeDial();
    }//GEN-LAST:event_neutroCurvaDialExistenteActionPerformed

    private void neutroCurvaCorrenteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaCorrenteExistenteActionPerformed
        carregarNeutroDialCadastradoEmCorrente();
    }//GEN-LAST:event_neutroCurvaCorrenteExistenteActionPerformed

    private void eletromecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eletromecanicoActionPerformed
        selecionaCardInicial();
    }//GEN-LAST:event_eletromecanicoActionPerformed

    private void digitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalActionPerformed
        selecionaCardInicial();
    }//GEN-LAST:event_digitalActionPerformed

    private void neutroCurvaMaximo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaMaximo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaMaximo2ActionPerformed

    private void neutroCurvaAdicionaCaracteristicas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaAdicionaCaracteristicas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaAdicionaCaracteristicas2ActionPerformed

    private void neutroCurvaRemoveCaracteristicas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRemoveCaracteristicas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaRemoveCaracteristicas2ActionPerformed

    private void neutroCurvaRemovePrimeira1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaRemovePrimeira1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaRemovePrimeira1ActionPerformed

    private void neutroCurvaAdicionaPrimeira1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaAdicionaPrimeira1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaAdicionaPrimeira1ActionPerformed

    private void neutroCurvaSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaSalvar1ActionPerformed

    private void neutroCurvaCorrenteCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaCorrenteCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaCorrenteCadastro1ActionPerformed

    private void neutroCurvaDialExistente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaDialExistente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaDialExistente1ActionPerformed

    private void neutroCurvaCorrenteExistente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaCorrenteExistente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neutroCurvaCorrenteExistente1ActionPerformed

    private void avancarNeutroCurva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarNeutroCurva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avancarNeutroCurva1ActionPerformed

    private void cancelarNeutroCurva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarNeutroCurva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarNeutroCurva1ActionPerformed

    private void retornarNeutroCurva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarNeutroCurva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retornarNeutroCurva1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!this.isEletromecanico()) {
            String minimo = this.faseCurvaRapidaMinimo.getText();
            String maximo = this.faseCurvaRapidaMaximo.getText();
            String passo = this.faseCurvaRapidaPasso.getText();

            if (!minimo.equals("") && !maximo.equals("") && !passo.equals("")) {
                double min = Double.parseDouble(minimo);
                double max = Double.parseDouble(maximo);
                double pas = Double.parseDouble(passo);

                if (this.verificaExpressao(min, max, pas)) {
                    ((ReligadorDigital) this.newReligador).setValuesTempo(Religador.INVERSA_FASE, min, max, pas);
                    ((ReligadorDigital) this.newReligador).setListaFaseRapida(this.modeloFaseRapidaCaracteristicas.getArrayList());
                    this.avancarTela();
                }
            }
        } else {
            this.avancarTela();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void faseCurvaRemovePrimeira1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRemovePrimeira1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaRemovePrimeira1ActionPerformed

    private void faseCurvaAdicionaPrimeira1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaAdicionaPrimeira1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaAdicionaPrimeira1ActionPerformed

    private void faseCurvaSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaSalvar1ActionPerformed

    private void faseCurvaCorrenteCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaCorrenteCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaCorrenteCadastro1ActionPerformed

    private void faseCurvaDialExistente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaDialExistente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaDialExistente1ActionPerformed

    private void faseCurvaCorrenteExistente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaCorrenteExistente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaCorrenteExistente1ActionPerformed

    private void faseCurvaAdicionaCaracteristicas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaAdicionaCaracteristicas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaAdicionaCaracteristicas1ActionPerformed

    private void faseCurvaRemoveCaracteristicas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRemoveCaracteristicas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaRemoveCaracteristicas1ActionPerformed

    public void selecionaCardInicial() {
        CardLayout card = (CardLayout) this.cardLayout10.getLayout();

        if (this.eletromecanico.isSelected()) {
            card.show(this.cardLayout10, "eletromecanico");
        } else {
            card.show(this.cardLayout10, "digital");
        }   
    }

    private void configurePanels() {
        boolean faseTemporizada = this.curvaInversaFase.isSelected();
        boolean faseInstantanea = this.curvaTempoFase.isSelected();
        boolean neutroTemporizada = this.curvaInversaNeutro.isSelected();
        boolean neutroInstantanea = this.curvaTempoNeutro.isSelected();
        this.panels = new boolean[5];

        this.panels[0] = true;
        this.panels[1] = faseTemporizada;
        this.panels[2] = faseInstantanea;
        this.panels[3] = neutroTemporizada;
        this.panels[4] = neutroInstantanea;
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

        if (this.eletromecanico.isSelected()) {
            card1.show(this.cardLayout1, "faseCorrenteFirst");
            card2.show(this.cardLayout2, "faseCurvaFirst");
            card3.show(this.cardLayout3, "faseInstantaneaFirst");
            card4.show(this.cardLayout4, "neutroCorrenteFirst");
            card5.show(this.cardLayout5, "neutroCurvaFirst");
            card6.show(this.cardLayout6, "neutroInstantaneaFirst");
        } else {
            card1.show(this.cardLayout1, "faseCorrenteSecond");
            card2.show(this.cardLayout2, "faseCurvaSecond");
            card3.show(this.cardLayout3, "faseInstantaneaSecond");
            card4.show(this.cardLayout4, "neutroCorrenteSecond");
            card5.show(this.cardLayout5, "neutroCurvaSecond");
            card6.show(this.cardLayout6, "neutroInstantaneaSecond");
        }
    }

    private void avancarTela() {
        while (true && this.getSelected() < this.tabbedPane.getComponentCount()) {
            int selecionado = this.getSelected() + 1;

            this.tabbedPane.setSelectedIndex(selecionado);
            if (this.panels[selecionado]) {
                this.desabilitarPaineis(selecionado);
                break;
            }
        }
    }

    private void retornarTela() {
        while (true && this.getSelected() > 0) {
            int selecionado = this.getSelected() - 1;

            this.tabbedPane.setSelectedIndex(selecionado);
            if (this.panels[selecionado]) {
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
        this.modeloNeutroLentaCaracteristicas = new CaracteristicasTableModel();
        this.modeloFaseLentaCaracteristicas = new CaracteristicasTableModel();
        this.modeloNeutroRapidaCaracteristicas = new CaracteristicasTableModel();
        this.modeloFaseRapidaCaracteristicas = new CaracteristicasTableModel();

        this.neutroCurvaCaracteristicas.setModel(modeloNeutroCaracteristicas);
        this.faseCurvaLentaCaracteristicas.setModel(modeloFaseLentaCaracteristicas);
        this.faseCurvaRapidaCaracteristicas.setModel(modeloFaseRapidaCaracteristicas);
    }

    private void configurarTabelasEletromecanica() {
        this.modeloFaseCriarDial = new PontoCurvaTableModel();
        this.modeloNeutroCriaDial = new PontoCurvaTableModel();
        this.modeloFaseExistenteDial = new PontoCurvaTableModel();
        this.modeloNeutroExistenteDial = new PontoCurvaTableModel();

        this.faseCurvaPrimeira.setModel(modeloFaseCriarDial);
        this.neutroCurvaPrimeira.setModel(modeloNeutroCriaDial);
        this.faseCurvaSegunda.setModel(modeloFaseExistenteDial);
        this.neutroCurvaSegunda.setModel(modeloNeutroExistenteDial);
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

    private boolean verificaExpressao(double min, double max, double pas) {
        if (min < max && (max - min) > pas) {
            return true;
        } else {
            return false;
        }
    }

    private void addCorrentePickupFase(List<Double> valores) {
        this.faseCurvaCorrenteCadastro.removeAllItems();
        this.faseCurvaCorrenteExistente.removeAllItems();
        for (double d : valores) {
            this.faseCurvaCorrenteCadastro.addItem(d);
            this.faseCurvaCorrenteExistente.addItem(d);
        }
    }

    private void addCorrentePickupNeutro(List<Double> valores) {
        for (Double d : valores) {
            this.neutroCurvaCorrenteCadastro.addItem(d);
            this.neutroCurvaCorrenteExistente.addItem(d);
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
    private javax.swing.JButton avancarInversaFaseCorrente;
    private javax.swing.JButton avancarInversaNeutroCorrente;
    private javax.swing.JButton avancarNeutroCurva;
    private javax.swing.JButton avancarNeutroCurva1;
    private javax.swing.JButton cancelarDadosGerais;
    private javax.swing.JButton cancelarDefinidaFase;
    private javax.swing.JButton cancelarDefinidaNeutro;
    private javax.swing.JButton cancelarFaseCurva;
    private javax.swing.JButton cancelarInversaFaseCorrente;
    private javax.swing.JButton cancelarInversaNeutroCorrente;
    private javax.swing.JButton cancelarNeutroCurva;
    private javax.swing.JButton cancelarNeutroCurva1;
    private javax.swing.JPanel cardLayout1;
    private javax.swing.JPanel cardLayout10;
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
    private javax.swing.JTextField definidaFaseTempoValores;
    private javax.swing.JTextField definidaFaseTempoValores1;
    private javax.swing.JTextField definidaNeutroCorrenteValores;
    private javax.swing.JTextField definidaNeutroFator;
    private javax.swing.JTextField definidaNeutroTempoValores;
    private javax.swing.JTextField definidaNeutroTempoValores1;
    private javax.swing.JRadioButton digital;
    private javax.swing.JRadioButton eletromecanico;
    private javax.swing.JTextField fabricante;
    private javax.swing.JPanel faseCorrenteFirst;
    private javax.swing.JTextField faseCorrenteMaximo;
    private javax.swing.JTextField faseCorrenteMinimo;
    private javax.swing.JTextField faseCorrentePasso;
    private javax.swing.JPanel faseCorrenteSecond;
    private javax.swing.JButton faseCurvaAdicionaCaracteristicas;
    private javax.swing.JButton faseCurvaAdicionaCaracteristicas1;
    private javax.swing.JButton faseCurvaAdicionaPrimeira;
    private javax.swing.JButton faseCurvaAdicionaPrimeira1;
    private javax.swing.JComboBox faseCurvaCorrenteCadastro;
    private javax.swing.JComboBox faseCurvaCorrenteCadastro1;
    private javax.swing.JComboBox faseCurvaCorrenteExistente;
    private javax.swing.JComboBox faseCurvaCorrenteExistente1;
    private javax.swing.JTextField faseCurvaDial;
    private javax.swing.JTextField faseCurvaDial1;
    private javax.swing.JComboBox faseCurvaDialExistente;
    private javax.swing.JComboBox faseCurvaDialExistente1;
    private javax.swing.JPanel faseCurvaFirst;
    private javax.swing.JPanel faseCurvaFirst1;
    private javax.swing.JPanel faseCurvaFirst4;
    private javax.swing.JButton faseCurvaGrafico;
    private javax.swing.JButton faseCurvaGrafico1;
    private javax.swing.JTable faseCurvaLentaCaracteristicas;
    private javax.swing.JTextField faseCurvaLentaMaximo;
    private javax.swing.JTextField faseCurvaLentaMinimo;
    private javax.swing.JTextField faseCurvaLentaPasso;
    private javax.swing.JTable faseCurvaPrimeira;
    private javax.swing.JTable faseCurvaPrimeira1;
    private javax.swing.JTable faseCurvaRapidaCaracteristicas;
    private javax.swing.JTextField faseCurvaRapidaMaximo;
    private javax.swing.JTextField faseCurvaRapidaMinimo;
    private javax.swing.JTextField faseCurvaRapidaPasso;
    private javax.swing.JButton faseCurvaRemoveCaracteristicas;
    private javax.swing.JButton faseCurvaRemoveCaracteristicas1;
    private javax.swing.JButton faseCurvaRemovePrimeira;
    private javax.swing.JButton faseCurvaRemovePrimeira1;
    private javax.swing.JButton faseCurvaSalvar;
    private javax.swing.JButton faseCurvaSalvar1;
    private javax.swing.JPanel faseCurvaSecond;
    private javax.swing.JPanel faseCurvaSecond1;
    private javax.swing.JTable faseCurvaSegunda;
    private javax.swing.JTable faseCurvaSegunda1;
    private javax.swing.JPanel faseInstantaneaFirst;
    private javax.swing.JPanel faseInstantaneaSecond;
    private javax.swing.JTextField faseMaximo;
    private javax.swing.JTextField faseMinimo;
    private javax.swing.JTextField fasePasso;
    private javax.swing.JTextField inversaFaseCorrenteValores;
    private javax.swing.JTextField inversaNeutroCorrenteFator;
    private javax.swing.JTextField inversaNeutroCorrenteValores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
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
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField modelo;
    private javax.swing.JPanel neutroCorrenteFirst;
    private javax.swing.JTextField neutroCorrenteMaximo;
    private javax.swing.JTextField neutroCorrenteMinimo;
    private javax.swing.JTextField neutroCorrentePasso;
    private javax.swing.JPanel neutroCorrenteSecond;
    private javax.swing.JButton neutroCurvaAdicionaCaracteristicas;
    private javax.swing.JButton neutroCurvaAdicionaCaracteristicas2;
    private javax.swing.JButton neutroCurvaAdicionaPrimeira;
    private javax.swing.JButton neutroCurvaAdicionaPrimeira1;
    private javax.swing.JTable neutroCurvaCaracteristicas;
    private javax.swing.JTable neutroCurvaCaracteristicas2;
    private javax.swing.JComboBox neutroCurvaCorrenteCadastro;
    private javax.swing.JComboBox neutroCurvaCorrenteCadastro1;
    private javax.swing.JComboBox neutroCurvaCorrenteExistente;
    private javax.swing.JComboBox neutroCurvaCorrenteExistente1;
    private javax.swing.JTextField neutroCurvaDial;
    private javax.swing.JTextField neutroCurvaDial1;
    private javax.swing.JComboBox neutroCurvaDialExistente;
    private javax.swing.JComboBox neutroCurvaDialExistente1;
    private javax.swing.JPanel neutroCurvaFirst;
    private javax.swing.JPanel neutroCurvaFirst1;
    private javax.swing.JButton neutroCurvaGrafico;
    private javax.swing.JButton neutroCurvaGrafico1;
    private javax.swing.JTextField neutroCurvaMaximo;
    private javax.swing.JTextField neutroCurvaMaximo2;
    private javax.swing.JTextField neutroCurvaMinimo;
    private javax.swing.JTextField neutroCurvaMinimo2;
    private javax.swing.JTextField neutroCurvaPasso;
    private javax.swing.JTextField neutroCurvaPasso2;
    private javax.swing.JTable neutroCurvaPrimeira;
    private javax.swing.JTable neutroCurvaPrimeira1;
    private javax.swing.JButton neutroCurvaRemoveCaracteristicas;
    private javax.swing.JButton neutroCurvaRemoveCaracteristicas2;
    private javax.swing.JButton neutroCurvaRemovePrimeira;
    private javax.swing.JButton neutroCurvaRemovePrimeira1;
    private javax.swing.JButton neutroCurvaSalvar;
    private javax.swing.JButton neutroCurvaSalvar1;
    private javax.swing.JPanel neutroCurvaSecond;
    private javax.swing.JPanel neutroCurvaSecond2;
    private javax.swing.JTable neutroCurvaSegunda;
    private javax.swing.JTable neutroCurvaSegunda1;
    private javax.swing.JPanel neutroInstantaneaFirst;
    private javax.swing.JPanel neutroInstantaneaSecond;
    private javax.swing.JTextField neutroMaximo;
    private javax.swing.JTextField neutroMinimo;
    private javax.swing.JTextField neutroPasso;
    private javax.swing.JPanel painelDigital;
    private javax.swing.JPanel painelEletromecanico;
    private javax.swing.JButton retornarDefinidaFase;
    private javax.swing.JButton retornarDefinidaNeutro;
    private javax.swing.JButton retornarFaseCurva;
    private javax.swing.JButton retornarInversaFaseCorrente;
    private javax.swing.JButton retornarInversaNeutroCorrente;
    private javax.swing.JButton retornarNeutroCurva;
    private javax.swing.JButton retornarNeutroCurva1;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTabbedPane temporizadaFase;
    private javax.swing.ButtonGroup tipoDeEquipamento;
    // End of variables declaration//GEN-END:variables
}
