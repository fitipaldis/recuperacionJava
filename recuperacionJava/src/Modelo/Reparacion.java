package Modelo;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Reparacion {

    private int codigo;
    private String descripcion;
    private float precioTotal;
    private int codigoCoche;
    private GregorianCalendar fecha;

    public Reparacion(int codigo, String descripcion, float precioTotal, int codigoCoche, String fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioTotal = precioTotal;
        this.codigoCoche = codigoCoche;
        setFecha(fecha);
    }

    public Reparacion() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getCodigoCoche() {
        return codigoCoche;
    }

    public void setCodigoCoche(int codigoCoche) {
        this.codigoCoche = codigoCoche;
    }

    public String getFecha() {
        
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yy");
        fmt.setCalendar(fecha);
        String dateFormatted = fmt.format(fecha.getTime());        
        return dateFormatted;
    }

    public void setFecha(String fechaIntroducida) {
        
        String dia = fechaIntroducida.substring(0, 2);
        String mes = fechaIntroducida.substring(3, 5);
        String año = fechaIntroducida.substring(6);
        
        fecha = new GregorianCalendar(Integer.parseInt(año) + 2000, Integer.parseInt(mes) - 1, Integer.parseInt(dia));
    }

}
