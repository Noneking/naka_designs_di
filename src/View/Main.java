/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Methods.pnl_Split_Derecha;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author nonek
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameLoggin = new javax.swing.JFrame();
        jPanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_login_user = new javax.swing.JTextField();
        Ptxt_login_password = new javax.swing.JPasswordField();
        eti_olvidarContraseña = new javax.swing.JLabel();
        btn_Login = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        pnl_TableMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMain = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_esconder_pnlPrincipal = new javax.swing.JButton();
        jTextFieldTableQuery = new javax.swing.JTextField();
        jButtonQueryClean = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        pnl_Movimientos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_ventasMovi = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btn_empleMovi = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        pnl_mostrarGrafica = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnl_Clientes = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldClienteNickname = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldClienteNombre = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldClienteApellidos = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldClienteEmail = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldClienteRePassword = new javax.swing.JTextField();
        jTextFieldClientePassword = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldClienteTelefono = new javax.swing.JTextField();
        btn_insertarCliente = new javax.swing.JButton();
        btn_modificarCliente = new javax.swing.JButton();
        pnl_Empleado = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldEmpleadoNombre = new javax.swing.JTextField();
        jTextFieldEmpleadoApellidos = new javax.swing.JTextField();
        jTextFieldEmpleadoNickname = new javax.swing.JTextField();
        jTextFieldEmpleadoTelefono = new javax.swing.JTextField();
        jTextFieldEmpleadoEmail = new javax.swing.JTextField();
        jTextFieldEmpleadoPassword = new javax.swing.JTextField();
        jTextFieldEmpleadoRePassword = new javax.swing.JTextField();
        jComboBoxEmpleadoRol = new javax.swing.JComboBox();
        btn_insertarEmpleado = new javax.swing.JButton();
        btn_modificarEmpleado = new javax.swing.JButton();
        pnl_Carrito = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        pnl_listaCarrito = new javax.swing.JPanel();
        btn_insertarCarrito = new javax.swing.JButton();
        pnl_Productos = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldProductoNombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldProductoPrecio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxProductoCategoria = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextFieldProductoCantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        btn_insertarProducto = new javax.swing.JButton();
        btn_modificarProducto = new javax.swing.JButton();
        pnl_Categorias = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCategoriaNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCategoriaDescripcion = new javax.swing.JTextArea();
        btn_categorias_insertar = new javax.swing.JButton();
        btn_categorias_modificar = new javax.swing.JButton();
        pnl_Materiales = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMaterialNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldMaterialCantidad = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        btn_insertarMaterial = new javax.swing.JButton();
        btn_modificarMaterial = new javax.swing.JButton();
        jdialog_eliminar = new javax.swing.JDialog();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        pnl_listaCategorias = new View.Methods.pnl_izquierda();
        btn_añadirCategoria = new javax.swing.JButton();
        pnl_contenedorListaCategorias = new javax.swing.JPanel();
        Frame_guardandoBD = new javax.swing.JFrame();
        pbar_guardandoBD = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        eti_estadoGuardandoBD = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_logGuardandoBD = new javax.swing.JTextArea();
        btn_comenzarGuardarBD = new javax.swing.JButton();
        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        pnl_Main = new javax.swing.JPanel();
        SplitPane1 = new javax.swing.JSplitPane();
        pnl_split1_izquierda = new View.Methods.pnl_izquierda();
        btn_Clientes = new javax.swing.JButton();
        btn_Carritos = new javax.swing.JButton();
        btn_Empleados = new javax.swing.JButton();
        btn_Materiales = new javax.swing.JButton();
        btn_Categorias = new javax.swing.JButton();
        btn_esconderRosa = new javax.swing.JButton();
        pnl_split1_derecha = new javax.swing.JPanel();
        SplitPane2 = new javax.swing.JSplitPane();
        pnl_split2_izquierda = new javax.swing.JPanel();
        SplitPane3 = new javax.swing.JSplitPane();
        pnl_split3_derecha = new javax.swing.JPanel();
        pnl_split3_inserts = new javax.swing.JPanel();
        manu_bar = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mitem_guardarBD = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mitem_nuevoMaterial = new javax.swing.JMenuItem();
        mitem_nuevoCliente = new javax.swing.JMenuItem();
        mitem_nuevoEmpleado = new javax.swing.JMenuItem();
        mitem_nuevoCarrito = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mn_apariencia = new javax.swing.JMenu();
        mitem_aluoxide = new javax.swing.JMenuItem();
        mitem_blackeye = new javax.swing.JMenuItem();
        mitem_blackstart = new javax.swing.JMenuItem();
        mitem_classy = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menu_movimientos = new javax.swing.JMenu();
        mn_historial_ventas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mitem_contacta = new javax.swing.JMenuItem();
        mitem_masInfo = new javax.swing.JMenuItem();

        jFrameLoggin.setTitle("Loggin");
        jFrameLoggin.setBounds(new java.awt.Rectangle(300, 300, 300, 300));
        jFrameLoggin.setUndecorated(true);
        jFrameLoggin.setResizable(false);
        jFrameLoggin.setSize(new java.awt.Dimension(361, 303));

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setPreferredSize(new java.awt.Dimension(361, 360));
        jPanelLogin.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario:");
        jPanelLogin.add(jLabel1);
        jLabel1.setBounds(0, 20, 361, 26);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña:");
        jPanelLogin.add(jLabel2);
        jLabel2.setBounds(0, 80, 361, 26);

        txt_login_user.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jPanelLogin.add(txt_login_user);
        txt_login_user.setBounds(100, 50, 160, 32);

        Ptxt_login_password.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jPanelLogin.add(Ptxt_login_password);
        Ptxt_login_password.setBounds(100, 110, 160, 32);

        eti_olvidarContraseña.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        eti_olvidarContraseña.setForeground(new java.awt.Color(0, 51, 255));
        eti_olvidarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eti_olvidarContraseña.setText("¿Ha olvidado su contraseña?");
        eti_olvidarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eti_olvidarContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eti_olvidarContraseñaMouseExited(evt);
            }
        });
        jPanelLogin.add(eti_olvidarContraseña);
        eti_olvidarContraseña.setBounds(200, 290, 150, 20);

        btn_Login.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        btn_Login.setText("Login");
        jPanelLogin.add(btn_Login);
        btn_Login.setBounds(80, 240, 210, 35);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/naka_designs_sevilla_logo.png"))); // NOI18N
        jPanelLogin.add(jLabel18);
        jLabel18.setBounds(0, 0, 360, 330);

        javax.swing.GroupLayout jFrameLogginLayout = new javax.swing.GroupLayout(jFrameLoggin.getContentPane());
        jFrameLoggin.getContentPane().setLayout(jFrameLogginLayout);
        jFrameLogginLayout.setHorizontalGroup(
            jFrameLogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrameLogginLayout.setVerticalGroup(
            jFrameLogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setOpaque(false);

        jTableMain.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTableMain.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMain.setGridColor(new java.awt.Color(255, 255, 255));
        jTableMain.setOpaque(false);
        jTableMain.setSelectionBackground(new java.awt.Color(102, 255, 102));
        jScrollPane1.setViewportView(jTableMain);

        btn_esconder_pnlPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow2_derecha.png"))); // NOI18N
        btn_esconder_pnlPrincipal.setBorderPainted(false);
        btn_esconder_pnlPrincipal.setContentAreaFilled(false);
        btn_esconder_pnlPrincipal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow1_derecha.png"))); // NOI18N

        jButtonQueryClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clean.png"))); // NOI18N
        jButtonQueryClean.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonQueryClean.setBorderPainted(false);
        jButtonQueryClean.setContentAreaFilled(false);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search1.png"))); // NOI18N
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_esconder_pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTableQuery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQueryClean, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_esconder_pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTableQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonQueryClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_TableMainLayout = new javax.swing.GroupLayout(pnl_TableMain);
        pnl_TableMain.setLayout(pnl_TableMainLayout);
        pnl_TableMainLayout.setHorizontalGroup(
            pnl_TableMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_TableMainLayout.setVerticalGroup(
            pnl_TableMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TableMainLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas de la BD"));

        btn_ventasMovi.setText("Ventas");

        jButton9.setText("Enviar Correo");

        jButton10.setText("Informes");

        btn_empleMovi.setText("Empleados");

        jButton2.setText("Productos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ventasMovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10))
                    .addComponent(btn_empleMovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_ventasMovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_empleMovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Graficas circulares y datos"));

        pnl_mostrarGrafica.setPreferredSize(new java.awt.Dimension(730, 228));

        javax.swing.GroupLayout pnl_mostrarGraficaLayout = new javax.swing.GroupLayout(pnl_mostrarGrafica);
        pnl_mostrarGrafica.setLayout(pnl_mostrarGraficaLayout);
        pnl_mostrarGraficaLayout.setHorizontalGroup(
            pnl_mostrarGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        pnl_mostrarGraficaLayout.setVerticalGroup(
            pnl_mostrarGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_mostrarGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_mostrarGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionalidades sobre aletas o avisos"));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/home.png"))); // NOI18N
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/home_selected.png"))); // NOI18N
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/settings.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/settings_selected.png"))); // NOI18N

        javax.swing.GroupLayout pnl_MovimientosLayout = new javax.swing.GroupLayout(pnl_Movimientos);
        pnl_Movimientos.setLayout(pnl_MovimientosLayout);
        pnl_MovimientosLayout.setHorizontalGroup(
            pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MovimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_MovimientosLayout.createSequentialGroup()
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_MovimientosLayout.setVerticalGroup(
            pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MovimientosLayout.createSequentialGroup()
                .addGroup(pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_MovimientosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_MovimientosLayout.createSequentialGroup()
                        .addGroup(pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnl_Clientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        pnl_Clientes.setMaximumSize(new java.awt.Dimension(600, 400));
        pnl_Clientes.setMinimumSize(new java.awt.Dimension(600, 400));
        pnl_Clientes.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel20.setText("Nick:");
        jLabel20.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldClienteNickname.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jTextFieldClienteNickname.setMaximumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteNickname.setMinimumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteNickname.setPreferredSize(new java.awt.Dimension(326, 32));

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel21.setText("Nombre:");
        jLabel21.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldClienteNombre.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jTextFieldClienteNombre.setMaximumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteNombre.setMinimumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteNombre.setPreferredSize(new java.awt.Dimension(326, 32));

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel22.setText("Apellidos:");
        jLabel22.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldClienteApellidos.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jTextFieldClienteApellidos.setMaximumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteApellidos.setMinimumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteApellidos.setPreferredSize(new java.awt.Dimension(326, 32));

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel23.setText("Email:");
        jLabel23.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldClienteEmail.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jTextFieldClienteEmail.setMaximumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteEmail.setMinimumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteEmail.setPreferredSize(new java.awt.Dimension(326, 32));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel24.setText("Password:");
        jLabel24.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel25.setText("Re-password:");
        jLabel25.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldClienteRePassword.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jTextFieldClienteRePassword.setMaximumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteRePassword.setMinimumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteRePassword.setPreferredSize(new java.awt.Dimension(326, 32));

        jTextFieldClientePassword.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jTextFieldClientePassword.setMaximumSize(new java.awt.Dimension(326, 32));
        jTextFieldClientePassword.setMinimumSize(new java.awt.Dimension(326, 32));
        jTextFieldClientePassword.setPreferredSize(new java.awt.Dimension(326, 32));

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel27.setText("Tlf - movil:");
        jLabel27.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldClienteTelefono.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jTextFieldClienteTelefono.setMaximumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteTelefono.setMinimumSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteTelefono.setPreferredSize(new java.awt.Dimension(326, 32));
        jTextFieldClienteTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteTelefonoActionPerformed(evt);
            }
        });

        btn_insertarCliente.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_insertarCliente.setText("Insertar");

        btn_modificarCliente.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_modificarCliente.setText("Modificar");

        javax.swing.GroupLayout pnl_ClientesLayout = new javax.swing.GroupLayout(pnl_Clientes);
        pnl_Clientes.setLayout(pnl_ClientesLayout);
        pnl_ClientesLayout.setHorizontalGroup(
            pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ClientesLayout.createSequentialGroup()
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ClientesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_ClientesLayout.createSequentialGroup()
                                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldClienteEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                                    .addComponent(jTextFieldClienteTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnl_ClientesLayout.createSequentialGroup()
                                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldClienteRePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldClientePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldClienteNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldClienteApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldClienteNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ClientesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_insertarCliente)))
                .addContainerGap())
        );
        pnl_ClientesLayout.setVerticalGroup(
            pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClientePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insertarCliente)
                    .addComponent(btn_modificarCliente))
                .addContainerGap())
        );

        pnl_Empleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));
        pnl_Empleado.setMinimumSize(new java.awt.Dimension(650, 250));
        pnl_Empleado.setPreferredSize(new java.awt.Dimension(650, 390));

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel28.setText("Nombre:");

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel29.setText("Apellidos:");

        jLabel30.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel30.setText("Nick:");

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel31.setText("Tlf - movil:");

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel32.setText("Email:");

        jLabel33.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel33.setText("Password:");

        jLabel34.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel34.setText("Re-password:");

        jLabel35.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel35.setText("Rol:");

        jTextFieldEmpleadoNombre.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jTextFieldEmpleadoApellidos.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jTextFieldEmpleadoNickname.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jTextFieldEmpleadoTelefono.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jTextFieldEmpleadoEmail.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jTextFieldEmpleadoPassword.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jTextFieldEmpleadoRePassword.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jComboBoxEmpleadoRol.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jComboBoxEmpleadoRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Empleado", "Administrador" }));

        btn_insertarEmpleado.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_insertarEmpleado.setText("Insertar");

        btn_modificarEmpleado.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_modificarEmpleado.setText("Modificar");

        javax.swing.GroupLayout pnl_EmpleadoLayout = new javax.swing.GroupLayout(pnl_Empleado);
        pnl_Empleado.setLayout(pnl_EmpleadoLayout);
        pnl_EmpleadoLayout.setHorizontalGroup(
            pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_EmpleadoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEmpleadoRol, 0, 370, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmpleadoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmpleadoApellidos)
                    .addComponent(jTextFieldEmpleadoNickname)
                    .addComponent(jTextFieldEmpleadoTelefono)
                    .addComponent(jTextFieldEmpleadoEmail)
                    .addComponent(jTextFieldEmpleadoPassword)
                    .addComponent(jTextFieldEmpleadoRePassword))
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_EmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_modificarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_insertarEmpleado)
                .addContainerGap())
        );
        pnl_EmpleadoLayout.setVerticalGroup(
            pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_EmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextFieldEmpleadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextFieldEmpleadoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextFieldEmpleadoNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextFieldEmpleadoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextFieldEmpleadoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextFieldEmpleadoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextFieldEmpleadoRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jComboBoxEmpleadoRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insertarEmpleado)
                    .addComponent(btn_modificarEmpleado))
                .addContainerGap())
        );

        pnl_Carrito.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrito"));
        pnl_Carrito.setMinimumSize(new java.awt.Dimension(650, 250));
        pnl_Carrito.setPreferredSize(new java.awt.Dimension(650, 250));

        jLabel37.setBackground(java.awt.Color.white);
        jLabel37.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel37.setText("Cliente:");

        jTextField22.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jButtonBuscarCliente.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButtonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search1.png"))); // NOI18N
        jButtonBuscarCliente.setContentAreaFilled(false);

        jLabel38.setBackground(java.awt.Color.white);
        jLabel38.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Producto:");

        jButton14.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton14.setText("Buscar");

        jLabel39.setBackground(java.awt.Color.white);
        jLabel39.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel39.setText("Nombre Producto");

        jLabel40.setBackground(java.awt.Color.white);
        jLabel40.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel40.setText("Precio");

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("--");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_listaCarrito.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnl_listaCarritoLayout = new javax.swing.GroupLayout(pnl_listaCarrito);
        pnl_listaCarrito.setLayout(pnl_listaCarritoLayout);
        pnl_listaCarritoLayout.setHorizontalGroup(
            pnl_listaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_listaCarritoLayout.setVerticalGroup(
            pnl_listaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_insertarCarrito.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_insertarCarrito.setText("Insertar");

        javax.swing.GroupLayout pnl_CarritoLayout = new javax.swing.GroupLayout(pnl_Carrito);
        pnl_Carrito.setLayout(pnl_CarritoLayout);
        pnl_CarritoLayout.setHorizontalGroup(
            pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CarritoLayout.createSequentialGroup()
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_CarritoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_CarritoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14)
                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(pnl_CarritoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_listaCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(btn_insertarCarrito)
                .addContainerGap())
        );
        pnl_CarritoLayout.setVerticalGroup(
            pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CarritoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscarCliente))
                .addGap(27, 27, 27)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CarritoLayout.createSequentialGroup()
                        .addGap(0, 196, Short.MAX_VALUE)
                        .addComponent(btn_insertarCarrito))
                    .addComponent(pnl_listaCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_Productos.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));
        pnl_Productos.setMinimumSize(new java.awt.Dimension(650, 250));
        pnl_Productos.setPreferredSize(new java.awt.Dimension(650, 400));

        jLabel14.setBackground(new java.awt.Color(182, 182, 182));
        jLabel14.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel14.setText("Nombre:");

        jTextFieldProductoNombre.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel15.setBackground(new java.awt.Color(182, 182, 182));
        jLabel15.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel15.setText("Precio: ");

        jTextFieldProductoPrecio.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel16.setBackground(new java.awt.Color(182, 182, 182));
        jLabel16.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel16.setText("Categoria:");

        jComboBoxProductoCategoria.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jComboBoxProductoCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setBackground(new java.awt.Color(182, 182, 182));
        jLabel17.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Materiales");

        jButton7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton7.setText("Más");

        jTextFieldProductoCantidad.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel11.setBackground(new java.awt.Color(182, 182, 182));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel11.setText("Cantidad:");

        btn_insertarProducto.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_insertarProducto.setText("Insertar");

        btn_modificarProducto.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_modificarProducto.setText("Modificar");

        javax.swing.GroupLayout pnl_ProductosLayout = new javax.swing.GroupLayout(pnl_Productos);
        pnl_Productos.setLayout(pnl_ProductosLayout);
        pnl_ProductosLayout.setHorizontalGroup(
            pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ProductosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(pnl_ProductosLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addGroup(pnl_ProductosLayout.createSequentialGroup()
                        .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldProductoNombre)
                            .addComponent(jTextFieldProductoPrecio)
                            .addComponent(jTextFieldProductoCantidad)
                            .addComponent(jComboBoxProductoCategoria, 0, 398, Short.MAX_VALUE))))
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_modificarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_insertarProducto)
                .addContainerGap())
        );
        pnl_ProductosLayout.setVerticalGroup(
            pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxProductoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insertarProducto)
                    .addComponent(btn_modificarProducto))
                .addContainerGap())
        );

        pnl_Categorias.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorias"));
        pnl_Categorias.setMinimumSize(new java.awt.Dimension(650, 250));
        pnl_Categorias.setPreferredSize(new java.awt.Dimension(650, 300));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setText("Nombre:");

        jTextFieldCategoriaNombre.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Descripcion de la categoria :");

        jTextAreaCategoriaDescripcion.setColumns(20);
        jTextAreaCategoriaDescripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextAreaCategoriaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCategoriaDescripcion);

        btn_categorias_insertar.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_categorias_insertar.setText("Insertar");

        btn_categorias_modificar.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_categorias_modificar.setText("Modificar");

        javax.swing.GroupLayout pnl_CategoriasLayout = new javax.swing.GroupLayout(pnl_Categorias);
        pnl_Categorias.setLayout(pnl_CategoriasLayout);
        pnl_CategoriasLayout.setHorizontalGroup(
            pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                .addGroup(pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                        .addGap(0, 464, Short.MAX_VALUE)
                        .addComponent(btn_categorias_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_categorias_insertar))
                    .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldCategoriaNombre))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        pnl_CategoriasLayout.setVerticalGroup(
            pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(jTextFieldCategoriaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_categorias_insertar)
                    .addComponent(btn_categorias_modificar))
                .addContainerGap())
        );

        pnl_Materiales.setBorder(javax.swing.BorderFactory.createTitledBorder("Materiales"));
        pnl_Materiales.setMinimumSize(new java.awt.Dimension(650, 150));
        pnl_Materiales.setName(""); // NOI18N
        pnl_Materiales.setPreferredSize(new java.awt.Dimension(650, 150));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        jLabel6.setText("Nombre: ");

        jTextFieldMaterialNombre.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        jLabel7.setText("Cantidad:");

        jTextFieldMaterialCantidad.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N

        btn_insertarMaterial.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_insertarMaterial.setText("Insertar");

        btn_modificarMaterial.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_modificarMaterial.setText("Modificar");

        javax.swing.GroupLayout pnl_MaterialesLayout = new javax.swing.GroupLayout(pnl_Materiales);
        pnl_Materiales.setLayout(pnl_MaterialesLayout);
        pnl_MaterialesLayout.setHorizontalGroup(
            pnl_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMaterialNombre))
                    .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMaterialCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MaterialesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_modificarMaterial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_insertarMaterial)))
                .addContainerGap())
        );
        pnl_MaterialesLayout.setVerticalGroup(
            pnl_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jTextFieldMaterialNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(jTextFieldMaterialCantidad)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insertarMaterial)
                    .addComponent(btn_modificarMaterial))
                .addContainerGap())
        );

        jdialog_eliminar.setUndecorated(true);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setTitle("JOption personalizado");
        jInternalFrame1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jInternalFrame1.setVisible(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("¿Estas seguro de que quieres eliminar este \"----------------------\"?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton11.setText("Cacelar");

        jButton12.setText("Aceptar");

        jCheckBox1.setText("No volver a mostrar este mensage.");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clean.png"))); // NOI18N

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 53, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jdialog_eliminarLayout = new javax.swing.GroupLayout(jdialog_eliminar.getContentPane());
        jdialog_eliminar.getContentPane().setLayout(jdialog_eliminarLayout);
        jdialog_eliminarLayout.setHorizontalGroup(
            jdialog_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        jdialog_eliminarLayout.setVerticalGroup(
            jdialog_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pnl_listaCategorias.setBackground(new java.awt.Color(51, 51, 51));
        pnl_listaCategorias.setMinimumSize(new java.awt.Dimension(300, 557));
        pnl_listaCategorias.setPreferredSize(new java.awt.Dimension(290, 557));

        btn_añadirCategoria.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        btn_añadirCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/masCategorias.png"))); // NOI18N
        btn_añadirCategoria.setBorderPainted(false);
        btn_añadirCategoria.setContentAreaFilled(false);
        btn_añadirCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/masCategorias_selected.png"))); // NOI18N
        btn_añadirCategoria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/presed/masCategorias_presed.png"))); // NOI18N

        pnl_contenedorListaCategorias.setOpaque(false);

        javax.swing.GroupLayout pnl_contenedorListaCategoriasLayout = new javax.swing.GroupLayout(pnl_contenedorListaCategorias);
        pnl_contenedorListaCategorias.setLayout(pnl_contenedorListaCategoriasLayout);
        pnl_contenedorListaCategoriasLayout.setHorizontalGroup(
            pnl_contenedorListaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        pnl_contenedorListaCategoriasLayout.setVerticalGroup(
            pnl_contenedorListaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_listaCategoriasLayout = new javax.swing.GroupLayout(pnl_listaCategorias);
        pnl_listaCategorias.setLayout(pnl_listaCategoriasLayout);
        pnl_listaCategoriasLayout.setHorizontalGroup(
            pnl_listaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_listaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_contenedorListaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_añadirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_listaCategoriasLayout.setVerticalGroup(
            pnl_listaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_añadirCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_contenedorListaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pbar_guardandoBD.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel4.setText("Guardando:");

        eti_estadoGuardandoBD.setBackground(new java.awt.Color(255, 255, 255));
        eti_estadoGuardandoBD.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        eti_estadoGuardandoBD.setText(".");
        eti_estadoGuardandoBD.setOpaque(true);

        ta_logGuardandoBD.setEditable(false);
        ta_logGuardandoBD.setColumns(20);
        ta_logGuardandoBD.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        ta_logGuardandoBD.setRows(5);
        ta_logGuardandoBD.setEnabled(false);
        jScrollPane4.setViewportView(ta_logGuardandoBD);

        btn_comenzarGuardarBD.setText("Comenzar");

        javax.swing.GroupLayout Frame_guardandoBDLayout = new javax.swing.GroupLayout(Frame_guardandoBD.getContentPane());
        Frame_guardandoBD.getContentPane().setLayout(Frame_guardandoBDLayout);
        Frame_guardandoBDLayout.setHorizontalGroup(
            Frame_guardandoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_guardandoBDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Frame_guardandoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_estadoGuardandoBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Frame_guardandoBDLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_comenzarGuardarBD))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addComponent(pbar_guardandoBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Frame_guardandoBDLayout.setVerticalGroup(
            Frame_guardandoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Frame_guardandoBDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Frame_guardandoBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_comenzarGuardarBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eti_estadoGuardandoBD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbar_guardandoBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuItemEliminar.setText("Eliminar");
        jPopupMenu.add(jMenuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Naka Designs Sevilla v0.3");
        setBackground(null);
        setUndecorated(true);

        SplitPane1.setBorder(null);
        SplitPane1.setDividerLocation(200);
        SplitPane1.setEnabled(false);
        SplitPane1.setFocusable(false);
        SplitPane1.setLastDividerLocation(200);
        SplitPane1.setMinimumSize(new java.awt.Dimension(200, 450));

        pnl_split1_izquierda.setBackground(new java.awt.Color(0, 0, 0));
        pnl_split1_izquierda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btn_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/Clientes.png"))); // NOI18N
        btn_Clientes.setBorderPainted(false);
        btn_Clientes.setContentAreaFilled(false);
        btn_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Clientes.setPreferredSize(new java.awt.Dimension(83, 55));
        btn_Clientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/Clientes_selected.png"))); // NOI18N
        btn_Clientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/presed/Clientes_presed.png"))); // NOI18N

        btn_Carritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/Carrito.png"))); // NOI18N
        btn_Carritos.setBorderPainted(false);
        btn_Carritos.setContentAreaFilled(false);
        btn_Carritos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Carritos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/Carrito_selected.png"))); // NOI18N
        btn_Carritos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/presed/Carrito_presed.png"))); // NOI18N

        btn_Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/Empleados.png"))); // NOI18N
        btn_Empleados.setBorderPainted(false);
        btn_Empleados.setContentAreaFilled(false);
        btn_Empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Empleados.setPreferredSize(new java.awt.Dimension(83, 55));
        btn_Empleados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/Empleados_selected.png"))); // NOI18N
        btn_Empleados.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/presed/Empleados_presed.png"))); // NOI18N

        btn_Materiales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/Materiales.png"))); // NOI18N
        btn_Materiales.setBorderPainted(false);
        btn_Materiales.setContentAreaFilled(false);
        btn_Materiales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Materiales.setPreferredSize(new java.awt.Dimension(83, 55));
        btn_Materiales.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/Materiales_selected.png"))); // NOI18N
        btn_Materiales.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/presed/Materiales_presed.png"))); // NOI18N

        btn_Categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/Categorias.png"))); // NOI18N
        btn_Categorias.setBorderPainted(false);
        btn_Categorias.setContentAreaFilled(false);
        btn_Categorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Categorias.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/Categorias_select.png"))); // NOI18N
        btn_Categorias.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/presed/Categorias_presed.png"))); // NOI18N

        btn_esconderRosa.setBackground(new java.awt.Color(255, 255, 255));
        btn_esconderRosa.setForeground(new java.awt.Color(255, 255, 255));
        btn_esconderRosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow1_blanco.png"))); // NOI18N
        btn_esconderRosa.setBorderPainted(false);
        btn_esconderRosa.setContentAreaFilled(false);
        btn_esconderRosa.setFocusPainted(false);
        btn_esconderRosa.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow1_izquierda.png"))); // NOI18N

        javax.swing.GroupLayout pnl_split1_izquierdaLayout = new javax.swing.GroupLayout(pnl_split1_izquierda);
        pnl_split1_izquierda.setLayout(pnl_split1_izquierdaLayout);
        pnl_split1_izquierdaLayout.setHorizontalGroup(
            pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_split1_izquierdaLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btn_esconderRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_split1_izquierdaLayout.createSequentialGroup()
                .addGroup(pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_Empleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Categorias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Clientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Materiales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_Carritos))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_split1_izquierdaLayout.setVerticalGroup(
            pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_split1_izquierdaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_esconderRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Carritos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        SplitPane1.setLeftComponent(pnl_split1_izquierda);

        SplitPane2.setDividerLocation(0);
        SplitPane2.setDividerSize(0);
        SplitPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SplitPane2.setMaximumSize(new java.awt.Dimension(300, 100));
        SplitPane2.setMinimumSize(new java.awt.Dimension(300, 3));

        pnl_split2_izquierda.setBackground(new java.awt.Color(0, 0, 0));
        pnl_split2_izquierda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout pnl_split2_izquierdaLayout = new javax.swing.GroupLayout(pnl_split2_izquierda);
        pnl_split2_izquierda.setLayout(pnl_split2_izquierdaLayout);
        pnl_split2_izquierdaLayout.setHorizontalGroup(
            pnl_split2_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_split2_izquierdaLayout.setVerticalGroup(
            pnl_split2_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        SplitPane2.setLeftComponent(pnl_split2_izquierda);

        SplitPane3.setDividerLocation(1000);
        SplitPane3.setDividerSize(0);
        SplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        javax.swing.GroupLayout pnl_split3_derechaLayout = new javax.swing.GroupLayout(pnl_split3_derecha);
        pnl_split3_derecha.setLayout(pnl_split3_derechaLayout);
        pnl_split3_derechaLayout.setHorizontalGroup(
            pnl_split3_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );
        pnl_split3_derechaLayout.setVerticalGroup(
            pnl_split3_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SplitPane3.setTopComponent(pnl_split3_derecha);

        javax.swing.GroupLayout pnl_split3_insertsLayout = new javax.swing.GroupLayout(pnl_split3_inserts);
        pnl_split3_inserts.setLayout(pnl_split3_insertsLayout);
        pnl_split3_insertsLayout.setHorizontalGroup(
            pnl_split3_insertsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );
        pnl_split3_insertsLayout.setVerticalGroup(
            pnl_split3_insertsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SplitPane3.setRightComponent(pnl_split3_inserts);

        SplitPane2.setRightComponent(SplitPane3);

        javax.swing.GroupLayout pnl_split1_derechaLayout = new javax.swing.GroupLayout(pnl_split1_derecha);
        pnl_split1_derecha.setLayout(pnl_split1_derechaLayout);
        pnl_split1_derechaLayout.setHorizontalGroup(
            pnl_split1_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_split1_derechaLayout.setVerticalGroup(
            pnl_split1_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SplitPane1.setRightComponent(pnl_split1_derecha);

        javax.swing.GroupLayout pnl_MainLayout = new javax.swing.GroupLayout(pnl_Main);
        pnl_Main.setLayout(pnl_MainLayout);
        pnl_MainLayout.setHorizontalGroup(
            pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
        );
        pnl_MainLayout.setVerticalGroup(
            pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu2.setText("Archivo");
        jMenu2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jMenu4.setText("Guardar");
        jMenu4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem3.setText("Informe");
        jMenu4.add(jMenuItem3);

        mitem_guardarBD.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_guardarBD.setText("Base de datos SQL");
        jMenu4.add(mitem_guardarBD);

        jMenu5.setText("Agenda de ...");
        jMenu5.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem9.setText("Clientes");
        jMenu5.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem10.setText("Empleados");
        jMenu5.add(jMenuItem10);

        jMenu4.add(jMenu5);

        jMenu2.add(jMenu4);

        jMenuItem4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem4.setText("Reconectar base de datos");
        jMenu2.add(jMenuItem4);

        jMenu6.setText("Nuevo . . .");
        jMenu6.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        mitem_nuevoMaterial.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_nuevoMaterial.setText("Materiales");
        jMenu6.add(mitem_nuevoMaterial);

        mitem_nuevoCliente.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_nuevoCliente.setText("Clientes");
        jMenu6.add(mitem_nuevoCliente);

        mitem_nuevoEmpleado.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_nuevoEmpleado.setText("Empleado");
        jMenu6.add(mitem_nuevoEmpleado);

        mitem_nuevoCarrito.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_nuevoCarrito.setText("Carrito");
        jMenu6.add(mitem_nuevoCarrito);

        jMenu2.add(jMenu6);

        manu_bar.add(jMenu2);

        jMenu3.setText("Editar");
        jMenu3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        mn_apariencia.setText("Apariencia");
        mn_apariencia.setFocusable(false);
        mn_apariencia.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        mitem_aluoxide.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_aluoxide.setText("Alu Oxide");
        mn_apariencia.add(mitem_aluoxide);

        mitem_blackeye.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_blackeye.setText("Black Eye");
        mn_apariencia.add(mitem_blackeye);

        mitem_blackstart.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_blackstart.setText("Black Start");
        mn_apariencia.add(mitem_blackstart);

        mitem_classy.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_classy.setText("Classy");
        mn_apariencia.add(mitem_classy);

        jMenu3.add(mn_apariencia);

        jMenuItem6.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem6.setText("Datos base");
        jMenu3.add(jMenuItem6);

        manu_bar.add(jMenu3);

        menu_movimientos.setText("Movimientos");
        menu_movimientos.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        mn_historial_ventas.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        mn_historial_ventas.setText("Historial ventas");
        menu_movimientos.add(mn_historial_ventas);

        manu_bar.add(menu_movimientos);

        jMenu1.setText("Ayuda");
        jMenu1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem1.setText("Paso a paso");
        jMenu1.add(jMenuItem1);

        mitem_contacta.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_contacta.setText("Contacta");
        jMenu1.add(mitem_contacta);

        mitem_masInfo.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_masInfo.setText("Mas información");
        jMenu1.add(mitem_masInfo);

        manu_bar.add(jMenu1);

        setJMenuBar(manu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eti_olvidarContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eti_olvidarContraseñaMouseExited
       eti_olvidarContraseña.setForeground(Color.blue);
    }//GEN-LAST:event_eti_olvidarContraseñaMouseExited

    private void eti_olvidarContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eti_olvidarContraseñaMouseEntered
       eti_olvidarContraseña.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_eti_olvidarContraseñaMouseEntered

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        
    }//GEN-LAST:event_btn_homeActionPerformed

    private void jTextFieldClienteTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteTelefonoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFrame Frame_guardandoBD;
    public javax.swing.JPasswordField Ptxt_login_password;
    public javax.swing.JSplitPane SplitPane1;
    public javax.swing.JSplitPane SplitPane2;
    public javax.swing.JSplitPane SplitPane3;
    public javax.swing.JButton btn_Carritos;
    public javax.swing.JButton btn_Categorias;
    public javax.swing.JButton btn_Clientes;
    public javax.swing.JButton btn_Empleados;
    public javax.swing.JButton btn_Login;
    public javax.swing.JButton btn_Materiales;
    public javax.swing.JButton btn_añadirCategoria;
    public javax.swing.JButton btn_categorias_insertar;
    public javax.swing.JButton btn_categorias_modificar;
    public javax.swing.JButton btn_comenzarGuardarBD;
    public javax.swing.JButton btn_empleMovi;
    public javax.swing.JButton btn_esconderRosa;
    public javax.swing.JButton btn_esconder_pnlPrincipal;
    public javax.swing.JButton btn_home;
    public javax.swing.JButton btn_insertarCarrito;
    public javax.swing.JButton btn_insertarCliente;
    public javax.swing.JButton btn_insertarEmpleado;
    public javax.swing.JButton btn_insertarMaterial;
    public javax.swing.JButton btn_insertarProducto;
    public javax.swing.JButton btn_modificarCliente;
    public javax.swing.JButton btn_modificarEmpleado;
    public javax.swing.JButton btn_modificarMaterial;
    public javax.swing.JButton btn_modificarProducto;
    public javax.swing.JButton btn_ventasMovi;
    public javax.swing.JLabel eti_estadoGuardandoBD;
    public javax.swing.JLabel eti_olvidarContraseña;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    public javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    public javax.swing.JButton jButtonBuscarCliente;
    public javax.swing.JButton jButtonQueryClean;
    private javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JComboBox jComboBoxEmpleadoRol;
    public javax.swing.JComboBox jComboBoxProductoCategoria;
    public javax.swing.JFrame jFrameLoggin;
    private javax.swing.JInternalFrame jInternalFrame1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    public javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanelLogin;
    public javax.swing.JPopupMenu jPopupMenu;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSlider1;
    public javax.swing.JTable jTableMain;
    public javax.swing.JTextArea jTextAreaCategoriaDescripcion;
    public javax.swing.JTextField jTextField22;
    public javax.swing.JTextField jTextFieldCategoriaNombre;
    public javax.swing.JTextField jTextFieldClienteApellidos;
    public javax.swing.JTextField jTextFieldClienteEmail;
    public javax.swing.JTextField jTextFieldClienteNickname;
    public javax.swing.JTextField jTextFieldClienteNombre;
    public javax.swing.JTextField jTextFieldClientePassword;
    public javax.swing.JTextField jTextFieldClienteRePassword;
    public javax.swing.JTextField jTextFieldClienteTelefono;
    public javax.swing.JTextField jTextFieldEmpleadoApellidos;
    public javax.swing.JTextField jTextFieldEmpleadoEmail;
    public javax.swing.JTextField jTextFieldEmpleadoNickname;
    public javax.swing.JTextField jTextFieldEmpleadoNombre;
    public javax.swing.JTextField jTextFieldEmpleadoPassword;
    public javax.swing.JTextField jTextFieldEmpleadoRePassword;
    public javax.swing.JTextField jTextFieldEmpleadoTelefono;
    public javax.swing.JTextField jTextFieldMaterialCantidad;
    public javax.swing.JTextField jTextFieldMaterialNombre;
    public javax.swing.JTextField jTextFieldProductoCantidad;
    public javax.swing.JTextField jTextFieldProductoNombre;
    public javax.swing.JTextField jTextFieldProductoPrecio;
    public javax.swing.JTextField jTextFieldTableQuery;
    public javax.swing.JDialog jdialog_eliminar;
    public javax.swing.JMenuBar manu_bar;
    public javax.swing.JMenu menu_movimientos;
    public javax.swing.JMenuItem mitem_aluoxide;
    public javax.swing.JMenuItem mitem_blackeye;
    public javax.swing.JMenuItem mitem_blackstart;
    public javax.swing.JMenuItem mitem_classy;
    public javax.swing.JMenuItem mitem_contacta;
    public javax.swing.JMenuItem mitem_guardarBD;
    public javax.swing.JMenuItem mitem_masInfo;
    public javax.swing.JMenuItem mitem_nuevoCarrito;
    public javax.swing.JMenuItem mitem_nuevoCliente;
    public javax.swing.JMenuItem mitem_nuevoEmpleado;
    public javax.swing.JMenuItem mitem_nuevoMaterial;
    public javax.swing.JMenu mn_apariencia;
    public javax.swing.JMenuItem mn_historial_ventas;
    public javax.swing.JProgressBar pbar_guardandoBD;
    public javax.swing.JPanel pnl_Carrito;
    public javax.swing.JPanel pnl_Categorias;
    public javax.swing.JPanel pnl_Clientes;
    public javax.swing.JPanel pnl_Empleado;
    public javax.swing.JPanel pnl_Main;
    public javax.swing.JPanel pnl_Materiales;
    public javax.swing.JPanel pnl_Movimientos;
    public javax.swing.JPanel pnl_Productos;
    public javax.swing.JPanel pnl_TableMain;
    public javax.swing.JPanel pnl_contenedorListaCategorias;
    public javax.swing.JPanel pnl_listaCarrito;
    public javax.swing.JPanel pnl_listaCategorias;
    public javax.swing.JPanel pnl_mostrarGrafica;
    public javax.swing.JPanel pnl_split1_derecha;
    public javax.swing.JPanel pnl_split1_izquierda;
    public javax.swing.JPanel pnl_split2_izquierda;
    public javax.swing.JPanel pnl_split3_derecha;
    public javax.swing.JPanel pnl_split3_inserts;
    public javax.swing.JTextArea ta_logGuardandoBD;
    public javax.swing.JTextField txt_login_user;
    // End of variables declaration//GEN-END:variables
}
