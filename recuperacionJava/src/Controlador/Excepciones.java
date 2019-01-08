package Controlador;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Excepciones {

    static public String[] Mensajes = {"Error en la base de datos", "No existe ningun usuario con estos datos", "Rellene todos los campos", "Ya se han utilizado los 3 intentos posibles", "No se puede conectar a la BD", "No se puede encontrar el driver", "Se ha superado el coste máximo de la reparación", "Debe seleccionar primero una imagen", "Debes seleccionar una fecha"};

    public Excepciones(String mensaje, int codigo) throws IOException {

        JOptionPane.showMessageDialog(null, mensaje + "\n" + Mensajes[codigo], "Mensaje de Error", WIDTH);
        escribirError(mensaje, codigo);
    }

    public Excepciones(int codigo) throws IOException {

        JOptionPane.showMessageDialog(null, Mensajes[codigo], "Mensaje de Error", WIDTH);
        escribirError(Mensajes[codigo], codigo);
    }

    public void escribirError(String mensaje, int codigo) throws IOException {

        FicheroErrores.escribirFichero(codigo, mensaje, Mensajes[codigo]);
    }
}
