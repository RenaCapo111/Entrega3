/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author renax
 */
public class Entrega3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal ventPrin = new VentanaPrincipal();
        ventPrin.setLocationRelativeTo(null);//muestra la ventana centrada en pantalla
        ventPrin.setTitle("FitFlow");//aquí escribo el título de la ventana
        ventPrin.setResizable(false);//se evita que el usuario pueda cambiar el tamaño de la ventana
        ventPrin.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//evita que puedan cerrar la ventana con la X
        ventPrin.setVisible(true);//muestra la ventana
    }
    
}
