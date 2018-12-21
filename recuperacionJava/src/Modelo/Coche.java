package Modelo;

public class Coche {
    
    private int codigo;
    private String marca;
    private int codcliente;
    private String imagen;

    public Coche(int codigo, String marca, int codcliente, String imagen) {
        setCodigo(codigo);
        setMarca(marca);
        setCodcliente(codcliente);
        setImagen(imagen);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
}
