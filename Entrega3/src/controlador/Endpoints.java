/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import modelo.Rutina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;  // Para Logger
import java.util.ArrayList;


/**
 *
 * @author antil
 */
public class Endpoints {
    public boolean ingresarRutina(Rutina rutina){
        boolean resultado = false;
        
        try {
        // Obtener la conexión
        Connection con = Conex.getConexion();
        
        // Nueva consulta para insertar los datos correspondientes
        String query = "INSERT INTO usuarios (id, nombre_alumno, nombre_rofesor, tipo_Rutina, precio_mensual) VALUES (?, ?, ?, ?, ?)";
        
        // Preparar la sentencia SQL
        PreparedStatement ps = con.prepareStatement(query);

        // Asignar los valores a la sentencia preparada
        ps.setInt(1, rutina.getId()); // Asignar el id de la rutina
        ps.setString(2, rutina.getNombreAlum()); // Asignar el nombre del alumno
        ps.setString(3, rutina.getNombreProfesor()); // Asignar el nombre del profesor
        ps.setString(4, rutina.getTipoRutina()); // Asignar el tipo de rutina (básico, medio o avanzado)
        ps.setDouble(5, rutina.getPrecioMensual()); // Asignar el precio mensual de la rutina

        // Ejecutar la consulta y verificar si se insertó correctamente
        resultado = ps.executeUpdate() == 1;
        
        // Cerrar la sentencia preparada
        ps.close();
        
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Endpoints.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return resultado;
    }
    
    public boolean modificarRutina(Rutina rutina)
    {
        boolean resultado = false;
        
        try
        {
            Connection con = Conex.getConexion();
            
            String query = "update usuarios set nombre_alumno=?, nombre_profesor=?, tipo_Rutina=?, precio_menual=? where Id=?";
            
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, rutina.getNombreAlum());
            ps.setString(2, rutina.getNombreProfesor());
            ps.setString(3, rutina.getTipoRutina());
            ps.setDouble(4, rutina.getPrecioMensual());
            ps.setInt(5, rutina.getId());
            
            resultado = ps.executeUpdate()==1;
            ps.close();
        }catch(SQLException ex)
        {
            Logger.getLogger(Endpoints.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex)
        {
            Logger.getLogger(Endpoints.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public boolean eliminarRutina(String id)
    {
        boolean resultado = false;
        
        try {
            Connection con = Conex.getConexion();
            String query="delete from tablarutina where id='"+id+"'";
            PreparedStatement ps = con.prepareStatement(query);    
            
            resultado = ps.executeUpdate()==1;
            ps.close();            
            
        }catch (SQLException ex){
            Logger.getLogger(Endpoints.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Endpoints.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public Rutina buscarRutina(int id)
    {
        Rutina rutina=null;
        try{
            Connection con = Conex.getConexion();
            String query = "SELECT * FROM tablarutina WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs=ps.executeQuery();
            
            while (rs.next())            
                rutina=new Rutina(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
            ps.close();
        }catch (SQLException ex){
            Logger.getLogger(Endpoints.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Endpoints.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rutina;     
    }   
 }

