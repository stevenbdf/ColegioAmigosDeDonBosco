/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.colegioamigosdedonbosco.basededatos;

import java.sql.*;

public class ConfiguracionCRUD {

    private final String SQL_UPDATE
            = "UPDATE configuracion SET ejemplares_prestar_alumnos = ?, ejemplares_prestar_profesor = ?, calcular_mora = ?";
    private final String SQL_SELECT
            = "SELECT ejemplares_prestar_alumnos, ejemplares_prestar_profesor, calcular_mora FROM configuracion";

    public int update(int alumnos, int profesores, Float mora) {
        int rows = 0;
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConexion();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(this.SQL_UPDATE);
            int index = 1;

            stmt.setInt(index++, alumnos);
            stmt.setInt(index++, profesores);
            stmt.setFloat(index++, mora);

            rows = stmt.executeUpdate();
            System.out.println("Numero de registros afectados: " + rows);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return rows;
    }

    public String[] select() {
        String[] configuracion = new String[3];
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConexion();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(this.SQL_SELECT);
            ResultSet rs = stmt.executeQuery();

            rs.next();
            configuracion[0] = String.valueOf(rs.getInt("ejemplares_prestar_alumnos"));
            configuracion[1] = String.valueOf(rs.getInt("ejemplares_prestar_profesor"));
            configuracion[2] = String.valueOf(rs.getFloat("calcular_mora"));

            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
        return configuracion;
    }
}
