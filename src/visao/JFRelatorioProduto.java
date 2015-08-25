/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.ProdutoDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

/**
 *
 * @author takedownone
 */
public class JFRelatorioProduto extends javax.swing.JFrame {

    DefaultTableModel tmProduto = new DefaultTableModel(null, new String[]{"Código", "Nome", "Descrição", "Valor", "Quantidade", "Classe"});
    List<Produto> produtos;
    ListSelectionModel lsmProdutos;

    /**
     * Creates new form JFRelatorioProduto
     */
    public JFRelatorioProduto() {
        initComponents();
        setCor(100, 100, 100);
    }

    private void setCor(int  vermelho, int verde, int azul) {
        Color minhaCor = new Color(vermelho,verde,azul);
        getContentPane().setBackground(minhaCor);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTPesquisar = new javax.swing.JTextField();
        jBPesquisa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTClasse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jTID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTabela = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jBLimpar = new javax.swing.JButton();
        jBalterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Produtos");
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pesquisar Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jTPesquisar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBPesquisa.setBackground(new java.awt.Color(153, 153, 153));
        jBPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBPesquisa.setText("Pesquisar");
        jBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jBPesquisa)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTPesquisar)
                    .addComponent(jBPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 21, 756, 73);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código:");

        jTNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTClasse.setEditable(false);
        jTClasse.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTClasseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade:");

        jTQuantidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor do Produto:");

        jTValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descrição:");

        jTADescricao.setColumns(20);
        jTADescricao.setRows(5);
        jScrollPane1.setViewportView(jTADescricao);

        jTID.setEditable(false);
        jTID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Classe(TIPO):");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTClasse)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(666, Short.MAX_VALUE)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 114, Short.MAX_VALUE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTClasse, jTNome, jTQuantidade, jTValor});

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 98, 756, 168);

        jTTabela.setBackground(new java.awt.Color(102, 102, 102));
        jTTabela.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTTabela.setForeground(new java.awt.Color(255, 255, 255));
        jTTabela.setModel(tmProduto);
        jTTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmProdutos = jTTabela.getSelectionModel();
        lsmProdutos.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()){
                    JTTabelaLinhaSelecionada(jTTabela);
                }
            }
        });
        jScrollPane2.setViewportView(jTTabela);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 340, 756, 151);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBLimpar.setBackground(new java.awt.Color(153, 153, 153));
        jBLimpar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBalterar.setBackground(new java.awt.Color(153, 153, 153));
        jBalterar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        jBExcluir.setBackground(new java.awt.Color(153, 153, 153));
        jBExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBSair.setBackground(new java.awt.Color(153, 153, 153));
        jBSair.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jBalterar)
                .addGap(67, 67, 67)
                .addComponent(jBExcluir)
                .addGap(31, 31, 31)
                .addComponent(jBSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBExcluir, jBLimpar, jBSair, jBalterar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBalterar)
                    .addComponent(jBExcluir)
                    .addComponent(jBSair))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBExcluir, jBLimpar, jBSair, jBalterar});

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 272, 756, 62);

        setSize(new java.awt.Dimension(792, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaActionPerformed
        listaProduto();
    }//GEN-LAST:event_jBPesquisaActionPerformed

    private void jTClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClasseActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
        if (verificaCampos()) {
            if (desejaAlterar()) {
                alterarProduto();
                limpaCampos();
                listaProduto();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos !");
        }
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if (verificaCampos()){
            if (desejaExcluir()){
                JOptionPane.showMessageDialog(null, "Desculpe!"
                        + " \n Esse produto não pode ser excluido do Banco de Dados,"
                        + "\n pois pode haver vendas relacionadas a ele !"
                        + "\n procure um administrador de DBA");
            }
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JFRelatorioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRelatorioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRelatorioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRelatorioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRelatorioProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBalterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextField jTClasse;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTextField jTQuantidade;
    private javax.swing.JTable jTTabela;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        jTADescricao.setText("");
        jTClasse.setText("");
        jTID.setText("");
        jTNome.setText("");
        jTPesquisar.setText("");
        jTQuantidade.setText("");
        jTValor.setText("");
    }

    private void mostraPesquisa(List<Produto> produtos) {
        while (tmProduto.getRowCount() > 0) {
            tmProduto.removeRow(0);
        }
        if (produtos.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!");
        } else {
            String[] linha = new String[]{null, null, null, null, null, null};
            for (int i = 0; i < produtos.size(); i++) {
                tmProduto.addRow(linha);
                tmProduto.setValueAt(produtos.get(i).getId(), i, 0);
                tmProduto.setValueAt(produtos.get(i).getNome(), i, 1);
                tmProduto.setValueAt(produtos.get(i).getDescricao(), i, 2);
                tmProduto.setValueAt(produtos.get(i).getValorProduto(), i, 3);
                tmProduto.setValueAt(produtos.get(i).getQuantidade(), i, 4);
                tmProduto.setValueAt(produtos.get(i).getId(), i, 5);
            }
        }
    }

    private void listaProduto() {
        ProdutoDAO dao = new ProdutoDAO();
        produtos = dao.listar("%" + jTPesquisar.getText() + "%");
        mostraPesquisa(produtos);
    }

    private void JTTabelaLinhaSelecionada(JTable tabela) {
        if (jTTabela.getSelectedRow() != -1) {
            jTID.setText(String.valueOf(produtos.get(tabela.getSelectedRow()).getId()));
            jTNome.setText(produtos.get(tabela.getSelectedRow()).getNome());
            jTADescricao.setText(produtos.get(tabela.getSelectedRow()).getDescricao());
            jTValor.setText(String.valueOf(produtos.get(tabela.getSelectedRow()).getValorProduto()));
            jTQuantidade.setText(String.valueOf(produtos.get(tabela.getSelectedRow()).getQuantidade()));
            jTClasse.setText(String.valueOf(produtos.get(tabela.getSelectedRow()).getClasse()));
        } else {
            limpaCampos();
        }
    }

    private void alterarProduto() {
        Produto produto = new Produto();
        produto.setNome(jTNome.getText());
        produto.setDescricao(jTADescricao.getText());
        produto.setValorProduto(Double.valueOf(jTValor.getText()));
        produto.setQuantidade(Integer.valueOf(jTQuantidade.getText()));
        produto.setClasse(Integer.valueOf(jTClasse.getText()));
        produto.setId(Long.valueOf(jTID.getText()));
        // pega o produto e isere no banco    
        ProdutoDAO dao = new ProdutoDAO();
        dao.alterar(produto);
    }

    private boolean verificaCampos() {
        boolean retorno;
        if (!jTADescricao.getText().equals("") && !jTClasse.getText().equals("")
                && !jTID.getText().equals("") && !jTNome.getText().equals("")
                && !jTQuantidade.getText().equals("") && !jTValor.getText().equals("")) {
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }

    private boolean desejaAlterar() {
        int resp = JOptionPane.showConfirmDialog(this, "Deseja alterar esse Produto ?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    private void excluirProduto() {
        Produto produto = new Produto();
        produto.setId(Long.valueOf(jTID.getText()));
        ProdutoDAO dao = new ProdutoDAO();
        dao.excluir(produto);
    }

    private boolean desejaExcluir() {
         int resp = JOptionPane.showConfirmDialog(this, "Deseja excluir esse Produto ?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {
            return true;
        } else {
            return false;
        }
    }
}
