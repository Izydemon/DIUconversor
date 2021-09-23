/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.lang.Math;

/**
 *
 * @author izyde
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
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

        Currencies = new javax.swing.ButtonGroup();
        Money = new javax.swing.JTextField();
        Result = new javax.swing.JTextField();
        Equivalence = new javax.swing.JTextField();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        Texto4 = new javax.swing.JLabel();
        Euro = new javax.swing.JRadioButton();
        Dollar = new javax.swing.JRadioButton();
        EquivalenceErrorMessage = new javax.swing.JLabel();
        MoneyErrorMessage = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        Info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Money.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MoneyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MoneyKeyTyped(evt);
            }
        });

        Result.setEditable(false);

        Equivalence.setText("1.17");
        Equivalence.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EquivalenceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EquivalenceKeyTyped(evt);
            }
        });

        Texto1.setText("Cantidad");

        Texto2.setText("Resultado");

        Texto3.setText("1€ equivale a:");

        Texto4.setText("$");

        Currencies.add(Euro);
        Euro.setSelected(true);
        Euro.setText(" €");
        Euro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EuroActionPerformed(evt);
            }
        });

        Currencies.add(Dollar);
        Dollar.setText("$");
        Dollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DollarActionPerformed(evt);
            }
        });

        EquivalenceErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        MoneyErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        Info.setText("Desarrollado por: Noah Hernández Morales e Isidro Bermúdez Fernández");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EquivalenceErrorMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Equivalence, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(Money, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoneyErrorMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Euro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dollar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Texto4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(Info)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Texto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Equivalence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EquivalenceErrorMessage)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto1)
                    .addComponent(Texto2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Euro)
                        .addComponent(Dollar))
                    .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoneyErrorMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(Info)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DollarActionPerformed
        ChangeMoney();
    }//GEN-LAST:event_DollarActionPerformed

    private void EuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EuroActionPerformed
        ChangeMoney();
    }//GEN-LAST:event_EuroActionPerformed

    private void MoneyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MoneyKeyReleased
        Input(evt);
    }//GEN-LAST:event_MoneyKeyReleased

    private void EquivalenceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EquivalenceKeyReleased
        Input(evt);
    }//GEN-LAST:event_EquivalenceKeyReleased

    double realEquivalence = 1.17;
    
    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        Equivalence.setText(String.valueOf(realEquivalence));
        ChangeMoney();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void EquivalenceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EquivalenceKeyTyped
        Input(evt);
    }//GEN-LAST:event_EquivalenceKeyTyped

    private void MoneyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MoneyKeyTyped
        Input(evt);
    }//GEN-LAST:event_MoneyKeyTyped

    private void Input(java.awt.event.KeyEvent evt){
        CheckInput(evt);
        ChangeMoney();
    }
    
    private boolean CheckInput(java.awt.event.KeyEvent evt){
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter) || enter == '.')){
            evt.consume();
            return false;
        }
        return true;
    }
    
    private void ChangeMoney() {
        if(CheckEquivalence() && CheckMoney()){
            double amount = Double.parseDouble(Money.getText());
            double equivalence = Double.parseDouble(Equivalence.getText());
            if(Euro.isSelected()){
                double value = RoundToTwoDecimals(amount * equivalence);
                Result.setText(String.valueOf(value));
            } else {
                double value = RoundToTwoDecimals(amount / equivalence);
                Result.setText(String.valueOf(value));
            }
        }
    }
    
    private double RoundToTwoDecimals(double value){
        return Math.round(value * Math.pow(10, 2)) / Math.pow(10, 2);
    }
    
    private boolean CheckEquivalence(){
        if(!Equivalence.getText().isBlank()){
            EquivalenceErrorMessage.setText("");
            return true;
        } else{
            EquivalenceErrorMessage.setText("Introduce un número valido");
            return false;
        }
    }
    
    private boolean CheckMoney(){
        if(!Money.getText().isBlank()){
            MoneyErrorMessage.setText("");
            return true;
        } else{
            MoneyErrorMessage.setText("Introduce un número valido");
            return false;
        }
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Currencies;
    private javax.swing.JRadioButton Dollar;
    private javax.swing.JTextField Equivalence;
    private javax.swing.JLabel EquivalenceErrorMessage;
    private javax.swing.JRadioButton Euro;
    private javax.swing.JLabel Info;
    private javax.swing.JTextField Money;
    private javax.swing.JLabel MoneyErrorMessage;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTextField Result;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Texto4;
    // End of variables declaration//GEN-END:variables


}
