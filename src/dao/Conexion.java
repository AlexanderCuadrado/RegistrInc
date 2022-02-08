package dao;
import java.sql.*;

public class Conexion {
    //información de la base de datos hecha con mysql(xampp)
    private final String db = "Proyecto2"; // nombre de la base de datos
    private final String url = "jdbc:mysql://localhost:3306/" + db;
    private final String user = "root"; //usuario de la base de datos
    private final String pass = ""; //contraseña de la base de datos
    private Connection con;
    private Statement st;
    
    public Conexion() {
        con = null;

        //conexion a la base de datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();   
        } catch (ClassNotFoundException | SQLException ex) {  
        }
    }
   
    //Función que realiza las consultas a la base de datos (SELECT)
    public ResultSet query(String SQL) {
        ResultSet datos = null;
        try {
            st = con.createStatement();
            datos = st.executeQuery(SQL);
        } catch (SQLException ex) {
        }
        return (datos);
    }
    
    //Función que ejecuta sentencias sql para el ingreso, modificación y eliminación de datos(INSERT Y DELETE) 
    public boolean insertQuery(String SQL) {
        try {
            st.executeUpdate(SQL);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
