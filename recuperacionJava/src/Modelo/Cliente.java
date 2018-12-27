package Modelo;

import java.util.Date;

public class Cliente {

    private int codigo;
    private String dni;
    private String usuario;
    private String password;

    public Cliente(int codigo, String dni, String usuario, String password) {
        this.codigo = codigo;
        this.dni = dni;
        this.usuario = usuario;
        this.password = password;
    }
    
    public Cliente(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
