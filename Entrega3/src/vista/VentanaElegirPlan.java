/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Endpoints;
import javax.swing.JOptionPane;
import modelo.Rutina;
import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class VentanaElegirPlan extends javax.swing.JFrame {
    
    Scanner teclado = new Scanner(System.in);
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
        jPanel3 = new javax.swing.JPanel();
        btnSalirElegirPlan = new javax.swing.JButton();
        txtRutinaSencilla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRutina = new javax.swing.JTextArea();
        txtRutinaMedia = new javax.swing.JLabel();
        txtRutinaAvanzada = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        txtNombreAlumno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        txtEntrenador1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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

        txtEntrenador2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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

        txtEntrenador3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        txtRutina.setText("-3 series sentadillas x 8 - 10 rep.\n-2 series abdominales x 8\n-3 series burpees x 8");
        jScrollPane1.setViewportView(txtRutina);

        txtRutinaMedia.setText("Rutina media");

        txtRutinaAvanzada.setText("Rutina Avanzada");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("- 4 series sentidllas x 8 rep\n- 3 series abdominales x 8-10 rep\n- 3 series burpees x 8 rep");
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("- 5 series sentidllas x 8 rep\n- 4 series abdominales x 8-10 rep\n- 4 series burpees x 8 rep");
        jScrollPane3.setViewportView(jTextArea2);

        txtNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumnoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese su nombre:");

        jLabel3.setText("Precio Mensual : 25000$");

        jLabel4.setText("Precio Mensual : 30000$");

        jLabel5.setText("Precio Mensual : 35000$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEntrenador1)
                                .addComponent(txtRutinaSencilla)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(btnSeleccionarEntrenador1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(117, 117, 117)))
                        .addGap(112, 112, 112)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEntrenador2)
                            .addComponent(txtRutinaMedia)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnSeleccionarEntrenador2)))
                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRutinaAvanzada, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEntrenador3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeleccionarEntrenador3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(158, 312, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEntrenador3)
                    .addComponent(txtEntrenador2)
                    .addComponent(txtEntrenador1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRutinaAvanzada)
                    .addComponent(txtRutinaMedia)
                    .addComponent(txtRutinaSencilla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionarEntrenador1)
                    .addComponent(btnSeleccionarEntrenador2)
                    .addComponent(btnSeleccionarEntrenador3))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirElegirPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirElegirPlanActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirElegirPlanActionPerformed

    private void btnSeleccionarEntrenador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEntrenador1ActionPerformed
        // TODO add your handling code here:
        String tipoRutina;
        Rutina rutina;
        String nombreProfesor;
    
        String nombreAlumno;
        
        
        //tipoRutina = "HolaVichota";
        tipoRutina = txtRutinaSencilla.getText();
        nombreProfesor = txtEntrenador1.getText();
        nombreAlumno = txtNombreAlumno.getText();
        rutina = new Rutina(nombreAlumno,nombreProfesor,tipoRutina,25000);
        
        Endpoints edp = new Endpoints();
        
        edp.ingresarRutina(rutina);
        JOptionPane.showMessageDialog(this, "Rutina Ingresada");
        txtNombreAlumno.setText(null);
        
        
    }//GEN-LAST:event_btnSeleccionarEntrenador1ActionPerformed

    private void btnSeleccionarEntrenador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEntrenador2ActionPerformed
        // TODO add your handling code here:
        String tipoRutina;
        Rutina rutina;
        String nombreProfesor;
        String nombreAlumno;
     
        //tipoRutina = "HolaVichota";
        tipoRutina = txtRutinaMedia.getText();
        nombreProfesor = txtEntrenador2.getText();
        nombreAlumno = txtNombreAlumno.getText();
        rutina = new Rutina(nombreAlumno,nombreProfesor,tipoRutina,30000);
        
        Endpoints edp = new Endpoints();
        
        edp.ingresarRutina(rutina);
        JOptionPane.showMessageDialog(this, "Rutina Ingresada");
        txtNombreAlumno.setText(null);
    }//GEN-LAST:event_btnSeleccionarEntrenador2ActionPerformed

    private void btnSeleccionarEntrenador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEntrenador3ActionPerformed
        // TODO add your handling code here:
        String tipoRutina;
        Rutina rutina;
        String nombreProfesor;
        String nombreAlumno;
        
        //tipoRutina = "HolaVichota";
        tipoRutina = txtRutinaAvanzada.getText();
        nombreProfesor = txtEntrenador3.getText();
        nombreAlumno = txtNombreAlumno.getText();
        rutina = new Rutina(nombreAlumno,nombreProfesor,tipoRutina,35000);
        
        Endpoints edp = new Endpoints();
        
        edp.ingresarRutina(rutina);
        JOptionPane.showMessageDialog(this, "Rutina Ingresada");
        
        
        txtNombreAlumno.setText(null);
      
    }//GEN-LAST:event_btnSeleccionarEntrenador3ActionPerformed

    private void txtNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlumnoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirElegirPlan;
    private javax.swing.JButton btnSeleccionarEntrenador1;
    private javax.swing.JButton btnSeleccionarEntrenador2;
    private javax.swing.JButton btnSeleccionarEntrenador3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel txtEntrenador1;
    private javax.swing.JLabel txtEntrenador2;
    private javax.swing.JLabel txtEntrenador3;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextArea txtRutina;
    private javax.swing.JLabel txtRutinaAvanzada;
    private javax.swing.JLabel txtRutinaMedia;
    private javax.swing.JLabel txtRutinaSencilla;
    // End of variables declaration//GEN-END:variables
}
