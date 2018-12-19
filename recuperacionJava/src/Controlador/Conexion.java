package Controlador;
//Establece la conexion con la BD y agrega al fichero de conexiones el login del usuario correspondiente.

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JTextField;




public class Conexion implements Serializable {

    static String usuario = "alejandro";
    static String driver = "org.apache.derby.jdbc.ClientDriver";
    static String connectString = "jdbc:derby://localhost:1527/recuperacion";
    public static Connection connection = null;

    public static boolean conectado = false;

    public static void conectar() {

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(connectString, usuario, usuario);
            conectado = true;
        } catch (SQLException ex) {
            Excepciones e = new Excepciones(ex.getMessage(), 4);
        } catch (ClassNotFoundException ex) {
            Excepciones e = new Excepciones(ex.getMessage(), 5);
        }
    }

    public static void escribirLog(String rutaArchivo, String cliente) throws IOException {

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {

            fh = new FileHandler(rutaArchivo, true);
            logger.addHandler(fh);

            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info(cliente);

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
