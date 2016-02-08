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
        pnl_Categorias = new View.Methods.pnl_azul();
        btn_esconderAzul = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCategoriaNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCategoriaDescripcion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        pnl_Materiales = new View.Methods.pnl_azul();
        btn_esconderAzul1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMaterialNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldMaterialCantidad = new javax.swing.JTextField();
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
        pnl_Main = new javax.swing.JPanel();
        SplitPane1 = new javax.swing.JSplitPane();
        pnl_split1_izquierda = new View.Methods.pnl_izquierda();
        btn_Clientes = new javax.swing.JButton();
        btn_Productos = new javax.swing.JButton();
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
        jPanel2 = new javax.swing.JPanel();
        manu_bar = new javax.swing.JMenuBar();
        menu_movimientos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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
                    .addComponent(jTextFieldTableQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_esconder_pnlPrincipal))
                .addGap(0, 10, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
        );

        pnl_Categorias.setBackground(new java.awt.Color(0, 204, 255));
        pnl_Categorias.setPreferredSize(new java.awt.Dimension(300, 498));
        pnl_Categorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_esconderAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow2_izquierda.png"))); // NOI18N
        btn_esconderAzul.setBorderPainted(false);
        btn_esconderAzul.setContentAreaFilled(false);
        btn_esconderAzul.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow1_izquierda.png"))); // NOI18N
        pnl_Categorias.add(btn_esconderAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 10, 30, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Categorias");
        jLabel8.setOpaque(true);
        pnl_Categorias.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 280, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(182, 182, 182));
        jLabel9.setText("Nombre:");
        pnl_Categorias.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, -1, -1));

        jTextFieldCategoriaNombre.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        pnl_Categorias.add(jTextFieldCategoriaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 123, 180, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(182, 182, 182));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Descripcion de la categoria :");
        pnl_Categorias.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, -1, -1));

        jTextAreaCategoriaDescripcion.setColumns(20);
        jTextAreaCategoriaDescripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextAreaCategoriaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCategoriaDescripcion);

        pnl_Categorias.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 280, 147));

        jButton1.setText("Insertar");
        pnl_Categorias.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 260, 40));

        pnl_Materiales.setBackground(new java.awt.Color(0, 204, 255));
        pnl_Materiales.setPreferredSize(new java.awt.Dimension(300, 498));
        pnl_Materiales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_esconderAzul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow2_izquierda.png"))); // NOI18N
        btn_esconderAzul1.setBorderPainted(false);
        btn_esconderAzul1.setContentAreaFilled(false);
        btn_esconderAzul1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow1_izquierda.png"))); // NOI18N
        pnl_Materiales.add(btn_esconderAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 10, 30, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Materiales");
        jLabel3.setOpaque(true);
        pnl_Materiales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 280, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(182, 182, 182));
        jLabel6.setText("Nombre: ");
        pnl_Materiales.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, -1, -1));

        jTextFieldMaterialNombre.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        pnl_Materiales.add(jTextFieldMaterialNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 134, 187, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(182, 182, 182));
        jLabel7.setText("Cantidad:");
        pnl_Materiales.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jTextFieldMaterialCantidad.setFont(new java.awt.Font("Calibri", 1, 23)); // NOI18N
        pnl_Materiales.add(jTextFieldMaterialCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 187, 186, -1));

        pnl_Productos.setBackground(new java.awt.Color(0, 204, 255));
        pnl_Productos.setPreferredSize(new java.awt.Dimension(199, 498));

        jLabel13.setBackground(new java.awt.Color(182, 182, 182));
        jLabel13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(182, 182, 182));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Producto");

        jLabel14.setBackground(new java.awt.Color(182, 182, 182));
        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(182, 182, 182));
        jLabel14.setText("Nombre:");

        jLabel15.setBackground(new java.awt.Color(182, 182, 182));
        jLabel15.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(182, 182, 182));
        jLabel15.setText("Precio: ");

        jLabel16.setBackground(new java.awt.Color(182, 182, 182));
        jLabel16.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(182, 182, 182));
        jLabel16.setText("Categoria:");

        jComboBoxProductoCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setBackground(new java.awt.Color(182, 182, 182));
        jLabel17.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(182, 182, 182));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Materiales");

        jButton7.setText("Más");

        jLabel11.setBackground(new java.awt.Color(182, 182, 182));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(182, 182, 182));
        jLabel11.setText("Cantidad:");

        javax.swing.GroupLayout pnl_ProductosLayout = new javax.swing.GroupLayout(pnl_Productos);
        pnl_Productos.setLayout(pnl_ProductosLayout);
        pnl_ProductosLayout.setHorizontalGroup(
            pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ProductosLayout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_ProductosLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton7)
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(pnl_ProductosLayout.createSequentialGroup()
                        .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldProductoCantidad)
                            .addComponent(jComboBoxProductoCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
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
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pnl_Clientes.setBackground(new java.awt.Color(0, 204, 255));
        pnl_Clientes.setPreferredSize(new java.awt.Dimension(199, 498));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(182, 182, 182));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Cliente");

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(182, 182, 182));
        jLabel20.setText("Nick:");

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(182, 182, 182));
        jLabel21.setText("Nombre:");

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(182, 182, 182));
        jLabel22.setText("Apellidos:");

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(182, 182, 182));
        jLabel23.setText("Email:");

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(182, 182, 182));
        jLabel24.setText("Password:");

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(182, 182, 182));
        jLabel25.setText("Re-password:");

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(182, 182, 182));
        jLabel27.setText("Tlf - movil:");

        javax.swing.GroupLayout pnl_ClientesLayout = new javax.swing.GroupLayout(pnl_Clientes);
        pnl_Clientes.setLayout(pnl_ClientesLayout);
        pnl_ClientesLayout.setHorizontalGroup(
            pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(jTextFieldClienteRePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jTextFieldClientePassword))))
                .addContainerGap())
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
                .addContainerGap(276, Short.MAX_VALUE))
        );

        pnl_Empleado.setBackground(new java.awt.Color(0, 204, 255));
        pnl_Empleado.setPreferredSize(new java.awt.Dimension(199, 498));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(182, 182, 182));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Empleados");

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(182, 182, 182));
        jLabel28.setText("Nombre:");

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(182, 182, 182));
        jLabel29.setText("Apellidos:");

        jLabel30.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(182, 182, 182));
        jLabel30.setText("Nick:");

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(182, 182, 182));
        jLabel31.setText("Tlf - movil:");

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(182, 182, 182));
        jLabel32.setText("Email:");

        jLabel33.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(182, 182, 182));
        jLabel33.setText("Password:");

        jLabel34.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(182, 182, 182));
        jLabel34.setText("Re-password:");

        jLabel35.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(182, 182, 182));
        jLabel35.setText("Rol:");

        jComboBoxEmpleadoRol.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jComboBoxEmpleadoRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnl_EmpleadoLayout = new javax.swing.GroupLayout(pnl_Empleado);
        pnl_Empleado.setLayout(pnl_EmpleadoLayout);
        pnl_EmpleadoLayout.setHorizontalGroup(
            pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_EmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_EmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEmpleadoRol, 0, 156, Short.MAX_VALUE))
                    .addGroup(pnl_EmpleadoLayout.createSequentialGroup()
                        .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_EmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmpleadoNombre)
                            .addComponent(jTextFieldEmpleadoApellidos)
                            .addComponent(jTextFieldEmpleadoNickname)
                            .addComponent(jTextFieldEmpleadoTelefono)
                            .addComponent(jTextFieldEmpleadoEmail)
                            .addComponent(jTextFieldEmpleadoPassword)
                            .addComponent(jTextFieldEmpleadoRePassword))))
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
                .addContainerGap(251, Short.MAX_VALUE))
        );

        pnl_Carrito.setBackground(new java.awt.Color(0, 204, 255));
        pnl_Carrito.setPreferredSize(new java.awt.Dimension(199, 498));

        jLabel36.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(182, 182, 182));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Carrito");

        jLabel37.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(182, 182, 182));
        jLabel37.setText("Cliente:");

        jButtonBuscarCliente.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButtonBuscarCliente.setText("B");

        jLabel38.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(182, 182, 182));
        jLabel38.setText("Producto:");

        jButton14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
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
                .addContainerGap()
                .addGroup(pnl_CarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_CarritoLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_CarritoLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addContainerGap(365, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Naka Designs Sevilla v0.1");
        setBackground(new java.awt.Color(51, 255, 255));
        setUndecorated(true);

        SplitPane1.setBorder(null);
        SplitPane1.setDividerLocation(200);
        SplitPane1.setEnabled(false);
        SplitPane1.setFocusable(false);
        SplitPane1.setLastDividerLocation(200);
        SplitPane1.setMinimumSize(new java.awt.Dimension(200, 450));

        pnl_split1_izquierda.setBackground(new java.awt.Color(204, 102, 255));
        pnl_split1_izquierda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btn_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/normal/Clientes.png"))); // NOI18N
        btn_Clientes.setBorderPainted(false);
        btn_Clientes.setContentAreaFilled(false);
        btn_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Clientes.setPreferredSize(new java.awt.Dimension(83, 55));
        btn_Clientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/selected/Clientes_selected.png"))); // NOI18N
        btn_Clientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttons/presed/Clientes_presed.png"))); // NOI18N

        btn_Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Productos.setPreferredSize(new java.awt.Dimension(83, 55));

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
        btn_esconderRosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrows/arrow1_izquierda.png"))); // NOI18N
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
                .addGroup(pnl_split1_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_Carritos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Empleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Categorias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Productos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Clientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Materiales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Carritos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        SplitPane1.setLeftComponent(pnl_split1_izquierda);

        SplitPane2.setDividerLocation(0);
        SplitPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SplitPane2.setLastDividerLocation(300);
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

        SplitPane3.setDividerLocation(400);
        SplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        javax.swing.GroupLayout pnl_split3_derechaLayout = new javax.swing.GroupLayout(pnl_split3_derecha);
        pnl_split3_derecha.setLayout(pnl_split3_derechaLayout);
        pnl_split3_derechaLayout.setHorizontalGroup(
            pnl_split3_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
        );
        pnl_split3_derechaLayout.setVerticalGroup(
            pnl_split3_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        SplitPane3.setTopComponent(pnl_split3_derecha);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        SplitPane3.setRightComponent(jPanel2);

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

        menu_movimientos.setText("Movimientos");

        jMenuItem1.setText("Historial Ventas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_movimientos.add(jMenuItem1);

        manu_bar.add(menu_movimientos);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SplitPane1.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField Ptxt_login_password;
    public javax.swing.JSplitPane SplitPane1;
    public javax.swing.JSplitPane SplitPane2;
    private javax.swing.JSplitPane SplitPane3;
    public javax.swing.JButton btn_Carritos;
    public javax.swing.JButton btn_Categorias;
    public javax.swing.JButton btn_Clientes;
    public javax.swing.JButton btn_Empleados;
    public javax.swing.JButton btn_Login;
    public javax.swing.JButton btn_Materiales;
    public javax.swing.JButton btn_Productos;
    public javax.swing.JButton btn_esconderAzul;
    public javax.swing.JButton btn_esconderAzul1;
    public javax.swing.JButton btn_esconderRosa;
    public javax.swing.JButton btn_esconder_pnlPrincipal;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButtonBuscarCliente;
    public javax.swing.JButton jButtonQueryClean;
    public javax.swing.JComboBox jComboBoxEmpleadoRol;
    public javax.swing.JComboBox jComboBoxProductoCategoria;
    public javax.swing.JFrame jFrameLoggin;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
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
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanelLogin;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
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
    public javax.swing.JMenuBar manu_bar;
    public javax.swing.JMenu menu_movimientos;
    public javax.swing.JPanel pnl_Carrito;
    public javax.swing.JPanel pnl_Categorias;
    public javax.swing.JPanel pnl_Clientes;
    public javax.swing.JPanel pnl_Empleado;
    public javax.swing.JPanel pnl_Main;
    public javax.swing.JPanel pnl_Materiales;
    public javax.swing.JPanel pnl_Productos;
    public javax.swing.JPanel pnl_TableMain;
    public javax.swing.JPanel pnl_split1_derecha;
    public javax.swing.JPanel pnl_split1_izquierda;
    public javax.swing.JPanel pnl_split2_izquierda;
    public javax.swing.JPanel pnl_split3_derecha;
    public javax.swing.JTextField txt_login_user;
    // End of variables declaration//GEN-END:variables
}
