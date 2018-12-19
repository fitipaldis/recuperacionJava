package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    public static int devolverCodigo(String codigo, String tabla, String variable, String usuario) throws SQLException {

        PreparedStatement s = Conexion.connection.prepareStatement("SELECT " + codigo + " FROM " + tabla + " WHERE " + variable + " = ?");
        s.setString(1, usuario);
        ResultSet rs = s.executeQuery();

        rs.next();
        return rs.getInt(1);

    }
}
