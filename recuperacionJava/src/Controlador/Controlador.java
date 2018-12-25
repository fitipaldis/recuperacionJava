package Controlador;

import Modelo.Coche;
import Modelo.Reparacion;
import Vista.JFrameLogin;
import Vista.JPanelVisualizar;
import static Vista.JPanelVisualizar.codigoCoche;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

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

    public static void insertarReparacion(int numRepa, String tipo, float precio, int codCoche, String fecha) throws SQLException {

        Statement stmt = Conexion.connection.createStatement();
        Iterator iterator = JFrameLogin.Reparaciones.iterator();
        Modelo.Reparacion next = null;

        for (int i = 0; i < JFrameLogin.Reparaciones.size(); i++) {
            next = (Modelo.Reparacion) iterator.next();
            String sql = "SELECT CODIGO FROM REPARACION WHERE CODCOCHE =" + next.getCodigoCoche() + " AND CODIGO=" + next.getCodigo();
            rset = stmt.executeQuery(sql);

            if (!rset.next()) {
                System.out.println("" + next.getFecha());
                String f = "20" + next.getFecha().substring(6) + "-" + next.getFecha().substring(3, 5) + "-" + next.getFecha().substring(0, 2);
                sql = "INSERT INTO REPARACION (CODIGO,DESCRIPCION,PRECIOTOTAL,CODCOCHE,FECHA) VALUES (" + next.getCodigo() + ",'" + next.getDescripcion() + "'," + next.getPrecioTotal() + "," + next.getCodigoCoche() + ",'" + f + "')";
                stmt.executeUpdate(sql);
            }
        }
    }

    public static void cargarCoches() throws SQLException {

        stmt = Conexion.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        String sql = Modelo.Consultas.selectint("*", "COCHE", "CODCLIENTE", JFrameLogin.codigoCliente, false);
        rset = stmt.executeQuery(sql);

        while (rset.next()) {
            Coche nuevo = new Coche(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4));

            Vista.JFrameLogin.Coches.add(nuevo);
        };

    }

    public static void cargarReparaciones() throws SQLException {

        stmt = Conexion.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        String sql = Modelo.Consultas.selectint("*", "REPARACION", "", 0, true);
        rset = stmt.executeQuery(sql);

        while (rset.next()) {
            SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yy");
            Reparacion nueva = new Reparacion(rset.getInt(1), rset.getString(2), rset.getFloat(3), rset.getInt(4), fmt.format(rset.getDate(5)));
            Vista.JFrameLogin.Reparaciones.add(nueva);
        };

    }

    public static void tablaCocheReparacion(int codigoCoche) throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel();
        Vista.JPanelVisualizar.jTable1.setModel(modelo);

        //Establecer como cabeceras el nombre de las columnas   
        String[] columNames = {"Reparacion", "Descripción", "Precio"};
        modelo.setColumnIdentifiers(columNames);

        //Creando las filas para el JTable
        if (JFrameLogin.Reparaciones.size() > 0) {
            Object[] fila = new Object[columNames.length];
            Modelo.Reparacion dato = new Reparacion();
            for (int i = 0; i < JFrameLogin.Reparaciones.size(); i++) {
                dato = (Modelo.Reparacion) JFrameLogin.Reparaciones.get(i);
                if (dato.getCodigoCoche() == codigoCoche) {
                    fila[0] = dato.getCodigo();
                    fila[1] = dato.getDescripcion();
                    fila[2] = dato.getPrecioTotal();
                    modelo.addRow(fila);
                }
            }

            JPanelVisualizar.jTable1.setModel(modelo);

        }

    }

    public static String devolverNombreCliente() throws SQLException {

        stmt = Conexion.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        String sql = Modelo.Consultas.selectint("USUARIO", "CLIENTE", "CODIGO", JFrameLogin.codigoCliente, false);
        rset = stmt.executeQuery(sql);

        rset.next();
        return rset.getString(1);
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

    public static int devolverNumeroReparacion() throws SQLException {

        stmt = Conexion.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        String sql = Modelo.Consultas.consultarCoches("COUNT(*)", "REPARACION", "CODIGO", JFrameLogin.Reparaciones.size());
        rset = stmt.executeQuery(sql);

        rset.next();

        int suma = rset.getInt(1) + JFrameLogin.Reparaciones.size();

        return suma + 1;
    }
}
