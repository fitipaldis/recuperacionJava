package Controlador;

import static Controlador.Conexion.fich;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.GregorianCalendar;

public class FicheroErrores {

    static BufferedWriter fich = null;
    static java.util.Date fecha = new Date();
    static String errors;

    public static void escribirFichero(int i, String error, String err) throws IOException {

        try {
            fich = new BufferedWriter(new FileWriter("C:\\Users\\Fiti\\Desktop\\recuperacionJAVA\\recuperacionJava\\recuperacionJava\\src\\errors.txt", true));
        } catch (IOException ex) {
            System.out.println("Error de apertura");
        }
        
        errors=i+" "+fecha+" "+error+" "+err; 
        
        errors = error + " " + fecha;
        fich.write(errors);
        errors = "\n";
        fich.write(errors);
        fich.close();
    }
}
