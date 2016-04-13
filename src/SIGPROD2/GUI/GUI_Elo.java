/*
 * Classe responsável por gerenciar a Janela de Elos.
 */
package SIGPROD2.GUI;

import SIGPROD2.Auxiliar.Arquivo;
import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Auxiliar.Mensagem;
import SIGPROD2.DAO.EloKDao;
import SIGPROD2.DAO.PontoCurvaDAO;
import SIGPROD2.Modelo.EloK;
import SIGPROD2.Modelo.PontoCurva;
import SIGPROD2.Modelo.Tabelas.PontoCurvaTableModel;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.TableRowSorter;

/*
 *
 * @author Sérgio Brunetta Júnior
 * @version 10/03/2K16
 *
 */

public class GUI_Elo extends javax.swing.JFrame {

    private PontoCurvaTableModel modeloMaximo;
    private PontoCurvaTableModel modeloMinimo;
    private PontoCurvaTableModel modeloMinimoCarregar;
    private PontoCurvaTableModel modeloMaximoCarregar;
    private EloK novoElo;
    private ArrayList<EloK> correntes;
    private boolean abaCarregarEloSelecionada;
    private boolean abaElosTransformadorSelecionada;
    
    public GUI_Elo() {
        initComponents();
        iniciaTabelas();
        carregarCorrentes();
    }

    /*
     * Carrega todas as correntes salvas no Banco de Dados para o JComboBox, na segunda aba.
     */
    private void carregarCorrentes() {
        try {
            this.correntes = EloKDao.buscarCorrentes();

            for (EloK elo : this.correntes) {
                this.listaCorrentes.addItem(elo);
            }
        } catch (SQLException ex) {
            Erro.mostraMensagemSQL(this);
        }

    }
    
    /*
     * Carrega ponto do elo selecionado na segunda aba.
     */
    private void carregarElo() {
        EloK selecionado = (EloK) this.listaCorrentes.getSelectedItem();
          if (selecionado != null) {
            try {
                this.preferencialCarregar.setSelected(selecionado.isPreferencial());
                carregarCurvaMaxima(selecionado);
                carregarCurvaMinima(selecionado);
                this.modeloMaximoCarregar.fireTableDataChanged();
                this.modeloMinimoCarregar.fireTableDataChanged();
            } catch (SQLException ex) {
                Erro.mostraMensagemSQL(this);
            }
        }
    }

    /*
     * Carrega os pontos minimos do elo selecionado na segunda aba.
     */
    private ArrayList<PontoCurva> carregarCurvaMinima(EloK selecionado) throws SQLException {
        ArrayList<PontoCurva> lista;
        lista = PontoCurvaDAO.buscaPontosCurva(selecionado.getCorrenteNominal(),
                PontoCurva.PONTODACURVAMINIMA);
        this.modeloMinimoCarregar.add(lista);
        return lista;
    }
    
    /*
     * Carrega os pontos máximos do elo selecionado na segunda aba.
     */
    private ArrayList<PontoCurva> carregarCurvaMaxima(EloK selecionado) throws SQLException {
        ArrayList<PontoCurva> lista;
        lista = PontoCurvaDAO.buscaPontosCurva(selecionado.getCorrenteNominal(),
                PontoCurva.PONTODACURVAMAXIMA);
        this.modeloMaximoCarregar.add(lista);
        return lista;
    }
    
    /*
     * Configura tabelas ao iniciar a classe.
     */
    private void iniciaTabelas() {
        iniciarTabelaCurvaMaxima();
        iniciarTabelaCurvaMinima();
        iniciarTabelaCurvaMinimaCarregar();
        iniciarTabelaCurvaMaximaCarregar();
    }

    private void iniciarTabelaCurvaMaximaCarregar() {
        modeloMaximoCarregar = new PontoCurvaTableModel();
        
        this.tabelaCurvaMaximaCarregar.setModel(modeloMaximoCarregar);
        this.tabelaCurvaMaximaCarregar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaCurvaMaximaCarregar.setRowSorter(new TableRowSorter(modeloMaximoCarregar));
    }

    private void iniciarTabelaCurvaMinimaCarregar() {
        modeloMinimoCarregar = new PontoCurvaTableModel();
        
        this.tabelaCurvaMinimoCarregar.setModel(modeloMinimoCarregar);
        this.tabelaCurvaMinimoCarregar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaCurvaMinimoCarregar.setRowSorter(new TableRowSorter(modeloMinimoCarregar));
    }

    private void iniciarTabelaCurvaMinima() {
        modeloMinimo = new PontoCurvaTableModel();
        
        this.tabelaCurvaMinimo.setModel(modeloMinimo);
        this.tabelaCurvaMinimo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaCurvaMinimo.setRowSorter(new TableRowSorter(modeloMinimo));
    }

    private void iniciarTabelaCurvaMaxima() {
        modeloMaximo = new PontoCurvaTableModel();
        
        this.tabelaCurvaMaxima.setModel(modeloMaximo);
        this.tabelaCurvaMaxima.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaCurvaMaxima.setRowSorter(new TableRowSorter(modeloMaximo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        corrente_nominal = new javax.swing.JLabel();
        correnteNominal = new javax.swing.JTextField();
        preferencial = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        tabelaCurva = new javax.swing.JScrollPane();
        tabelaCurvaMinimo = new javax.swing.JTable();
        removeCurvaMinima = new javax.swing.JButton();
        addCurvaMinima = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tabelaPonto = new javax.swing.JScrollPane();
        tabelaCurvaMaxima = new javax.swing.JTable();
        addCurvaMaxima = new javax.swing.JButton();
        removeCurvaMaxima = new javax.swing.JButton();
        inserir = new javax.swing.JButton();
        arquivoUm = new javax.swing.JButton();
        apagarDados = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        type2 = new javax.swing.JLabel();
        corrente_nominal2 = new javax.swing.JLabel();
        preferencialCarregar = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        tabelaCurva2 = new javax.swing.JScrollPane();
        tabelaCurvaMinimoCarregar = new javax.swing.JTable();
        removeCurvaMinimaCarregar = new javax.swing.JButton();
        addCurvaMinimaCarregar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        tabelaPonto2 = new javax.swing.JScrollPane();
        tabelaCurvaMaximaCarregar = new javax.swing.JTable();
        addCurvaMaximaCarregar = new javax.swing.JButton();
        removeCurvaMaximaCarregar = new javax.swing.JButton();
        arquivoDois = new javax.swing.JButton();
        listaCorrentes = new javax.swing.JComboBox();
        botaoDeletar = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        apagarDadosCarregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        type.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        type.setText("Tipo K");

        corrente_nominal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        corrente_nominal.setText("Corrente Nominal");

        preferencial.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        preferencial.setText("Preferencial");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva de Minima Fusão"));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 275));

        tabelaCurva.setPreferredSize(new java.awt.Dimension(150, 480));

        tabelaCurvaMinimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Corrente", "Tempo"
            }
        ));
        tabelaCurvaMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaCurvaMinimoKeyPressed(evt);
            }
        });
        tabelaCurva.setViewportView(tabelaCurvaMinimo);

        removeCurvaMinima.setText("-");
        removeCurvaMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCurvaMinimaActionPerformed(evt);
            }
        });

        addCurvaMinima.setText("+");
        addCurvaMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCurvaMinimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addCurvaMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeCurvaMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaCurva, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCurvaMinima)
                    .addComponent(removeCurvaMinima))
                .addGap(12, 12, 12))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva de Máxima Interrupção"));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 300));

        tabelaCurvaMaxima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Corrente", "Tempo"
            }
        ));
        tabelaCurvaMaxima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaCurvaMaximaKeyPressed(evt);
            }
        });
        tabelaPonto.setViewportView(tabelaCurvaMaxima);

        addCurvaMaxima.setText("+");
        addCurvaMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCurvaMaximaActionPerformed(evt);
            }
        });

        removeCurvaMaxima.setText("-");
        removeCurvaMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCurvaMaximaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(addCurvaMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(removeCurvaMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(tabelaPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCurvaMaxima)
                    .addComponent(removeCurvaMaxima))
                .addGap(12, 12, 12))
        );

        inserir.setText("Inserir");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        arquivoUm.setText("Arquivo");
        arquivoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivoUmActionPerformed(evt);
            }
        });

        apagarDados.setText("Limpar");
        apagarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(type)
                        .addGap(53, 53, 53)
                        .addComponent(corrente_nominal)
                        .addGap(6, 6, 6)
                        .addComponent(correnteNominal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(preferencial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(apagarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(arquivoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corrente_nominal)
                    .addComponent(correnteNominal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preferencial))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arquivoUm)
                    .addComponent(inserir)
                    .addComponent(apagarDados))
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Novo Elo de Ramal", jPanel1);

        jPanel8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel8KeyPressed(evt);
            }
        });

        type2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        type2.setText("Tipo K");

        corrente_nominal2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        corrente_nominal2.setText("Corrente Nominal");

        preferencialCarregar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        preferencialCarregar.setText("Preferencial");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva de Minima Fusão"));
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 275));

        tabelaCurva2.setPreferredSize(new java.awt.Dimension(150, 480));

        tabelaCurvaMinimoCarregar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Corrente", "Tempo"
            }
        ));
        tabelaCurvaMinimoCarregar.setMinimumSize(new java.awt.Dimension(250, 250));
        tabelaCurvaMinimoCarregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCurvaMinimoCarregarMouseClicked(evt);
            }
        });
        tabelaCurvaMinimoCarregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaCurvaMinimoCarregarKeyPressed(evt);
            }
        });
        tabelaCurva2.setViewportView(tabelaCurvaMinimoCarregar);

        removeCurvaMinimaCarregar.setText("-");
        removeCurvaMinimaCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCurvaMinimaCarregarActionPerformed(evt);
            }
        });

        addCurvaMinimaCarregar.setText("+");
        addCurvaMinimaCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCurvaMinimaCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaCurva2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(addCurvaMinimaCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeCurvaMinimaCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaCurva2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCurvaMinimaCarregar)
                    .addComponent(removeCurvaMinimaCarregar))
                .addGap(12, 12, 12))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Curva de Máxima Interrupção"));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 300));

        tabelaCurvaMaximaCarregar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Corrente", "Tempo"
            }
        ));
        tabelaCurvaMaximaCarregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaCurvaMaximaCarregarKeyPressed(evt);
            }
        });
        tabelaPonto2.setViewportView(tabelaCurvaMaximaCarregar);

        addCurvaMaximaCarregar.setText("+");
        addCurvaMaximaCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCurvaMaximaCarregarActionPerformed(evt);
            }
        });

        removeCurvaMaximaCarregar.setText("-");
        removeCurvaMaximaCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCurvaMaximaCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaPonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(addCurvaMaximaCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(removeCurvaMaximaCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaPonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCurvaMaximaCarregar)
                    .addComponent(removeCurvaMaximaCarregar))
                .addContainerGap())
        );

        arquivoDois.setText("Arquivo");
        arquivoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivoDoisActionPerformed(evt);
            }
        });

        listaCorrentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCorrentesActionPerformed(evt);
            }
        });

        botaoDeletar.setText("Deletar");
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        apagarDadosCarregar.setText("Limpar");
        apagarDadosCarregar.setToolTipText("");
        apagarDadosCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarDadosCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(type2)
                        .addGap(53, 53, 53)
                        .addComponent(corrente_nominal2)
                        .addGap(6, 6, 6)
                        .addComponent(listaCorrentes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(preferencialCarregar))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(apagarDadosCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arquivoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corrente_nominal2)
                    .addComponent(preferencialCarregar)
                    .addComponent(listaCorrentes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDeletar)
                    .addComponent(botaoAtualizar)
                    .addComponent(arquivoDois)
                    .addComponent(apagarDadosCarregar))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Carregar Elo", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Abre o seletor de arquivos na primeira aba.
     */
    private void arquivoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivoUmActionPerformed
        GUI_SelecionaArquivo select = new GUI_SelecionaArquivo(this, true);
        select.setVisible(true);
    }//GEN-LAST:event_arquivoUmActionPerformed

    /*
     * Abre o seletor de arquivos na segunda aba. 
     */
    private void arquivoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivoDoisActionPerformed
        GUI_SelecionaArquivo select = new GUI_SelecionaArquivo(this, false);
        select.setVisible(true);
    }//GEN-LAST:event_arquivoDoisActionPerformed

    /*
     * Adiciona uma linha na tabela de curva minima da primeira aba.
     */
    private void addCurvaMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCurvaMinimaActionPerformed
        this.modeloMinimo.add(new PontoCurva(0, 0));
        this.modeloMinimo.fireTableDataChanged();
    }//GEN-LAST:event_addCurvaMinimaActionPerformed

    /*
     * Remove uma linha na tabela de curva minima da primeira aba.
     */
    private void removeCurvaMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCurvaMinimaActionPerformed
        int row = tabelaCurvaMinimo.getSelectedRow();

        if (row != -1) {
            this.modeloMinimo.remove(row);
        } else {
            Erro.linhaNaoSelecionada(this);
        }
    }//GEN-LAST:event_removeCurvaMinimaActionPerformed

    /*
     * Adiciona uma linha na tabela de curva máxima da primeira aba.
     */
    private void addCurvaMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCurvaMaximaActionPerformed
        this.modeloMaximo.add(new PontoCurva(0, 0));
        this.modeloMaximo.fireTableDataChanged();
    }//GEN-LAST:event_addCurvaMaximaActionPerformed

    /*
     * Insere no banco de dados um novo Elo
     */
    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        if (!this.correnteNominal.getText().equals("")) {
            this.novoElo = new EloK(Integer.parseInt(this.correnteNominal.getText()),
                    preferencial.isSelected(),
                    this.modeloMinimo.getArrayList(),
                    this.modeloMaximo.getArrayList());

            try {
                EloKDao.insereEloK(novoElo);
                this.listaCorrentes.addItem(novoElo);
                Mensagem.mostraMensagemInsercao(this, novoElo.getCorrenteNominal());
                this.limparCampos(true);
            } catch (SQLException ex) {
                Erro.correnteExistente(this);
            }
        } else {
            Erro.correnteVazia(this);
        }
    }//GEN-LAST:event_inserirActionPerformed

    /*
     * Remove uma linha na tabela de curva máxima da primeira aba.
     */
    private void removeCurvaMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCurvaMaximaActionPerformed
        int row = tabelaCurvaMaxima.getSelectedRow();

        if (row != -1) {
            this.modeloMaximo.remove(row);
        } else {
            Erro.linhaNaoSelecionada(this);
        }
    }//GEN-LAST:event_removeCurvaMaximaActionPerformed

    /* 
     * Adiciona uma linha na tabela de curva mínima da segunda aba.
     */
    private void addCurvaMinimaCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCurvaMinimaCarregarActionPerformed
        this.modeloMinimoCarregar.add(new PontoCurva(0, 0));
        this.modeloMinimoCarregar.fireTableDataChanged();
    }//GEN-LAST:event_addCurvaMinimaCarregarActionPerformed

    /* 
     * Remove uma linha na tabela de curva mínima da segunda aba.
     */
    private void removeCurvaMinimaCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCurvaMinimaCarregarActionPerformed
        int row = tabelaCurvaMinimoCarregar.getSelectedRow();

        if (row != -1) {
            this.modeloMinimoCarregar.remove(row);
        } else {
            Erro.linhaNaoSelecionada(this);
        }
    }//GEN-LAST:event_removeCurvaMinimaCarregarActionPerformed

    /* 
     * Adiciona uma linha na tabela de curva Máxima da segunda aba.
     */
    private void addCurvaMaximaCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCurvaMaximaCarregarActionPerformed
        this.modeloMaximoCarregar.add(new PontoCurva(0, 0));
        this.modeloMaximoCarregar.fireTableDataChanged();
    }//GEN-LAST:event_addCurvaMaximaCarregarActionPerformed

    /* 
     * Remove uma linha na tabela de curva Máxima da segunda aba.
     */
    private void removeCurvaMaximaCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCurvaMaximaCarregarActionPerformed
        int row = tabelaCurvaMaximaCarregar.getSelectedRow();

        if (row != -1) {
            this.modeloMaximoCarregar.remove(row);
        } else {
            Erro.linhaNaoSelecionada(this);
        }
    }//GEN-LAST:event_removeCurvaMaximaCarregarActionPerformed

    /*
     * Carrega os pontos de curva do Elo selecionado, na segunda aba.
     */
    private void listaCorrentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCorrentesActionPerformed
        carregarElo();
    }//GEN-LAST:event_listaCorrentesActionPerformed

    /*
     * Deleta o Elo selecionado na segunda aba.
     */
    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        if (this.listaCorrentes.getSelectedItem() != null) {
            EloK elo = (EloK) this.listaCorrentes.getSelectedItem();

            try {
                EloKDao.deletaEloK(elo);
                this.limparCampos(false);
                this.listaCorrentes.removeItem(elo);
                Mensagem.mostraMensagemExclusao(this, elo.getCorrenteNominal());
            } catch (SQLException ex) {
                Erro.mostraMensagemSQL(this);
            }
        }
    }//GEN-LAST:event_botaoDeletarActionPerformed

    /*
     * Atualiza o Elo selecionado no JComboBox na segunda aba.
     */
    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        if (this.listaCorrentes.getSelectedItem() != null) {
            EloK elo = (EloK) this.listaCorrentes.getSelectedItem();

            elo.setPreferencial(this.preferencialCarregar.isSelected());
            elo.setCurvaDeMinimaFusao(this.modeloMinimoCarregar.getArrayList());
            elo.setCurvaDeMaximaInterrupcao(this.modeloMaximoCarregar.getArrayList());
            try {
                EloKDao.deletaEloK(elo);
                EloKDao.insereEloK(elo);
            } catch (SQLException ex) {
                Erro.mostraMensagemSQL(this);
            }
        }
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    /*
     * Quando botao DELETE é clicado, é excluida a linha selecionada na tabelaCurvaMinimoCarregar
     */
    private void tabelaCurvaMinimoCarregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCurvaMinimoCarregarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            int row = tabelaCurvaMinimoCarregar.getSelectedRow();

            if (row != -1) {
                this.modeloMinimoCarregar.remove(row);
            } else {
                Erro.linhaNaoSelecionada(this);
            }
        }
    }//GEN-LAST:event_tabelaCurvaMinimoCarregarKeyPressed

    /*
     * Quando botao DELETE é clicado, é excluida a linha selecionada na tabelaCurvaMaximaCarregar
     */
    private void tabelaCurvaMaximaCarregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCurvaMaximaCarregarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            int row = tabelaCurvaMaximaCarregar.getSelectedRow();

            if (row != -1) {
                this.modeloMaximoCarregar.remove(row);
            } else {
                Erro.linhaNaoSelecionada(this);
            }
        }
    }//GEN-LAST:event_tabelaCurvaMaximaCarregarKeyPressed

    /*
     * Quando botao DELETE é clicado, é excluida a linha selecionada na tabelaCurvaMinimo
     */
    private void tabelaCurvaMinimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCurvaMinimoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            int row = tabelaCurvaMinimo.getSelectedRow();

            if (row != -1) {
                this.modeloMinimo.remove(row);
            } else {
                Erro.linhaNaoSelecionada(this);
            }
        }
    }//GEN-LAST:event_tabelaCurvaMinimoKeyPressed

    /*
     * Quando botao DELETE é clicado, é excluida a linha selecionada na tabelaCurvaMaxima
     */
    private void tabelaCurvaMaximaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCurvaMaximaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            int row = tabelaCurvaMaxima.getSelectedRow();

            if (row != -1) {
                this.modeloMaximo.remove(row);
            } else {
                Erro.linhaNaoSelecionada(this);
            }
        }
    }//GEN-LAST:event_tabelaCurvaMaximaKeyPressed

    /*
     * Responsável por limpar todos os dados na primeira aba.
     */
    private void apagarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarDadosActionPerformed
        this.limparCampos(true);
    }//GEN-LAST:event_apagarDadosActionPerformed

    /*
     * Responsável por limpar todos os dados na segunda aba.
     */
    private void apagarDadosCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarDadosCarregarActionPerformed
        this.limparCampos(false);
    }//GEN-LAST:event_apagarDadosCarregarActionPerformed

    private void tabelaCurvaMinimoCarregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCurvaMinimoCarregarMouseClicked

    }//GEN-LAST:event_tabelaCurvaMinimoCarregarMouseClicked

    private void jPanel8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel8KeyPressed
 
    }//GEN-LAST:event_jPanel8KeyPressed

    /*
     * Arquivo selecionado é mandado para este método, juntamente com um boolean, informando
     * qual a página em que está sendo carregado o arquivo, para saber quais PontoCurvaTableModel usar.
     */
    public void setArquivo(Arquivo file, boolean page) {
        if (file != null && file.existeArquivo()) {
            if (file.podeLerArquivo()) {
                if (file.abreArquivo()) {
                    PontoCurvaTableModel pc_Maximo;
                    PontoCurvaTableModel pc_Minimo;

                    if (page) {
                        pc_Maximo = this.modeloMaximo;
                        pc_Minimo = this.modeloMinimo;
                    } else {
                        pc_Maximo = this.modeloMaximoCarregar;
                        pc_Minimo = this.modeloMinimoCarregar;
                    }
                    pc_Maximo.removeTodos();
                    pc_Minimo.removeTodos();
                    String texto = file.lerArquivo();
                    String linhas[] = texto.split("\r");

                    this.setPontosCurvaTabela(pc_Minimo, pc_Maximo, linhas);
                } else {
                    Erro.aberturaDeArquivo(this);
                }
            } else {
                Erro.naoPermitidaLeitura(this);
            }
        } else {
            Erro.arquivoInexistente(this);
        }
    }

    /*
     * Atribui, e exibe, os valores lidos no arquivo, conforme o PontoCurvaTableModel passado por parâmetro.
     */
    public void setPontosCurvaTabela(PontoCurvaTableModel min, PontoCurvaTableModel max, String[] linhas) {
        for (String linha : linhas) {
            if (!linha.equals("")) {
                String[] valores = linha.split(" ");
                double corrente = Double.parseDouble(valores[0]);
                double tempo = Double.parseDouble(valores[1]);
                int ehMax = Integer.parseInt(valores[2]);
                if (ehMax == 1) {
                    max.add(new PontoCurva(corrente, tempo));
                } else {
                    min.add(new PontoCurva(corrente, tempo));
                }
            }
        }
        max.fireTableDataChanged();
        min.fireTableDataChanged();
    }

    /*
     * Limpa campos da primeira ou segunda aba, dependendo do valor do boolean recebido.
     */
    public void limparCampos(boolean first) {
        if (first) {
            this.preferencial.setSelected(false);
            this.correnteNominal.setText(null);
            this.modeloMaximo.removeTodos();
            this.modeloMinimo.removeTodos();
            this.modeloMaximo.fireTableDataChanged();
            this.modeloMinimo.fireTableDataChanged();
        } else {
            this.preferencialCarregar.setSelected(false);
            this.modeloMaximoCarregar.removeTodos();
            this.modeloMinimoCarregar.removeTodos();
            this.modeloMaximoCarregar.fireTableDataChanged();
            this.modeloMinimoCarregar.fireTableDataChanged();
        }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Elo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI_Elo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCurvaMaxima;
    private javax.swing.JButton addCurvaMaximaCarregar;
    private javax.swing.JButton addCurvaMinima;
    private javax.swing.JButton addCurvaMinimaCarregar;
    private javax.swing.JButton apagarDados;
    private javax.swing.JButton apagarDadosCarregar;
    private javax.swing.JButton arquivoDois;
    private javax.swing.JButton arquivoUm;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JTextField correnteNominal;
    private javax.swing.JLabel corrente_nominal;
    private javax.swing.JLabel corrente_nominal2;
    private javax.swing.JButton inserir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox listaCorrentes;
    private javax.swing.JCheckBox preferencial;
    private javax.swing.JCheckBox preferencialCarregar;
    private javax.swing.JButton removeCurvaMaxima;
    private javax.swing.JButton removeCurvaMaximaCarregar;
    private javax.swing.JButton removeCurvaMinima;
    private javax.swing.JButton removeCurvaMinimaCarregar;
    private javax.swing.JScrollPane tabelaCurva;
    private javax.swing.JScrollPane tabelaCurva2;
    private javax.swing.JTable tabelaCurvaMaxima;
    private javax.swing.JTable tabelaCurvaMaximaCarregar;
    private javax.swing.JTable tabelaCurvaMinimo;
    private javax.swing.JTable tabelaCurvaMinimoCarregar;
    private javax.swing.JScrollPane tabelaPonto;
    private javax.swing.JScrollPane tabelaPonto2;
    private javax.swing.JLabel type;
    private javax.swing.JLabel type2;
    // End of variables declaration//GEN-END:variables
}
