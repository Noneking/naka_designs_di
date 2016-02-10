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
        jLabel4 = new javax.swing.JLabel();
        btn_Login = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        pnl_TableMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMain = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_esconder_pnlPrincipal = new javax.swing.JButton();
        jTextFieldTableQuery = new javax.swing.JTextField();
        jButtonQueryClean = new javax.swing.JButton();
        pnl_Movimientos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        scrll_clientes = new javax.swing.JScrollPane();
        pnl_Clientes = new View.Methods.pnl_azul();
        jLabel19 = new javax.swing.JLabel();
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
        scrll_empleados = new javax.swing.JScrollPane();
        pnl_Empleado = new View.Methods.pnl_azul();
        jLabel26 = new javax.swing.JLabel();
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
        scrll_carrito = new javax.swing.JScrollPane();
        pnl_Carrito = new View.Methods.pnl_azul();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        scrll_productos = new javax.swing.JScrollPane();
        pnl_Productos = new View.Methods.pnl_azul();
        jLabel13 = new javax.swing.JLabel();
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
        scrll_categorias = new javax.swing.JScrollPane();
        pnl_Categorias = new View.Methods.pnl_azul();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCategoriaNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCategoriaDescripcion = new javax.swing.JTextArea();
        scrll_materiales = new javax.swing.JScrollPane();
        pnl_Materiales = new View.Methods.pnl_azul();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMaterialNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldMaterialCantidad = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jdialog_eliminar = new javax.swing.JDialog();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        scrll_listaCategorias = new javax.swing.JScrollPane();
        pnl_listaCategorias = new View.Methods.pnl_izquierda();
        jLabel42 = new javax.swing.JLabel();
        btn_añadirCategoria = new javax.swing.JButton();
        pnl_contenedorListaCategorias = new javax.swing.JPanel();
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
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
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

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("¿Ha olvidado su contraseña?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanelLogin.add(jLabel4);
        jLabel4.setBounds(200, 290, 150, 20);

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

        pnl_TableMain.setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setOpaque(false);

        jTableMain.setBackground(new java.awt.Color(153, 153, 153));
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
        jTableMain.setOpaque(false);
        jScrollPane1.setViewportView(jTableMain);

        btn_esconder_pnlPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow2_derecha.png"))); // NOI18N
        btn_esconder_pnlPrincipal.setBorderPainted(false);
        btn_esconder_pnlPrincipal.setContentAreaFilled(false);
        btn_esconder_pnlPrincipal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow1_derecha.png"))); // NOI18N

        jButtonQueryClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clean.png"))); // NOI18N
        jButtonQueryClean.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonQueryClean.setBorderPainted(false);
        jButtonQueryClean.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_esconder_pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTableQuery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonQueryClean))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonQueryClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_esconder_pnlPrincipal))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jTextFieldTableQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_TableMainLayout = new javax.swing.GroupLayout(pnl_TableMain);
        pnl_TableMain.setLayout(pnl_TableMainLayout);
        pnl_TableMainLayout.setHorizontalGroup(
            pnl_TableMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_TableMainLayout.setVerticalGroup(
            pnl_TableMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TableMainLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas de la BD"));

        jButton1.setText("Categorias");

        jButton2.setText("Productos");

        jButton4.setText("Materiales");

        jButton5.setText("Empleados");

        jButton6.setText("Clientes");

        jButton8.setText("Carritos");

        jButton9.setText("Enviar Correo");

        jButton10.setText("Informes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Graficas circulares y datos"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
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
            .addGap(0, 213, Short.MAX_VALUE)
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
            .addGroup(pnl_MovimientosLayout.createSequentialGroup()
                .addGroup(pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_MovimientosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_MovimientosLayout.createSequentialGroup()
                        .addGroup(pnl_MovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        scrll_clientes.setPreferredSize(new java.awt.Dimension(652, 360));

        pnl_Clientes.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Clientes.setMinimumSize(new java.awt.Dimension(650, 300));
        pnl_Clientes.setPreferredSize(new java.awt.Dimension(650, 360));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(182, 182, 182));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Cliente");

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(182, 182, 182));
        jLabel20.setText("Nick:");

        jTextFieldClienteNickname.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(182, 182, 182));
        jLabel21.setText("Nombre:");

        jTextFieldClienteNombre.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(182, 182, 182));
        jLabel22.setText("Apellidos:");

        jTextFieldClienteApellidos.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(182, 182, 182));
        jLabel23.setText("Email:");

        jTextFieldClienteEmail.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(182, 182, 182));
        jLabel24.setText("Password:");

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(182, 182, 182));
        jLabel25.setText("Re-password:");

        jTextFieldClienteRePassword.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jTextFieldClientePassword.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(182, 182, 182));
        jLabel27.setText("Tlf - movil:");

        jTextFieldClienteTelefono.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        javax.swing.GroupLayout pnl_ClientesLayout = new javax.swing.GroupLayout(pnl_Clientes);
        pnl_Clientes.setLayout(pnl_ClientesLayout);
        pnl_ClientesLayout.setHorizontalGroup(
            pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ClientesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ClientesLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnl_ClientesLayout.createSequentialGroup()
                        .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel27)
                            .addComponent(jLabel23)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldClienteNombre)
                            .addComponent(jTextFieldClienteApellidos)
                            .addComponent(jTextFieldClienteNickname)
                            .addComponent(jTextFieldClienteEmail)
                            .addComponent(jTextFieldClienteTelefono)
                            .addComponent(jTextFieldClienteRePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(jTextFieldClientePassword))
                        .addGap(100, 100, 100))))
        );
        pnl_ClientesLayout.setVerticalGroup(
            pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldClienteApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextFieldClienteNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextFieldClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldClientePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextFieldClienteRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrll_clientes.setViewportView(pnl_Clientes);

        pnl_Empleado.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Empleado.setMinimumSize(new java.awt.Dimension(650, 250));
        pnl_Empleado.setPreferredSize(new java.awt.Dimension(650, 390));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(182, 182, 182));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Empleados");

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(182, 182, 182));
        jLabel28.setText("Nombre:");

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(182, 182, 182));
        jLabel29.setText("Apellidos:");

        jLabel30.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(182, 182, 182));
        jLabel30.setText("Nick:");

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(182, 182, 182));
        jLabel31.setText("Tlf - movil:");

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(182, 182, 182));
        jLabel32.setText("Email:");

        jLabel33.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(182, 182, 182));
        jLabel33.setText("Password:");

        jLabel34.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(182, 182, 182));
        jLabel34.setText("Re-password:");

        jLabel35.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(182, 182, 182));
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

        javax.swing.GroupLayout pnl_EmpleadoLayout = new javax.swing.GroupLayout(pnl_Empleado);
        pnl_Empleado.setLayout(pnl_EmpleadoLayout);
        pnl_EmpleadoLayout.setHorizontalGroup(
            pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_EmpleadoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
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
                    .addComponent(jComboBoxEmpleadoRol, 0, 382, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmpleadoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmpleadoApellidos)
                    .addComponent(jTextFieldEmpleadoNickname)
                    .addComponent(jTextFieldEmpleadoTelefono)
                    .addComponent(jTextFieldEmpleadoEmail)
                    .addComponent(jTextFieldEmpleadoPassword)
                    .addComponent(jTextFieldEmpleadoRePassword))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_EmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_EmpleadoLayout.setVerticalGroup(
            pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_EmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
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
                .addContainerGap(37, Short.MAX_VALUE))
        );

        scrll_empleados.setViewportView(pnl_Empleado);

        pnl_Carrito.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Carrito.setMinimumSize(new java.awt.Dimension(650, 250));
        pnl_Carrito.setPreferredSize(new java.awt.Dimension(650, 250));

        jLabel36.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(182, 182, 182));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Carrito");

        jLabel37.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(182, 182, 182));
        jLabel37.setText("Cliente:");

        jTextField22.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jButtonBuscarCliente.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButtonBuscarCliente.setText("B");

        jLabel38.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(182, 182, 182));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Producto:");

        jButton14.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton14.setText("Buscar");

        jLabel39.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(182, 182, 182));
        jLabel39.setText("Nombre Producto");

        jLabel40.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(182, 182, 182));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout pnl_CarritoLayout = new javax.swing.GroupLayout(pnl_Carrito);
        pnl_Carrito.setLayout(pnl_CarritoLayout);
        pnl_CarritoLayout.setHorizontalGroup(
            pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CarritoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CarritoLayout.createSequentialGroup()
                        .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_CarritoLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton14)
                            .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_CarritoLayout.setVerticalGroup(
            pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        scrll_carrito.setViewportView(pnl_Carrito);

        scrll_productos.setPreferredSize(new java.awt.Dimension(652, 450));

        pnl_Productos.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Productos.setMinimumSize(new java.awt.Dimension(650, 250));
        pnl_Productos.setPreferredSize(new java.awt.Dimension(650, 400));

        jLabel13.setBackground(new java.awt.Color(182, 182, 182));
        jLabel13.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(182, 182, 182));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Producto");

        jLabel14.setBackground(new java.awt.Color(182, 182, 182));
        jLabel14.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(182, 182, 182));
        jLabel14.setText("Nombre:");

        jTextFieldProductoNombre.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel15.setBackground(new java.awt.Color(182, 182, 182));
        jLabel15.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(182, 182, 182));
        jLabel15.setText("Precio: ");

        jTextFieldProductoPrecio.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel16.setBackground(new java.awt.Color(182, 182, 182));
        jLabel16.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(182, 182, 182));
        jLabel16.setText("Categoria:");

        jComboBoxProductoCategoria.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jComboBoxProductoCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setBackground(new java.awt.Color(182, 182, 182));
        jLabel17.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(182, 182, 182));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Materiales");

        jButton7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton7.setText("Más");

        jTextFieldProductoCantidad.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N

        jLabel11.setBackground(new java.awt.Color(182, 182, 182));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(182, 182, 182));
        jLabel11.setText("Cantidad:");

        javax.swing.GroupLayout pnl_ProductosLayout = new javax.swing.GroupLayout(pnl_Productos);
        pnl_Productos.setLayout(pnl_ProductosLayout);
        pnl_ProductosLayout.setHorizontalGroup(
            pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ProductosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_ProductosLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProductoNombre))
                    .addGroup(pnl_ProductosLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldProductoPrecio))
                    .addGroup(pnl_ProductosLayout.createSequentialGroup()
                        .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldProductoCantidad)
                            .addComponent(jComboBoxProductoCategoria, 0, 410, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3)
                    .addGroup(pnl_ProductosLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addGap(100, 100, 100))
        );
        pnl_ProductosLayout.setVerticalGroup(
            pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrll_productos.setViewportView(pnl_Productos);

        pnl_Categorias.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Categorias.setMinimumSize(new java.awt.Dimension(650, 250));
        pnl_Categorias.setPreferredSize(new java.awt.Dimension(650, 300));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Categorias");
        jLabel8.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(182, 182, 182));
        jLabel9.setText("Nombre:");

        jTextFieldCategoriaNombre.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(182, 182, 182));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Descripcion de la categoria :");

        jTextAreaCategoriaDescripcion.setColumns(20);
        jTextAreaCategoriaDescripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextAreaCategoriaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCategoriaDescripcion);

        javax.swing.GroupLayout pnl_CategoriasLayout = new javax.swing.GroupLayout(pnl_Categorias);
        pnl_Categorias.setLayout(pnl_CategoriasLayout);
        pnl_CategoriasLayout.setHorizontalGroup(
            pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                .addGroup(pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldCategoriaNombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CategoriasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CategoriasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        pnl_CategoriasLayout.setVerticalGroup(
            pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(jTextFieldCategoriaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        scrll_categorias.setViewportView(pnl_Categorias);

        scrll_materiales.setPreferredSize(new java.awt.Dimension(652, 200));

        pnl_Materiales.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Materiales.setMinimumSize(new java.awt.Dimension(650, 250));
        pnl_Materiales.setPreferredSize(new java.awt.Dimension(650, 300));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Materiales");
        jLabel3.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(182, 182, 182));
        jLabel6.setText("Nombre: ");

        jTextFieldMaterialNombre.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(182, 182, 182));
        jLabel7.setText("Cantidad:");

        jTextFieldMaterialCantidad.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N

        javax.swing.GroupLayout pnl_MaterialesLayout = new javax.swing.GroupLayout(pnl_Materiales);
        pnl_Materiales.setLayout(pnl_MaterialesLayout);
        pnl_MaterialesLayout.setHorizontalGroup(
            pnl_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMaterialNombre))
                    .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMaterialCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_MaterialesLayout.setVerticalGroup(
            pnl_MaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MaterialesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        scrll_materiales.setViewportView(pnl_Materiales);

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

        scrll_listaCategorias.setPreferredSize(new java.awt.Dimension(310, 559));

        pnl_listaCategorias.setBackground(new java.awt.Color(51, 51, 51));
        pnl_listaCategorias.setMinimumSize(new java.awt.Dimension(300, 557));
        pnl_listaCategorias.setPreferredSize(new java.awt.Dimension(300, 557));

        jLabel42.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Categorias");

        btn_añadirCategoria.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        btn_añadirCategoria.setText("Añadir categoria");

        pnl_contenedorListaCategorias.setOpaque(false);

        javax.swing.GroupLayout pnl_contenedorListaCategoriasLayout = new javax.swing.GroupLayout(pnl_contenedorListaCategorias);
        pnl_contenedorListaCategorias.setLayout(pnl_contenedorListaCategoriasLayout);
        pnl_contenedorListaCategoriasLayout.setHorizontalGroup(
            pnl_contenedorListaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_contenedorListaCategoriasLayout.setVerticalGroup(
            pnl_contenedorListaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_listaCategoriasLayout = new javax.swing.GroupLayout(pnl_listaCategorias);
        pnl_listaCategorias.setLayout(pnl_listaCategoriasLayout);
        pnl_listaCategoriasLayout.setHorizontalGroup(
            pnl_listaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_listaCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_listaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_contenedorListaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_añadirCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_listaCategoriasLayout.setVerticalGroup(
            pnl_listaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_añadirCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_contenedorListaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        scrll_listaCategorias.setViewportView(pnl_listaCategorias);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Naka Designs Sevilla v0.2");
        setBackground(new java.awt.Color(51, 255, 255));
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

        SplitPane2.setDividerLocation(5);
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
            .addGap(0, 913, Short.MAX_VALUE)
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
            .addGap(0, 913, Short.MAX_VALUE)
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

        jMenuItem7.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem7.setText("Base de datos SQL");
        jMenu4.add(jMenuItem7);

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

        manu_bar.add(jMenu2);

        jMenu3.setText("Editar");
        jMenu3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jMenuItem5.setText("Apariencia");
        jMenu3.add(jMenuItem5);

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

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
       jLabel4.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       jLabel4.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        
    }//GEN-LAST:event_btn_homeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    public javax.swing.JButton btn_esconderRosa;
    public javax.swing.JButton btn_esconder_pnlPrincipal;
    public javax.swing.JButton btn_home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    public javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
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
    public javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanelLogin;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
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
    public javax.swing.JMenuItem mitem_contacta;
    public javax.swing.JMenuItem mitem_masInfo;
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
    public javax.swing.JPanel pnl_contenedorListaCategorias;
    public javax.swing.JPanel pnl_listaCategorias;
    public javax.swing.JPanel pnl_split1_derecha;
    public javax.swing.JPanel pnl_split1_izquierda;
    public javax.swing.JPanel pnl_split2_izquierda;
    public javax.swing.JPanel pnl_split3_derecha;
    public javax.swing.JPanel pnl_split3_inserts;
    public javax.swing.JScrollPane scrll_carrito;
    public javax.swing.JScrollPane scrll_categorias;
    public javax.swing.JScrollPane scrll_clientes;
    public javax.swing.JScrollPane scrll_empleados;
    public javax.swing.JScrollPane scrll_listaCategorias;
    public javax.swing.JScrollPane scrll_materiales;
    public javax.swing.JScrollPane scrll_productos;
    public javax.swing.JTextField txt_login_user;
    // End of variables declaration//GEN-END:variables
}
