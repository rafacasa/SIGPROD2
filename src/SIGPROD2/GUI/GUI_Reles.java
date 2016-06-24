package SIGPROD2.GUI;

import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Auxiliar.Grafico;
import SIGPROD2.Auxiliar.Perguntas;
import SIGPROD2.Auxiliar.StringUtils;
import SIGPROD2.Modelo.CaracteristicasCurva;
import SIGPROD2.Modelo.DialDeTempoMecanico;
import SIGPROD2.Modelo.PontoCurva;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleDigital;
import SIGPROD2.Modelo.ReleEletromecanico;
import SIGPROD2.Modelo.Tabelas.CaracteristicasTableModel;
import SIGPROD2.Modelo.Tabelas.PontoCurvaTableModel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GUI_Reles extends javax.swing.JFrame {

    private CaracteristicasTableModel modeloFaseCaracteristicas;
    private CaracteristicasTableModel modeloNeutroCaracteristicas;
    private PontoCurvaTableModel modeloFaseCriarDial;
    private PontoCurvaTableModel modeloFaseExistenteDial;
    private PontoCurvaTableModel modeloNeutroCriaDial;
    private PontoCurvaTableModel modeloNeutroExistenteDial;
    private Rele newRele;
    private boolean[] panels;

    public GUI_Reles() {
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
        removeDialInversaFase = new javax.swing.JButton();
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
        faseInstantaneaSecond = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        faseMinimo = new javax.swing.JTextField();
        faseMaximo = new javax.swing.JTextField();
        fasePasso = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        campoMinimoTempoDefFase = new javax.swing.JTextField();
        campoMaximoTempoDefFase = new javax.swing.JTextField();
        campoPassoTempoDefFase = new javax.swing.JTextField();
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
        neutroInstantaneaSecond = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        neutroMinimo = new javax.swing.JTextField();
        neutroMaximo = new javax.swing.JTextField();
        neutroPasso = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        campoMinimoTempoDefNeutro = new javax.swing.JTextField();
        campoMaximoTempoDefNeutro = new javax.swing.JTextField();
        campoPassoTempoDefNeutro = new javax.swing.JTextField();
        avancarDefinidaNeutro = new javax.swing.JButton();
        retornarDefinidaNeutro = new javax.swing.JButton();
        cancelarDefinidaNeutro = new javax.swing.JButton();
        definidaNeutroFator = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabbedPane.setPreferredSize(new java.awt.Dimension(880, 580));

        jLabel1.setText("Fabricante :");

        jLabel2.setText("Modelo :");

        jLabel3.setText("Curva inversa : ");

        jLabel4.setText("Curva de tempo definido: ");

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
                                .addGroup(Painel1Layout.createSequentialGroup()
                                    .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(6, 6, 6)
                                    .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel41)
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
                        .addGap(0, 518, Short.MAX_VALUE)))
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
                .addGap(6, 6, 6)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eletromecanico)
                    .addComponent(digital))
                .addGap(56, 56, 56)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(curvaInversaFase)
                    .addComponent(curvaInversaNeutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(curvaTempoFase)
                    .addComponent(curvaTempoNeutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
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

        jLabel5.setText("Mínimo (A) : ");

        jLabel9.setText("Máximo (A) : ");

        jLabel10.setText("Passo (A) : ");

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
                .addGap(6, 6, 6)
                .addGroup(faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faseCorrentePasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCorrenteMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCorrenteMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(400, Short.MAX_VALUE))
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
                        .addGap(6, 6, 6)
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

        cardLayout2.setLayout(new java.awt.CardLayout());

        faseCurvaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar dial de tempo"));
        jPanel4.setVerifyInputWhenFocusTarget(false);

        jLabel8.setText("Dial de tempo : ");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane1.setViewportView(faseCurvaPrimeira);

        faseCurvaGrafico.setText("Gráfico");
        faseCurvaGrafico.setPreferredSize(new java.awt.Dimension(84, 26));
        faseCurvaGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaGraficoActionPerformed(evt);
            }
        });

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

        jLabel7.setText("Corrente de pickup : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faseCurvaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(faseCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(faseCurvaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Dial de tempo cadastrados"));

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

        jLabel33.setText("Corrente de pickup : ");

        jLabel34.setText("Dial de tempo : ");

        removeDialInversaFase.setText("-");
        removeDialInversaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDialInversaFaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane0, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel33)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel34)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(faseCurvaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(removeDialInversaFase, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(faseCurvaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(faseCurvaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeDialInversaFase))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane0, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout faseCurvaFirstLayout = new javax.swing.GroupLayout(faseCurvaFirst);
        faseCurvaFirst.setLayout(faseCurvaFirstLayout);
        faseCurvaFirstLayout.setHorizontalGroup(
            faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        faseCurvaFirstLayout.setVerticalGroup(
            faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
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
                .addContainerGap(70, Short.MAX_VALUE))
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
                .addGap(6, 6, 6))
            .addComponent(cardLayout2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(cardLayout2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarFaseCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retornarFaseCurva)
                    .addComponent(avancarFaseCurva))
                .addGap(26, 26, 26))
        );

        temporizadaFase.addTab("Curvas", jPanel5);

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

        jLabel20.setText("Mínimo (A) : ");

        jLabel21.setText("Máximo (A) : ");

        jLabel22.setText("Passo (A) : ");

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
                .addGap(6, 6, 6)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(neutroCorrentePasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCorrenteMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCorrenteMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(400, Short.MAX_VALUE))
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
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarInversaNeutroCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retornarInversaNeutroCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(avancarInversaNeutroCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                        .addGap(10, 10, 10))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correntePickup3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correntePickup3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(16, 16, 16)
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
                .addContainerGap(209, Short.MAX_VALUE))
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
                .addContainerGap(88, Short.MAX_VALUE))
        );

        cardLayout5.add(neutroCurvaSecond, "neutroCurvaSecond");

        neutroCurvaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar dial de tempo"));
        jPanel8.setPreferredSize(new java.awt.Dimension(420, 397));

        jLabel30.setText("Dial de tempo : ");

        jScrollPane4.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane4.setViewportView(neutroCurvaPrimeira);

        neutroCurvaGrafico.setText("Gráfico");
        neutroCurvaGrafico.setPreferredSize(new java.awt.Dimension(84, 26));
        neutroCurvaGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutroCurvaGraficoActionPerformed(evt);
            }
        });

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

        jLabel29.setText("Corrente de pickup : ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroCurvaCorrenteCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaDial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(neutroCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(neutroCurvaSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55))
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
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Dial de tempo cadastrados"));

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

        jLabel31.setText("Corrente de pickup : ");

        jLabel32.setText("Dial de tempo : ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroCurvaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroCurvaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout neutroCurvaFirstLayout = new javax.swing.GroupLayout(neutroCurvaFirst);
        neutroCurvaFirst.setLayout(neutroCurvaFirstLayout);
        neutroCurvaFirstLayout.setHorizontalGroup(
            neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        neutroCurvaFirstLayout.setVerticalGroup(
            neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addGap(3, 3, 3))
            .addComponent(cardLayout5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(cardLayout5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarNeutroCurva)
                    .addComponent(retornarNeutroCurva)
                    .addComponent(cancelarNeutroCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jTabbedPane1.addTab("Curvas", jPanel3);

        tabbedPane.addTab("Inversa de neutro", jTabbedPane1);

        cardLayout3.setLayout(new java.awt.CardLayout());

        jLabel44.setText("Valores separados por vírgula :");

        definidaFaseCorrenteValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definidaFaseCorrenteValoresActionPerformed(evt);
            }
        });

        jLabel23.setText("Corrente de pickup");

        jLabel24.setText("Tempo de atuação");

        jLabel25.setText("Valores separados por vírgula:");

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
                        .addComponent(jLabel25)
                        .addGap(6, 6, 6)
                        .addComponent(definidaFaseTempoValores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24))
                .addContainerGap(30, Short.MAX_VALUE))
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
                .addGap(323, 323, 323))
        );

        cardLayout3.add(faseInstantaneaFirst, "faseInstantaneaFirst");

        jLabel6.setText("Mínimo (A) : ");

        jLabel12.setText("Máximo (A) :");

        jLabel42.setText(" Passo (A) : ");

        jLabel35.setText("Multiplicador de Corrente");

        jLabel37.setText("Multiplicador de Tempo");

        jLabel38.setText("Mínimo (s) : ");

        jLabel53.setText("Máximo (s) : ");

        jLabel54.setText("Passo (s) : ");

        javax.swing.GroupLayout faseInstantaneaSecondLayout = new javax.swing.GroupLayout(faseInstantaneaSecond);
        faseInstantaneaSecond.setLayout(faseInstantaneaSecondLayout);
        faseInstantaneaSecondLayout.setHorizontalGroup(
            faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel6))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, faseInstantaneaSecondLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)))
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faseMaximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fasePasso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel37))
                            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel54))
                                .addGap(5, 5, 5)
                                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoPassoTempoDefFase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoMaximoTempoDefFase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoMinimoTempoDefFase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel35)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        faseInstantaneaSecondLayout.setVerticalGroup(
            faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoMinimoTempoDefFase, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38))
                    .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(faseMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(campoMaximoTempoDefFase, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fasePasso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54)
                        .addComponent(campoPassoTempoDefFase, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42)))
                .addContainerGap(265, Short.MAX_VALUE))
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
                .addContainerGap(557, Short.MAX_VALUE)
                .addComponent(cancelarDefinidaFase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarDefinidaFase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarDefinidaFase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarDefinidaFase)
                    .addComponent(retornarDefinidaFase)
                    .addComponent(cancelarDefinidaFase))
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

        jLabel27.setText("Tempo de atuação");

        jLabel28.setText("Valores separados por vírgula:");

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
                    .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(6, 6, 6)
                        .addComponent(definidaNeutroTempoValores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27))
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
                .addContainerGap(366, Short.MAX_VALUE))
        );

        cardLayout6.add(neutroInstantaneaFirst, "neutroInstantaneaFirst");

        jLabel18.setText("Mínimo (A) : ");

        jLabel19.setText("Máximo (A) : ");

        jLabel47.setText("Passo (A) : ");

        jLabel55.setText("Multiplicador de Corrente");

        jLabel56.setText("Multiplicador de Tempo");

        jLabel57.setText("Mínimo (s) : ");

        jLabel58.setText("Máximo (s) : ");

        jLabel59.setText("Passo (s) : ");

        javax.swing.GroupLayout neutroInstantaneaSecondLayout = new javax.swing.GroupLayout(neutroInstantaneaSecond);
        neutroInstantaneaSecond.setLayout(neutroInstantaneaSecondLayout);
        neutroInstantaneaSecondLayout.setHorizontalGroup(
            neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel47)
                            .addComponent(jLabel18))
                        .addGap(6, 6, 6)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neutroMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neutroPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel55))
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57))
                        .addGap(5, 5, 5)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPassoTempoDefNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoMaximoTempoDefNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoMinimoTempoDefNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel56)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        neutroInstantaneaSecondLayout.setVerticalGroup(
            neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(neutroMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(campoMinimoTempoDefNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(neutroMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(6, 6, 6)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(neutroPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoMaximoTempoDefNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(campoPassoTempoDefNeutro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(308, Short.MAX_VALUE))
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

        if (!"".equals(fab) && !"".equals(mod)) {
            if (this.isEletromecanico()) {
                this.newRele = new ReleEletromecanico();
            } else {
                this.newRele = new ReleDigital();
            }
            this.newRele.setFabricante(fab);
            this.newRele.setModelo(mod);
            this.configurePanels();
            this.selecionarCards();
            this.avancarTela();
        } else {
            Erro.camposVazios(this);
        }
    }//GEN-LAST:event_avancarDadosGeraisActionPerformed

    private void retornarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarFaseCurvaActionPerformed
        if (this.newRele.getTipo() == Rele.ELETROMECANICO) {
            ((ReleEletromecanico) this.newRele).removeDialDeTempo(Rele.INVERSA_FASE);
        }
        int selecionado = this.temporizadaFase.getSelectedIndex();

        this.temporizadaFase.setSelectedIndex(selecionado - 1);
    }//GEN-LAST:event_retornarFaseCurvaActionPerformed

    private void cancelarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFaseCurvaActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarFaseCurvaActionPerformed

    private void avancarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarFaseCurvaActionPerformed
        if (!this.isEletromecanico()) {
            String minimo = this.faseCurvaMinimo.getText();
            String maximo = this.faseCurvaMaximo.getText();
            String passo = this.faseCurvaPasso.getText();

            if (!"".equals(minimo) && !"".equals(maximo) && !"".equals(passo)) {
                double min = Double.parseDouble(minimo);
                double max = Double.parseDouble(maximo);
                double pas = Double.parseDouble(passo);

                if (this.verificaExpressao(min, max, pas)) {
                    ((ReleDigital) this.newRele).setValuesTempo(Rele.INVERSA_FASE, min, max, pas);
                    ((ReleDigital) this.newRele).setListaFase(this.modeloFaseCaracteristicas.getArrayList());
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
        
        if (StringUtils.isNumber(f)) {
            
            if (this.isEletromecanico()) {
                String valor = this.inversaFaseCorrenteValores.getText();
                
                if (!("").equals(valor)) {
                    List<Double> valores = new ArrayList();
                    double fator = Double.parseDouble(f);
                    
                    StringUtils.separaValores(valor, valores);
                    ((ReleEletromecanico) this.newRele).addCorrentePickup(valores, Rele.INVERSA_FASE);
                    this.newRele.setFatorInicio(fator, Rele.INVERSA_FASE);
                    this.addCorrentePickupFase(valores);
                    int selecionado = this.temporizadaFase.getSelectedIndex();

                    this.temporizadaFase.setSelectedIndex(selecionado + 1);
                } else {
                    Erro.camposVazios(this);
                }
                
            } else {
                String min = this.faseCorrenteMinimo.getText();
                String max = this.faseCorrenteMaximo.getText();
                String pas = this.faseCorrentePasso.getText();
                double fator = Double.parseDouble(f);

                if (StringUtils.isNumber(min) && StringUtils.isNumber(max) && StringUtils.isNumber(pas)) {
                    double minimo = Double.parseDouble(min);
                    double maximo = Double.parseDouble(max);
                    double passo = Double.parseDouble(pas);

                    if (this.verificaExpressao(minimo, maximo, passo)) {
                        this.newRele.setFatorInicio(fator, Rele.INVERSA_FASE);
                        ((ReleDigital) this.newRele).setValuesCorrente(Rele.INVERSA_FASE, minimo, maximo, passo);
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

        if (!"".equals(f)) {
            if (this.isEletromecanico()) {
                String c = this.definidaFaseCorrenteValores.getText();
                String t = this.definidaFaseTempoValores.getText();
                double fator = Double.parseDouble(f);

                if (!"".equals(c) && !"".equals(t)) {
                    this.newRele.setFatorInicio(fator, Rele.DEFINIDO_FASE);
                    ArrayList<Double> lista_corrente = this.separaValores(c);
                    ArrayList<Double> lista_tempo = this.separaValores(t);

                    ((ReleEletromecanico) this.newRele).addCorrentePickup(lista_corrente, Rele.DEFINIDO_FASE);
                    ((ReleEletromecanico) this.newRele).addTempoDeAtuacao(lista_tempo, Rele.DEFINIDO_FASE);
                    this.avancarTela();
                } else {
                    Erro.camposVazios(this);
                }
            } else {
                String minimoCorr = this.faseMinimo.getText();
                String maximoCorr = this.faseMaximo.getText();
                String passoCorr = this.fasePasso.getText();
                String minimoTempo = this.campoMinimoTempoDefFase.getText();
                String maximoTempo = this.campoMaximoTempoDefFase.getText();
                String passoTempo = this.campoPassoTempoDefFase.getText();
                double fator = Double.parseDouble(f);

                if (!"".equals(minimoCorr) && !"".equals(maximoCorr) && !"".equals(passoCorr) && !"".equals(minimoTempo) && !"".equals(maximoTempo) && !"".equals(passoTempo)) {
                    double minCorr = Double.parseDouble(minimoCorr);
                    double maxCorr = Double.parseDouble(maximoCorr);
                    double pasCorr = Double.parseDouble(passoCorr);
                    double minTemp = Double.parseDouble(minimoTempo);
                    double maxTemp = Double.parseDouble(maximoTempo);
                    double pasTemp = Double.parseDouble(passoTempo);

                    if (this.verificaExpressao(minCorr, maxCorr, pasCorr) && this.verificaExpressao(minTemp, maxTemp, pasTemp)) {
                        this.newRele.setFatorInicio(fator, Rele.DEFINIDO_FASE);
                        ((ReleDigital) this.newRele).setValuesCorrente(Rele.DEFINIDO_FASE, minCorr, maxCorr, pasCorr);
                        ((ReleDigital) this.newRele).setValuesTempo(Rele.DEFINIDO_FASE, minTemp, maxTemp, pasTemp);
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

        if (!"".equals(f)) {
            double fator = Double.parseDouble(f);

            if (this.isEletromecanico()) {
                String c = this.definidaNeutroCorrenteValores.getText();
                String t = this.definidaNeutroTempoValores.getText();

                if (!"".equals(c) && !"".equals(t)) {
                    ArrayList<Double> lista_corrente = this.separaValores(c);
                    ArrayList<Double> lista_tempo = this.separaValores(t);

                    this.newRele.setFatorInicio(fator, Rele.DEFINIDO_NEUTRO);
                    ((ReleEletromecanico) this.newRele).addCorrentePickup(lista_corrente, Rele.DEFINIDO_NEUTRO);
                    ((ReleEletromecanico) this.newRele).addTempoDeAtuacao(lista_tempo, Rele.DEFINIDO_NEUTRO);
                } else {
                    Erro.camposVazios(this);
                }
            } else {
                String minimoCor = this.neutroMinimo.getText();
                String maximoCor = this.neutroMaximo.getText();
                String passoCor = this.neutroPasso.getText();
                String minimoTempo = this.campoMinimoTempoDefNeutro.getText();
                String maximoTempo = this.campoMaximoTempoDefNeutro.getText();
                String passoTempo = this.campoPassoTempoDefNeutro.getText();

                if (!"".equals(minimoCor) && !"".equals(maximoCor) && !"".equals(passoCor) && !"".equals(minimoTempo) && !"".equals(maximoTempo) && !"".equals(passoTempo)) {
                    double minCorr = Double.parseDouble(minimoCor);
                    double maxCorr = Double.parseDouble(maximoCor);
                    double pasCorr = Double.parseDouble(passoCor);
                    double minTemp = Double.parseDouble(minimoTempo);
                    double maxTemp = Double.parseDouble(maximoTempo);
                    double pasTemp = Double.parseDouble(passoTempo);

                    if (this.verificaExpressao(minCorr, maxCorr, pasCorr) && this.verificaExpressao(minTemp, maxTemp, pasTemp)) {
                        this.newRele.setFatorInicio(fator, Rele.DEFINIDO_NEUTRO);
                        ((ReleDigital) this.newRele).setValuesCorrente(Rele.DEFINIDO_NEUTRO, minCorr, maxCorr, pasCorr);
                        ((ReleDigital) this.newRele).setValuesTempo(Rele.DEFINIDO_NEUTRO, minTemp, maxTemp, pasTemp);
                    }
                } else {
                    Erro.camposVazios(this);
                }
            }
            try {
                GUI_Reles_Resumo resumo = new GUI_Reles_Resumo(this, true, newRele);
                resumo.setAlwaysOnTop(true);
                resumo.setVisible(true);
            } catch (Exception e) {

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

            if (!"".equals(minimo) && !"".equals(maximo) && !"".equals(passo)) {
                double min = Double.parseDouble(this.neutroCurvaMinimo.getText());
                double max = Double.parseDouble(this.neutroCurvaMaximo.getText());
                double pas = Double.parseDouble(this.neutroCurvaPasso.getText());

                if (this.verificaExpressao(min, max, pas)) {
                    ((ReleDigital) this.newRele).setValuesTempo(Rele.INVERSA_NEUTRO, min, max, pas);
                    ((ReleDigital) this.newRele).setListaNeutro(this.modeloNeutroCaracteristicas.getArrayList());
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
        if (this.newRele.getTipo() == Rele.ELETROMECANICO) {
            ((ReleEletromecanico) this.newRele).removeDialDeTempo(WIDTH);
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

        if (!"".equals(f)) {
            if (this.isEletromecanico()) {
                String v = this.inversaNeutroCorrenteValores.getText();
                double fator = Double.parseDouble(f);

                if (!"".equals(v)) {
                    this.newRele.setFatorInicio(fator, Rele.INVERSA_NEUTRO);
                    ArrayList<Double> lista = this.separaValores(v);

                    ((ReleEletromecanico) this.newRele).addCorrentePickup(lista, Rele.INVERSA_NEUTRO);
                    this.addCorrentePickupNeutro(lista);
                    int selecionado = this.jTabbedPane1.getSelectedIndex();

                    this.jTabbedPane1.setSelectedIndex(selecionado + 1);
                }
            } else {
                String minimo = this.neutroCorrenteMinimo.getText();
                String maximo = this.neutroCorrenteMaximo.getText();
                String passo = this.neutroCorrentePasso.getText();
                double fator = Double.parseDouble(f);

                if (!"".equals(minimo) && !"".equals(maximo) && !"".equals(passo)) {
                    double min = Double.parseDouble(this.neutroCorrenteMinimo.getText());
                    double max = Double.parseDouble(this.neutroCorrenteMaximo.getText());
                    double pas = Double.parseDouble(this.neutroCorrentePasso.getText());

                    if (this.verificaExpressao(min, max, pas)) {
                        this.newRele.setFatorInicio(fator, Rele.INVERSA_NEUTRO);
                        ((ReleDigital) this.newRele).setValuesCorrente(Rele.INVERSA_NEUTRO, min, max, pas);
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
        this.salvarFaseDialCadastradoComPontos();
        this.limparCamposFaseCurvaSalvar();
        this.carregarFaseDialCadastradoEmCorrente();
        this.carregarFasePontosDeDial();
    }//GEN-LAST:event_faseCurvaSalvarActionPerformed

    private void limparCamposFaseCurvaSalvar() {
        this.faseCurvaDial.setText("");
        this.modeloFaseCriarDial.removeTodos();
        this.modeloFaseCriarDial.fireTableDataChanged();
    }

    private void salvarFaseDialCadastradoComPontos() {
        String c = String.valueOf(this.faseCurvaCorrenteCadastro.getSelectedItem());
        String d = this.faseCurvaDial.getText();

        if (!("").equals(c) && !("").equals(d)) {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            List<PontoCurva> pontos = this.modeloFaseCriarDial.getList();
            List<Double> values = ((ReleEletromecanico) this.newRele).getDialDeTempo(Rele.INVERSA_FASE, corrente);

            if (values.isEmpty() || values.indexOf(dial) == -1) {
                ((ReleEletromecanico) this.newRele).addDialDeTempo(Rele.INVERSA_FASE, corrente, dial, pontos);
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

        if (!"".equals(c) && !"".equals(d)) {
            double corrente = Double.parseDouble(c);
            double dial = Double.parseDouble(d);
            List<PontoCurva> pontos = this.modeloNeutroCriaDial.getList();
            List<Double> values = ((ReleEletromecanico) this.newRele).getDialDeTempo(Rele.INVERSA_NEUTRO, corrente);

            if (values.isEmpty() || values.indexOf(dial) == -1) {
                ((ReleEletromecanico) this.newRele).addDialDeTempo(Rele.INVERSA_NEUTRO, corrente, dial, pontos);
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

        if ("null".equals(str)) {
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(str);

            List<Double> dial = ((ReleEletromecanico) this.newRele).getDialDeTempo(Rele.INVERSA_FASE, corrente);
            this.faseCurvaDialExistente.removeAllItems();
            for (Double d : dial) {
                this.faseCurvaDialExistente.addItem(d);
            }
        }
    }

    private void carregarNeutroDialCadastradoEmCorrente() {
        String str = String.valueOf(this.neutroCurvaCorrenteExistente.getSelectedItem());
        double corrente = Double.parseDouble(str);

        List<Double> dial = ((ReleEletromecanico) this.newRele).getDialDeTempo(Rele.INVERSA_NEUTRO, corrente);
        this.neutroCurvaDialExistente.removeAllItems();
        for (Double d : dial) {
            this.neutroCurvaDialExistente.addItem(d);
        }
    }

    private void faseCurvaDialExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaDialExistenteActionPerformed
        try {
            this.carregarFasePontosDeDial();
        } catch (NullPointerException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_faseCurvaDialExistenteActionPerformed

    private void carregarFasePontosDeDial() throws NullPointerException {
        String str = String.valueOf(this.faseCurvaCorrenteExistente.getSelectedItem());
        String srt = String.valueOf(this.faseCurvaDialExistente.getSelectedItem());

        if ("null".equals(str) || "null".equals(srt)) {
            this.modeloFaseExistenteDial.removeTodos();
            this.modeloFaseExistenteDial.fireTableDataChanged();
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(str);
            double dial = Double.parseDouble(srt);
            List<PontoCurva> list;
            list = ((ReleEletromecanico) this.newRele).getPontosDialDeTempo(corrente, dial, Rele.INVERSA_FASE);

            this.modeloFaseExistenteDial.removeTodos();
            this.modeloFaseExistenteDial.add(list);
            this.modeloFaseExistenteDial.fireTableDataChanged();
        }
    }

    private void carregarNeutroPontosDeDial() {
        String str = String.valueOf(this.neutroCurvaCorrenteExistente.getSelectedItem());
        String srt = String.valueOf(this.neutroCurvaDialExistente.getSelectedItem());

        if ("null".equals(str) || "null".equals(srt)) {
            this.modeloNeutroExistenteDial.removeTodos();
            this.modeloNeutroExistenteDial.fireTableDataChanged();
            throw new NullPointerException();
        } else {
            double corrente = Double.parseDouble(str);
            double dial = Double.parseDouble(srt);
            List<PontoCurva> list;
            list = ((ReleEletromecanico) this.newRele).getPontosDialDeTempo(corrente, dial, Rele.INVERSA_NEUTRO);

            this.modeloNeutroExistenteDial.removeTodos();
            this.modeloNeutroExistenteDial.add(list);
            this.modeloNeutroExistenteDial.fireTableDataChanged();
        }
    }

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
        this.limparCamposNeutroCurvaSalvar();
        this.neutroCurvaCorrenteExistenteActionPerformed(evt);
        this.neutroCurvaDialExistenteActionPerformed(evt);
    }//GEN-LAST:event_neutroCurvaSalvarActionPerformed

    private void limparCamposNeutroCurvaSalvar() {
        this.neutroCurvaDial.setText("");
        this.modeloNeutroCriaDial.removeTodos();
        this.modeloNeutroCriaDial.fireTableDataChanged();
    }

    private void neutroCurvaDialExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaDialExistenteActionPerformed
        try {
            this.carregarNeutroPontosDeDial();
        } catch (NullPointerException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_neutroCurvaDialExistenteActionPerformed

    private void neutroCurvaCorrenteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaCorrenteExistenteActionPerformed
        carregarNeutroDialCadastradoEmCorrente();
    }//GEN-LAST:event_neutroCurvaCorrenteExistenteActionPerformed

    private void faseCurvaGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaGraficoActionPerformed
        String c = String.valueOf(this.faseCurvaCorrenteCadastro.getSelectedItem());
        String d = this.faseCurvaDial.getText();

        if (!("").equals(c) && !("").equals(d)) {
            double dial = Double.parseDouble(d);
            List<PontoCurva> pontos = this.modeloFaseCriarDial.getList();
            DialDeTempoMecanico dialTempo = new DialDeTempoMecanico(dial, pontos);
            //Grafico.criarGrafico(dialTempo, this).setVisible(true);
        }
    }//GEN-LAST:event_faseCurvaGraficoActionPerformed

    private void neutroCurvaGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaGraficoActionPerformed
        String c = String.valueOf(this.neutroCurvaCorrenteCadastro.getSelectedItem());
        String d = this.neutroCurvaDial.getText();

        if (!"".equals(c) && !"".equals(d)) {
            double dial = Double.parseDouble(d);
            List<PontoCurva> pontos = this.modeloNeutroCriaDial.getList();
            DialDeTempoMecanico dialTempo = new DialDeTempoMecanico(dial, pontos);
            //Grafico.criarGrafico(dialTempo, this).setVisible(true);
        }
    }//GEN-LAST:event_neutroCurvaGraficoActionPerformed

    private void removeDialInversaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDialInversaFaseActionPerformed
        
    }//GEN-LAST:event_removeDialInversaFaseActionPerformed

    private void configurePanels() {
        boolean faseInversa = this.curvaInversaFase.isSelected();
        boolean faseDefinida = this.curvaTempoFase.isSelected();
        boolean neutroInversa = this.curvaInversaNeutro.isSelected();
        boolean neutroDefinida = this.curvaTempoNeutro.isSelected();
        this.panels = new boolean[5];

        this.newRele.setExisteCurva(Rele.INVERSA_FASE, faseInversa);
        this.newRele.setExisteCurva(Rele.INVERSA_NEUTRO, neutroInversa);
        this.newRele.setExisteCurva(Rele.DEFINIDO_FASE, faseDefinida);
        this.newRele.setExisteCurva(Rele.DEFINIDO_NEUTRO, neutroDefinida);
        this.panels[0] = true;
        this.panels[1] = faseInversa;
        this.panels[2] = faseDefinida;
        this.panels[3] = neutroInversa;
        this.panels[4] = neutroDefinida;
    }

    private void desabilitarPaineis(int selecionado) {
        int tabs = this.tabbedPane.getTabCount();
        
        /*for (int i = 0; i < tabs; i++) {
            if (i == selecionado) {
                tabbedPane.setEnabledAt(i, true);
            } else {
                this.tabbedPane.setEnabledAt(i, false);
            }
        }*/
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
        while (this.getSelected() < this.tabbedPane.getComponentCount()) {
            int selecionado = this.getSelected() + 1;

            this.tabbedPane.setSelectedIndex(selecionado);
            if (this.panels[selecionado]) {
                //this.desabilitarPaineis(selecionado);
                break;
            }
        }
    }

    private void retornarTela() {
        while (this.getSelected() > 0) {
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
        this.modeloNeutroCaracteristicas = new CaracteristicasTableModel();
        this.modeloFaseCaracteristicas = new CaracteristicasTableModel();

        this.neutroCurvaCaracteristicas.setModel(modeloNeutroCaracteristicas);
        this.faseCurvaCaracteristicas.setModel(modeloFaseCaracteristicas);
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
            java.util.logging.Logger.getLogger(GUI_Reles.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Reles.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Reles.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Reles.class
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
                new GUI_Reles().setVisible(true);
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
    private javax.swing.JTextField campoMaximoTempoDefFase;
    private javax.swing.JTextField campoMaximoTempoDefNeutro;
    private javax.swing.JTextField campoMinimoTempoDefFase;
    private javax.swing.JTextField campoMinimoTempoDefNeutro;
    private javax.swing.JTextField campoPassoTempoDefFase;
    private javax.swing.JTextField campoPassoTempoDefNeutro;
    private javax.swing.JButton cancelarDadosGerais;
    private javax.swing.JButton cancelarDefinidaFase;
    private javax.swing.JButton cancelarDefinidaNeutro;
    private javax.swing.JButton cancelarFaseCurva;
    private javax.swing.JButton cancelarInversaFaseCorrente;
    private javax.swing.JButton cancelarInversaNeutroCorrente;
    private javax.swing.JButton cancelarNeutroCurva;
    private javax.swing.JPanel cardLayout1;
    private javax.swing.JPanel cardLayout2;
    private javax.swing.JPanel cardLayout3;
    private javax.swing.JPanel cardLayout4;
    private javax.swing.JPanel cardLayout5;
    private javax.swing.JPanel cardLayout6;
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
    private javax.swing.JTextField definidaNeutroCorrenteValores;
    private javax.swing.JTextField definidaNeutroFator;
    private javax.swing.JTextField definidaNeutroTempoValores;
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
    private javax.swing.JButton faseCurvaRemoveCaracteristicas;
    private javax.swing.JButton faseCurvaRemovePrimeira;
    private javax.swing.JButton faseCurvaSalvar;
    private javax.swing.JPanel faseCurvaSecond;
    private javax.swing.JTable faseCurvaSegunda;
    private javax.swing.JPanel faseInstantaneaFirst;
    private javax.swing.JPanel faseInstantaneaSecond;
    private javax.swing.JTextField faseMaximo;
    private javax.swing.JTextField faseMinimo;
    private javax.swing.JTextField fasePasso;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField modelo;
    private javax.swing.JPanel neutroCorrenteFirst;
    private javax.swing.JTextField neutroCorrenteMaximo;
    private javax.swing.JTextField neutroCorrenteMinimo;
    private javax.swing.JTextField neutroCorrentePasso;
    private javax.swing.JPanel neutroCorrenteSecond;
    private javax.swing.JButton neutroCurvaAdicionaCaracteristicas;
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
    private javax.swing.JButton neutroCurvaRemoveCaracteristicas;
    private javax.swing.JButton neutroCurvaRemovePrimeira;
    private javax.swing.JButton neutroCurvaSalvar;
    private javax.swing.JPanel neutroCurvaSecond;
    private javax.swing.JTable neutroCurvaSegunda;
    private javax.swing.JPanel neutroInstantaneaFirst;
    private javax.swing.JPanel neutroInstantaneaSecond;
    private javax.swing.JTextField neutroMaximo;
    private javax.swing.JTextField neutroMinimo;
    private javax.swing.JTextField neutroPasso;
    private javax.swing.JButton removeDialInversaFase;
    private javax.swing.JButton retornarDefinidaFase;
    private javax.swing.JButton retornarDefinidaNeutro;
    private javax.swing.JButton retornarFaseCurva;
    private javax.swing.JButton retornarInversaFaseCorrente;
    private javax.swing.JButton retornarInversaNeutroCorrente;
    private javax.swing.JButton retornarNeutroCurva;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTabbedPane temporizadaFase;
    private javax.swing.ButtonGroup tipoDeEquipamento;
    // End of variables declaration//GEN-END:variables
}
