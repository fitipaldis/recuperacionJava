package Controlador;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

public class Excepciones {

    static public String [] Mensajes= {"Error en la base de datos","No existe ningun usuario con estos datos","Rellene todos los campos","Ya se han utilizado los 3 intentos posibles","No se puede conectar a la BD","No se puede encontrar el driver", "Se ha superado el coste máximo de la reparación", "Debe seleccionar primero una imagen"};
    
    public Excepciones(String mensaje, int codigo){
    
     JOptionPane.showMessageDialog(null,mensaje+"\n"+Mensajes[codigo], "Mensaje de Error", WIDTH);
    }
    
    public Excepciones(int codigo){
    
       JOptionPane.showMessageDialog(null,Mensajes[codigo], "Mensaje de Error", WIDTH);
    }   
  
}
