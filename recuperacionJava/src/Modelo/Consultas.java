package Modelo;

public class Consultas {

    public static String selectstring(String parametro, String tabla, String fila, String condicion, boolean flag) {

        String sql;
        if (flag) {
            sql = "SELECT " + parametro + " FROM " + tabla;
        } else {
            sql = "SELECT " + parametro + " FROM " + tabla + " WHERE " + fila + " = '" + condicion + "'";
        }
        return sql;

    }

    public static String selectInt(String parametro, String tabla, String fila, int condicion, boolean bandera) {
        
        String sql;
        if(bandera) {
            
            sql = "SELECT " + parametro + " FROM " + tabla;
        } else {
            
            sql = "SELECT " + parametro + " FROM " + tabla + " WHERE " + fila + " = " + condicion + "";
        }
        
        return sql;
    }
    
    public static String consultarCoches(String parametro, String tabla, String fila, int condicion) {

        String sql = "SELECT " + parametro + " FROM " + tabla + " WHERE " + fila + " != " + condicion + "";

        return sql;
    }
}
