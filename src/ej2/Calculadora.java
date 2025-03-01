/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Lourdes
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        CalculadoraDialog = new javax.swing.JDialog();
        panelRes = new javax.swing.JPanel();
        fieldResultado = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        btnPorc = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnInv = new javax.swing.JButton();
        btnCuadr = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnSig = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDec = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        CalculadoraDialog.setMinimumSize(new java.awt.Dimension(300, 300));

        fieldResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldResultado.setText("0");

        javax.swing.GroupLayout panelResLayout = new javax.swing.GroupLayout(panelRes);
        panelRes.setLayout(panelResLayout);
        panelResLayout.setHorizontalGroup(
            panelResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fieldResultado)
        );
        panelResLayout.setVerticalGroup(
            panelResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fieldResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        panelBotones.setLayout(new java.awt.GridLayout(6, 4));

        btnPorc.setText("%");
        panelBotones.add(btnPorc);

        btnCE.setForeground(java.awt.Color.blue);
        btnCE.setText("CE");
        panelBotones.add(btnCE);

        btnC.setForeground(java.awt.Color.blue);
        btnC.setText("C");
        panelBotones.add(btnC);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej2/images/backspace.png"))); // NOI18N
        panelBotones.add(btnBack);

        btnInv.setText("1/x");
        panelBotones.add(btnInv);

        btnCuadr.setText("x²");
        panelBotones.add(btnCuadr);

        btnRaiz.setText("√x");
        panelBotones.add(btnRaiz);

        btnDiv.setForeground(java.awt.Color.blue);
        btnDiv.setText("÷");
        panelBotones.add(btnDiv);

        btn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelBotones.add(btn7);

        btn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn8.setText("8");
        panelBotones.add(btn8);

        btn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn9.setText("9");
        panelBotones.add(btn9);

        btnMult.setForeground(java.awt.Color.blue);
        btnMult.setText("x");
        panelBotones.add(btnMult);

        btn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn4.setText("4");
        panelBotones.add(btn4);

        btn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn5.setText("5");
        panelBotones.add(btn5);

        btn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn6.setText("6");
        panelBotones.add(btn6);

        btnRest.setForeground(java.awt.Color.blue);
        btnRest.setText("-");
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });
        panelBotones.add(btnRest);

        btn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn1.setText("1");
        panelBotones.add(btn1);

        btn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn2.setText("2");
        panelBotones.add(btn2);

        btn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn3.setText("3");
        panelBotones.add(btn3);

        btnSum.setForeground(java.awt.Color.blue);
        btnSum.setText("+");
        panelBotones.add(btnSum);

        btnSig.setText("+/-");
        panelBotones.add(btnSig);

        btn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn0.setText("0");
        panelBotones.add(btn0);

        btnDec.setText(",");
        panelBotones.add(btnDec);

        btnIgual.setForeground(java.awt.Color.blue);
        btnIgual.setText("=");
        panelBotones.add(btnIgual);

        javax.swing.GroupLayout CalculadoraDialogLayout = new javax.swing.GroupLayout(CalculadoraDialog.getContentPane());
        CalculadoraDialog.getContentPane().setLayout(CalculadoraDialogLayout);
        CalculadoraDialogLayout.setHorizontalGroup(
            CalculadoraDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        CalculadoraDialogLayout.setVerticalGroup(
            CalculadoraDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraDialogLayout.createSequentialGroup()
                .addComponent(panelRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        CalculadoraDialog.setModal(true);
        CalculadoraDialog.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog CalculadoraDialog;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCuadr;
    private javax.swing.JButton btnDec;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnInv;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPorc;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnSig;
    private javax.swing.JButton btnSum;
    private javax.swing.JTextField fieldResultado;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelRes;
    // End of variables declaration//GEN-END:variables
}
