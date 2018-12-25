package Controlador;

import Modelo.Coche;
import Vista.JFrameLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class Controlador {

    public static ResultSet rset;
    static Statement stmt;
    static boolean inicio = true;

    public boolean iniciarSesion(String usuario, String contra) throws SQLException {

        iniciar();
        boolean flag = false;

        do {
            if (rset.getString(3).equals(usuario) && rset.getString(4).equals(contra)) {
                flag = true;
            }

        } while (!flag && rset.next());

        return flag;
    }

    public static void iniciar() throws SQLException {

        stmt = Conexion.connection.createStatement();
        String sql = Modelo.Consultas.selectstring("*", "cliente", "", "", true);
        rset = stmt.executeQuery(sql);
        rset.next();
    }

    public static void insertarCoche(int numCoche, String marca, int codigoCliente, String imagen) throws SQLException {

        Statement stmt = Conexion.connection.createStatement();
        Iterator iterator = JFrameLogin.Coches.iterator();
        Modelo.Coche next = null;

        for (int i = 0; i < JFrameLogin.Coches.size(); i++) {
            next = (Coche) iterator.next();
            String sql = "SELECT CODIGO FROM COCHE WHERE CODIGO= " + next.getCodigo();
            rset = stmt.executeQuery(sql);

            if (!rset.next()) {
                sql = "INSERT INTO COCHE (CODIGO,MARCA,CODCLIENTE,IMAGEN) VALUES (" + next.getCodigo() + ",'" + next.getMarca() + "'," + next.getCodcliente() + ",'" + next.getImagen().toString() + "')";
                stmt.executeUpdate(sql);
            }
        }

    }

    public static void cargarCoches() throws SQLException {

        stmt = Conexion.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        String sql = Modelo.Consultas.selectInt("*", "COCHE", "CODCLIENTE", JFrameLogin.codigoCliente, false);
        rset = stmt.executeQuery(sql);

        while (rset.next()) {
            Coche nuevo = new Coche(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4));

            Vista.JFrameLogin.Coches.add(nuevo);
        };

    }

    public static ResultSet mostrarDatosCoches(int contador) throws SQLException {

        stmt = Conexion.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = Modelo.Consultas.selectInt("*", "COCHE", "CODCLIENTE", JFrameLogin.codigoCliente, false);
        rset = stmt.executeQuery(sql);

        rset.absolute(contador);

        return rset;
    }

    public static int devolverCodigo(String codigo, String tabla, String variable, String usuario) throws SQLException {

        PreparedStatement s = Conexion.connection.prepareStatement("SELECT " + codigo + " FROM " + tabla + " WHERE " + variable + " = ?");
        s.setString(1, usuario);
        ResultSet rs = s.executeQuery();

        rs.next();
        return rs.getInt(1);
    }

    public static int devolverNumeroCoche() throws SQLException {

        stmt = Conexion.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        String sql = Modelo.Consultas.consultarCoches("COUNT(*)", "COCHE", "CODCLIENTE", JFrameLogin.codigoCliente);
        rset = stmt.executeQuery(sql);

        rset.next();

        int suma = rset.getInt(1) + JFrameLogin.Coches.size();

        return suma + 1;
    }
}
