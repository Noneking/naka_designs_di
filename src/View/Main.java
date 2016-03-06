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
        jLabelLogginErrorMessage = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnl_mensageMovimientos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pnl_TableMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMain = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_esconder_pnlPrincipal = new javax.swing.JButton();
        jButtonQueryClean = new javax.swing.JButton();
        jButtonQuerySearch = new javax.swing.JButton();
        jTextFieldTableQuery = new javax.swing.JTextField();
        pnl_contenedorDerecho = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        pnl_mostrarGrafica = new javax.swing.JPanel();
        pnl_contenedorInferiorMovimientos = new javax.swing.JPanel();
        pnl_Movimientos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_ventasMovi = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btn_empleMovi = new javax.swing.JButton();
        btn_productoMovi = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnl_contenedorDerechoMovimientos = new javax.swing.JPanel();
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
        jLabel27 = new javax.swing.JLabel();
        jTextFieldClienteTelefono = new javax.swing.JTextField();
        btn_insertarCliente = new javax.swing.JButton();
        btn_modificarCliente = new javax.swing.JButton();
        jPasswordFieldClientePassword = new javax.swing.JPasswordField();
        jPasswordFieldClienteRePassword = new javax.swing.JPasswordField();
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
        jComboBoxEmpleadoRol = new javax.swing.JComboBox();
        btn_insertarEmpleado = new javax.swing.JButton();
        btn_modificarEmpleado = new javax.swing.JButton();
        jPasswordFieldEmpleadoPassword = new javax.swing.JPasswordField();
        jPasswordFieldEmpleadoRePassword = new javax.swing.JPasswordField();
        pnl_Carrito = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldBasket = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        asd = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        btn_insertarCarrito = new javax.swing.JButton();
        eti_productoCarrito = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        pnl_listaCarrito = new javax.swing.JPanel();
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
        pnl_filechooser = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();
        btn_abrirFilechooser = new javax.swing.JButton();
        btn_verFilechooser = new javax.swing.JButton();
        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jFrame_productoCarrito = new javax.swing.JFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_productoCarrito = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSpinner_productoCarrito = new javax.swing.JSpinner();
        jFrame_clienteCarrito = new javax.swing.JFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_clienteCarrito = new javax.swing.JTable();
        jFrame_confiCrew = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_nombreConfiCrew = new javax.swing.JTextField();
        txt_apellidosConfiCrew = new javax.swing.JTextField();
        txt_telefonoConfiCrew = new javax.swing.JTextField();
        txt_emailConfiCrew = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPasswordField_contraseñaConfi = new javax.swing.JPasswordField();
        jPasswordField_reContraseñaConfi = new javax.swing.JPasswordField();
        txt_nickConfiCrew = new javax.swing.JTextField();
        btn_cancelarConfiCrew = new javax.swing.JButton();
        btn_modificarConfiCrew = new javax.swing.JButton();
        pnl_Main = new javax.swing.JPanel();
        SplitPane1 = new javax.swing.JSplitPane();
        pnl_split1_izquierda = new View.Methods.pnl_izquierda();
        btn_Clientes = new javax.swing.JButton();
        btn_Carritos = new javax.swing.JButton();
        btn_Empleados = new javax.swing.JButton();
        btn_Materiales = new javax.swing.JButton();
        btn_Categorias = new javax.swing.JButton();
        btn_esconderRosa = new javax.swing.JButton();
        pnl_listaCategorias = new javax.swing.JPanel();
        btn_añadirCategoria = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        eti_nickCrew = new javax.swing.JLabel();
        eti_emailCrew = new javax.swing.JLabel();
        pnl_split1_derecha = new javax.swing.JPanel();
        SplitPane3 = new javax.swing.JSplitPane();
        pnl_split3_derecha = new javax.swing.JPanel();
        pnl_split3_inserts = new javax.swing.JPanel();
        manu_bar = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mitem_nuevoProducto = new javax.swing.JMenuItem();
        mitem_nuevoMaterial = new javax.swing.JMenuItem();
        mitem_nuevoCliente = new javax.swing.JMenuItem();
        mitem_nuevoEmpleado = new javax.swing.JMenuItem();
        mitem_nuevoCarrito = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mitem_logout = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mn_apariencia = new javax.swing.JMenu();
        mitem_aluoxide = new javax.swing.JMenuItem();
        mitem_blackeye = new javax.swing.JMenuItem();
        mitem_blackstart = new javax.swing.JMenuItem();
        mitem_classy = new javax.swing.JMenuItem();
        mitem_configCrew = new javax.swing.JMenuItem();
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
        eti_olvidarContraseña.setBounds(200, 300, 150, 20);

        btn_Login.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        btn_Login.setText("Login");
        jPanelLogin.add(btn_Login);
        btn_Login.setBounds(80, 240, 210, 35);

        jLabelLogginErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelLogin.add(jLabelLogginErrorMessage);
        jLabelLogginErrorMessage.setBounds(10, 280, 340, 20);

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

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Para poder visualizar las Gráficas");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("pulse en las opciones mostradas");

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("en en el menu lateral izquierdo.");

        javax.swing.GroupLayout pnl_mensageMovimientosLayout = new javax.swing.GroupLayout(pnl_mensageMovimientos);
        pnl_mensageMovimientos.setLayout(pnl_mensageMovimientosLayout);
        pnl_mensageMovimientosLayout.setHorizontalGroup(
            pnl_mensageMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mensageMovimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mensageMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_mensageMovimientosLayout.setVerticalGroup(
            pnl_mensageMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mensageMovimientosLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(269, Short.MAX_VALUE))
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

        jButtonQuerySearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search1.png"))); // NOI18N
        jButtonQuerySearch.setBorderPainted(false);
        jButtonQuerySearch.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_esconder_pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldTableQuery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQuerySearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQueryClean))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jTextFieldTableQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btn_esconder_pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonQuerySearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonQueryClean, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_TableMainLayout = new javax.swing.GroupLayout(pnl_TableMain);
        pnl_TableMain.setLayout(pnl_TableMainLayout);
        pnl_TableMainLayout.setHorizontalGroup(
            pnl_TableMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_TableMainLayout.setVerticalGroup(
            pnl_TableMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TableMainLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Graficas circulares y datos"));

        pnl_mostrarGrafica.setPreferredSize(new java.awt.Dimension(730, 228));

        javax.swing.GroupLayout pnl_mostrarGraficaLayout = new javax.swing.GroupLayout(pnl_mostrarGrafica);
        pnl_mostrarGrafica.setLayout(pnl_mostrarGraficaLayout);
        pnl_mostrarGraficaLayout.setHorizontalGroup(
            pnl_mostrarGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_mostrarGraficaLayout.setVerticalGroup(
            pnl_mostrarGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_mostrarGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_mostrarGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        pnl_contenedorInferiorMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionalidades sobre aletas o avisos"));

        javax.swing.GroupLayout pnl_contenedorInferiorMovimientosLayout = new javax.swing.GroupLayout(pnl_contenedorInferiorMovimientos);
        pnl_contenedorInferiorMovimientos.setLayout(pnl_contenedorInferiorMovimientosLayout);
        pnl_contenedorInferiorMovimientosLayout.setHorizontalGroup(
            pnl_contenedorInferiorMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );
        pnl_contenedorInferiorMovimientosLayout.setVerticalGroup(
            pnl_contenedorInferiorMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_contenedorDerechoLayout = new javax.swing.GroupLayout(pnl_contenedorDerecho);
        pnl_contenedorDerecho.setLayout(pnl_contenedorDerechoLayout);
        pnl_contenedorDerechoLayout.setHorizontalGroup(
            pnl_contenedorDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_contenedorInferiorMovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_contenedorDerechoLayout.setVerticalGroup(
            pnl_contenedorDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contenedorDerechoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_contenedorInferiorMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas de la BD"));

        btn_ventasMovi.setText("Ventas");

        jButton9.setText("Enviar Correo");

        jButton10.setText("Informes");

        btn_empleMovi.setText("Empleados");

        btn_productoMovi.setText("Productos");

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
                    .addComponent(btn_productoMovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btn_productoMovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        javax.swing.GroupLayout pnl_contenedorDerechoMovimientosLayout = new javax.swing.GroupLayout(pnl_contenedorDerechoMovimientos);
        pnl_contenedorDerechoMovimientos.setLayout(pnl_contenedorDerechoMovimientosLayout);
        pnl_contenedorDerechoMovimientosLayout.setHorizontalGroup(
            pnl_contenedorDerechoMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        pnl_contenedorDerechoMovimientosLayout.setVerticalGroup(
            pnl_contenedorDerechoMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
                .addComponent(pnl_contenedorDerechoMovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_MovimientosLayout.setVerticalGroup(
            pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MovimientosLayout.createSequentialGroup()
                .addGroup(pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnl_contenedorDerechoMovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPasswordFieldClientePassword.setText("jPasswordField1");

        jPasswordFieldClienteRePassword.setText("jPasswordField1");

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
                                    .addComponent(jTextFieldClienteEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
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
                                    .addComponent(jTextFieldClienteNickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldClienteApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldClienteNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordFieldClientePassword)
                                    .addComponent(jPasswordFieldClienteRePassword)))))
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
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_ClientesLayout.createSequentialGroup()
                        .addComponent(jPasswordFieldClientePassword)
                        .addGap(4, 4, 4)))
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_ClientesLayout.createSequentialGroup()
                        .addComponent(jPasswordFieldClienteRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
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

        jComboBoxEmpleadoRol.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jComboBoxEmpleadoRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "em", "ad" }));

        btn_insertarEmpleado.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_insertarEmpleado.setText("Insertar");

        btn_modificarEmpleado.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_modificarEmpleado.setText("Modificar");

        jPasswordFieldEmpleadoPassword.setText("jPasswordField1");

        jPasswordFieldEmpleadoRePassword.setText("jPasswordField1");

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
                    .addComponent(jPasswordFieldEmpleadoPassword)
                    .addComponent(jPasswordFieldEmpleadoRePassword))
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
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33)
                    .addGroup(pnl_EmpleadoLayout.createSequentialGroup()
                        .addComponent(jPasswordFieldEmpleadoPassword)
                        .addGap(2, 2, 2)))
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addGroup(pnl_EmpleadoLayout.createSequentialGroup()
                        .addComponent(jPasswordFieldEmpleadoRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jComboBoxEmpleadoRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
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

        jTextFieldBasket.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

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

        javax.swing.GroupLayout asdLayout = new javax.swing.GroupLayout(asd);
        asd.setLayout(asdLayout);
        asdLayout.setHorizontalGroup(
            asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addContainerGap())
        );
        asdLayout.setVerticalGroup(
            asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(asdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_insertarCarrito.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btn_insertarCarrito.setText("Insertar");

        eti_productoCarrito.setBackground(new java.awt.Color(255, 255, 255));
        eti_productoCarrito.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        eti_productoCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_productoCarrito.setText("null");
        eti_productoCarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eti_productoCarrito.setOpaque(true);

        pnl_listaCarrito.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnl_listaCarritoLayout = new javax.swing.GroupLayout(pnl_listaCarrito);
        pnl_listaCarrito.setLayout(pnl_listaCarritoLayout);
        pnl_listaCarritoLayout.setHorizontalGroup(
            pnl_listaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );
        pnl_listaCarritoLayout.setVerticalGroup(
            pnl_listaCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jScrollPane7.setViewportView(pnl_listaCarrito);

        javax.swing.GroupLayout pnl_CarritoLayout = new javax.swing.GroupLayout(pnl_Carrito);
        pnl_Carrito.setLayout(pnl_CarritoLayout);
        pnl_CarritoLayout.setHorizontalGroup(
            pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CarritoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldBasket, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addComponent(eti_productoCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14)
                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_CarritoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
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
                        .addComponent(jTextFieldBasket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscarCliente))
                .addGap(27, 27, 27)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jButton14)
                    .addComponent(eti_productoCarrito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CarritoLayout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(btn_insertarCarrito))
                    .addComponent(jScrollPane7))
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

        jFileChooser1.setControlButtonsAreShown(false);
        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\MrDrulix\\Desktop"));
        jFileChooser1.setFileHidingEnabled(true);
        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
        jFileChooser1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jFileChooser1.setForeground(new java.awt.Color(204, 204, 204));
        jFileChooser1.setBorder(null);

        btn_abrirFilechooser.setText("Abrir");

        btn_verFilechooser.setText("Ver");

        javax.swing.GroupLayout pnl_filechooserLayout = new javax.swing.GroupLayout(pnl_filechooser);
        pnl_filechooser.setLayout(pnl_filechooserLayout);
        pnl_filechooserLayout.setHorizontalGroup(
            pnl_filechooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_filechooserLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_filechooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_abrirFilechooser, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(btn_verFilechooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnl_filechooserLayout.setVerticalGroup(
            pnl_filechooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
            .addGroup(pnl_filechooserLayout.createSequentialGroup()
                .addComponent(btn_abrirFilechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_verFilechooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuItemModificar.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItemModificar.setText("Modificar");
        jPopupMenu.add(jMenuItemModificar);

        jMenuItemEliminar.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItemEliminar.setText("Eliminar");
        jPopupMenu.add(jMenuItemEliminar);

        jFrame_productoCarrito.setTitle("Selección de Producto");
        jFrame_productoCarrito.setResizable(false);

        jTable_productoCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable_productoCarrito);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Cantidad:");

        jSpinner_productoCarrito.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout jFrame_productoCarritoLayout = new javax.swing.GroupLayout(jFrame_productoCarrito.getContentPane());
        jFrame_productoCarrito.getContentPane().setLayout(jFrame_productoCarritoLayout);
        jFrame_productoCarritoLayout.setHorizontalGroup(
            jFrame_productoCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
            .addGroup(jFrame_productoCarritoLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner_productoCarrito))
        );
        jFrame_productoCarritoLayout.setVerticalGroup(
            jFrame_productoCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame_productoCarritoLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame_productoCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_productoCarrito)))
        );

        jFrame_clienteCarrito.setTitle("Selección de Cliente");
        jFrame_clienteCarrito.setResizable(false);

        jTable_clienteCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable_clienteCarrito);

        javax.swing.GroupLayout jFrame_clienteCarritoLayout = new javax.swing.GroupLayout(jFrame_clienteCarrito.getContentPane());
        jFrame_clienteCarrito.getContentPane().setLayout(jFrame_clienteCarritoLayout);
        jFrame_clienteCarritoLayout.setHorizontalGroup(
            jFrame_clienteCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        jFrame_clienteCarritoLayout.setVerticalGroup(
            jFrame_clienteCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jFrame_confiCrew.setTitle("Configuracion de Empleado");
        jFrame_confiCrew.setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos personales"));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel4.setText("Email: ");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel5.setText("Nombre: ");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel12.setText("Apellidos: ");

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel26.setText("Teléfono: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombreConfiCrew)
                    .addComponent(txt_apellidosConfiCrew)
                    .addComponent(txt_telefonoConfiCrew)
                    .addComponent(txt_emailConfiCrew))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nombreConfiCrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_apellidosConfiCrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txt_telefonoConfiCrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_emailConfiCrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));

        jLabel36.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel36.setText("Nickname: ");

        jLabel42.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel42.setText("Contraseña: ");

        jLabel43.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel43.setText("Re-Contraseña: ");

        jPasswordField_contraseñaConfi.setText("asd");

        jPasswordField_reContraseñaConfi.setText("asd");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField_contraseñaConfi)
                    .addComponent(jPasswordField_reContraseñaConfi, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(txt_nickConfiCrew))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txt_nickConfiCrew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jPasswordField_contraseñaConfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jPasswordField_reContraseñaConfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cancelarConfiCrew.setText("Cancelar");

        btn_modificarConfiCrew.setText("Modificar");

        javax.swing.GroupLayout jFrame_confiCrewLayout = new javax.swing.GroupLayout(jFrame_confiCrew.getContentPane());
        jFrame_confiCrew.getContentPane().setLayout(jFrame_confiCrewLayout);
        jFrame_confiCrewLayout.setHorizontalGroup(
            jFrame_confiCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame_confiCrewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame_confiCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame_confiCrewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_modificarConfiCrew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelarConfiCrew)))
                .addContainerGap())
        );
        jFrame_confiCrewLayout.setVerticalGroup(
            jFrame_confiCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame_confiCrewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame_confiCrewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelarConfiCrew)
                    .addComponent(btn_modificarConfiCrew))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Naka Designs Sevilla v0.3");
        setBackground(null);
        setUndecorated(true);

        pnl_Main.setOpaque(false);

        SplitPane1.setBorder(null);
        SplitPane1.setDividerLocation(200);
        SplitPane1.setEnabled(false);
        SplitPane1.setFocusable(false);
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

        pnl_listaCategorias.setOpaque(false);

        btn_añadirCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/masCategorias.png"))); // NOI18N
        btn_añadirCategoria.setBorderPainted(false);
        btn_añadirCategoria.setContentAreaFilled(false);
        btn_añadirCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/masCategorias_selected.png"))); // NOI18N
        btn_añadirCategoria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/presed/masCategorias_presed.png"))); // NOI18N

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setHorizontalScrollBar(null);
        jScrollPane8.setOpaque(false);

        jPanel7.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jScrollPane8.setViewportView(jPanel7);

        javax.swing.GroupLayout pnl_listaCategoriasLayout = new javax.swing.GroupLayout(pnl_listaCategorias);
        pnl_listaCategorias.setLayout(pnl_listaCategoriasLayout);
        pnl_listaCategoriasLayout.setHorizontalGroup(
            pnl_listaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btn_añadirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 291, Short.MAX_VALUE)
        );
        pnl_listaCategoriasLayout.setVerticalGroup(
            pnl_listaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaCategoriasLayout.createSequentialGroup()
                .addComponent(btn_añadirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8)
                .addContainerGap())
        );

        jPanel3.setOpaque(false);

        eti_nickCrew.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        eti_nickCrew.setForeground(new java.awt.Color(204, 204, 204));
        eti_nickCrew.setText("null");

        eti_emailCrew.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        eti_emailCrew.setForeground(new java.awt.Color(204, 204, 204));
        eti_emailCrew.setText("null");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eti_emailCrew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eti_nickCrew, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(eti_nickCrew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eti_emailCrew)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_split1_izquierdaLayout = new javax.swing.GroupLayout(pnl_split1_izquierda);
        pnl_split1_izquierda.setLayout(pnl_split1_izquierdaLayout);
        pnl_split1_izquierdaLayout.setHorizontalGroup(
            pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_split1_izquierdaLayout.createSequentialGroup()
                .addGroup(pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_Carritos)
                        .addComponent(btn_Empleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Categorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Materiales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_listaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_split1_izquierdaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_esconderRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_split1_izquierdaLayout.setVerticalGroup(
            pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_split1_izquierdaLayout.createSequentialGroup()
                .addComponent(btn_esconderRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_split1_izquierdaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btn_Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Carritos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_split1_izquierdaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_listaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        SplitPane1.setLeftComponent(pnl_split1_izquierda);

        SplitPane3.setDividerLocation(1000);
        SplitPane3.setDividerSize(0);
        SplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        javax.swing.GroupLayout pnl_split3_derechaLayout = new javax.swing.GroupLayout(pnl_split3_derecha);
        pnl_split3_derecha.setLayout(pnl_split3_derechaLayout);
        pnl_split3_derechaLayout.setHorizontalGroup(
            pnl_split3_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
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
            .addGap(0, 720, Short.MAX_VALUE)
        );
        pnl_split3_insertsLayout.setVerticalGroup(
            pnl_split3_insertsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SplitPane3.setRightComponent(pnl_split3_inserts);

        javax.swing.GroupLayout pnl_split1_derechaLayout = new javax.swing.GroupLayout(pnl_split1_derecha);
        pnl_split1_derecha.setLayout(pnl_split1_derechaLayout);
        pnl_split1_derechaLayout.setHorizontalGroup(
            pnl_split1_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane3)
        );
        pnl_split1_derechaLayout.setVerticalGroup(
            pnl_split1_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        SplitPane1.setRightComponent(pnl_split1_derecha);

        javax.swing.GroupLayout pnl_MainLayout = new javax.swing.GroupLayout(pnl_Main);
        pnl_Main.setLayout(pnl_MainLayout);
        pnl_MainLayout.setHorizontalGroup(
            pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );
        pnl_MainLayout.setVerticalGroup(
            pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu2.setText("Archivo");
        jMenu2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save.png"))); // NOI18N
        jMenu4.setText("Guardar");
        jMenu4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pdf.png"))); // NOI18N
        jMenuItem3.setText("Informe");
        jMenu4.add(jMenuItem3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/agenda.png"))); // NOI18N
        jMenu5.setText("Agenda de ...");
        jMenu5.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/agenda_usuario.png"))); // NOI18N
        jMenuItem9.setText("Clientes");
        jMenu5.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/agenda_crew.png"))); // NOI18N
        jMenuItem10.setText("Empleados");
        jMenu5.add(jMenuItem10);

        jMenu4.add(jMenu5);

        jMenu2.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add.png"))); // NOI18N
        jMenu6.setText("Nuevo . . .");
        jMenu6.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        mitem_nuevoProducto.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_nuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/table/product.png"))); // NOI18N
        mitem_nuevoProducto.setText("Producto");
        jMenu6.add(mitem_nuevoProducto);

        mitem_nuevoMaterial.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_nuevoMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/table/material.png"))); // NOI18N
        mitem_nuevoMaterial.setText("Material");
        jMenu6.add(mitem_nuevoMaterial);

        mitem_nuevoCliente.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_nuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/table/user.png"))); // NOI18N
        mitem_nuevoCliente.setText("Cliente");
        jMenu6.add(mitem_nuevoCliente);

        mitem_nuevoEmpleado.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_nuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/table/crew.png"))); // NOI18N
        mitem_nuevoEmpleado.setText("Empleado");
        mitem_nuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_nuevoEmpleadoActionPerformed(evt);
            }
        });
        jMenu6.add(mitem_nuevoEmpleado);

        mitem_nuevoCarrito.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_nuevoCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/table/basket.png"))); // NOI18N
        mitem_nuevoCarrito.setText("Carrito");
        jMenu6.add(mitem_nuevoCarrito);

        jMenu2.add(jMenu6);
        jMenu2.add(jSeparator2);

        mitem_logout.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout.png"))); // NOI18N
        mitem_logout.setText("Cerrar sesión");
        jMenu2.add(mitem_logout);

        manu_bar.add(jMenu2);

        jMenu3.setText("Editar");
        jMenu3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        mn_apariencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/apariencia.png"))); // NOI18N
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

        mitem_configCrew.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_configCrew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/settings_mini.png"))); // NOI18N
        mitem_configCrew.setText("Cofiguración Usuario");
        jMenu3.add(mitem_configCrew);

        manu_bar.add(jMenu3);

        menu_movimientos.setText("Movimientos");
        menu_movimientos.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        mn_historial_ventas.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        mn_historial_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/movi.png"))); // NOI18N
        mn_historial_ventas.setText("Historial ventas");
        menu_movimientos.add(mn_historial_ventas);

        manu_bar.add(menu_movimientos);

        jMenu1.setText("Ayuda");
        jMenu1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/manual.png"))); // NOI18N
        jMenuItem1.setText("Paso a paso");
        jMenu1.add(jMenuItem1);

        mitem_contacta.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_contacta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mail.png"))); // NOI18N
        mitem_contacta.setText("Contacta");
        jMenu1.add(mitem_contacta);

        mitem_masInfo.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        mitem_masInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/web.png"))); // NOI18N
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

    private void mitem_nuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_nuevoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitem_nuevoEmpleadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField Ptxt_login_password;
    public javax.swing.JSplitPane SplitPane1;
    public javax.swing.JSplitPane SplitPane3;
    public javax.swing.JPanel asd;
    public javax.swing.JButton btn_Carritos;
    public javax.swing.JButton btn_Categorias;
    public javax.swing.JButton btn_Clientes;
    public javax.swing.JButton btn_Empleados;
    public javax.swing.JButton btn_Login;
    public javax.swing.JButton btn_Materiales;
    public javax.swing.JButton btn_abrirFilechooser;
    public javax.swing.JButton btn_añadirCategoria;
    public javax.swing.JButton btn_cancelarConfiCrew;
    public javax.swing.JButton btn_categorias_insertar;
    public javax.swing.JButton btn_categorias_modificar;
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
    public javax.swing.JButton btn_modificarConfiCrew;
    public javax.swing.JButton btn_modificarEmpleado;
    public javax.swing.JButton btn_modificarMaterial;
    public javax.swing.JButton btn_modificarProducto;
    public javax.swing.JButton btn_productoMovi;
    public javax.swing.JButton btn_ventasMovi;
    public javax.swing.JButton btn_verFilechooser;
    public javax.swing.JLabel eti_emailCrew;
    public javax.swing.JLabel eti_nickCrew;
    public javax.swing.JLabel eti_olvidarContraseña;
    public javax.swing.JLabel eti_productoCarrito;
    private javax.swing.JButton jButton10;
    public javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    public javax.swing.JButton jButtonBuscarCliente;
    public javax.swing.JButton jButtonQueryClean;
    public javax.swing.JButton jButtonQuerySearch;
    public javax.swing.JComboBox jComboBoxEmpleadoRol;
    public javax.swing.JComboBox jComboBoxProductoCategoria;
    public javax.swing.JFileChooser jFileChooser1;
    public javax.swing.JFrame jFrameLoggin;
    private javax.swing.JFrame jFrame_clienteCarrito;
    public javax.swing.JFrame jFrame_confiCrew;
    private javax.swing.JFrame jFrame_productoCarrito;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    public javax.swing.JLabel jLabel41;
    public javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelLogginErrorMessage;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JMenuItem jMenuItemEliminar;
    public javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanelLogin;
    public javax.swing.JPasswordField jPasswordFieldClientePassword;
    public javax.swing.JPasswordField jPasswordFieldClienteRePassword;
    public javax.swing.JPasswordField jPasswordFieldEmpleadoPassword;
    public javax.swing.JPasswordField jPasswordFieldEmpleadoRePassword;
    public javax.swing.JPasswordField jPasswordField_contraseñaConfi;
    public javax.swing.JPasswordField jPasswordField_reContraseñaConfi;
    public javax.swing.JPopupMenu jPopupMenu;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSlider jSlider1;
    public javax.swing.JSpinner jSpinner_productoCarrito;
    public javax.swing.JTable jTableMain;
    public javax.swing.JTable jTable_clienteCarrito;
    private javax.swing.JTable jTable_productoCarrito;
    public javax.swing.JTextArea jTextAreaCategoriaDescripcion;
    public javax.swing.JTextField jTextFieldBasket;
    public javax.swing.JTextField jTextFieldCategoriaNombre;
    public javax.swing.JTextField jTextFieldClienteApellidos;
    public javax.swing.JTextField jTextFieldClienteEmail;
    public javax.swing.JTextField jTextFieldClienteNickname;
    public javax.swing.JTextField jTextFieldClienteNombre;
    public javax.swing.JTextField jTextFieldClienteTelefono;
    public javax.swing.JTextField jTextFieldEmpleadoApellidos;
    public javax.swing.JTextField jTextFieldEmpleadoEmail;
    public javax.swing.JTextField jTextFieldEmpleadoNickname;
    public javax.swing.JTextField jTextFieldEmpleadoNombre;
    public javax.swing.JTextField jTextFieldEmpleadoTelefono;
    public javax.swing.JTextField jTextFieldMaterialCantidad;
    public javax.swing.JTextField jTextFieldMaterialNombre;
    public javax.swing.JTextField jTextFieldProductoCantidad;
    public javax.swing.JTextField jTextFieldProductoNombre;
    public javax.swing.JTextField jTextFieldProductoPrecio;
    public javax.swing.JTextField jTextFieldTableQuery;
    public javax.swing.JMenuBar manu_bar;
    public javax.swing.JMenu menu_movimientos;
    public javax.swing.JMenuItem mitem_aluoxide;
    public javax.swing.JMenuItem mitem_blackeye;
    public javax.swing.JMenuItem mitem_blackstart;
    public javax.swing.JMenuItem mitem_classy;
    public javax.swing.JMenuItem mitem_configCrew;
    public javax.swing.JMenuItem mitem_contacta;
    public javax.swing.JMenuItem mitem_logout;
    public javax.swing.JMenuItem mitem_masInfo;
    public javax.swing.JMenuItem mitem_nuevoCarrito;
    public javax.swing.JMenuItem mitem_nuevoCliente;
    public javax.swing.JMenuItem mitem_nuevoEmpleado;
    public javax.swing.JMenuItem mitem_nuevoMaterial;
    public javax.swing.JMenuItem mitem_nuevoProducto;
    public javax.swing.JMenu mn_apariencia;
    public javax.swing.JMenuItem mn_historial_ventas;
    public javax.swing.JPanel pnl_Carrito;
    public javax.swing.JPanel pnl_Categorias;
    public javax.swing.JPanel pnl_Clientes;
    public javax.swing.JPanel pnl_Empleado;
    public javax.swing.JPanel pnl_Main;
    public javax.swing.JPanel pnl_Materiales;
    public javax.swing.JPanel pnl_Movimientos;
    public javax.swing.JPanel pnl_Productos;
    public javax.swing.JPanel pnl_TableMain;
    public javax.swing.JPanel pnl_contenedorDerecho;
    public javax.swing.JPanel pnl_contenedorDerechoMovimientos;
    public javax.swing.JPanel pnl_contenedorInferiorMovimientos;
    public javax.swing.JPanel pnl_filechooser;
    public javax.swing.JPanel pnl_listaCarrito;
    public javax.swing.JPanel pnl_listaCategorias;
    public javax.swing.JPanel pnl_mensageMovimientos;
    public javax.swing.JPanel pnl_mostrarGrafica;
    public javax.swing.JPanel pnl_split1_derecha;
    public javax.swing.JPanel pnl_split1_izquierda;
    public javax.swing.JPanel pnl_split3_derecha;
    public javax.swing.JPanel pnl_split3_inserts;
    public javax.swing.JTextField txt_apellidosConfiCrew;
    public javax.swing.JTextField txt_emailConfiCrew;
    public javax.swing.JTextField txt_login_user;
    public javax.swing.JTextField txt_nickConfiCrew;
    public javax.swing.JTextField txt_nombreConfiCrew;
    public javax.swing.JTextField txt_telefonoConfiCrew;
    // End of variables declaration//GEN-END:variables
}
