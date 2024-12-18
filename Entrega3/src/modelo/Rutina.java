/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author antil
 */
public class Rutina {
    
    private String nombreAlum;
    private String nombreProfesor;
    private String tipoRutina; // "básico", "medio", "avanzado"
    private double precioMensual;

    // Constructor
    public Rutina( String nombreAlum, String nombreProfesor, String tipoRutina, double precioMensual) {
       
        this.nombreAlum = nombreAlum;
        this.nombreProfesor = nombreProfesor;
        this.tipoRutina = tipoRutina;
        this.precioMensual = precioMensual;
    }

    // Getters y Setters
 

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getTipoRutina() {
        return tipoRutina;
    }

    public void setTipoRutina(String tipoRutina) {
        this.tipoRutina = tipoRutina;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

}
