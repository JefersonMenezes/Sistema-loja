/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author takedown
 */
public class JFCalc extends javax.swing.JFrame {

    
    char operacao;
    String temp, numAntes;
    double num1, num2, resultado;
    
    
    /**
     * Creates new form JFCalc
     */
    public JFCalc() {
        initComponents();
        setCor(100, 100, 100);
    }
    
    private void setCor(int  vermelho, int verde, int azul) {
        Color minhaCor = new Color(vermelho,verde,azul);
        getContentPane().setBackground(minhaCor);
    }
    
    
      private void numeroDigitado(String numero) {
        temp = JTextVisor.getText();
        numAntes = temp;
        temp = temp + numero;
        JTextVisor.setText(temp);
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        JTextVisor = new javax.swing.JTextField();
        jBEsp = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jBPonto = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jBCe = new javax.swing.JButton();
        jBClr = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jBIgual = new javax.swing.JButton();
        jBMaisMenos = new javax.swing.JButton();
        jBDivisao = new javax.swing.JButton();
        jBMultiplicacao = new javax.swing.JButton();
        jBSubtracao = new javax.swing.JButton();
        jBSoma = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        JTextVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextVisorActionPerformed(evt);
            }
        });

        jBEsp.setBackground(new java.awt.Color(153, 153, 153));
        jBEsp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBEsp.setText("Esp");
        jBEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEspActionPerformed(evt);
            }
        });

        jB7.setBackground(new java.awt.Color(153, 153, 153));
        jB7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB4.setBackground(new java.awt.Color(153, 153, 153));
        jB4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB1.setBackground(new java.awt.Color(153, 153, 153));
        jB1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB0.setBackground(new java.awt.Color(153, 153, 153));
        jB0.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB0.setMnemonic(java.awt.event.KeyEvent.VK_0);
        jB0.setText("0");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jB0, org.jdesktop.beansbinding.ELProperty.create("0"), jB0, org.jdesktop.beansbinding.BeanProperty.create("mnemonic"));
        bindingGroup.addBinding(binding);

        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jBPonto.setBackground(new java.awt.Color(153, 153, 153));
        jBPonto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBPonto.setText(".");
        jBPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPontoActionPerformed(evt);
            }
        });

        jB2.setBackground(new java.awt.Color(153, 153, 153));
        jB2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB5.setBackground(new java.awt.Color(153, 153, 153));
        jB5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB8.setBackground(new java.awt.Color(153, 153, 153));
        jB8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jBCe.setBackground(new java.awt.Color(153, 153, 153));
        jBCe.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBCe.setText("Ce");
        jBCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCeActionPerformed(evt);
            }
        });

        jBClr.setBackground(new java.awt.Color(153, 153, 153));
        jBClr.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBClr.setText("Clr");
        jBClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClrActionPerformed(evt);
            }
        });

        jB9.setBackground(new java.awt.Color(153, 153, 153));
        jB9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB6.setBackground(new java.awt.Color(153, 153, 153));
        jB6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB3.setBackground(new java.awt.Color(153, 153, 153));
        jB3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jBIgual.setBackground(new java.awt.Color(153, 153, 153));
        jBIgual.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBIgual.setText("=");
        jBIgual.setToolTipText("Mostra Resultado");
        jBIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIgualActionPerformed(evt);
            }
        });

        jBMaisMenos.setBackground(new java.awt.Color(153, 153, 153));
        jBMaisMenos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBMaisMenos.setText("-+");
        jBMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMaisMenosActionPerformed(evt);
            }
        });

        jBDivisao.setBackground(new java.awt.Color(153, 153, 153));
        jBDivisao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBDivisao.setText("/");
        jBDivisao.setToolTipText("Divisão");
        jBDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDivisaoActionPerformed(evt);
            }
        });

        jBMultiplicacao.setBackground(new java.awt.Color(153, 153, 153));
        jBMultiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBMultiplicacao.setText("*");
        jBMultiplicacao.setToolTipText("Multiplicação");
        jBMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicacaoActionPerformed(evt);
            }
        });

        jBSubtracao.setBackground(new java.awt.Color(153, 153, 153));
        jBSubtracao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBSubtracao.setText("-");
        jBSubtracao.setToolTipText("Subtração");
        jBSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubtracaoActionPerformed(evt);
            }
        });

        jBSoma.setBackground(new java.awt.Color(153, 153, 153));
        jBSoma.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBSoma.setMnemonic(java.awt.event.KeyEvent.VK_PLUS);
        jBSoma.setText("+");
        jBSoma.setToolTipText("Soma");
        jBSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTextVisor)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBClr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jB0, jB1, jB2, jB3, jB4, jB5, jB6, jB7, jB8, jB9, jBCe, jBClr, jBDivisao, jBEsp, jBIgual, jBMaisMenos, jBMultiplicacao, jBPonto, jBSoma, jBSubtracao});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JTextVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBCe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBClr)
                        .addComponent(jBMaisMenos))
                    .addComponent(jBEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB8)
                    .addComponent(jB9)
                    .addComponent(jBDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB5)
                    .addComponent(jB6)
                    .addComponent(jBMultiplicacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB2)
                    .addComponent(jB3)
                    .addComponent(jBSubtracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPonto)
                    .addComponent(jBIgual)
                    .addComponent(jBSoma))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jB0, jB1, jB2, jB3, jB4, jB5, jB6, jB7, jB8, jB9, jBCe, jBClr, jBDivisao, jBEsp, jBIgual, jBMaisMenos, jBMultiplicacao, jBPonto, jBSoma, jBSubtracao});

        jB0.getAccessibleContext().setAccessibleDescription("0");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 242, 252);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(169, 11, 68, 25);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(269, 343));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
  numeroDigitado("9");        // TODO add your handling code here:
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
  numeroDigitado("6");        // TODO add your handling code here:
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
  numeroDigitado("3");        // TODO add your handling code here:
    }//GEN-LAST:event_jB3ActionPerformed

    private void jBIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIgualActionPerformed
        num2 =Double.parseDouble(JTextVisor.getText());
        
        switch(operacao){
            case'+':
                resultado = num1 + num2;
                break;
            case'-':
                resultado = num1 - num2;
                break;
            case'*':
                resultado = num1 * num2;
                break;
            case'/':
                resultado = num1 / num2;
                break;
        }
        JTextVisor.setText(String.valueOf(resultado));
        
    }//GEN-LAST:event_jBIgualActionPerformed

    private void jBMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMaisMenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBMaisMenosActionPerformed

    private void jBDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDivisaoActionPerformed
          escolheOperacao('/');
    }//GEN-LAST:event_jBDivisaoActionPerformed

    private void jBMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultiplicacaoActionPerformed
        escolheOperacao('*');
    }//GEN-LAST:event_jBMultiplicacaoActionPerformed

    private void jBSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubtracaoActionPerformed
        escolheOperacao('-');
    }//GEN-LAST:event_jBSubtracaoActionPerformed

    private void jBSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaActionPerformed
        escolheOperacao('+');
    }

    private void escolheOperacao(char op) throws NumberFormatException {
        operacao = op;
        num1 = Double.parseDouble(JTextVisor.getText());
        JTextVisor.setText("");
    }//GEN-LAST:event_jBSomaActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        numeroDigitado("0");
    
    }//GEN-LAST:event_jB0ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        numeroDigitado("1");
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
  numeroDigitado("5");        // TODO add your handling code here:
    }//GEN-LAST:event_jB5ActionPerformed

    private void jBEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEspActionPerformed
        temp = numAntes;
        JTextVisor.setText(temp);
    }//GEN-LAST:event_jBEspActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
  numeroDigitado("2");        
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
  numeroDigitado("4");        // TODO add your handling code here:
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
  numeroDigitado("7");        // TODO add your handling code here:
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
  numeroDigitado("8");        // TODO add your handling code here:
    }//GEN-LAST:event_jB8ActionPerformed

    private void jBPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPontoActionPerformed
  numeroDigitado(".");        // TODO add your handling code here:
    }//GEN-LAST:event_jBPontoActionPerformed

    private void JTextVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextVisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextVisorActionPerformed

    private void jBCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCeActionPerformed
        num2 = 0;
        JTextVisor.setText(String.valueOf(num1));
    }//GEN-LAST:event_jBCeActionPerformed

    private void jBClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClrActionPerformed
        num1 = 0;
        num2 = 0;
        JTextVisor.setText("");
    }//GEN-LAST:event_jBClrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextVisor;
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBCe;
    private javax.swing.JButton jBClr;
    private javax.swing.JButton jBDivisao;
    private javax.swing.JButton jBEsp;
    private javax.swing.JButton jBIgual;
    private javax.swing.JButton jBMaisMenos;
    private javax.swing.JButton jBMultiplicacao;
    private javax.swing.JButton jBPonto;
    private javax.swing.JButton jBSoma;
    private javax.swing.JButton jBSubtracao;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}