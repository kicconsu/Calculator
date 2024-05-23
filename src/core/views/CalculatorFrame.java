package core.views;

import core.controllers.*;
import core.controllers.utils.Response;

import javax.swing.JOptionPane;

public class CalculatorFrame extends javax.swing.JFrame {

    public CalculatorFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        bSubstract = new javax.swing.JButton();
        bMult = new javax.swing.JButton();
        bDivide = new javax.swing.JButton();
        bPotency = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bHistory = new javax.swing.JButton();
        fn1 = new javax.swing.JTextField();
        fn2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aDisplay = new javax.swing.JList<>();
        fresult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Calculator");

        bAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bSubstract.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSubstract.setText("Subtract");
        bSubstract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubstractActionPerformed(evt);
            }
        });

        bMult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bMult.setText("Multiply");
        bMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultActionPerformed(evt);
            }
        });

        bDivide.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bDivide.setText("Divide");
        bDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivideActionPerformed(evt);
            }
        });

        bPotency.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bPotency.setText("Potency");
        bPotency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPotencyActionPerformed(evt);
            }
        });

        bClear.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bClear.setText("Clear numbers");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        bHistory.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bHistory.setText("Update history");
        bHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHistoryActionPerformed(evt);
            }
        });

        fn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fn2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Number 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Number 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Result");

        aDisplay.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        aDisplay.setEnabled(false);
        jScrollPane1.setViewportView(aDisplay);

        fresult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fresult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fresult.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fn1)
                            .addComponent(fn2)
                            .addComponent(fresult, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bPotency, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bMult, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(bAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bSubstract, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(bDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHistory))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAdd)
                            .addComponent(bSubstract))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bDivide)
                            .addComponent(bMult))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPotency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bClear))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        
        //Get input data
        String number1 = fn1.getText();
        String number2 = fn2.getText();
        
        //Invoke controller, get response
        Response res = AddController.operate(number1, number2);
        
        //Display response!
        if (res.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Error " + res.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (res.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Error " + res.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            
            fn1.setText("");
            fn2.setText("");
            fresult.setText(res.getResult());
            
        }
        
    }//GEN-LAST:event_bAddActionPerformed

    private void bSubstractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubstractActionPerformed
        //Get input data
        String number1 = fn1.getText();
        String number2 = fn2.getText();
        
        //Invoke controller, get response
        Response res = SubstractController.operate(number1, number2);
        
        //Display response!
        if (res.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Error " + res.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (res.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Error " + res.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            
            fn1.setText("");
            fn2.setText("");
            fresult.setText(res.getResult());
            
        }
    }//GEN-LAST:event_bSubstractActionPerformed

    private void bMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultActionPerformed
        //Get input data
        String number1 = fn1.getText();
        String number2 = fn2.getText();
        
        //Invoke controller, get response
        Response res = MultiplyController.operate(number1, number2);
        
        //Display response!
        if (res.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Error " + res.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (res.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Error " + res.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            
            fn1.setText("");
            fn2.setText("");
            fresult.setText(res.getResult());
            
        }
    }//GEN-LAST:event_bMultActionPerformed

    private void bDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivideActionPerformed
        //Get input data
        String number1 = fn1.getText();
        String number2 = fn2.getText();
        
        //Invoke controller, get response
        Response res = DivideController.operate(number1, number2);
        
        //Display response!
        if (res.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Error " + res.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (res.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Error " + res.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, res.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            
            fn1.setText("");
            fn2.setText("");
            fresult.setText(res.getResult());
            
        }
    }//GEN-LAST:event_bDivideActionPerformed

    private void bPotencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPotencyActionPerformed
        JOptionPane.showMessageDialog(null, "Not Implemented", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bPotencyActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        fn1.setText("");
        fn2.setText("");
        fresult.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void bHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHistoryActionPerformed
        //Invoke controller, get response
        Response history = HistoryController.getHistory();
        
        //Display response!
        if (history.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, history.getMessage(), "Error " + history.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (history.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, history.getMessage(), "Error " + history.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {

            fresult.setText(history.getHistoryList());
            
        }
        
    }//GEN-LAST:event_bHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> aDisplay;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDivide;
    private javax.swing.JButton bHistory;
    private javax.swing.JButton bMult;
    private javax.swing.JButton bPotency;
    private javax.swing.JButton bSubstract;
    private javax.swing.JTextField fn1;
    private javax.swing.JTextField fn2;
    private javax.swing.JTextField fresult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
