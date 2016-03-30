package SIGPROD2.GUI;

import SIGPROD2.Auxiliar.Perguntas;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI_Reles extends javax.swing.JFrame {

    private boolean[] abas;

    public GUI_Reles() {
        this.abas = new boolean[]{true, true, true, true, true, true, true};

        this.initComponents();
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
        unidadeTemporizadaFase = new javax.swing.JCheckBox();
        unidadeTemporizadaNeutro = new javax.swing.JCheckBox();
        unidadeInstantaneaFase = new javax.swing.JCheckBox();
        unidadeInstantaneaNeutro = new javax.swing.JCheckBox();
        avancarDadosGerais = new javax.swing.JButton();
        cancelarDadosGerais = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        eletromecanico = new javax.swing.JRadioButton();
        digital = new javax.swing.JRadioButton();
        temporizadaFase = new javax.swing.JTabbedPane();
        correntePickup = new javax.swing.JPanel();
        cardLayout1 = new javax.swing.JPanel();
        faseCorrenteFirst = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        faseCorrenteSecond = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cardLayout2 = new javax.swing.JPanel();
        faseCurvaFirst = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        faseCurvaCorrente = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        faseCurvaDial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        faseCurvaPrimeira = new javax.swing.JTable();
        faseCurvaAdicionaPrimeira = new javax.swing.JButton();
        faseCurvaRemovePrimeira = new javax.swing.JButton();
        faseCurvaGrafico = new javax.swing.JButton();
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
        faseInstantaneaSecond = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        faseInstantaneaFirst = new javax.swing.JPanel();
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
        cardLayout5 = new javax.swing.JPanel();
        neutroCorrenteSecond = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        neutroCorrenteFirst = new javax.swing.JPanel();
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
        cardLayout6 = new javax.swing.JPanel();
        neutroCurvaFirst = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        faseCurvaCorrente1 = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        faseCurvaDial1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        faseCurvaPrimeira1 = new javax.swing.JTable();
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
        faseCurvaCaracteristicas1 = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        faseCurvaAdicionaCaracteristicas1 = new javax.swing.JButton();
        faseCurvaRemoveCaracteristicas1 = new javax.swing.JButton();
        avancarFaseCurva1 = new javax.swing.JButton();
        cancelarFaseCurva1 = new javax.swing.JButton();
        retornarFaseCurva1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        correntePickup2 = new javax.swing.JPanel();
        cardLayout4 = new javax.swing.JPanel();
        neutroInstantaneaSecond = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        neutroInstantaneaFirst = new javax.swing.JPanel();
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

        jLabel3.setText("Unidade temporizada :");

        jLabel4.setText("Unidade Instantânea :");

        unidadeTemporizadaFase.setText("Fase");

        unidadeTemporizadaNeutro.setText("Neutro");

        unidadeInstantaneaFase.setText("Fase");

        unidadeInstantaneaNeutro.setText("Neutro");

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
                .addContainerGap()
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
                                        .addComponent(unidadeTemporizadaFase)
                                        .addGap(6, 6, 6)
                                        .addComponent(unidadeTemporizadaNeutro))
                                    .addGroup(Painel1Layout.createSequentialGroup()
                                        .addComponent(unidadeInstantaneaFase)
                                        .addGap(6, 6, 6)
                                        .addComponent(unidadeInstantaneaNeutro)))))
                        .addGap(0, 544, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(unidadeTemporizadaFase)
                    .addComponent(unidadeTemporizadaNeutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(unidadeInstantaneaFase)
                    .addComponent(unidadeInstantaneaNeutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarDadosGerais)
                    .addComponent(cancelarDadosGerais))
                .addContainerGap())
        );

        tabbedPane.addTab("Dados gerais", Painel1);

        temporizadaFase.setPreferredSize(new java.awt.Dimension(880, 553));

        cardLayout1.setLayout(new java.awt.CardLayout());

        jLabel5.setText("Mínimo (A) :");

        jLabel9.setText("Máximo (A) :");

        jLabel10.setText("Passo (A) :");

        javax.swing.GroupLayout faseCorrenteFirstLayout = new javax.swing.GroupLayout(faseCorrenteFirst);
        faseCorrenteFirst.setLayout(faseCorrenteFirstLayout);
        faseCorrenteFirstLayout.setHorizontalGroup(
            faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCorrenteFirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addGroup(faseCorrenteFirstLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel10)))
                .addGap(3, 3, 3)
                .addGroup(faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        faseCorrenteFirstLayout.setVerticalGroup(
            faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCorrenteFirstLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(faseCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        cardLayout1.add(faseCorrenteFirst, "faseCorrenteFirst");

        jLabel11.setText("Valores separados por vírgula :");

        javax.swing.GroupLayout faseCorrenteSecondLayout = new javax.swing.GroupLayout(faseCorrenteSecond);
        faseCorrenteSecond.setLayout(faseCorrenteSecondLayout);
        faseCorrenteSecondLayout.setHorizontalGroup(
            faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCorrenteSecondLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        faseCorrenteSecondLayout.setVerticalGroup(
            faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCorrenteSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(faseCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );

        cardLayout1.add(faseCorrenteSecond, "faseCorrenteSecond");

        jButton1.setText("Avançar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Retornar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel43.setText("Fator de início da curva :");

        javax.swing.GroupLayout correntePickupLayout = new javax.swing.GroupLayout(correntePickup);
        correntePickup.setLayout(correntePickupLayout);
        correntePickupLayout.setHorizontalGroup(
            correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(correntePickupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardLayout1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(correntePickupLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 213, Short.MAX_VALUE))
        );
        correntePickupLayout.setVerticalGroup(
            correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickupLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(correntePickupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        temporizadaFase.addTab("Corrente de pickup", correntePickup);

        jPanel5.setPreferredSize(new java.awt.Dimension(875, 526));

        cardLayout2.setLayout(new java.awt.CardLayout());

        faseCurvaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jLabel7.setText("Corrente de pickup :");

        jLabel8.setText("Dial de tempo :");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(251, 250));

        faseCurvaPrimeira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(faseCurvaPrimeira);

        faseCurvaAdicionaPrimeira.setText("+");
        faseCurvaAdicionaPrimeira.setPreferredSize(new java.awt.Dimension(44, 26));

        faseCurvaRemovePrimeira.setText("-");
        faseCurvaRemovePrimeira.setPreferredSize(new java.awt.Dimension(44, 26));

        faseCurvaGrafico.setText("Gráfico");
        faseCurvaGrafico.setPreferredSize(new java.awt.Dimension(84, 26));

        javax.swing.GroupLayout faseCurvaFirstLayout = new javax.swing.GroupLayout(faseCurvaFirst);
        faseCurvaFirst.setLayout(faseCurvaFirstLayout);
        faseCurvaFirstLayout.setHorizontalGroup(
            faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(faseCurvaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(faseCurvaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, faseCurvaFirstLayout.createSequentialGroup()
                                    .addComponent(faseCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(faseCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(faseCurvaGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        faseCurvaFirstLayout.setVerticalGroup(
            faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaFirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(faseCurvaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(faseCurvaDial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faseCurvaAdicionaPrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRemovePrimeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        cardLayout2.add(faseCurvaFirst, "faseCurvaFirst");

        jLabel13.setText("Multiplicador de tempo :");

        jLabel14.setText("Mínimo (A) :");
        jLabel14.setPreferredSize(new java.awt.Dimension(85, 15));

        jLabel15.setText("Máximo (A) :");

        jLabel16.setText("Passo (A) :");
        jLabel16.setPreferredSize(new java.awt.Dimension(85, 15));

        faseCurvaCaracteristicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(faseCurvaCaracteristicas);

        jLabel17.setText("Características da curva :");

        faseCurvaAdicionaCaracteristicas.setText("+");
        faseCurvaAdicionaCaracteristicas.setPreferredSize(new java.awt.Dimension(44, 26));

        faseCurvaRemoveCaracteristicas.setText("-");
        faseCurvaRemoveCaracteristicas.setPreferredSize(new java.awt.Dimension(44, 26));

        javax.swing.GroupLayout faseCurvaSecondLayout = new javax.swing.GroupLayout(faseCurvaSecond);
        faseCurvaSecond.setLayout(faseCurvaSecondLayout);
        faseCurvaSecondLayout.setHorizontalGroup(
            faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaSecondLayout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(491, Short.MAX_VALUE))
        );
        faseCurvaSecondLayout.setVerticalGroup(
            faseCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseCurvaSecondLayout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(75, Short.MAX_VALUE))
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

        tabbedPane.addTab("Temporizada de fase", temporizadaFase);

        cardLayout3.setLayout(new java.awt.CardLayout());

        jLabel44.setText("Valores separados por vírgula :");

        javax.swing.GroupLayout faseInstantaneaSecondLayout = new javax.swing.GroupLayout(faseInstantaneaSecond);
        faseInstantaneaSecond.setLayout(faseInstantaneaSecondLayout);
        faseInstantaneaSecondLayout.setHorizontalGroup(
            faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel44)
                .addGap(6, 6, 6)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        faseInstantaneaSecondLayout.setVerticalGroup(
            faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(faseInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );

        cardLayout3.add(faseInstantaneaSecond, "faseInstantaneaSecond");

        jLabel6.setText("Mínimo (A) :");

        jLabel12.setText("Máximo (A) :");

        jLabel42.setText("Passo (A) :");

        javax.swing.GroupLayout faseInstantaneaFirstLayout = new javax.swing.GroupLayout(faseInstantaneaFirst);
        faseInstantaneaFirst.setLayout(faseInstantaneaFirstLayout);
        faseInstantaneaFirstLayout.setHorizontalGroup(
            faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel42)))
                .addGap(3, 3, 3)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        faseInstantaneaFirstLayout.setVerticalGroup(
            faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faseInstantaneaFirstLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addGroup(faseInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        cardLayout3.add(faseInstantaneaFirst, "faseInstantaneaFirst");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(correntePickup1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardLayout3, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(correntePickup1Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 218, Short.MAX_VALUE))
        );
        correntePickup1Layout.setVerticalGroup(
            correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout3, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton6)))
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

        tabbedPane.addTab("Instantânea de fase", Painel3);

        cardLayout5.setLayout(new java.awt.CardLayout());

        jLabel36.setText("Valores separados por vírgula :");

        javax.swing.GroupLayout neutroCorrenteSecondLayout = new javax.swing.GroupLayout(neutroCorrenteSecond);
        neutroCorrenteSecond.setLayout(neutroCorrenteSecondLayout);
        neutroCorrenteSecondLayout.setHorizontalGroup(
            neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteSecondLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel36)
                .addGap(6, 6, 6)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        neutroCorrenteSecondLayout.setVerticalGroup(
            neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(neutroCorrenteSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );

        cardLayout5.add(neutroCorrenteSecond, "neutroCorrenteSecond");

        jLabel20.setText("Mínimo (A) :");

        jLabel21.setText("Máximo (A) :");

        jLabel22.setText("Passo (A) :");

        javax.swing.GroupLayout neutroCorrenteFirstLayout = new javax.swing.GroupLayout(neutroCorrenteFirst);
        neutroCorrenteFirst.setLayout(neutroCorrenteFirstLayout);
        neutroCorrenteFirstLayout.setHorizontalGroup(
            neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteFirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addGroup(neutroCorrenteFirstLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel22)))
                .addGap(3, 3, 3)
                .addGroup(neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        neutroCorrenteFirstLayout.setVerticalGroup(
            neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCorrenteFirstLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(6, 6, 6)
                .addGroup(neutroCorrenteFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        cardLayout5.add(neutroCorrenteFirst, "neutroCorrenteFirst");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correntePickup3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(correntePickup3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardLayout5, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(correntePickup3Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 213, Short.MAX_VALUE))
        );
        correntePickup3Layout.setVerticalGroup(
            correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup3Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout5, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(correntePickup3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(correntePickup3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(correntePickup3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel6.setPreferredSize(new java.awt.Dimension(875, 526));

        cardLayout6.setLayout(new java.awt.CardLayout());

        neutroCurvaFirst.setPreferredSize(new java.awt.Dimension(423, 433));

        jLabel37.setText("Corrente de pickup :");

        jLabel38.setText("Dial de tempo :");

        jScrollPane5.setPreferredSize(new java.awt.Dimension(251, 250));

        faseCurvaPrimeira1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(faseCurvaPrimeira1);

        faseCurvaAdicionaPrimeira1.setText("+");
        faseCurvaAdicionaPrimeira1.setPreferredSize(new java.awt.Dimension(44, 26));

        faseCurvaRemovePrimeira1.setText("-");
        faseCurvaRemovePrimeira1.setPreferredSize(new java.awt.Dimension(44, 26));

        faseCurvaGrafico1.setText("Gráfico");
        faseCurvaGrafico1.setPreferredSize(new java.awt.Dimension(84, 26));

        javax.swing.GroupLayout neutroCurvaFirstLayout = new javax.swing.GroupLayout(neutroCurvaFirst);
        neutroCurvaFirst.setLayout(neutroCurvaFirstLayout);
        neutroCurvaFirstLayout.setHorizontalGroup(
            neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                .addGroup(neutroCurvaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(neutroCurvaFirstLayout.createSequentialGroup()
                        .addContainerGap()
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
                .addContainerGap()
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

        cardLayout6.add(neutroCurvaFirst, "neutroCurvaFirst");

        jLabel39.setText("Multiplicador de tempo :");

        jLabel40.setText("Mínimo (A) :");
        jLabel40.setPreferredSize(new java.awt.Dimension(85, 15));

        jLabel50.setText("Máximo (A) :");

        jLabel51.setText("Passo (A) :");
        jLabel51.setPreferredSize(new java.awt.Dimension(85, 15));

        faseCurvaCaracteristicas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(faseCurvaCaracteristicas1);

        jLabel52.setText("Características da curva :");

        faseCurvaAdicionaCaracteristicas1.setText("+");
        faseCurvaAdicionaCaracteristicas1.setPreferredSize(new java.awt.Dimension(44, 26));

        faseCurvaRemoveCaracteristicas1.setText("-");
        faseCurvaRemoveCaracteristicas1.setPreferredSize(new java.awt.Dimension(44, 26));

        javax.swing.GroupLayout neutroCurvaSecondLayout = new javax.swing.GroupLayout(neutroCurvaSecond);
        neutroCurvaSecond.setLayout(neutroCurvaSecondLayout);
        neutroCurvaSecondLayout.setHorizontalGroup(
            neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaSecondLayout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(faseCurvaAdicionaCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(faseCurvaRemoveCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        neutroCurvaSecondLayout.setVerticalGroup(
            neutroCurvaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroCurvaSecondLayout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(faseCurvaAdicionaCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faseCurvaRemoveCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        cardLayout6.add(neutroCurvaSecond, "neutroCurvaSecond");

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
                .addContainerGap())
            .addComponent(cardLayout6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(cardLayout6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarFaseCurva1)
                    .addComponent(cancelarFaseCurva1)
                    .addComponent(retornarFaseCurva1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        tabbedPane.addTab("tab5", jTabbedPane1);

        cardLayout4.setLayout(new java.awt.CardLayout());

        jLabel46.setText("Valores separados por vírgula :");

        javax.swing.GroupLayout neutroInstantaneaSecondLayout = new javax.swing.GroupLayout(neutroInstantaneaSecond);
        neutroInstantaneaSecond.setLayout(neutroInstantaneaSecondLayout);
        neutroInstantaneaSecondLayout.setHorizontalGroup(
            neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel46)
                .addGap(6, 6, 6)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        neutroInstantaneaSecondLayout.setVerticalGroup(
            neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaSecondLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(neutroInstantaneaSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );

        cardLayout4.add(neutroInstantaneaSecond, "neutroInstantaneaSecond");

        jLabel18.setText("Mínimo (A) :");

        jLabel19.setText("Máximo (A) :");

        jLabel47.setText("Passo (A) :");

        javax.swing.GroupLayout neutroInstantaneaFirstLayout = new javax.swing.GroupLayout(neutroInstantaneaFirst);
        neutroInstantaneaFirst.setLayout(neutroInstantaneaFirstLayout);
        neutroInstantaneaFirstLayout.setHorizontalGroup(
            neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel47)))
                .addGap(3, 3, 3)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        neutroInstantaneaFirstLayout.setVerticalGroup(
            neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neutroInstantaneaFirstLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(6, 6, 6)
                .addGroup(neutroInstantaneaFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        cardLayout4.add(neutroInstantaneaFirst, "neutroInstantaneaFirst");

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
                .addContainerGap()
                .addGroup(correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardLayout4, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(correntePickup2Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 218, Short.MAX_VALUE))
        );
        correntePickup2Layout.setVerticalGroup(
            correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correntePickup2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(correntePickup2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardLayout4, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
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

        tabbedPane.addTab("Instantânea de neutro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarDadosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarDadosGeraisActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarDadosGeraisActionPerformed

    private void avancarDadosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarDadosGeraisActionPerformed
        this.enablePanels();
        this.avancarTela();
    }//GEN-LAST:event_avancarDadosGeraisActionPerformed

    private void retornarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarFaseCurvaActionPerformed
        int selecionado = this.temporizadaFase.getSelectedIndex();

        this.temporizadaFase.setSelectedIndex(selecionado - 1);
    }//GEN-LAST:event_retornarFaseCurvaActionPerformed

    private void cancelarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFaseCurvaActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_cancelarFaseCurvaActionPerformed

    private void avancarFaseCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarFaseCurvaActionPerformed
        this.avancarTela();
    }//GEN-LAST:event_avancarFaseCurvaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selecionado = this.temporizadaFase.getSelectedIndex();

        this.temporizadaFase.setSelectedIndex(selecionado + 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int selecionado = this.jTabbedPane1.getSelectedIndex();

        this.jTabbedPane1.setSelectedIndex(selecionado + 1);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.retornarTela();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.cancelOption();
    }//GEN-LAST:event_jButton12ActionPerformed

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

    private void enablePanels() {
        boolean faseTemporizada = this.unidadeTemporizadaFase.isSelected();
        boolean faseInstantanea = this.unidadeInstantaneaFase.isSelected();
        boolean neutroTemporizada = this.unidadeTemporizadaNeutro.isSelected();
        boolean neutroInstantanea = this.unidadeInstantaneaNeutro.isSelected();

        CardLayout card1 = (CardLayout) this.cardLayout1.getLayout();
        CardLayout card2 = (CardLayout) this.cardLayout2.getLayout();
        CardLayout card3 = (CardLayout) this.cardLayout3.getLayout();
        CardLayout card4 = (CardLayout) this.cardLayout4.getLayout();
        CardLayout card5 = (CardLayout) this.cardLayout5.getLayout();
        CardLayout card6 = (CardLayout) this.cardLayout6.getLayout();

        if (this.digital.isSelected()) {
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

        this.tabbedPane.setEnabledAt(1, faseTemporizada);
        this.tabbedPane.setEnabledAt(2, faseInstantanea);
        this.tabbedPane.setEnabledAt(3, neutroTemporizada);
        this.tabbedPane.setEnabledAt(4, neutroInstantanea);
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

    private void enableComponents(JPanel painel) {
        for (Component comp : painel.getComponents()) {
            comp.setEnabled(true);
        }
    }

    private void disableComponents(JPanel painel) {
        for (Component comp : painel.getComponents()) {
            comp.setEnabled(false);
        }
    }

    /*private void selectCheck(int aba) {
     if (this.abas[aba]) {
     switch (aba) {
     case 0:
     this.unidadeInstantaneaFase.setSelected(true);
     this.unidadeInstantaneaNeutro.setSelected(true);
     this.unidadeTemporizadaFase.setSelected(true);
     this.unidadeTemporizadaNeutro.setSelected(true);
     break;
     case 1:
     this.faseCorrentePassoConstante.setSelected(true);
     this.faseCorrentePassoConstanteActionPerformed(null);
     break;
     case 2:
     this.faseCurvaFormasActionPerformed(null);
     break;
     case 3:
     this.faseInstantaneaPassoConstante.setSelected(true);
     this.faseInstantaneaPassoConstanteActionPerformed(null);
     break;
     case 4:
     this.neutroCorrentePassoConstante.setSelected(true);
     this.neutroCorrentePassoConstanteActionPerformed(null);
     break;
     case 5:
     this.neutroCurvaFormasActionPerformed(null);
     break;
     case 6:
     this.neutroInstantaneaPassoConstante.setSelected(true);
     this.neutroInstantaneaPassoConstanteActionPerformed(null);
     break;
     }
     this.abas[aba] = false;
     }
     }

     private int getVetorPosicao() {
     int pos = this.getSelected();

     switch (pos) {
     case 0:
     return pos;
     case 1:
     return getSelected() + (this.temporizadaFase.getSelectedIndex() + 1);
     case 2:
     return 4;
     case 3:
     return this.getSelected() + (this.temporizadaNeutro.getSelectedIndex() + 3);
     case 4:
     return 7;
     default :
     return -1;

     }
     }*/
    private int getSelected() {
        return this.tabbedPane.getSelectedIndex();
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
            java.util.logging.Logger.getLogger(GUI_Reles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Reles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Reles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Reles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton avancarFaseCurva;
    private javax.swing.JButton avancarFaseCurva1;
    private javax.swing.JButton cancelarDadosGerais;
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
    private javax.swing.JRadioButton digital;
    private javax.swing.JRadioButton eletromecanico;
    private javax.swing.JTextField fabricante;
    private javax.swing.JPanel faseCorrenteFirst;
    private javax.swing.JPanel faseCorrenteSecond;
    private javax.swing.JButton faseCurvaAdicionaCaracteristicas;
    private javax.swing.JButton faseCurvaAdicionaCaracteristicas1;
    private javax.swing.JButton faseCurvaAdicionaPrimeira;
    private javax.swing.JButton faseCurvaAdicionaPrimeira1;
    private javax.swing.JTable faseCurvaCaracteristicas;
    private javax.swing.JTable faseCurvaCaracteristicas1;
    private javax.swing.JComboBox faseCurvaCorrente;
    private javax.swing.JComboBox faseCurvaCorrente1;
    private javax.swing.JTextField faseCurvaDial;
    private javax.swing.JTextField faseCurvaDial1;
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
    private javax.swing.JTable faseCurvaPrimeira1;
    private javax.swing.JButton faseCurvaRemoveCaracteristicas;
    private javax.swing.JButton faseCurvaRemoveCaracteristicas1;
    private javax.swing.JButton faseCurvaRemovePrimeira;
    private javax.swing.JButton faseCurvaRemovePrimeira1;
    private javax.swing.JPanel faseCurvaSecond;
    private javax.swing.JPanel faseInstantaneaFirst;
    private javax.swing.JPanel faseInstantaneaSecond;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField modelo;
    private javax.swing.JPanel neutroCorrenteFirst;
    private javax.swing.JPanel neutroCorrenteSecond;
    private javax.swing.JPanel neutroCurvaFirst;
    private javax.swing.JPanel neutroCurvaSecond;
    private javax.swing.JPanel neutroInstantaneaFirst;
    private javax.swing.JPanel neutroInstantaneaSecond;
    private javax.swing.JButton retornarFaseCurva;
    private javax.swing.JButton retornarFaseCurva1;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTabbedPane temporizadaFase;
    private javax.swing.ButtonGroup tipoDeEquipamento;
    private javax.swing.JCheckBox unidadeInstantaneaFase;
    private javax.swing.JCheckBox unidadeInstantaneaNeutro;
    private javax.swing.JCheckBox unidadeTemporizadaFase;
    private javax.swing.JCheckBox unidadeTemporizadaNeutro;
    // End of variables declaration//GEN-END:variables
}
