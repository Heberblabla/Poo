package Vista;
//@Autor Heber
public class Eleccion_Prestar_o_recivir extends javax.swing.JFrame {


    public Eleccion_Prestar_o_recivir() {
        initComponents();
        setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_realizar_ = new javax.swing.JButton();
        boton_devolucion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boton_atras_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_realizar_.setText("Realizar Prestamo");
        boton_realizar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_realizar_ActionPerformed(evt);
            }
        });

        boton_devolucion.setText("Registrar devolución");
        boton_devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_devolucionActionPerformed(evt);
            }
        });

        jLabel1.setText("Q desea Hacer?");

        boton_atras_.setText("Atras");
        boton_atras_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atras_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton_atras_))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_realizar_, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_atras_)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(boton_realizar_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(boton_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_realizar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_realizar_ActionPerformed
        Gestion_de_Prestamos nuevo = new Gestion_de_Prestamos();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_realizar_ActionPerformed

    private void boton_devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_devolucionActionPerformed
        Gestion_de_Devolucion nuevo = new Gestion_de_Devolucion();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_devolucionActionPerformed

    private void boton_atras_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atras_ActionPerformed
        Menu_Principal nuevo = new Menu_Principal();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_atras_ActionPerformed

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
            java.util.logging.Logger.getLogger(Eleccion_Prestar_o_recivir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eleccion_Prestar_o_recivir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eleccion_Prestar_o_recivir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eleccion_Prestar_o_recivir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eleccion_Prestar_o_recivir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_atras_;
    private javax.swing.JButton boton_devolucion;
    private javax.swing.JButton boton_realizar_;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
