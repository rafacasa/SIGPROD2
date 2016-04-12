package SIGPROD2.GUI;

import SIGPROD2.Auxiliar.Arquivo;
import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Auxiliar.Perguntas;
import SIGPROD2.Modelo.PontoCurva;
import SIGPROD2.Modelo.Tabelas.CaracteristicasTableModel;
import SIGPROD2.Modelo.Tabelas.PontoCurvaTableModel;
import SIGPROD2.Modelo.CaracteristicaCurva;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleDigital;
import SIGPROD2.Modelo.ReleEletromecanico;
import com.google.gson.Gson;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class GUI_Reles extends javax.swing.JFrame {

    private CaracteristicasTableModel modeloFaseCaracteristicas;
    private CaracteristicasTableModel modeloNeutroCaracteristicas;
    private PontoCurvaTableModel modeloFaseCriarDial;
    private PontoCurvaTableModel modeloFaseExistenteDial;
    private PontoCurvaTableModel modeloNeutroPrimeiro;
    private PontoCurvaTableModel modeloNeutroDial;
    private Rele newRele;

    public GUI_Reles() {
        this.initComponents();
        this.configurarTabelas();
        this.desabilitarPaineis();
        this.selectCheck();
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
        faseCorrenteValores = new javax.swing.JTextField();
        faseCorrenteSecond = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        faseCorrenteMinimo = new javax.swing.JTextField();
        faseCorrenteMaximo = new javax.swing.JTextField();
        faseCorrentePasso = new javax.swing.JTextField();
        avancarFaseCorrente = new javax.swing.JButton();
        retornarFaseCorrente = new javax.swing.JButton();
        cancelarFaseCorrente = new javax.swing.JButton();
        faseCorrenteFator = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cardLayout2 = new javax.swing.JPanel();
        faseCurvaFirst = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        faseCurvaCorrenteCadastro = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        faseCurvaDial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        faseCurvaPrimeira = new javax.swing.JTable();
        faseCurvaGrafico = new javax.swing.JButton();
        faseCurvaRemovePrimeira = new javax.swing.JButton();
        faseCurvaAdicionaPrimeira = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        faseCurvaDialExistente = new javax.swing.JComboBox();
        faseCurvaCorrenteExistente = new javax.swing.JComboBox();
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
        Painel3 = new javax.swing.JPanel();
        correntePickup1 = new javax.swing.JPanel();
        cardLayout3 = new javax.swing.JPanel();
        faseInstantaneaFirst = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        valores = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        faseInstantaneaSecond = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        correntePickup3 = new javax.swing.JPanel();
        cardLayout4 = new javax.swing.JPanel();
        neutroCorrenteFirst = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        neutroCorrenteSecond = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField20 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        cardLayout5 = new javax.swing.JPanel();
        neutroCurvaFirst = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        faseCurvaCorrente1 = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        faseCurvaDial1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        neutroCurvaPrimeira = new javax.swing.JTable();
        faseCurvaAdicionaPrimeira1 = new javax.swing.JButton();
        faseCurvaRemovePrimeira1 = new javax.swing.JButton();
        faseCurvaGrafico1 = new javax.swing.JButton();
        neutroCurvaSecond = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        faseCurvaMinimo1 = new javax.swing.JTextField();
        faseCurvaMaximo1 = new javax.swing.JTextField();
        faseCurvaPasso1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        neutroCurvaCaracteristicas = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        neutroCurvaAdicionaCaracteristicas = new javax.swing.JButton();
        neutroCurvaRemoveCaracteristicas = new javax.swing.JButton();
        avancarFaseCurva1 = new javax.swing.JButton();
        cancelarFaseCurva1 = new javax.swing.JButton();
        retornarFaseCurva1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        correntePickup2 = new javax.swing.JPanel();
        cardLayout6 = new javax.swing.JPanel();
        neutroInstantaneaFirst = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        neutroInstantaneaSecond = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
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
                        .addGap(0, 527, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
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
                .addComponent(faseCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        faseCorrenteFirstLayout.setVerticalGroup(
            faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCorrenteFirstLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(faseCorrenteValores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        avancarFaseCorrente.setText("Avançar");
        avancarFaseCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarFaseCorrenteActionPerformed(evt);
            }
        });

        retornarFaseCorrente.setText("Retornar");
        retornarFaseCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarFaseCorrenteActionPerformed(evt);
            }
        });

        cancelarFaseCorrente.setText("Cancelar");
        cancelarFaseCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFaseCorrenteActionPerformed(evt);
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
                        .addComponent(faseCorrenteFator, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarFaseCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarFaseCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarFaseCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        correntePickupLayout.setVerticalGroup(
            correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickupLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCorrenteFator, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarFaseCorrente)
                    .addComponent(retornarFaseCorrente)
                    .addComponent(cancelarFaseCorrente))
                .addGap(12, 12, 12))
        );

        temporizadaFase.addTab("Corrente de pickup", correntePickup);

        jPanel5.setPreferredSize(new java.awt.Dimension(875, 526));

        cardLayout2.setLayout(new java.awt.CardLayout());

        faseCurvaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jLabel7.setText("Corrente de pickup :");

        faseCurvaCorrenteCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaCorrenteCadastroActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar dial de tempo"));

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

        jButton15.setText("Salvar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(faseCurvaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(faseCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faseCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(faseCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Dial de tempo cadastrados"));

        jScrollPane3.setViewportView(jTable1);

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(faseCurvaCorrenteExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(faseCurvaDialExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout faseCurvaFirstLayout = new javax.swing.GroupLayout(faseCurvaFirst);
        faseCurvaFirst.setLayout(faseCurvaFirstLayout);
        faseCurvaFirstLayout.setHorizontalGroup(
            faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(faseCurvaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        faseCurvaFirstLayout.setVerticalGroup(
            faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                        .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(faseCurvaCorrenteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(faseCurvaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(490, Short.MAX_VALUE))
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

        temporizadaFase.addTab("Curvas", jPanel5);

        tabbedPane.addTab("Inversa de fase", temporizadaFase);

        cardLayout3.setLayout(new java.awt.CardLayout());

        jLabel44.setText("Valores separados por vírgula :");

        valores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valoresActionPerformed(evt);
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
                        .addComponent(valores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(valores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel25)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(323, 323, 323))
        );

        cardLayout3.add(faseInstantaneaFirst, "faseInstantaneaFirst");

        jLabel6.setText("Mínimo (A) :");

        jLabel12.setText("Máximo (A) :");

        jLabel42.setText("Passo (A) :");

        javax.swing.GroupLayout faseInstantaneaSecondLayout = new javax.swing.GroupLayout(faseInstantaneaSecond);
        faseInstantaneaSecond.setLayout(faseInstantaneaSecondLayout);
        faseInstantaneaSecondLayout.setHorizontalGroup(
            faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel42)))
                .addGap(3, 3, 3)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(602, Short.MAX_VALUE))
        );
        faseInstantaneaSecondLayout.setVerticalGroup(
            faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        cardLayout3.add(faseInstantaneaSecond, "faseInstantaneaSecond");

        jButton4.setText("Avançar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Retornar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        correntePickup1Layout.setVerticalGroup(
            correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton4))
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
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        neutroCorrenteFirstLayout.setVerticalGroup(
            neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteFirstLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        neutroCorrenteSecondLayout.setVerticalGroup(
            neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteSecondLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(6, 6, 6)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        cardLayout4.add(neutroCorrenteSecond, "neutroCorrenteSecond");

        jButton10.setText("Avançar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Retornar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Cancelar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel49.setText("Fator de início da curva :");

        javax.swing.GroupLayout correntePickup3Layout = new javax.swing.GroupLayout(correntePickup3);
        correntePickup3.setLayout(correntePickup3Layout);
        correntePickup3Layout.setHorizontalGroup(
            correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup3Layout.createSequentialGroup()
                .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(correntePickup3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(correntePickup3Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cardLayout4, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        correntePickup3Layout.setVerticalGroup(
            correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(correntePickup3Layout.createSequentialGroup()
                        .addComponent(cardLayout4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup3Layout.createSequentialGroup()
                        .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton11)
                            .addComponent(jButton12))
                        .addGap(12, 12, 12))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(correntePickup3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correntePickup3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Corrente de pickup", jPanel2);

        jPanel6.setPreferredSize(new java.awt.Dimension(875, 526));

        cardLayout5.setLayout(new java.awt.CardLayout());

        neutroCurvaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jLabel37.setText("Corrente de pickup :");

        jLabel38.setText("Dial de tempo :");

        jScrollPane5.setPreferredSize(new java.awt.Dimension(251, 250));
        jScrollPane5.setViewportView(neutroCurvaPrimeira);

        faseCurvaAdicionaPrimeira1.setText("+");
        faseCurvaAdicionaPrimeira1.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaAdicionaPrimeira1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaAdicionaPrimeira1ActionPerformed(evt);
            }
        });

        faseCurvaRemovePrimeira1.setText("-");
        faseCurvaRemovePrimeira1.setPreferredSize(new java.awt.Dimension(44, 26));
        faseCurvaRemovePrimeira1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaRemovePrimeira1ActionPerformed(evt);
            }
        });

        faseCurvaGrafico1.setText("Gráfico");
        faseCurvaGrafico1.setPreferredSize(new java.awt.Dimension(84, 26));

        javax.swing.GroupLayout neutroCurvaFirstLayout = new javax.swing.GroupLayout(neutroCurvaFirst);
        neutroCurvaFirst.setLayout(neutroCurvaFirstLayout);
        neutroCurvaFirstLayout.setHorizontalGroup(
            neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                .addGroup(neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addGap(6, 6, 6)
                        .addComponent(faseCurvaCorrente1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(6, 6, 6)
                                .addComponent(faseCurvaDial1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, neutroCurvaFirstLayout.createSequentialGroup()
                                    .addComponent(faseCurvaAdicionaPrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(faseCurvaRemovePrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(faseCurvaGrafico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        neutroCurvaFirstLayout.setVerticalGroup(
            neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(faseCurvaCorrente1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(faseCurvaDial1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaAdicionaPrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRemovePrimeira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaGrafico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        cardLayout5.add(neutroCurvaFirst, "neutroCurvaFirst");

        jLabel39.setText("Multiplicador de tempo :");

        jLabel40.setText("Mínimo (A) :");
        jLabel40.setPreferredSize(new java.awt.Dimension(85, 15));

        jLabel50.setText("Máximo (A) :");

        jLabel51.setText("Passo (A) :");
        jLabel51.setPreferredSize(new java.awt.Dimension(85, 15));

        faseCurvaMaximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseCurvaMaximo1ActionPerformed(evt);
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
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addGroup(neutroCurvaSecondLayout.createSequentialGroup()
                        .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faseCurvaPasso1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaMaximo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faseCurvaMinimo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel52)
                    .addGroup(neutroCurvaSecondLayout.createSequentialGroup()
                        .addComponent(neutroCurvaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neutroCurvaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(490, Short.MAX_VALUE))
        );
        neutroCurvaSecondLayout.setVerticalGroup(
            neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaSecondLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaMinimo1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(faseCurvaMaximo1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaPasso1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neutroCurvaAdicionaCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neutroCurvaRemoveCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        cardLayout5.add(neutroCurvaSecond, "neutroCurvaSecond");

        avancarFaseCurva1.setText("Avançar");
        avancarFaseCurva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarFaseCurva1ActionPerformed(evt);
            }
        });

        cancelarFaseCurva1.setText("Cancelar");
        cancelarFaseCurva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFaseCurva1ActionPerformed(evt);
            }
        });

        retornarFaseCurva1.setText("Retornar");
        retornarFaseCurva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarFaseCurva1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarFaseCurva1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarFaseCurva1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avancarFaseCurva1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addComponent(cardLayout5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(cardLayout5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarFaseCurva1)
                    .addComponent(retornarFaseCurva1)
                    .addComponent(avancarFaseCurva1))
                .addContainerGap())
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

        cardLayout6.setLayout(new java.awt.CardLayout());

        jLabel46.setText("Valores separados por vírgula :");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
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
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26))
                .addGap(28, 28, 28)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(366, Short.MAX_VALUE))
        );

        cardLayout6.add(neutroInstantaneaFirst, "neutroInstantaneaFirst");

        jLabel18.setText("Mínimo (A) :");

        jLabel19.setText("Máximo (A) :");

        jLabel47.setText("Passo (A) :");

        javax.swing.GroupLayout neutroInstantaneaSecondLayout = new javax.swing.GroupLayout(neutroInstantaneaSecond);
        neutroInstantaneaSecond.setLayout(neutroInstantaneaSecondLayout);
        neutroInstantaneaSecondLayout.setHorizontalGroup(
            neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel47)))
                .addGap(3, 3, 3)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(602, Short.MAX_VALUE))
        );
        neutroInstantaneaSecondLayout.setVerticalGroup(
            neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(6, 6, 6)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        cardLayout6.add(neutroInstantaneaSecond, "neutroInstantaneaSecond");

        jButton7.setText("Avançar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Retornar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Cancelar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel48.setText("Fator de início da curva :");

        javax.swing.GroupLayout correntePickup2Layout = new javax.swing.GroupLayout(correntePickup2);
        correntePickup2.setLayout(correntePickup2Layout);
        correntePickup2Layout.setHorizontalGroup(
            correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(correntePickup2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardLayout6, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(correntePickup2Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        correntePickup2Layout.setVerticalGroup(
            correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout6, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton9)))
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
                this.newRele = new ReleEletromecanico();
            } else {
                this.newRele = new ReleDigital();
            }
            this.newRele.setFabricante(fab);
            this.newRele.setModelo(mod);
            this.habilitarPaineis();
            this.selecionarCards();
            this.avancarTela();
        } else {
            Erro.camposVazios(this);
        }
    }//GEN-LAST:event_avancarDadosGeraisActionPerformed

    private void retornarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarFaseCurvaActionPerformed
        this.removeCorrentePickupFase();
        ((ReleEletromecanico) this.newRele).removeCorrentePickup(Rele.INVERSA_FASE);
        int selecionado = this.temporizadaFase.getSelectedIndex();

        this.temporizadaFase.setSelectedIndex(selecionado - 1);
    }//GEN-LAST:event_retornarFaseCurvaActionPerformed

    private void cancelarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFaseCurvaActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarFaseCurvaActionPerformed

    private void avancarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarFaseCurvaActionPerformed
        this.avancarTela();
        Arquivo a = new Arquivo("teste.ini");
        Gson json = new Gson();
        a.escreverArquivo(json.toJson(this.newRele));
    }//GEN-LAST:event_avancarFaseCurvaActionPerformed

    private void cancelarFaseCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFaseCorrenteActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarFaseCorrenteActionPerformed

    private void retornarFaseCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarFaseCorrenteActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_retornarFaseCorrenteActionPerformed

    private void avancarFaseCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarFaseCorrenteActionPerformed
        if (this.isEletromecanico()) {
            String fator = this.faseCorrenteFator.getText();
            String valor = this.faseCorrenteValores.getText();

            if (!fator.equals("") && !valor.equals("")) {
                ArrayList<Double> v = this.separaValores(valor);
                double d = Double.parseDouble(fator);

                ((ReleEletromecanico) this.newRele).addCorrentePickup(v, Rele.INVERSA_FASE);
                this.newRele.addFatorInicio(d, Rele.INVERSA_FASE);
                this.addCorrentePickupFase(v);
                int selecionado = this.temporizadaFase.getSelectedIndex();

                this.temporizadaFase.setSelectedIndex(selecionado + 1);
            } else {
                Erro.camposVazios(this);
            }
        } else {

        }

    }//GEN-LAST:event_avancarFaseCorrenteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String s = this.jTextField10.getText();
        double fator = Double.parseDouble(s);
        this.newRele.addFatorInicio(fator, Rele.DEFINIDO_FASE);
        
        String c = this.valores.getText();
        ArrayList<Double> lista = this.separaValores(c);
        
        
        this.avancarTela();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.avancarTela();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void avancarFaseCurva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarFaseCurva1ActionPerformed
        this.avancarTela();
    }//GEN-LAST:event_avancarFaseCurva1ActionPerformed

    private void cancelarFaseCurva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFaseCurva1ActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarFaseCurva1ActionPerformed

    private void retornarFaseCurva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarFaseCurva1ActionPerformed
        int selecionado = this.jTabbedPane1.getSelectedIndex();

        this.jTabbedPane1.setSelectedIndex(selecionado - 1);
    }//GEN-LAST:event_retornarFaseCurva1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int selecionado = this.jTabbedPane1.getSelectedIndex();

        this.jTabbedPane1.setSelectedIndex(selecionado + 1);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void faseCurvaMaximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaMaximo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaMaximo1ActionPerformed

    private void neutroCurvaAdicionaCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutroCurvaAdicionaCaracteristicasActionPerformed
        this.modeloNeutroCaracteristicas.add(new CaracteristicaCurva("-", "-", "-", "-"));
        this.modeloNeutroCaracteristicas.fireTableDataChanged();
    }//GEN-LAST:event_neutroCurvaAdicionaCaracteristicasActionPerformed

    private void faseCurvaAdicionaPrimeira1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaAdicionaPrimeira1ActionPerformed
        this.modeloNeutroPrimeiro.add(new PontoCurva(0, 0));
        this.modeloNeutroPrimeiro.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaAdicionaPrimeira1ActionPerformed

    private void faseCurvaRemovePrimeira1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaRemovePrimeira1ActionPerformed
        int selecionado = this.neutroCurvaPrimeira.getSelectedRow();

        this.modeloNeutroPrimeiro.remove(selecionado);
        this.modeloNeutroPrimeiro.fireTableDataChanged();
    }//GEN-LAST:event_faseCurvaRemovePrimeira1ActionPerformed

    private void faseCurvaAdicionaCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaAdicionaCaracteristicasActionPerformed
        this.modeloFaseCaracteristicas.add(new CaracteristicaCurva("-", "-", "-", "-"));
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

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        ReleEletromecanico rele = (ReleEletromecanico) this.newRele;
        String c = String.valueOf(this.faseCurvaCorrenteCadastro.getSelectedItem());
        double corrente = Double.parseDouble(c);
        String d = this.faseCurvaDial.getText();
        double dial = Double.parseDouble(d);
        ArrayList<PontoCurva> pontos = new ArrayList(this.modeloFaseCriarDial.getArrayList());

        rele.addDialDeTempo(Rele.INVERSA_FASE, corrente, dial, pontos);
        this.faseCurvaCorrenteExistenteActionPerformed(null);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void faseCurvaCorrenteExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaCorrenteExistenteActionPerformed
        String str = String.valueOf(this.faseCurvaCorrenteExistente.getSelectedItem());
        double corrente = Double.parseDouble(str);

        ArrayList<Double> dial = ((ReleEletromecanico) this.newRele).getDialDeTempo(Rele.INVERSA_FASE, corrente);
        this.faseCurvaDialExistente.removeAllItems();
        for (Double d : dial) {
            this.faseCurvaDialExistente.addItem(d);
        }
        this.faseCurvaDialExistenteActionPerformed(null);
    }//GEN-LAST:event_faseCurvaCorrenteExistenteActionPerformed

    private void faseCurvaDialExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaDialExistenteActionPerformed
        String str = String.valueOf(this.faseCurvaCorrenteExistente.getSelectedItem());
        String srt = String.valueOf(this.faseCurvaDialExistente.getSelectedItem());

        try {
            double corrente = Double.parseDouble(str);
            double dial = Double.parseDouble(srt);
            ArrayList<PontoCurva> a;
            a = ((ReleEletromecanico) this.newRele).getPontosDialDeTempo(corrente, dial, Rele.INVERSA_FASE);

            this.modeloFaseExistenteDial.removeTodos();
            this.modeloFaseExistenteDial.add(a);
            this.modeloFaseExistenteDial.fireTableDataChanged();
        } catch (NumberFormatException e) {
            this.modeloFaseExistenteDial.removeTodos();
            this.modeloFaseExistenteDial.fireTableDataChanged();
        }

    }//GEN-LAST:event_faseCurvaDialExistenteActionPerformed

    private void faseCurvaCorrenteCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseCurvaCorrenteCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faseCurvaCorrenteCadastroActionPerformed

    private void valoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valoresActionPerformed

    private void criaSequencia(String min, String max, String pass) {
        int minimo = Integer.parseInt(min);
        int maximo = Integer.parseInt(max);
        int passo = Integer.parseInt(pass);
        for (int i = minimo; i < maximo; i += passo) {
            System.out.println(i);
        }
    }

    private void habilitarPaineis() {
        boolean faseTemporizada = this.curvaInversaFase.isSelected();
        boolean faseInstantanea = this.curvaTempoFase.isSelected();
        boolean neutroTemporizada = this.curvaInversaNeutro.isSelected();
        boolean neutroInstantanea = this.curvaTempoNeutro.isSelected();

        this.tabbedPane.setEnabledAt(1, faseTemporizada);
        this.tabbedPane.setEnabledAt(2, faseInstantanea);
        this.tabbedPane.setEnabledAt(3, neutroTemporizada);
        this.tabbedPane.setEnabledAt(4, neutroInstantanea);
    }

    private void desabilitarPaineis() {
        int tabs = this.tabbedPane.getTabCount();
        for (int i = 1; i < tabs; i++) {
            this.tabbedPane.setEnabledAt(i, false);
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
            if (this.tabbedPane.isEnabledAt(selecionado)) {
                break;
            }
        }
    }

    private void retornarTela() {
        while (true && this.getSelected() > 0) {
            int selecionado = this.getSelected() - 1;

            this.tabbedPane.setSelectedIndex(selecionado);
            if (this.tabbedPane.isEnabledAt(selecionado)) {
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
        this.modeloNeutroPrimeiro = new PontoCurvaTableModel();
        this.modeloFaseExistenteDial = new PontoCurvaTableModel();
        this.modeloNeutroDial = new PontoCurvaTableModel();

        this.faseCurvaPrimeira.setModel(modeloFaseCriarDial);
        this.neutroCurvaPrimeira.setModel(modeloNeutroPrimeiro);
        this.jTable1.setModel(modeloFaseExistenteDial);
    }

    private void selectCheck() {
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
                a.add(Double.parseDouble(valor));
            }
        }
        return a;
    }

    private void addCorrentePickupFase(List<Double> valores) {
        for (Double d : valores) {
            this.faseCurvaCorrenteCadastro.addItem(d);
            this.faseCurvaCorrenteExistente.addItem(d);
        }
    }

    private void removeCorrentePickupFase() {
        this.faseCurvaCorrenteCadastro.removeAllItems();
        this.faseCurvaCorrenteExistente.removeAllItems();
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
    private javax.swing.JPanel Painel1;
    private javax.swing.JPanel Painel3;
    private javax.swing.JButton avancarDadosGerais;
    private javax.swing.JButton avancarFaseCorrente;
    private javax.swing.JButton avancarFaseCurva;
    private javax.swing.JButton avancarFaseCurva1;
    private javax.swing.JButton cancelarDadosGerais;
    private javax.swing.JButton cancelarFaseCorrente;
    private javax.swing.JButton cancelarFaseCurva;
    private javax.swing.JButton cancelarFaseCurva1;
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
    private javax.swing.JRadioButton digital;
    private javax.swing.JRadioButton eletromecanico;
    private javax.swing.JTextField fabricante;
    private javax.swing.JTextField faseCorrenteFator;
    private javax.swing.JPanel faseCorrenteFirst;
    private javax.swing.JTextField faseCorrenteMaximo;
    private javax.swing.JTextField faseCorrenteMinimo;
    private javax.swing.JTextField faseCorrentePasso;
    private javax.swing.JPanel faseCorrenteSecond;
    private javax.swing.JTextField faseCorrenteValores;
    private javax.swing.JButton faseCurvaAdicionaCaracteristicas;
    private javax.swing.JButton faseCurvaAdicionaPrimeira;
    private javax.swing.JButton faseCurvaAdicionaPrimeira1;
    private javax.swing.JTable faseCurvaCaracteristicas;
    private javax.swing.JComboBox faseCurvaCorrente1;
    private javax.swing.JComboBox faseCurvaCorrenteCadastro;
    private javax.swing.JComboBox faseCurvaCorrenteExistente;
    private javax.swing.JTextField faseCurvaDial;
    private javax.swing.JTextField faseCurvaDial1;
    private javax.swing.JComboBox faseCurvaDialExistente;
    private javax.swing.JPanel faseCurvaFirst;
    private javax.swing.JButton faseCurvaGrafico;
    private javax.swing.JButton faseCurvaGrafico1;
    private javax.swing.JTextField faseCurvaMaximo;
    private javax.swing.JTextField faseCurvaMaximo1;
    private javax.swing.JTextField faseCurvaMinimo;
    private javax.swing.JTextField faseCurvaMinimo1;
    private javax.swing.JTextField faseCurvaPasso;
    private javax.swing.JTextField faseCurvaPasso1;
    private javax.swing.JTable faseCurvaPrimeira;
    private javax.swing.JButton faseCurvaRemoveCaracteristicas;
    private javax.swing.JButton faseCurvaRemovePrimeira;
    private javax.swing.JButton faseCurvaRemovePrimeira1;
    private javax.swing.JPanel faseCurvaSecond;
    private javax.swing.JPanel faseInstantaneaFirst;
    private javax.swing.JPanel faseInstantaneaSecond;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField modelo;
    private javax.swing.JPanel neutroCorrenteFirst;
    private javax.swing.JPanel neutroCorrenteSecond;
    private javax.swing.JButton neutroCurvaAdicionaCaracteristicas;
    private javax.swing.JTable neutroCurvaCaracteristicas;
    private javax.swing.JPanel neutroCurvaFirst;
    private javax.swing.JTable neutroCurvaPrimeira;
    private javax.swing.JButton neutroCurvaRemoveCaracteristicas;
    private javax.swing.JPanel neutroCurvaSecond;
    private javax.swing.JPanel neutroInstantaneaFirst;
    private javax.swing.JPanel neutroInstantaneaSecond;
    private javax.swing.JButton retornarFaseCorrente;
    private javax.swing.JButton retornarFaseCurva;
    private javax.swing.JButton retornarFaseCurva1;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTabbedPane temporizadaFase;
    private javax.swing.ButtonGroup tipoDeEquipamento;
    private javax.swing.JTextField valores;
    // End of variables declaration//GEN-END:variables
}
