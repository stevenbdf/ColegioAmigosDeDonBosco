/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.colegioamigosdedonbosco.basededatos;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PCECA
 */
public class AutoresCRUD {

    private final String SQL_INSERT
            = "INSERT INTO autores(nombres, apellidos, fecha_nacimiento) VALUES (?, ?, ?)";
    private final String SQL_UPDATE
            = "UPDATE autores SET nombres = ?, apellidos = ?, fecha_nacimiento = ? WHERE id = ?";
    private final String SQL_DELETE
            = "DELETE FROM autores WHERE id = ?";
    private final String SQL_SELECT
            = "SELECT id as Codigo, nombres as Nombres, apellidos as Apellidos, fecha_nacimiento as 'Fecha de Nacimiento' FROM autores";

    public int insert(String nombres, String apellidos, String fecha_nacimiento) {
        int rows = 0;
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConexion();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(this.SQL_INSERT);
            int index = 1;

            stmt.setString(index++, nombres);
            stmt.setString(index++, apellidos);
            stmt.setString(index++, fecha_nacimiento);

            rows = stmt.executeUpdate();
            System.out.println("Numero de registros afectados: " + rows);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
        return rows;
    }

    public int update(String nombres, String apellidos, String fecha_nacimiento, int id) {
        int rows = 0;
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConexion();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(this.SQL_UPDATE);
            int index = 1;

            stmt.setString(index++, nombres);
            stmt.setString(index++, apellidos);
            stmt.setString(index++, fecha_nacimiento);
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
