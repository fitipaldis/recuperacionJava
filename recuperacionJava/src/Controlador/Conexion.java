package Controlador;
//Establece la conexion con la BD y agrega al fichero de conexiones el login del usuario correspondiente.

import Vista.JPanelVisualizarConexiones;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;


public class Conexion implements Serializable {

    static String usuario = "alejandro";
    static String driver = "org.apache.derby.jdbc.ClientDriver";
    static String connectString = "jdbc:derby://localhost:1527/recuperacion";
    public static Connection connection = null;

    public static boolean conectado = false;

    static BufferedWriter fich = null;
    static java.util.Date fecha = new Date();
    static String client;

    public static void conectar() throws IOException {

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

        try {
            fich = new BufferedWriter(new FileWriter(rutaArchivo, true));
        } catch (IOException ex) {
            System.out.println("Error de apertura");
        }

        client = cliente + " " + fecha;
        fich.write(client);
        client = "\n";
        fich.write(client);
        fich.close();
    }

    public static void leerLog(String rutaArchivo) throws IOException, ClassNotFoundException {

        FileReader f = new FileReader(rutaArchivo);

        try {
            BufferedReader fichLect = new BufferedReader(f);

            String aux;

            while ((aux = fichLect.readLine()) != null){
                    JPanelVisualizarConexiones.historialConexiones.setText(JPanelVisualizarConexiones.historialConexiones.getText() + aux + "\n");
            }
            fichLect.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error en la apertura del fichero, compruebe que exista", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
        }

    }
}
