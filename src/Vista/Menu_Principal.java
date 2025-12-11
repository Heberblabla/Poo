package Vista;
//@Autor Heber
import Base_de_Datos.Funciones_BD;
import static Base_de_Datos.Funciones_BD.cargarPrestamosDesdeBD;
import Base_de_datos.*;

public class Menu_Principal extends javax.swing.JFrame {

    public static String ides = "";

    public Menu_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Funciones_BD dao = new Funciones_BD();
        String xd = dao.cargarMaterialesDesdeBD();
        String xd2 = dao.cargarPrestamosDesdeBD();
        String xd3 = dao.cargarUsuariosDesdeBD();
        System.out.println(xd);
        System.out.println(xd2);
        System.out.println(xd3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busqueda_button_ = new javax.swing.JButton();
        Prestamos_button_ = new javax.swing.JButton();
        Catalogacion_button_ = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Busqueda_button_.setText("Entrar");
        Busqueda_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda_button_ActionPerformed(evt);
            }
        });

        Prestamos_button_.setText("Entrar");
        Prestamos_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prestamos_button_ActionPerformed(evt);
            }
        });

        Catalogacion_button_.setText("Entrar");
        Catalogacion_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Catalogacion_button_ActionPerformed(evt);
            }
        });

        label1.setText("Catalogación");

        label2.setText("Gestion de Prestamos");

        label3.setText("Busqueda y Clasificacion");

        jLabel1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel1.setText("Biblioteca Mayor de Arequipa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Catalogacion_button_, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(Prestamos_button_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Busqueda_button_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Catalogacion_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Prestamos_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Busqueda_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void Busqueda_button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busqueda_button_ActionPerformed
        Busqueda_y_Clasficacion nuevo = new Busqueda_y_Clasficacion();
        nuevo.setVisible(true);
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_Busqueda_button_ActionPerformed

    private void Prestamos_button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prestamos_button_ActionPerformed
        Eleccion_Prestar_o_recivir nuevo = new Eleccion_Prestar_o_recivir();
        nuevo.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_Prestamos_button_ActionPerformed

    private void Catalogacion_button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Catalogacion_button_ActionPerformed
        Catalogacion nuevo = new Catalogacion();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Catalogacion_button_ActionPerformed

    public static void main(String args[]) {

        Funciones_BD dao = new Funciones_BD();
        String xd = dao.cargarMaterialesDesdeBD();
        String xd2 = dao.cargarPrestamosDesdeBD();
        String xd3 = dao.cargarUsuariosDesdeBD();
        System.out.println(xd);
        System.out.println(xd2);
        System.out.println(xd3);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busqueda_button_;
    private javax.swing.JButton Catalogacion_button_;
    private javax.swing.JButton Prestamos_button_;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
