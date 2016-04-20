/*
 * Classe responsável por gerenciar a Janela de Elo de Transformadores.
 */
package SIGPROD2.GUI;

import SIGPROD2.Auxiliar.Entrada;
import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Auxiliar.MyRenderer;
import SIGPROD2.DAO.EloTransformadorDao;
import SIGPROD2.Modelo.Posicao;
import SIGPROD2.Modelo.Tabelas.TransformadorTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Sérgio Brunetta Júnior
 * @version 15/03/2K16
 *
 */
public class GUI_Elo_de_Transformador extends javax.swing.JFrame {

    private TransformadorTableModel modelTrifasico;
    private TransformadorTableModel modelMonofasico;

    public GUI_Elo_de_Transformador() {
        initComponents();
        this.configuraTabelaMonofasico();
        this.configuraTabelaTrifasico();
        this.carregarTabelas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaMonofasico = new javax.swing.JTable();
        addColunaMonofasico = new javax.swing.JButton();
        removeColunaMonofasico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addLinhaMonofasico = new javax.swing.JButton();
        removeLinhaMonofasico = new javax.swing.JButton();
        apagarDadosMonofasico = new javax.swing.JButton();
        atualizaMonofasico = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTrifasico = new javax.swing.JTable();
        addColunaTrifasico = new javax.swing.JButton();
        removeColunaTrifasico = new javax.swing.JButton();
        addLinhaTrifasico = new javax.swing.JButton();
        removeLinhaTrifasico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        apagarDadosTrifasico = new javax.swing.JButton();
        atualizaTrifasico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(713, 523));
        setPreferredSize(new java.awt.Dimension(713, 523));
        setResizable(false);

        tabelaMonofasico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaMonofasico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMonofasicoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaMonofasico);

        addColunaMonofasico.setText("+");
        addColunaMonofasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addColunaMonofasicoActionPerformed(evt);
            }
        });

        removeColunaMonofasico.setText("-");
        removeColunaMonofasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeColunaMonofasicoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Coluna");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Linha");

        addLinhaMonofasico.setText("+");
        addLinhaMonofasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLinhaMonofasicoActionPerformed(evt);
            }
        });

        removeLinhaMonofasico.setText("-");
        removeLinhaMonofasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLinhaMonofasicoActionPerformed(evt);
            }
        });

        apagarDadosMonofasico.setText("Limpar");
        apagarDadosMonofasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarDadosMonofasicoActionPerformed(evt);
            }
        });

        atualizaMonofasico.setText("Atualizar");
        atualizaMonofasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaMonofasicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addLinhaMonofasico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeLinhaMonofasico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addColunaMonofasico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeColunaMonofasico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(atualizaMonofasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apagarDadosMonofasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addColunaMonofasico)
                            .addComponent(removeColunaMonofasico))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addLinhaMonofasico)
                            .addComponent(removeLinhaMonofasico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atualizaMonofasico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apagarDadosMonofasico))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Monofásico", jPanel1);

        tabelaTrifasico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaTrifasico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaTrifasicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaTrifasico);

        addColunaTrifasico.setText("+");
        addColunaTrifasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addColunaTrifasicoActionPerformed(evt);
            }
        });

        removeColunaTrifasico.setText("-");
        removeColunaTrifasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeColunaTrifasicoActionPerformed(evt);
            }
        });

        addLinhaTrifasico.setText("+");
        addLinhaTrifasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLinhaTrifasicoActionPerformed(evt);
            }
        });

        removeLinhaTrifasico.setText("-");
        removeLinhaTrifasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLinhaTrifasicoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Coluna");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Linha");

        apagarDadosTrifasico.setText("Limpar");
        apagarDadosTrifasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarDadosTrifasicoActionPerformed(evt);
            }
        });

        atualizaTrifasico.setText("Atualizar");
        atualizaTrifasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaTrifasicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addColunaTrifasico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeColunaTrifasico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(addLinhaTrifasico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeLinhaTrifasico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(atualizaTrifasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apagarDadosTrifasico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeColunaTrifasico)
                            .addComponent(addColunaTrifasico))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeLinhaTrifasico)
                            .addComponent(addLinhaTrifasico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atualizaTrifasico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apagarDadosTrifasico)))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Trifásico", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Configura tabela Trifasico
     */
    private void configuraTabelaTrifasico() {
        this.modelTrifasico = new TransformadorTableModel();
        this.tabelaTrifasico.setModel(this.modelTrifasico);
        this.tabelaTrifasico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaTrifasico.setDefaultRenderer(Object.class, new MyRenderer());
        this.modelTrifasico.addColumn(" ");
        this.modelTrifasico.fireTableStructureChanged();
    }
    /*
     * Configura tabela Trifasico
     */

    private void configuraTabelaMonofasico() {
        this.modelMonofasico = new TransformadorTableModel();
        this.tabelaMonofasico.setModel(this.modelMonofasico);
        this.tabelaMonofasico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaMonofasico.setDefaultRenderer(Object.class, new MyRenderer());
        this.modelMonofasico.addColumn(" ");
        this.modelMonofasico.fireTableStructureChanged();
    }

    private void carregarTabelas() {
        this.carregaTabelaMonofasica();
        this.carregaTabelaTrifasica();
    }

    private void carregaTabelaMonofasica() {
        try {
            ArrayList<String> listaColunas = EloTransformadorDao.buscarKv(EloTransformadorDao.MONOFASICO);
            Posicao[][] dados = EloTransformadorDao.buscarElos(listaColunas.size(), EloTransformadorDao.MONOFASICO);
            ArrayList<Posicao> listaTemp = new ArrayList<>();
            Posicao[] linha;

            for (String coluna : listaColunas) {
                if (!coluna.equals(" ")) {
                    this.modelMonofasico.addColumn(coluna);
                }
            }
            this.modelMonofasico.fireTableStructureChanged();
            for (int i = 0; i < dados.length; i++) {
                linha = dados[i];
                for (int j = 0; j < linha.length; j++) {
                    listaTemp.add(linha[j]);
                }
                this.modelMonofasico.add(listaTemp);
                listaTemp = new ArrayList<>();
            }
            this.modelMonofasico.fireTableDataChanged();
        } catch (SQLException ex) {
            Erro.mostraMensagemSQL(this);
        }
    }

    private void carregaTabelaTrifasica() {
        try {
            ArrayList<String> listaColunas = EloTransformadorDao.buscarKv(EloTransformadorDao.TRIFASICO);
            Posicao[][] dados = EloTransformadorDao.buscarElos(listaColunas.size(), EloTransformadorDao.TRIFASICO);
            ArrayList<Posicao> listaTemp = new ArrayList<>();
            Posicao[] linha;

            for (String coluna : listaColunas) {
                if (!coluna.equals(" ")) {
                    this.modelTrifasico.addColumn(coluna);
                }
            }
            this.modelTrifasico.fireTableStructureChanged();
            for (int i = 0; i < dados.length; i++) {
                linha = dados[i];
                for (int j = 0; j < linha.length; j++) {
                    listaTemp.add(linha[j]);
                }
                this.modelTrifasico.add(listaTemp);
                listaTemp = new ArrayList<>();
            }
            this.modelTrifasico.fireTableDataChanged();
        } catch (SQLException ex) {
            Erro.mostraMensagemSQL(this);
        }
    }

    /*
     * Remove linha na tabela monofasico.
     */
    private void removeLinhaMonofasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLinhaMonofasicoActionPerformed
        int pos = this.tabelaMonofasico.getSelectedRow();

        if (pos != -1) {
            this.modelMonofasico.remove(pos);
        }
    }//GEN-LAST:event_removeLinhaMonofasicoActionPerformed

    /*
     * Adiciona coluna na tabela monofasico.
     */
    private void removeColunaMonofasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeColunaMonofasicoActionPerformed
        int pos = this.tabelaMonofasico.getSelectedColumn();

        if (pos >= 1) {
            this.modelMonofasico.removeColumn(pos);
            this.modelMonofasico.fireTableStructureChanged();
        }
    }//GEN-LAST:event_removeColunaMonofasicoActionPerformed

    /*
     * Adiciona linha na tabela monofasico.
     */
    private void addLinhaMonofasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLinhaMonofasicoActionPerformed
        ArrayList<Posicao> pos = new ArrayList<>();
        String rowValue = Entrada.valorLinha(this);
        if (this.isNumber(rowValue)) {
            pos.add(new Posicao(Integer.parseInt(rowValue)));
            for (int i = 1; i < this.modelMonofasico.getColumnCount(); i++) {
                pos.add(new Posicao());
            }
            this.modelMonofasico.add(pos);
            this.modelMonofasico.fireTableDataChanged();
        }
    }//GEN-LAST:event_addLinhaMonofasicoActionPerformed

    /*
     * Adiciona coluna na tabela monofasico.
     */
    private void addColunaMonofasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addColunaMonofasicoActionPerformed
        String nomeColumn = Entrada.valorColuna(this);

        if (nomeColumn != null) {
            if (this.isNumber(nomeColumn)) {
                this.modelMonofasico.addColumn(nomeColumn + " kV ");
                this.modelMonofasico.fireTableStructureChanged();
            }
        }
    }//GEN-LAST:event_addColunaMonofasicoActionPerformed

    private void tabelaMonofasicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMonofasicoMouseClicked
        if (evt.getClickCount() == 2) {
            int row = this.tabelaMonofasico.getSelectedRow();
            int col = this.tabelaMonofasico.getSelectedColumn();

            if (col != 0) {
                String oldValue = (String) this.modelMonofasico.getValueAt(row, col);
                String newValue = Entrada.alteraValorPosicao(this, oldValue);

                if (newValue != null) {
                    if (newValue.contains(":") && !newValue.equals(":")) {
                        String[] tt = newValue.split(":");

                        if (tt.length == 2) {
                            String sub_init = tt[0].trim();
                            String sub_end = tt[1].trim();

                            if (this.isNumber(sub_init)) {
                                if ((sub_end.length() == 1) && (this.isLetter(sub_end.charAt(0)))) {
                                    Posicao pos = new Posicao(Integer.parseInt(sub_init), sub_end.toUpperCase());
                                    this.modelMonofasico.setValueAt(pos, row, col);
                                    this.modelMonofasico.fireTableDataChanged();
                                } else {
                                    Erro.entradaInvalida(this);
                                }
                            } else {
                                Erro.entradaInvalida(this);
                            }
                        } else {
                            Erro.entradaInvalida(this);
                        }
                    } else {
                        Erro.entradaInvalida(this);
                    }
                }
            }
        }
    }//GEN-LAST:event_tabelaMonofasicoMouseClicked

    /*
     * Adiciona coluna na tabela trifasico.
     */
    private void addColunaTrifasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addColunaTrifasicoActionPerformed
        String nomeColumn = Entrada.valorColuna(this);

        if (nomeColumn != null) {
            if (this.isNumber(nomeColumn)) {
                this.modelTrifasico.addColumn(nomeColumn + " kV ");
                this.modelTrifasico.fireTableStructureChanged();
            }
        }
    }//GEN-LAST:event_addColunaTrifasicoActionPerformed

    /*
     * Remove coluna na tabela trifasico.
     */
    private void removeColunaTrifasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeColunaTrifasicoActionPerformed
        int pos = this.tabelaTrifasico.getSelectedColumn();

        if (pos >= 1) {
            this.modelTrifasico.removeColumn(pos);
            this.modelTrifasico.fireTableStructureChanged();
        }
    }//GEN-LAST:event_removeColunaTrifasicoActionPerformed

    /*
     * Adiciona linha na tabela trifasico.
     */
    private void addLinhaTrifasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLinhaTrifasicoActionPerformed
        ArrayList<Posicao> pos = new ArrayList<>();
        String rowValue = Entrada.valorLinha(this);

        if (this.isNumber(rowValue)) {
            pos.add(new Posicao(Integer.parseInt(rowValue)));
            for (int i = 1; i < this.modelTrifasico.getColumnCount(); i++) {
                pos.add(new Posicao());
            }
            this.modelTrifasico.add(pos);
            this.modelTrifasico.fireTableDataChanged();
        }
    }//GEN-LAST:event_addLinhaTrifasicoActionPerformed

    /*
     * Remove linha na tabela trifasico.
     */
    private void removeLinhaTrifasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLinhaTrifasicoActionPerformed
        int pos = this.tabelaTrifasico.getSelectedRow();

        if (pos != -1) {
            this.modelTrifasico.remove(pos);
        }
    }//GEN-LAST:event_removeLinhaTrifasicoActionPerformed

    /*
     * Limpa os dados do TableModel da tabela trifasico.
     */
    private void apagarDadosTrifasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarDadosTrifasicoActionPerformed
        this.limparCampos(false);
    }//GEN-LAST:event_apagarDadosTrifasicoActionPerformed

    /*
     * Limpa os dados do TableModel da tabela monofasico.
     */
    private void apagarDadosMonofasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarDadosMonofasicoActionPerformed
        this.limparCampos(true);
    }//GEN-LAST:event_apagarDadosMonofasicoActionPerformed

    private void tabelaTrifasicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTrifasicoMouseClicked
        if (evt.getClickCount() == 2) {
            int row = this.tabelaTrifasico.getSelectedRow();
            int col = this.tabelaTrifasico.getSelectedColumn();

            if (col != 0) {
                String oldValue = (String) this.modelTrifasico.getValueAt(row, col);
                String newValue = Entrada.alteraValorPosicao(this, oldValue);

                if (newValue != null) {
                    if (newValue.contains(":") && !newValue.equals(":")) {
                        String[] tt = newValue.split(":");

                        if (tt.length == 2) {
                            String sub_init = tt[0].trim();
                            String sub_end = tt[1].trim();

                            if (this.isNumber(sub_init)) {
                                if ((sub_end.length() == 1) && (this.isLetter(sub_end.charAt(0)))) {
                                    Posicao pos = new Posicao(Integer.parseInt(sub_init), sub_end.toUpperCase());
                                    this.modelTrifasico.setValueAt(pos, row, col);
                                    this.modelTrifasico.fireTableDataChanged();
                                } else {
                                    Erro.entradaInvalida(this);
                                }
                            } else {
                                Erro.entradaInvalida(this);
                            }
                        } else {
                            Erro.entradaInvalida(this);
                        }
                    } else {
                        Erro.entradaInvalida(this);
                    }
                }
            }
        }
    }//GEN-LAST:event_tabelaTrifasicoMouseClicked

    private void atualizaMonofasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaMonofasicoActionPerformed
        int qtdColunas = this.modelMonofasico.getColumnCount();
        String[][] matriz = this.modelMonofasico.getDataArray();
        int qtdLinhas = matriz.length;
        if (qtdColunas > 0 && qtdLinhas > 0) {
            String[] vetorColunas = new String[qtdColunas];

            for (int i = 0; i < qtdColunas; i++) {
                vetorColunas[i] = this.modelMonofasico.getColumnName(i);
            }

            String[] vetorLinhas = new String[qtdLinhas];

            for (int i = 0; i < qtdLinhas; i++) {
                vetorLinhas[i] = matriz[i][0];
            }
            try {
                EloTransformadorDao.limparBanco(EloTransformadorDao.MONOFASICO);
                EloTransformadorDao.inserirKv(vetorColunas, EloTransformadorDao.MONOFASICO);
                EloTransformadorDao.inserirPot(vetorLinhas, EloTransformadorDao.MONOFASICO);
                EloTransformadorDao.inserirEloTransformador(matriz,
                        qtdColunas,
                        qtdLinhas,
                        EloTransformadorDao.MONOFASICO);
            } catch (SQLException ex) {
                Erro.mostraMensagemSQL(this);
                ex.printStackTrace();
            }
        } else {
            try {
                EloTransformadorDao.limparBanco(EloTransformadorDao.MONOFASICO);
            } catch (SQLException ex) {
                Erro.mostraMensagemSQL(this);
            }
        }
    }//GEN-LAST:event_atualizaMonofasicoActionPerformed

    private void atualizaTrifasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaTrifasicoActionPerformed
        int qtdColunas = this.modelTrifasico.getColumnCount();
        String[][] matriz = this.modelTrifasico.getDataArray();
        int qtdLinhas = matriz.length;
        if (qtdColunas > 0 && qtdLinhas > 0) {
            String[] vetorColunas = new String[qtdColunas];

            for (int i = 0; i < qtdColunas; i++) {
                vetorColunas[i] = this.modelTrifasico.getColumnName(i);
            }

            String[] vetorLinhas = new String[qtdLinhas];

            for (int i = 0; i < qtdLinhas; i++) {
                vetorLinhas[i] = matriz[i][0];
            }
            try {
                EloTransformadorDao.limparBanco(EloTransformadorDao.TRIFASICO);
                EloTransformadorDao.inserirKv(vetorColunas, EloTransformadorDao.TRIFASICO);
                EloTransformadorDao.inserirPot(vetorLinhas, EloTransformadorDao.TRIFASICO);
                EloTransformadorDao.inserirEloTransformador(matriz,
                        qtdColunas,
                        qtdLinhas,
                        EloTransformadorDao.TRIFASICO);
            } catch (SQLException ex) {
                Erro.mostraMensagemSQL(this);
                ex.printStackTrace();
            }
        } else {
            try {
                EloTransformadorDao.limparBanco(EloTransformadorDao.TRIFASICO);
            } catch (SQLException ex) {
                Erro.mostraMensagemSQL(this);
            }
        }
    }//GEN-LAST:event_atualizaTrifasicoActionPerformed

    /*
     * Método responsável por fazer a limpeza.
     */
    public void limparCampos(boolean first) {
        if (first) {
            this.configuraTabelaMonofasico();
        } else {
            this.configuraTabelaTrifasico();
        }
    }

    /*
     * Verifica se o valor passado por parametro é um número.
     */
    public boolean isNumber(String num) {
        try {
            Double.parseDouble(num);
            return true;
        } catch (NumberFormatException ex) {
            Erro.entradaSomenteNumeros(this);
            return false;
        }
    }

    /*
     * Verifica se o valor passado por parametro é uma letra do alfabeto.
     */
    public boolean isLetter(char digit) {
        int value = (int) digit;

        if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122)) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(GUI_Elo_de_Transformador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Elo_de_Transformador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Elo_de_Transformador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Elo_de_Transformador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Elo_de_Transformador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addColunaMonofasico;
    private javax.swing.JButton addColunaTrifasico;
    private javax.swing.JButton addLinhaMonofasico;
    private javax.swing.JButton addLinhaTrifasico;
    private javax.swing.JButton apagarDadosMonofasico;
    private javax.swing.JButton apagarDadosTrifasico;
    private javax.swing.JButton atualizaMonofasico;
    private javax.swing.JButton atualizaTrifasico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton removeColunaMonofasico;
    private javax.swing.JButton removeColunaTrifasico;
    private javax.swing.JButton removeLinhaMonofasico;
    private javax.swing.JButton removeLinhaTrifasico;
    private javax.swing.JTable tabelaMonofasico;
    private javax.swing.JTable tabelaTrifasico;
    // End of variables declaration//GEN-END:variables
}
