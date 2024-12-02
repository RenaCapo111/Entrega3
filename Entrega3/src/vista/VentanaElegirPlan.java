/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Endpoints;
import javax.swing.JOptionPane;
import modelo.Rutina;

/**
 *
 * @author maxim
 */
public class VentanaElegirPlan extends javax.swing.JFrame {

    /**
     * Creates new form VentanaElegirPlan
     */
    public VentanaElegirPlan() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtEntrenador1 = new javax.swing.JLabel();
        btnSeleccionarEntrenador1 = new javax.swing.JButton();
        txtEntrenador2 = new javax.swing.JLabel();
        btnSeleccionarEntrenador2 = new javax.swing.JButton();
        txtEntrenador3 = new javax.swing.JLabel();
        btnSeleccionarEntrenador3 = new javax.swing.JButton();
        btnHacerRutinaPropia = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSalirElegirPlan = new javax.swing.JButton();
        txtRutinaSencilla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRutina = new javax.swing.JTextArea();
        txtRutinaMedia = new javax.swing.JLabel();
        txtRutinaAvanzada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 153));
        jPanel2.setForeground(new java.awt.Color(0, 255, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 720));

        txtEntrenador1.setText("Entrenador Renato");

        btnSeleccionarEntrenador1.setBackground(new java.awt.Color(0, 0, 0));
        btnSeleccionarEntrenador1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSeleccionarEntrenador1.setForeground(new java.awt.Color(51, 255, 153));
        btnSeleccionarEntrenador1.setText("Seleccionar");
        btnSeleccionarEntrenador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEntrenador1ActionPerformed(evt);
            }
        });

        txtEntrenador2.setText("Entrenador Martin");

        btnSeleccionarEntrenador2.setBackground(new java.awt.Color(0, 0, 0));
        btnSeleccionarEntrenador2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSeleccionarEntrenador2.setForeground(new java.awt.Color(51, 255, 153));
        btnSeleccionarEntrenador2.setText("Seleccionar");
        btnSeleccionarEntrenador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEntrenador2ActionPerformed(evt);
            }
        });

        txtEntrenador3.setText("Entrenador Felipe");

        btnSeleccionarEntrenador3.setBackground(new java.awt.Color(0, 0, 0));
        btnSeleccionarEntrenador3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSeleccionarEntrenador3.setForeground(new java.awt.Color(51, 255, 153));
        btnSeleccionarEntrenador3.setText("Seleccionar");
        btnSeleccionarEntrenador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEntrenador3ActionPerformed(evt);
            }
        });

        btnHacerRutinaPropia.setBackground(new java.awt.Color(0, 0, 0));
        btnHacerRutinaPropia.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnHacerRutinaPropia.setForeground(new java.awt.Color(51, 255, 153));
        btnHacerRutinaPropia.setText("Hacer Rutina Propia");
        btnHacerRutinaPropia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerRutinaPropiaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnSalirElegirPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoVolver.png"))); // NOI18N
        btnSalirElegirPlan.setBorder(null);
        btnSalirElegirPlan.setContentAreaFilled(false);
        btnSalirElegirPlan.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSalirElegirPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirElegirPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnSalirElegirPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnSalirElegirPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        txtRutinaSencilla.setText("Rutina Sencilla");

        txtRutina.setColumns(20);
        txtRutina.setRows(5);
        txtRutina.setText("-3\n-2\n-3");
        jScrollPane1.setViewportView(txtRutina);

        txtRutinaMedia.setText("Rutina media");

        txtRutinaAvanzada.setText("Rutina Avanzada");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHacerRutinaPropia)
                        .addGap(159, 159, 159))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEntrenador1)
                            .addComponent(txtRutinaSencilla))
                        .addGap(229, 229, 229)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeleccionarEntrenador2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEntrenador2)
                                    .addComponent(txtRutinaMedia))
                                .addGap(199, 199, 199)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRutinaAvanzada)
                                    .addComponent(txtEntrenador3))))
                        .addGap(0, 478, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSeleccionarEntrenador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeleccionarEntrenador3)
                        .addGap(454, 454, 454))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntrenador1)
                    .addComponent(txtEntrenador2)
                    .addComponent(txtEntrenador3))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRutinaSencilla)
                    .addComponent(txtRutinaMedia)
                    .addComponent(txtRutinaAvanzada))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnHacerRutinaPropia)
                        .addGap(141, 141, 141))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionarEntrenador3)
                    .addComponent(btnSeleccionarEntrenador2)
                    .addComponent(btnSeleccionarEntrenador1))
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 1180, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirElegirPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirElegirPlanActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirElegirPlanActionPerformed

    private void btnHacerRutinaPropiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerRutinaPropiaActionPerformed
        // TODO add your handling code here:
        VentanaRutinaPropia ventIn = new VentanaRutinaPropia();
       ventIn.setLocationRelativeTo(null);//muestra la ventana centrada en pantalla
       ventIn.setTitle("Hacer Rutina Propia");//aquí escribo el título de la ventana
       ventIn.setResizable(false);//se evita que el usuario pueda cambiar el tamaño de la ventana
       ventIn.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//evita que puedan cerrar la ventana con la X
       ventIn.setVisible(true);//muestra la ventana
    }//GEN-LAST:event_btnHacerRutinaPropiaActionPerformed

    private void btnSeleccionarEntrenador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEntrenador1ActionPerformed
        // TODO add your handling code here:
        String tipoRutina;
        Rutina rutina;
        String nombreProfesor;
        
        //tipoRutina = "HolaVichota";
        tipoRutina = txtRutinaSencilla.getText();
        nombreProfesor = txtEntrenador1.getText();
        rutina = new Rutina("Alumno X",nombreProfesor,tipoRutina,15000);
        
        Endpoints edp = new Endpoints();
        
        edp.ingresarRutina(rutina);
        JOptionPane.showMessageDialog(this, "Rutina Ingresada");
        
    }//GEN-LAST:event_btnSeleccionarEntrenador1ActionPerformed

    private void btnSeleccionarEntrenador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEntrenador2ActionPerformed
        // TODO add your handling code here:
        String tipoRutina;
        Rutina rutina;
        String nombreProfesor;
        
        //tipoRutina = "HolaVichota";
        tipoRutina = txtRutinaMedia.getText();
        nombreProfesor = txtEntrenador2.getText();
        rutina = new Rutina("Alumno X",nombreProfesor,tipoRutina,20000);
        
        Endpoints edp = new Endpoints();
        
        edp.ingresarRutina(rutina);
        JOptionPane.showMessageDialog(this, "Rutina Ingresada");
    }//GEN-LAST:event_btnSeleccionarEntrenador2ActionPerformed

    private void btnSeleccionarEntrenador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEntrenador3ActionPerformed
        // TODO add your handling code here:
        String tipoRutina;
        Rutina rutina;
        String nombreProfesor;
        
        //tipoRutina = "HolaVichota";
        tipoRutina = txtRutinaAvanzada.getText();
        nombreProfesor = txtEntrenador3.getText();
        rutina = new Rutina("Alumno X",nombreProfesor,tipoRutina,25000);
        
        Endpoints edp = new Endpoints();
        
        edp.ingresarRutina(rutina);
        JOptionPane.showMessageDialog(this, "Rutina Ingresada");
    }//GEN-LAST:event_btnSeleccionarEntrenador3ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHacerRutinaPropia;
    private javax.swing.JButton btnSalirElegirPlan;
    private javax.swing.JButton btnSeleccionarEntrenador1;
    private javax.swing.JButton btnSeleccionarEntrenador2;
    private javax.swing.JButton btnSeleccionarEntrenador3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtEntrenador1;
    private javax.swing.JLabel txtEntrenador2;
    private javax.swing.JLabel txtEntrenador3;
    private javax.swing.JTextArea txtRutina;
    private javax.swing.JLabel txtRutinaAvanzada;
    private javax.swing.JLabel txtRutinaMedia;
    private javax.swing.JLabel txtRutinaSencilla;
    // End of variables declaration//GEN-END:variables
}
