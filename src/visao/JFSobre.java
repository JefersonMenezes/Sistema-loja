/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author takedown
 */
public class JFSobre extends javax.swing.JFrame {

    
    String texto1 = "O sistema auxilia a um pequeno comerciante\n"
            + " a ter um maior controle de seus produtos e clientes\n"
            + "facilitando no acesso das informações de seus\n"
            + "produtos e clientes controle de estoque, quantidade,\n"
            + "separação por categorias e acesso a custo e faturamento.";
    /**
     * Creates new form JFSobre
     */
    public JFSobre() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(58, 26, 109));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 410, 140, 40);

        jToggleButton1.setBackground(new java.awt.Color(201, 21, 45));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/youtube.png"))); // NOI18N
        jToggleButton1.setPreferredSize(new java.awt.Dimension(97, 93));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(80, 410, 50, 50);

        jToggleButton2.setBackground(new java.awt.Color(4, 21, 72));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/facebook.png"))); // NOI18N
        jToggleButton2.setMaximumSize(new java.awt.Dimension(81, 57));
        jToggleButton2.setMinimumSize(new java.awt.Dimension(81, 57));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(20, 410, 50, 50);

        jLTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobre.jpg"))); // NOI18N
        getContentPane().add(jLTexto);
        jLTexto.setBounds(0, 0, 530, 480);

        setSize(new java.awt.Dimension(547, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();      
        requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
            Desktop desk = java.awt.Desktop.getDesktop();   
    try {  
        desk.browse(new java.net.URI("https://www.youtube.com/user/SuperLionjuda"));  
    } catch (IOException e) {  
                    e.printStackTrace();  
    } catch (URISyntaxException e) {  
        e.printStackTrace();  
    }  
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        Desktop desk = java.awt.Desktop.getDesktop();   
    try {  
        desk.browse(new java.net.URI("https://www.facebook.com/jeferson.menezes.779"));  
    } catch (IOException e) {  
                    e.printStackTrace();  
    } catch (URISyntaxException e) {  
        e.printStackTrace();  
    }          // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLTexto;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
