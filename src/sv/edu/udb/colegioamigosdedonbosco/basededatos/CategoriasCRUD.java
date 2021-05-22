/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.colegioamigosdedonbosco.basededatos;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CategoriasCRUD {

    private final String SQL_INSERT
            = "INSERT INTO categorias(descripcion) VALUES (?)";
    private final String SQL_UPDATE
            = "UPDATE categorias SET descripcion = ? WHERE id = ?";
    private final String SQL_DELETE
            = "DELETE FROM categorias WHERE id = ?";
    private final String SQL_SELECT
            = "SELECT id as Codigo, descripcion as Descripcion FROM categorias";

    public int insert(String descripcion) {
        int rows = 0;
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConexion();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(this.SQL_INSERT);
            int index = 1;

            stmt.setString(index++, descripcion);
            rows = stmt.executeUpdate();
            System.out.println("Numero de registros afectados: " + rows);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
        return rows;
    }

    public int update(String descripcion, int id) {
        int rows = 0;
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConexion();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(this.SQL_UPDATE);
            int index = 1;

            stmt.setString(index++, descripcion);
            stmt.setInt(index++, id);
            rows = stmt.executeUpdate();
            System.out.println("Numero de registros afectados: " + rows);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return rows;
    }

    public int delete(int id) {
        int rows = 0;
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConexion();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(this.SQL_DELETE);
            int index = 1;

            stmt.setInt(index++, id);
            rows = stmt.executeUpdate();
            System.out.println("Numero de registros afectados: " + rows);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
        return rows;
    }

    public DefaultTableModel select() {
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConexion();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(this.SQL_SELECT);
            ResultSet rs = stmt.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();

            int numberOfColumns = meta.getColumnCount();

            // Formato encabezado
            for (int i = 1; i <= numberOfColumns; i++) {
                dtm.addColumn(meta.getColumnLabel(i));
            }

            // Creando filas de la tabla
            while (rs.next()) {
                Object[] fila = new Object[numberOfColumns];

                for (int j = 0; j < numberOfColumns; j++) {
                    fila[j] = rs.getObject(j + 1);
                }
                dtm.addRow(fila);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
        return dtm;
    }
}
