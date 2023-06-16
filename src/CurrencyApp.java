/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author drbx3
 */
public class CurrencyApp extends javax.swing.JFrame {

    /**
     * Creates new form CurrencyApp
     */
    public CurrencyApp() {
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

        jLabel1 = new javax.swing.JLabel();
        firstCurrencyField = new javax.swing.JTextField();
        secondCurrencyField = new javax.swing.JTextField();
        usdFirstButton = new javax.swing.JRadioButton();
        euroFirstButton = new javax.swing.JRadioButton();
        yenFirstButton = new javax.swing.JRadioButton();
        poundFirstButton = new javax.swing.JRadioButton();
        cadFirstButton = new javax.swing.JRadioButton();
        usdSecondButton = new javax.swing.JRadioButton();
        euroSecondButton = new javax.swing.JRadioButton();
        yenSecondButton = new javax.swing.JRadioButton();
        poundSecondButton = new javax.swing.JRadioButton();
        cadSecondButton = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(262, 280));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Currency Converter");

        firstCurrencyField.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        firstCurrencyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstCurrencyField.setText("0");
        firstCurrencyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCurrencyFieldActionPerformed(evt);
            }
        });

        secondCurrencyField.setEditable(false);
        secondCurrencyField.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        secondCurrencyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondCurrencyField.setText("0");
        secondCurrencyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondCurrencyFieldActionPerformed(evt);
            }
        });

        usdFirstButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        usdFirstButton.setText("American USD");
        usdFirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usdFirstButtonActionPerformed(evt);
            }
        });

        euroFirstButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        euroFirstButton.setText("Euro");
        euroFirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euroFirstButtonActionPerformed(evt);
            }
        });

        yenFirstButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        yenFirstButton.setText("Japanese Yen");
        yenFirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenFirstButtonActionPerformed(evt);
            }
        });

        poundFirstButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        poundFirstButton.setText("British Pound");
        poundFirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poundFirstButtonActionPerformed(evt);
            }
        });

        cadFirstButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        cadFirstButton.setText("Canadian CAD");
        cadFirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFirstButtonActionPerformed(evt);
            }
        });

        usdSecondButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        usdSecondButton.setText("American USD");
        usdSecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usdSecondButtonActionPerformed(evt);
            }
        });

        euroSecondButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        euroSecondButton.setText("Euro");
        euroSecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euroSecondButtonActionPerformed(evt);
            }
        });

        yenSecondButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        yenSecondButton.setText("Japanese Yen");
        yenSecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenSecondButtonActionPerformed(evt);
            }
        });

        poundSecondButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        poundSecondButton.setText("British Pound");
        poundSecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poundSecondButtonActionPerformed(evt);
            }
        });

        cadSecondButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        cadSecondButton.setText("Canadian CAD");
        cadSecondButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadSecondButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usdFirstButton)
                        .addComponent(euroFirstButton)
                        .addComponent(yenFirstButton)
                        .addComponent(poundFirstButton)
                        .addComponent(cadFirstButton))
                    .addComponent(firstCurrencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usdSecondButton)
                    .addComponent(euroSecondButton)
                    .addComponent(yenSecondButton)
                    .addComponent(poundSecondButton)
                    .addComponent(cadSecondButton)
                    .addComponent(secondCurrencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondCurrencyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstCurrencyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usdFirstButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(euroFirstButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yenFirstButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poundFirstButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadFirstButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usdSecondButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(euroSecondButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yenSecondButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poundSecondButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadSecondButton)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstCurrencyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCurrencyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCurrencyFieldActionPerformed

    private void secondCurrencyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondCurrencyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondCurrencyFieldActionPerformed

    private void usdFirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usdFirstButtonActionPerformed
        firstSignifier = 0;
    }//GEN-LAST:event_usdFirstButtonActionPerformed

    private void usdSecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usdSecondButtonActionPerformed
        secondSignifier = 0;
    }//GEN-LAST:event_usdSecondButtonActionPerformed

    private void euroFirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euroFirstButtonActionPerformed
        firstSignifier = 1;
    }//GEN-LAST:event_euroFirstButtonActionPerformed

    private void euroSecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euroSecondButtonActionPerformed
        secondSignifier = 1;
    }//GEN-LAST:event_euroSecondButtonActionPerformed

    private void yenFirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenFirstButtonActionPerformed
        firstSignifier = 2;
    }//GEN-LAST:event_yenFirstButtonActionPerformed

    private void yenSecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenSecondButtonActionPerformed
        secondSignifier = 2;
    }//GEN-LAST:event_yenSecondButtonActionPerformed

    private void poundFirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poundFirstButtonActionPerformed
        firstSignifier = 3;
    }//GEN-LAST:event_poundFirstButtonActionPerformed

    private void poundSecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poundSecondButtonActionPerformed
        secondSignifier = 3;
    }//GEN-LAST:event_poundSecondButtonActionPerformed

    private void cadFirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFirstButtonActionPerformed
        firstSignifier = 4;
    }//GEN-LAST:event_cadFirstButtonActionPerformed

    private void cadSecondButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadSecondButtonActionPerformed
        secondSignifier = 4;
    }//GEN-LAST:event_cadSecondButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        
    }//GEN-LAST:event_refreshButtonActionPerformed
    private void refresh() {
        WebScraper ws = new WebScraper();
    }
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
            java.util.logging.Logger.getLogger(CurrencyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyApp().setVisible(true);
            }
        });
    }
    public final int usdRate = 1; //its signifier is 0
    public int euroRate = 0;  //its signifier is 1
    public int yenRate = 0; //its signifier is 2
    public int poundRate = 0; //its signifier is 3
    public int cadRate = 0; //its signifier is 4
    public int firstSignifier = 0;
    public int secondSignifier = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cadFirstButton;
    private javax.swing.JRadioButton cadSecondButton;
    private javax.swing.JRadioButton euroFirstButton;
    private javax.swing.JRadioButton euroSecondButton;
    private javax.swing.JTextField firstCurrencyField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton poundFirstButton;
    private javax.swing.JRadioButton poundSecondButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField secondCurrencyField;
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton usdFirstButton;
    private javax.swing.JRadioButton usdSecondButton;
    private javax.swing.JRadioButton yenFirstButton;
    private javax.swing.JRadioButton yenSecondButton;
    // End of variables declaration//GEN-END:variables
}
