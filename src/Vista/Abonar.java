/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
 import Vista.AbonarCuotaSeleccionada;
 import Vista.AbonarMontoCuota;
 import Vista.MenuAccion;
/**
 *
 * @author mari_
 */
public class Abonar extends javax.swing.JFrame {

    /**
     * Creates new form Abonar
     */
    public Abonar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtrasMA = new javax.swing.JButton();
        btnCuotaSelec = new javax.swing.JButton();
        btnMonto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAtrasMA.setText("Atras");
        btnAtrasMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasMAActionPerformed(evt);
            }
        });

        btnCuotaSelec.setText("Seleccionar Cuotas");
        btnCuotaSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuotaSelecActionPerformed(evt);
            }
        });

        btnMonto.setText("Monto");
        btnMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAtrasMA)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCuotaSelec)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMonto)
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnCuotaSelec)
                .addGap(31, 31, 31)
                .addComponent(btnMonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnAtrasMA)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuotaSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuotaSelecActionPerformed
        AbonarCuotaSeleccionada ACS = new AbonarCuotaSeleccionada();
        ACS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCuotaSelecActionPerformed

    private void btnMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontoActionPerformed
        AbonarMontoCuota AMC = new AbonarMontoCuota();
        AMC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMontoActionPerformed

    private void btnAtrasMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasMAActionPerformed
       MenuAccion m= new MenuAccion();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasMAActionPerformed

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
            java.util.logging.Logger.getLogger(Abonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Abonar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasMA;
    private javax.swing.JButton btnCuotaSelec;
    private javax.swing.JButton btnMonto;
    // End of variables declaration//GEN-END:variables
}
