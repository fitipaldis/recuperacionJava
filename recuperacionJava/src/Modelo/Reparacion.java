package Modelo;

import java.util.GregorianCalendar;

public class Reparacion {

    private int codigo;
    private String descripcion;
    private float precioTotal;
    private int codigoCoche;
    private GregorianCalendar fecha;

    public Reparacion(int codigo, String descripcion, float precioTotal, int codigoCoche, GregorianCalendar fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioTotal = precioTotal;
        this.codigoCoche = codigoCoche;
        this.fecha = fecha;
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

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

}
