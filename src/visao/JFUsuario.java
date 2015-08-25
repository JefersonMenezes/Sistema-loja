/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.LoginDao;
import java.awt.Color;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Login;

/**
 *
 * @author takedown
 */
public class JFUsuario extends javax.swing.JFrame {

    DefaultTableModel tmLogin = new DefaultTableModel(null, new String[]{"Código", "Usuário", "Senha"});
    List<Login> logins;
    ListSelectionModel lsmLogins;

    /**
     * Creates new form JFUsuario
     */
    public JFUsuario() {
        initComponents();
        desabilitaCampos();
        setCor(0, 0, 153);
    }

    private void setCor(int vermelho, int verde, int azul) {
        Color minhaCor = new Color(vermelho, verde, azul);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFSenha = new javax.swing.JTextField();
        jBNovo = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jTFPesquisar = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTabela = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");

        jPanel1.setBackground(new java.awt.Color(0, 0, 151));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("ID :");

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("NOME:");

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("SENHA:");

        jBNovo.setBackground(new java.awt.Color(0, 0, 100));
        jBNovo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBNovo.setForeground(new java.awt.Color(204, 255, 255));
        jBNovo.setText("NOVO");
        jBNovo.setToolTipText("Desbloqueia os campos para digitar");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBSalvar.setBackground(new java.awt.Color(0, 0, 100));
        jBSalvar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBSalvar.setForeground(new java.awt.Color(204, 255, 255));
        jBSalvar.setText("SALVAR");
        jBSalvar.setToolTipText("Insere um novo usuario no sistema");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBAlterar.setBackground(new java.awt.Color(0, 0, 100));
        jBAlterar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBAlterar.setForeground(new java.awt.Color(204, 255, 255));
        jBAlterar.setText("ALTERAR");
        jBAlterar.setToolTipText("Altera o usuario");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setBackground(new java.awt.Color(0, 0, 100));
        jBExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBExcluir.setForeground(new java.awt.Color(204, 255, 255));
        jBExcluir.setText("EXCLUIR");
        jBExcluir.setToolTipText("Exclui um usuario do sistema ");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBPesquisar.setBackground(new java.awt.Color(0, 0, 100));
        jBPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBPesquisar.setForeground(new java.awt.Color(204, 255, 255));
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.setToolTipText("Lista os usuarios cadastrados no sistema");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jBAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar)))
                .addGap(3, 3, 3))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAlterar, jBExcluir, jBNovo, jBSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBExcluir)
                    .addComponent(jBAlterar)
                    .addComponent(jBSalvar)
                    .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAlterar, jBExcluir, jBNovo, jBSalvar});

        jTTabela.setBackground(new java.awt.Color(51, 51, 51));
        jTTabela.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTTabela.setForeground(new java.awt.Color(204, 204, 204));
        jTTabela.setModel(tmLogin);
        jTTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmLogins = jTTabela.getSelectionModel();
        lsmLogins.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()){
                    JTTabelaLinhaSelecionada(jTTabela);
                }
            }
        });
        jScrollPane1.setViewportView(jTTabela);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Querys SQL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("SQL Banco");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Acesso ao Sistema");
        jButton3.setToolTipText("Acesso direto ao menu do sistema sem necessidade de usuário cadastrado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("Lista de Usuários cadastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        habilitaCampos();
        requestFocus();
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        if (verificaCampos()) {
            inserirUsuario();
            JOptionPane.showMessageDialog(null, "O usuário " + jTFNome.getText() + " Foi Adcionado com Sucesso !");
            limpaCampos();
            try {
                listarUsuarios();
            } catch (ParseException ex) {
                Logger.getLogger(JFUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os campos Nome e Senha são Obrigatórios !");

        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            listarUsuarios();
        } catch (ParseException ex) {
            Logger.getLogger(JFUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed

        if (verificaCampos()) {
            alteraUsuario();
            JOptionPane.showMessageDialog(null, "O usuário " + jTFNome.getText() + " Alterado com Sucesso !");
            limpaCampos();
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar um usuário na tabela para alterar !");
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed

        if (verificaCampos()) {
            int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse usuário",
                    "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_NO_OPTION) {
                excluirUsuario();
                JOptionPane.showMessageDialog(null, "O usuário " + jTFNome.getText() + " Excluido com Sucesso !");
                limpaCampos();
                try {
                    listarUsuarios();
                } catch (ParseException ex) {
                    Logger.getLogger(JFUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar um usuário na tabela para excluir !");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFSql sql = new JFSql();
        sql.show();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFQuery query = new JFQuery();
        query.show();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFMenu menu = new JFMenu();
        menu.show();
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisar;
    private javax.swing.JTextField jTFSenha;
    private javax.swing.JTable jTTabela;
    // End of variables declaration//GEN-END:variables

    private void habilitaCampos() {
        jTFNome.setEditable(true);
        jTFSenha.setEditable(true);
    }

    private void desabilitaCampos() {
        jTFId.setEditable(false);
        jTFNome.setEditable(false);
        jTFSenha.setEditable(false);
    }

    private boolean verificaCampos() {
        boolean retorno;
        if (jTFNome.getText().equals("") && jTFSenha.getText().equals("")) {
            retorno = false;
        } else {
            retorno = true;
        }
        return retorno;
    }

    private void inserirUsuario() {
        Login login = new Login();
        login.setUsuario(jTFNome.getText());
        login.setSenha(jTFSenha.getText());

        LoginDao dao = new LoginDao();
        dao.inserir(login);
    }

    private void limpaCampos() {
        jTFId.setText("");
        jTFNome.setText("");
        jTFSenha.setText("");
    }

    private void listarUsuarios() throws ParseException {
        LoginDao dao = new LoginDao();
        logins = dao.listarPorNome("%" + jTFPesquisar.getText() + "%");
        mostraPesquisa(logins);
    }

    private void mostraPesquisa(List<Login> logins) {
        while (tmLogin.getRowCount() > 0) {
            tmLogin.removeRow(0);
        }
        if (logins.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Usuário Cadastrado");
        } else {
            String[] linha = new String[]{null, null, null};
            for (int i = 0; i < logins.size(); i++) {
                tmLogin.addRow(linha);
                tmLogin.setValueAt(logins.get(i).getId(), i, 0);
                tmLogin.setValueAt(logins.get(i).getUsuario(), i, 1);
                tmLogin.setValueAt(logins.get(i).getSenha(), i, 2);
            }
        }
    }

    private void JTTabelaLinhaSelecionada(JTable tabela) {
        if (jTTabela.getSelectedRow() != -1) {
            jTFId.setText(String.valueOf(logins.get(tabela.getSelectedRow()).getId()));
            jTFNome.setText(logins.get(tabela.getSelectedRow()).getUsuario());
            jTFSenha.setText(logins.get(tabela.getSelectedRow()).getSenha());
        } else {
            limpaCampos();
        }
    }

    private void alteraUsuario() {
        Login login = new Login();
        login.setId(Integer.valueOf(jTFId.getText()));
        login.setUsuario(jTFNome.getText());
        login.setSenha(jTFSenha.getText());

        LoginDao dao = new LoginDao();
        dao.alterar(login);
    }

    private void excluirUsuario() {
        LoginDao dao = new LoginDao();
        dao.excluirPorId(Integer.valueOf(jTFId.getText()));
    }
}