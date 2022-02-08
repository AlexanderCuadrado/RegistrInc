/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Zeus
 */
public class Alumnos {
    private int id;
    private String nombre;
    private String apellido;
    private String edad;
    private String carrera;
    private String fecha;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getFecha() {
        return fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Alumnos() {
    }
    //constructor para el objeto alumno
    public Alumnos(int id, String nombre, String apellido, String edad, String carrera, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.fecha = fecha;
    }    
    
    
}
