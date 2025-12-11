package Vista;
//@Autor Heber
import Base_de_Datos.*;
import Libreria.Cargar_Elementos;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

public class Catalogacion extends javax.swing.JFrame {

    public Catalogacion() {
        initComponents();
        buttonGroup1.add(Boton_libro_eleccion_);
        buttonGroup1.add(Boton_revista_eleccion_);
        buttonGroup1.add(Boton_tesis_eleccion_);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
//waos 1

    //En esta parte se crean tods lo componentes , solo editable desde el panel :v
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Button_atras_ = new javax.swing.JButton();
        titulo_agregar_text_ = new javax.swing.JLabel();
        autor_text_ = new javax.swing.JLabel();
        Titulo_text_ = new javax.swing.JLabel();
        año_text = new javax.swing.JLabel();
        Caja_titulo_ = new javax.swing.JTextField();
        Caja_Autor_ = new javax.swing.JTextField();
        Caja_año_ = new javax.swing.JTextField();
        categoria_text_ = new javax.swing.JLabel();
        Boton_libro_eleccion_ = new javax.swing.JRadioButton();
        Boton_revista_eleccion_ = new javax.swing.JRadioButton();
        Boton_tesis_eleccion_ = new javax.swing.JRadioButton();
        extra1_ = new javax.swing.JLabel();
        extra2_ = new javax.swing.JLabel();
        Caja_1_ = new javax.swing.JTextField();
        Caja_2_ = new javax.swing.JTextField();
        Boton_guardar_ = new javax.swing.JButton();
        Descripcion_text_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Caja_descripcion_ = new javax.swing.JTextArea();
        Id_text_ = new javax.swing.JLabel();
        Caja_id_ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button_atras_.setText("Atras");
        Button_atras_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_atras_ActionPerformed(evt);
            }
        });

        titulo_agregar_text_.setText("Titulo");

        autor_text_.setText("Autor");

        Titulo_text_.setText("Agregar un nuevo Libro");

        año_text.setText("Año");

        Caja_titulo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja_titulo_ActionPerformed(evt);
            }
        });

        categoria_text_.setText("Categoria");

        Boton_libro_eleccion_.setSelected(true);
        Boton_libro_eleccion_.setText("libro");
        Boton_libro_eleccion_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_libro_eleccion_ActionPerformed(evt);
            }
        });

        Boton_revista_eleccion_.setText("Revista");
        Boton_revista_eleccion_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_revista_eleccion_ActionPerformed(evt);
            }
        });

        Boton_tesis_eleccion_.setText("Tesis");
        Boton_tesis_eleccion_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_tesis_eleccion_ActionPerformed(evt);
            }
        });

        extra1_.setText("Formato");

        extra2_.setText("URL Descarga");

        Boton_guardar_.setText("Guardar");
        Boton_guardar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_guardar_ActionPerformed(evt);
            }
        });

        Descripcion_text_.setText("Descripcion");

        Caja_descripcion_.setColumns(20);
        Caja_descripcion_.setRows(5);
        jScrollPane1.setViewportView(Caja_descripcion_);

        Id_text_.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Button_atras_)
                .addGap(97, 97, 97)
                .addComponent(Titulo_text_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(extra1_)
                            .addComponent(extra2_)
                            .addComponent(titulo_agregar_text_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autor_text_)
                            .addComponent(año_text)
                            .addComponent(Id_text_))
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Caja_1_, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Caja_titulo_, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Caja_Autor_)
                            .addComponent(Caja_año_)
                            .addComponent(Caja_2_)
                            .addComponent(Caja_id_, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoria_text_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_libro_eleccion_)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Boton_guardar_, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Boton_revista_eleccion_, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(Boton_tesis_eleccion_, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Descripcion_text_)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_atras_)
                    .addComponent(Titulo_text_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria_text_)
                    .addComponent(Boton_libro_eleccion_)
                    .addComponent(Boton_revista_eleccion_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_tesis_eleccion_))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Descripcion_text_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Id_text_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(titulo_agregar_text_, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Caja_id_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Caja_titulo_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Caja_Autor_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autor_text_))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Caja_año_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(año_text))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Boton_guardar_, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Caja_1_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extra1_))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Caja_2_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extra2_))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//waos 1

    private void Boton_libro_eleccion_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_libro_eleccion_ActionPerformed
        // TODO add your handling code here:
        extra1_.setText("Formato");
        extra2_.setText("Url de descarga");
    }//GEN-LAST:event_Boton_libro_eleccion_ActionPerformed

    private void Boton_revista_eleccion_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_revista_eleccion_ActionPerformed
        extra1_.setText("Categoria");
        extra2_.setText("Editor");
    }//GEN-LAST:event_Boton_revista_eleccion_ActionPerformed

    private void Boton_tesis_eleccion_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_tesis_eleccion_ActionPerformed
        extra1_.setText("Universidad");
        extra2_.setText("Asesor");
    }//GEN-LAST:event_Boton_tesis_eleccion_ActionPerformed

    private void Button_atras_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_atras_ActionPerformed
        Menu_Principal nuevo = new Menu_Principal();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_atras_ActionPerformed

    private void Caja_titulo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja_titulo_ActionPerformed
        //al presinar enter q relize una accion :v
        String texto = Caja_titulo_.getText();
        if (texto.equals("xd")) {
            JOptionPane.showMessageDialog(null, "no valido");
        }
    }//GEN-LAST:event_Caja_titulo_ActionPerformed

    private void Boton_guardar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_guardar_ActionPerformed

        // Validar que los campos no estén vacíos
        if (Caja_id_.getText().trim().isEmpty()
                || Caja_titulo_.getText().trim().isEmpty()
                || Caja_Autor_.getText().trim().isEmpty()
                || Caja_descripcion_.getText().trim().isEmpty()
                || Caja_año_.getText().trim().isEmpty()
                || Caja_1_.getText().trim().isEmpty()
                || Caja_2_.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, completa todos los campos.",
                    "Campos vacíos",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Validar selección de clasificación
        Enumeration<AbstractButton> botones = buttonGroup1.getElements();
        String Clasificacion = "";
        while (botones.hasMoreElements()) {
            AbstractButton boton = botones.nextElement();
            if (boton.isSelected()) {
                Clasificacion = boton.getText();
                break;
            }
        }

        if (Clasificacion.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar una clasificación.",
                    "Clasificación requerida",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Validar que el año sea entero
        int numeroAño;
        try {
            numeroAño = Integer.parseInt(Caja_año_.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "El año debe ser un número entero.",
                    "Año inválido",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Tomar datos
        String ids = Caja_id_.getText();
        String Titulo = Caja_titulo_.getText();
        String Autor = Caja_Autor_.getText();
        String Descripcion = Caja_descripcion_.getText();
        String waos1 = Caja_1_.getText();
        String waos2 = Caja_2_.getText();

        // Validar ID existente en ArrayList
        if (Cargar_Elementos.existeId(ids)) {
            JOptionPane.showMessageDialog(null, "El ID ya existe, ¡cámbialo!");
            return;
        }

        // Crear en ArrayList interno
        Cargar_Elementos.crearMaterial(
                Clasificacion,
                ids,
                Titulo,
                Descripcion,
                Autor,
                Caja_año_.getText(),
                waos1,
                waos2,
                true
        );

        // Guardar en base de datos
        Funciones_BD dao = new Funciones_BD();

        String r = dao.insertarMaterial(
                ids,
                Titulo,
                Autor,
                Descripcion,
                numeroAño,
                waos1,
                waos2,
                Clasificacion,
                "Disponible"
        );

        JOptionPane.showMessageDialog(null, r);
        Funciones_BD actus = new Funciones_BD();
        actus.actu();
    }//GEN-LAST:event_Boton_guardar_ActionPerformed

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
            java.util.logging.Logger.getLogger(Catalogacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_guardar_;
    private javax.swing.JRadioButton Boton_libro_eleccion_;
    private javax.swing.JRadioButton Boton_revista_eleccion_;
    private javax.swing.JRadioButton Boton_tesis_eleccion_;
    private javax.swing.JButton Button_atras_;
    private javax.swing.JTextField Caja_1_;
    private javax.swing.JTextField Caja_2_;
    private javax.swing.JTextField Caja_Autor_;
    private javax.swing.JTextField Caja_año_;
    private javax.swing.JTextArea Caja_descripcion_;
    private javax.swing.JTextField Caja_id_;
    private javax.swing.JTextField Caja_titulo_;
    private javax.swing.JLabel Descripcion_text_;
    private javax.swing.JLabel Id_text_;
    private javax.swing.JLabel Titulo_text_;
    private javax.swing.JLabel autor_text_;
    private javax.swing.JLabel año_text;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel categoria_text_;
    private javax.swing.JLabel extra1_;
    private javax.swing.JLabel extra2_;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulo_agregar_text_;
    // End of variables declaration//GEN-END:variables
}
