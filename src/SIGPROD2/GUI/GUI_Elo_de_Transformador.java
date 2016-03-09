/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGPROD2.GUI;

import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Auxiliar.MyRenderer;
import SIGPROD2.Modelo.Posicao;
import SIGPROD2.Modelo.Tabelas.TransformadorTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author sbrunettajr
 *
 */
public class GUI_Elo_de_Transformador extends javax.swing.JFrame {

    private TransformadorTableModel modelTrifasico;
    private TransformadorTableModel modelMonofasico;

    public GUI_Elo_de_Transformador() {
        initComponents();
        this.configurarTabelas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaMonofasico = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTrifasico = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(713, 523));
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

        jButton3.setText("Add Column");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Row");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Remove Column");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Remove Row");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(46, 46, 46)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Monofásico", jPanel1);

        tabelaTrifasico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaTrifasico);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
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

    private void configurarTabelas() {
        this.modelMonofasico = new TransformadorTableModel();
        this.tabelaMonofasico.setModel(modelMonofasico);
        this.tabelaMonofasico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaMonofasico.setDefaultRenderer(Object.class, new MyRenderer());
        this.modelMonofasico.addColumn(" ");
        this.modelMonofasico.fireTableStructureChanged();

        this.modelTrifasico = new TransformadorTableModel();
        this.tabelaTrifasico.setModel(this.modelTrifasico);
        this.tabelaTrifasico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaTrifasico.setDefaultRenderer(Object.class, new MyRenderer());
        this.modelTrifasico.addColumn(" ");
        this.modelTrifasico.fireTableStructureChanged();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nomeColumn = JOptionPane.showInputDialog(this, "Insira o nome da nova Coluna:", "ColumnName", 3);
        if (nomeColumn != null) {
            if (this.isNumber(nomeColumn)) {
                this.modelMonofasico.addColumn(nomeColumn + " KW ");
                this.modelMonofasico.fireTableStructureChanged();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Posicao> pos = new ArrayList<>();
        String rowValue = JOptionPane.showInputDialog(this, "Insira o nome da nova linha:", "RowName", 3);
        if (this.isNumber(rowValue)) {
            pos.add(new Posicao("", Integer.parseInt(rowValue)));
            for (int i = 1; i < this.modelMonofasico.getColumnCount(); i++) {
                pos.add(new Posicao("", 0));
            }
            this.modelMonofasico.add(pos);
            this.modelMonofasico.fireTableDataChanged();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int pos = this.tabelaMonofasico.getSelectedRow();
        if (pos != -1) {
            this.modelMonofasico.remove(pos);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int pos = this.tabelaMonofasico.getSelectedColumn();
        if (pos >= 1) {
            this.modelMonofasico.removeColumn(pos);
            this.modelMonofasico.fireTableStructureChanged();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabelaMonofasicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMonofasicoMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = this.tabelaMonofasico.getSelectedRow();
            int coluna = this.tabelaMonofasico.getSelectedColumn();

            String valor = (String) this.modelMonofasico.getValueAt(linha, coluna);
            String novoValor = JOptionPane.showInputDialog("Tipo : Tempo", valor);
            if (novoValor.contains(":")) {
                try {
                    String tipo = novoValor.split(":")[0];
                    if (contemLetras(tipo)) {
                        int tempo = Integer.parseInt(novoValor.split(":")[1]);;
                        table_transformadorTri.getModel().setValueAt(
                                new Posicao(tipo, tempo),
                                linha,
                                coluna);
                    } else {
                        Erro.mostraMensagem(this, "O tipo deve conter apenas letras.");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    Erro.mostraMensagem(this, "A corrente deve conter apenas números");
                }
            } else {
                Erro.mostraMensagem(this, "O padrão de formato é: Tipo:Corrente.");
            }
        }
    }//GEN-LAST:event_tabelaMonofasicoMouseClicked

    public boolean isNumber(String num) {
        try {
            Double.parseDouble(num);
            return true;
        } catch (NumberFormatException ex) {
            Erro.EntredaSomenteNumeros(this);
            return false;
        }
    }

    public boolean isLetter (char digit) {
        int value = Character.getNumericValue(digit);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaMonofasico;
    private javax.swing.JTable tabelaTrifasico;
    // End of variables declaration//GEN-END:variables
}
