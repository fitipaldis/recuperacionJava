package Controlador;
//Establece la conexion con la BD y agrega al fichero de conexiones el login del usuario correspondiente.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    static String usuario="alejandro";
    static String driver = "org.apache.derby.jdbc.ClientDriver";
    static String connectString = "jdbc:derby://localhost:1527/recuperacion";
    public static Connection connection = null;
  
    public static boolean conectado = false;
    
    public static void conectar() {
        
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(connectString,usuario,usuario);
            conectado = true;
        } catch (SQLException ex) {
              Excepciones e = new Excepciones(ex.getMessage(),4);
        } catch (ClassNotFoundException ex) {
              Excepciones e=new Excepciones(ex.getMessage(),5);
        }
    }
}