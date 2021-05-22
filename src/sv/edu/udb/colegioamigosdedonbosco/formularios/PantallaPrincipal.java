/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.colegioamigosdedonbosco.formularios;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sv.edu.udb.colegioamigosdedonbosco.basededatos.CategoriasCRUD;
import sv.edu.udb.colegioamigosdedonbosco.basededatos.ConfiguracionCRUD;

public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        mostrarPanel("bienvenida");
        this.getContentPane().setBackground(Color.WHITE);
    }

    private void mostrarPanel(String panel) {
        pnlPrestamos.setVisible(panel.equals("prestamos"));
        pnlEjemplares.setVisible(panel.equals("ejemplares"));
        pnlCategorias.setVisible(panel.equals("categorias"));
        pnlUsuarios.setVisible(panel.equals("usuarios"));
        pnlRoles.setVisible(panel.equals("roles"));
        pnlConfiguracion.setVisible(panel.equals("configuracion"));
        pnlBienvenida.setVisible(panel.equals("bienvenida"));
        pnlAutores.setVisible(panel.equals("autores"));
    }

    private void limpiarCategoriaCampos() {
        txtCategoriaCodigo.setText("");
        txtCategoriaDescripcion.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAutores = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnRoles = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnPrestamos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnEjemplares = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlBienvenida = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlAutores = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnlPrestamos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlEjemplares = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlConfiguracion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtConfiguracionAlumnos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtConfiguracionProfesores = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtConfiguracionMora = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnConfiguracionModificar = new javax.swing.JButton();
        pnlRoles = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlUsuarios = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlCategorias = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        txtCategoriaDescripcion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCategoriaEliminar = new javax.swing.JButton();
        btnCategoriaGuardar = new javax.swing.JButton();
        btnCategoriaModificar = new javax.swing.JButton();
        btnCategoriaLimpiar = new javax.swing.JButton();
        txtCategoriaCodigo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio Amigos de Don Bosco");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 204, 51));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("PantallaPrincipal"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAutores.setBackground(new java.awt.Color(55, 60, 86));
        btnAutores.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 11)); // NOI18N
        btnAutores.setForeground(new java.awt.Color(255, 255, 255));
        btnAutores.setText("AUTORES");
        btnAutores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 120, 50));

        btnCerrarSesion.setBackground(new java.awt.Color(199, 0, 57));
        btnCerrarSesion.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 11)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("CERRAR SESIÓN");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 50));

        btnCategorias.setBackground(new java.awt.Color(55, 60, 86));
        btnCategorias.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 11)); // NOI18N
        btnCategorias.setForeground(new java.awt.Color(255, 255, 255));
        btnCategorias.setText("CATEGORIAS");
        btnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, 50));

        btnRoles.setBackground(new java.awt.Color(55, 60, 86));
        btnRoles.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 11)); // NOI18N
        btnRoles.setForeground(new java.awt.Color(255, 255, 255));
        btnRoles.setText("ROLES");
        btnRoles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });
        getContentPane().add(btnRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 50));

        btnConfiguracion.setBackground(new java.awt.Color(55, 60, 86));
        btnConfiguracion.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 11)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setText("CONFIGURACIÓN");
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 120, 50));

        btnPrestamos.setBackground(new java.awt.Color(55, 60, 86));
        btnPrestamos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 11)); // NOI18N
        btnPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamos.setText("PRESTAMOS");
        btnPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 50));

        btnUsuarios.setBackground(new java.awt.Color(55, 60, 86));
        btnUsuarios.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 11)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 120, 50));

        btnEjemplares.setBackground(new java.awt.Color(55, 60, 86));
        btnEjemplares.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 11)); // NOI18N
        btnEjemplares.setForeground(new java.awt.Color(255, 255, 255));
        btnEjemplares.setText("EJEMPLARES");
        btnEjemplares.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjemplaresActionPerformed(evt);
            }
        });
        getContentPane().add(btnEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 120, 50));

        jLabel1.setBackground(new java.awt.Color(55, 60, 86));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 520));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CADB");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 80));

        jLabel2.setBackground(new java.awt.Color(68, 117, 245));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 80));

        pnlBienvenida.setBackground(new java.awt.Color(255, 255, 255));
        pnlBienvenida.setMaximumSize(new java.awt.Dimension(880, 600));
        pnlBienvenida.setMinimumSize(new java.awt.Dimension(880, 600));
        pnlBienvenida.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlBienvenidaComponentShown(evt);
            }
        });
        pnlBienvenida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Selecciona una opcion del menu lateral");
        pnlBienvenida.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel11.setText("¡Bienvenido!");
        pnlBienvenida.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        getContentPane().add(pnlBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, 600));

        pnlAutores.setBackground(new java.awt.Color(255, 255, 255));
        pnlAutores.setMaximumSize(new java.awt.Dimension(880, 600));
        pnlAutores.setMinimumSize(new java.awt.Dimension(880, 600));
        pnlAutores.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlAutoresComponentShown(evt);
            }
        });
        pnlAutores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel12.setText("Autores");
        pnlAutores.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(pnlAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, 600));

        pnlPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrestamos.setMaximumSize(new java.awt.Dimension(880, 600));
        pnlPrestamos.setMinimumSize(new java.awt.Dimension(880, 600));
        pnlPrestamos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlPrestamosComponentShown(evt);
            }
        });
        pnlPrestamos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel9.setText("Prestamos");
        pnlPrestamos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(pnlPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, 600));

        pnlEjemplares.setBackground(new java.awt.Color(255, 255, 255));
        pnlEjemplares.setMaximumSize(new java.awt.Dimension(880, 600));
        pnlEjemplares.setMinimumSize(new java.awt.Dimension(880, 600));
        pnlEjemplares.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel4.setText("Ejemplares");
        pnlEjemplares.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(pnlEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, 600));

        pnlConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        pnlConfiguracion.setMaximumSize(new java.awt.Dimension(880, 600));
        pnlConfiguracion.setMinimumSize(new java.awt.Dimension(880, 600));
        pnlConfiguracion.setPreferredSize(new java.awt.Dimension(880, 600));
        pnlConfiguracion.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlConfiguracionComponentShown(evt);
            }
        });
        pnlConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel5.setText("Configuración");
        pnlConfiguracion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtConfiguracionAlumnos.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtConfiguracionAlumnos.setPreferredSize(new java.awt.Dimension(300, 35));
        pnlConfiguracion.add(txtConfiguracionAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel15.setText("# de ejemplares a prestar a alumnos");
        pnlConfiguracion.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtConfiguracionProfesores.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtConfiguracionProfesores.setPreferredSize(new java.awt.Dimension(300, 35));
        pnlConfiguracion.add(txtConfiguracionProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 370, -1));

        jLabel16.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel16.setText("# de ejemplares a prestar a profesores");
        pnlConfiguracion.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        txtConfiguracionMora.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtConfiguracionMora.setPreferredSize(new java.awt.Dimension(300, 35));
        pnlConfiguracion.add(txtConfiguracionMora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel17.setText("Porcentaje de mora anual");
        pnlConfiguracion.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        btnConfiguracionModificar.setBackground(new java.awt.Color(217, 119, 6));
        btnConfiguracionModificar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnConfiguracionModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracionModificar.setText("MODIFICAR");
        btnConfiguracionModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConfiguracionModificar.setMaximumSize(new java.awt.Dimension(100, 50));
        btnConfiguracionModificar.setMinimumSize(new java.awt.Dimension(100, 50));
        btnConfiguracionModificar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnConfiguracionModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionModificarActionPerformed(evt);
            }
        });
        pnlConfiguracion.add(btnConfiguracionModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, -1, -1));

        getContentPane().add(pnlConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, 600));

        pnlRoles.setBackground(new java.awt.Color(255, 255, 255));
        pnlRoles.setMaximumSize(new java.awt.Dimension(880, 600));
        pnlRoles.setMinimumSize(new java.awt.Dimension(880, 600));
        pnlRoles.setPreferredSize(new java.awt.Dimension(880, 600));
        pnlRoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel6.setText("Roles");
        pnlRoles.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(pnlRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, 600));

        pnlUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        pnlUsuarios.setMaximumSize(new java.awt.Dimension(880, 600));
        pnlUsuarios.setMinimumSize(new java.awt.Dimension(880, 600));
        pnlUsuarios.setPreferredSize(new java.awt.Dimension(880, 600));
        pnlUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel7.setText("Usuarios");
        pnlUsuarios.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(pnlUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, 600));

        pnlCategorias.setBackground(new java.awt.Color(255, 255, 255));
        pnlCategorias.setMaximumSize(new java.awt.Dimension(880, 600));
        pnlCategorias.setMinimumSize(new java.awt.Dimension(880, 600));
        pnlCategorias.setPreferredSize(new java.awt.Dimension(880, 600));
        pnlCategorias.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                pnlCategoriasComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlCategoriasComponentShown(evt);
            }
        });
        pnlCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel8.setText("Descripción");
        pnlCategorias.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCategorias.getTableHeader().setResizingAllowed(false);
        tblCategorias.getTableHeader().setReorderingAllowed(false);
        tblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategorias);

        pnlCategorias.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 820, 270));

        txtCategoriaDescripcion.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtCategoriaDescripcion.setPreferredSize(new java.awt.Dimension(300, 35));
        pnlCategorias.add(txtCategoriaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel13.setText("Categorias");
        pnlCategorias.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnCategoriaEliminar.setBackground(new java.awt.Color(220, 38, 38));
        btnCategoriaEliminar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnCategoriaEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaEliminar.setText("ELIMINAR");
        btnCategoriaEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategoriaEliminar.setMaximumSize(new java.awt.Dimension(100, 50));
        btnCategoriaEliminar.setMinimumSize(new java.awt.Dimension(100, 50));
        btnCategoriaEliminar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnCategoriaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaEliminarActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnCategoriaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        btnCategoriaGuardar.setBackground(new java.awt.Color(68, 117, 245));
        btnCategoriaGuardar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnCategoriaGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaGuardar.setText("GUARDAR");
        btnCategoriaGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategoriaGuardar.setMaximumSize(new java.awt.Dimension(100, 50));
        btnCategoriaGuardar.setMinimumSize(new java.awt.Dimension(100, 50));
        btnCategoriaGuardar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnCategoriaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaGuardarActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnCategoriaGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        btnCategoriaModificar.setBackground(new java.awt.Color(217, 119, 6));
        btnCategoriaModificar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnCategoriaModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaModificar.setText("MODIFICAR");
        btnCategoriaModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategoriaModificar.setMaximumSize(new java.awt.Dimension(100, 50));
        btnCategoriaModificar.setMinimumSize(new java.awt.Dimension(100, 50));
        btnCategoriaModificar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnCategoriaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaModificarActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnCategoriaModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        btnCategoriaLimpiar.setBackground(new java.awt.Color(59, 130, 246));
        btnCategoriaLimpiar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        btnCategoriaLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaLimpiar.setText("LIMPIAR");
        btnCategoriaLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategoriaLimpiar.setMaximumSize(new java.awt.Dimension(100, 50));
        btnCategoriaLimpiar.setMinimumSize(new java.awt.Dimension(100, 50));
        btnCategoriaLimpiar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnCategoriaLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaLimpiarActionPerformed(evt);
            }
        });
        pnlCategorias.add(btnCategoriaLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        txtCategoriaCodigo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtCategoriaCodigo.setEnabled(false);
        txtCategoriaCodigo.setPreferredSize(new java.awt.Dimension(300, 35));
        pnlCategorias.add(txtCategoriaCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel14.setText("Código");
        pnlCategorias.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        getContentPane().add(pnlCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        new IniciarSesion().setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjemplaresActionPerformed
        this.mostrarPanel("ejemplares");
    }//GEN-LAST:event_btnEjemplaresActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        this.mostrarPanel("categorias");
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        this.mostrarPanel("usuarios");
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
        this.mostrarPanel("roles");
    }//GEN-LAST:event_btnRolesActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        this.mostrarPanel("configuracion");
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
        this.mostrarPanel("prestamos");
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void pnlPrestamosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlPrestamosComponentShown
        System.out.println("Se cargo el panel de prestamos");
    }//GEN-LAST:event_pnlPrestamosComponentShown

    private void pnlBienvenidaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlBienvenidaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBienvenidaComponentShown

    private void btnAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresActionPerformed
        this.mostrarPanel("autores");
    }//GEN-LAST:event_btnAutoresActionPerformed

    private void pnlAutoresComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlAutoresComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlAutoresComponentShown

    private void pnlCategoriasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlCategoriasComponentShown
        CategoriasCRUD categorias = new CategoriasCRUD();
        tblCategorias.setModel(categorias.select());
    }//GEN-LAST:event_pnlCategoriasComponentShown

    private void btnCategoriaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaEliminarActionPerformed
        if (txtCategoriaCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecciona una categoria", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            CategoriasCRUD categorias = new CategoriasCRUD();
            if (categorias.delete(Integer.parseInt(txtCategoriaCodigo.getText())) == 1) {
                JOptionPane.showMessageDialog(null, "Categoria eliminada correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar categoria", "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.limpiarCategoriaCampos();
            tblCategorias.setModel(categorias.select());
        }
    }//GEN-LAST:event_btnCategoriaEliminarActionPerformed

    private void btnCategoriaLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaLimpiarActionPerformed
        this.limpiarCategoriaCampos();
    }//GEN-LAST:event_btnCategoriaLimpiarActionPerformed

    private void tblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriasMouseClicked
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        txtCategoriaCodigo.setText(source.getModel().getValueAt(row, 0) + "");
        txtCategoriaDescripcion.setText(source.getModel().getValueAt(row, 1) + "");
    }//GEN-LAST:event_tblCategoriasMouseClicked

    private void btnCategoriaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaModificarActionPerformed
        if (txtCategoriaCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecciona una categoria", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            CategoriasCRUD categorias = new CategoriasCRUD();
            if (categorias.update(txtCategoriaDescripcion.getText(), Integer.parseInt(txtCategoriaCodigo.getText())) == 1) {
                JOptionPane.showMessageDialog(null, "Categoria modificada correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar categoria", "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.limpiarCategoriaCampos();
            tblCategorias.setModel(categorias.select());
        }
    }//GEN-LAST:event_btnCategoriaModificarActionPerformed

    private void btnCategoriaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaGuardarActionPerformed
        CategoriasCRUD categorias = new CategoriasCRUD();
        if (categorias.insert(txtCategoriaDescripcion.getText()) == 1) {
            JOptionPane.showMessageDialog(null, "Categoria creada correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear categoria", "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.limpiarCategoriaCampos();
        tblCategorias.setModel(categorias.select());
    }//GEN-LAST:event_btnCategoriaGuardarActionPerformed

    private void pnlCategoriasComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlCategoriasComponentHidden
        this.limpiarCategoriaCampos();
    }//GEN-LAST:event_pnlCategoriasComponentHidden

    private void btnConfiguracionModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionModificarActionPerformed
        if (txtConfiguracionAlumnos.getText().equals("") || txtConfiguracionProfesores.getText().equals("") || txtConfiguracionMora.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresa todos los datos", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            ConfiguracionCRUD configuracion = new ConfiguracionCRUD();
            if (configuracion.update(Integer.parseInt(txtConfiguracionAlumnos.getText()), Integer.parseInt(txtConfiguracionProfesores.getText()), Float.parseFloat(txtConfiguracionMora.getText())) == 1) {
                JOptionPane.showMessageDialog(null, "Configuracion modificada correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar configuracion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConfiguracionModificarActionPerformed

    private void pnlConfiguracionComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlConfiguracionComponentShown
        ConfiguracionCRUD configuracion = new ConfiguracionCRUD();
        String[] valores = configuracion.select();
        txtConfiguracionAlumnos.setText(valores[0]);
        txtConfiguracionProfesores.setText(valores[1]);
        txtConfiguracionMora.setText(valores[2]);
    }//GEN-LAST:event_pnlConfiguracionComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutores;
    private javax.swing.JButton btnCategoriaEliminar;
    private javax.swing.JButton btnCategoriaGuardar;
    private javax.swing.JButton btnCategoriaLimpiar;
    private javax.swing.JButton btnCategoriaModificar;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnConfiguracionModificar;
    private javax.swing.JButton btnEjemplares;
    private javax.swing.JButton btnPrestamos;
    private javax.swing.JButton btnRoles;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlAutores;
    private javax.swing.JPanel pnlBienvenida;
    private javax.swing.JPanel pnlCategorias;
    private javax.swing.JPanel pnlConfiguracion;
    private javax.swing.JPanel pnlEjemplares;
    private javax.swing.JPanel pnlPrestamos;
    private javax.swing.JPanel pnlRoles;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextField txtCategoriaCodigo;
    private javax.swing.JTextField txtCategoriaDescripcion;
    private javax.swing.JTextField txtConfiguracionAlumnos;
    private javax.swing.JTextField txtConfiguracionMora;
    private javax.swing.JTextField txtConfiguracionProfesores;
    // End of variables declaration//GEN-END:variables
}
