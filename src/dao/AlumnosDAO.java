/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidad.Alumnos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Zeus
 */
 //Función para agregar la información de los alumnos a la base de datos
public class AlumnosDAO {
    private Conexion conex = new Conexion();
    public void agregarAlumno (String nombre, String apellido, String edad, String carrera, String fecha_registro){
     
        String sql = "INSERT INTO Alumnos (nombre,apellido,edad,carrera,fecha_registro) VALUES('"+nombre+"','"+apellido+"',"
                + "'"+edad+"','"+carrera+"','"+fecha_registro+"')";//envía a la base de datos el comando sql para insertar valores
        conex.insertQuery(sql);
}
             //Función para obtener la información de todos los alumnos, que posteriormente ser mostrada en una tabla.
    public ArrayList <Alumnos> getAlumnos(){
        ArrayList <Alumnos> lista = new ArrayList<>();
        String sql = "SELECT * FROM Alumnos";
            ResultSet datos = conex.query(sql);
            try{
                while(datos.next()){ //mientras haya mas datos, se creará un nuevo objeto Alumnos, se llenará con los datos y se agregará a la lista
                    Alumnos alu = new Alumnos(datos.getInt("id"),datos.getString("nombre"),datos.getString("apellido")
                    ,datos.getString("edad"),datos.getString("carrera"),datos.getString("fecha_registro"));
                    lista.add(alu);
                }
                return lista;
            }catch(SQLException ex){
                return null;
            }
    }
    
          //Función para obtener la información de un alumno mediante su id.
    public ArrayList <Alumnos> getAlumnosID(int id){
        ArrayList <Alumnos> lista = new ArrayList<>();
        String sql = "SELECT * FROM Alumnos WHERE id="+id;
        ResultSet datos = conex.query(sql);
        try{
            while(datos.next()){
                    Alumnos alu = new Alumnos(datos.getInt("id"),datos.getString("nombre"),datos.getString("apellido")
                    ,datos.getString("edad"),datos.getString("carrera"),datos.getString("fecha_registro"));
                    lista.add(alu);
                }
            return lista;
        }catch(SQLException ex){
            return null;
        }
      
        
    }
       //Función para obtener la información de un alumno mediante su apellido
    public ArrayList <Alumnos> getAlumnosApell(String apellido){
        ArrayList <Alumnos> lista = new ArrayList<>();
        String sql = "SELECT * FROM Alumnos WHERE apellido='"+apellido+"'";
        ResultSet datos = conex.query(sql);
        try{
            while(datos.next()){
                    Alumnos alu = new Alumnos(datos.getInt("id"),datos.getString("nombre"),datos.getString("apellido")
                    ,datos.getString("edad"),datos.getString("carrera"),datos.getString("fecha_registro"));
                    lista.add(alu);
                }
            return lista;
        }catch(SQLException ex){
            return null;
        }
      
        
    }
    //Función para borrar alumnos según su id.
    public void deleteAlumnosID(int id){
        Conexion conex = new Conexion();
        String sql = "DELETE FROM Alumnos WHERE id="+id;
        conex.insertQuery(sql);
        
    }
    
  
    
}


