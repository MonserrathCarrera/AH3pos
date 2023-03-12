
package com.mycompany.ah3pos;

import javax.swing.JOptionPane;
 import javax.swing.table.DefaultTableModel;
public class Admin extends javax.swing.JFrame {

    
    public Admin() {
        initComponents();
        setLocationRelativeTo(null);
        mostrar_Tabla();
         mostrar_Tabla2();
         mostrar_Tabla3();
          mostrar_Tabla4();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreU = new javax.swing.JLabel();
        jTabbedPane33 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        crearU1 = new javax.swing.JButton();
        cargaM1 = new javax.swing.JButton();
        actulizar1 = new javax.swing.JButton();
        exportPDF6 = new javax.swing.JButton();
        exportPDF9 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        cerrarS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla3 = new javax.swing.JTable();
        crearU2 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        cargaM2 = new javax.swing.JButton();
        actulizar2 = new javax.swing.JButton();
        exportPDF7 = new javax.swing.JButton();
        exportPDF10 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        cerrarS1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabla4 = new javax.swing.JTable();
        crearU3 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cargaM3 = new javax.swing.JButton();
        actulizar3 = new javax.swing.JButton();
        exportPDF8 = new javax.swing.JButton();
        exportPDF11 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        cerrarS2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        exportPDF2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        exportPDF3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        exportPDF4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        exportPDF5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        crearU = new javax.swing.JButton();
        cargaM = new javax.swing.JButton();
        exportPDF1 = new javax.swing.JButton();
        actulizar = new javax.swing.JButton();
        exportPDF = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(22, 3, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Módulo de Administración");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel4)
                .addContainerGap(550, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido(a)");

        nombreU.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(nombreU)
                        .addGap(115, 115, 115))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane33.setBackground(new java.awt.Color(0, 0, 102));
        jTabbedPane33.setForeground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(22, 3, 50));

        crearU1.setBackground(new java.awt.Color(102, 0, 140));
        crearU1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        crearU1.setForeground(new java.awt.Color(255, 255, 255));
        crearU1.setText("+ Crear Sucursal");
        crearU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearU1ActionPerformed(evt);
            }
        });

        cargaM1.setBackground(new java.awt.Color(102, 0, 140));
        cargaM1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cargaM1.setForeground(new java.awt.Color(255, 255, 255));
        cargaM1.setText("Carga Masiva");
        cargaM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaM1ActionPerformed(evt);
            }
        });

        actulizar1.setBackground(new java.awt.Color(102, 0, 140));
        actulizar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        actulizar1.setForeground(new java.awt.Color(255, 255, 255));
        actulizar1.setText("Actualizar");
        actulizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizar1ActionPerformed(evt);
            }
        });

        exportPDF6.setBackground(new java.awt.Color(102, 0, 140));
        exportPDF6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF6.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF6.setText("Exportar PDF");
        exportPDF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF6ActionPerformed(evt);
            }
        });

        exportPDF9.setBackground(new java.awt.Color(102, 0, 140));
        exportPDF9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF9.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF9.setText("Exportar PDF");
        exportPDF9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF9ActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel24.setBackground(new java.awt.Color(0, 102, 153));
        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Sucursales");

        cerrarS.setBackground(new java.awt.Color(204, 0, 0));
        cerrarS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cerrarS.setForeground(new java.awt.Color(255, 255, 255));
        cerrarS.setText("Cerrar Sesión");
        cerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSActionPerformed(evt);
            }
        });

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(cerrarS, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearU1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPDF9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actulizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPDF6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cerrarS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(cargaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(exportPDF6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(actulizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(exportPDF9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(crearU1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane33.addTab("Sucursales", jPanel7);

        jPanel1.setBackground(new java.awt.Color(22, 3, 50));

        Tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(Tabla3);

        crearU2.setBackground(new java.awt.Color(102, 0, 140));
        crearU2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        crearU2.setForeground(new java.awt.Color(255, 255, 255));
        crearU2.setText("+ Crear Producto");
        crearU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearU2ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(0, 102, 153));
        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Listado De Productos");

        cargaM2.setBackground(new java.awt.Color(102, 0, 140));
        cargaM2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cargaM2.setForeground(new java.awt.Color(255, 255, 255));
        cargaM2.setText("Carga Masiva");
        cargaM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaM2ActionPerformed(evt);
            }
        });

        actulizar2.setBackground(new java.awt.Color(102, 0, 140));
        actulizar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        actulizar2.setForeground(new java.awt.Color(255, 255, 255));
        actulizar2.setText("Actualizar");
        actulizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizar2ActionPerformed(evt);
            }
        });

        exportPDF7.setBackground(new java.awt.Color(102, 0, 140));
        exportPDF7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF7.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF7.setText("Exportar PDF");
        exportPDF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF7ActionPerformed(evt);
            }
        });

        exportPDF10.setBackground(new java.awt.Color(102, 0, 140));
        exportPDF10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF10.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF10.setText("Exportar PDF");
        exportPDF10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF10ActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cerrarS1.setBackground(new java.awt.Color(204, 0, 0));
        cerrarS1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cerrarS1.setForeground(new java.awt.Color(255, 255, 255));
        cerrarS1.setText("Cerrar Sesión");
        cerrarS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarS1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarS1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearU2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPDF10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actulizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPDF7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargaM2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cerrarS1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(cargaM2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(exportPDF7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(actulizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(exportPDF10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(crearU2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane33.addTab("Productos", jPanel1);

        jPanel5.setBackground(new java.awt.Color(22, 3, 50));

        Tabla4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(Tabla4);

        crearU3.setBackground(new java.awt.Color(102, 0, 140));
        crearU3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        crearU3.setForeground(new java.awt.Color(255, 255, 255));
        crearU3.setText("+ Crear Usuario");
        crearU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearU3ActionPerformed(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(0, 102, 153));
        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Listado De Clientes");

        cargaM3.setBackground(new java.awt.Color(102, 0, 140));
        cargaM3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cargaM3.setForeground(new java.awt.Color(255, 255, 255));
        cargaM3.setText("Carga Masiva");
        cargaM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaM3ActionPerformed(evt);
            }
        });

        actulizar3.setBackground(new java.awt.Color(102, 0, 140));
        actulizar3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        actulizar3.setForeground(new java.awt.Color(255, 255, 255));
        actulizar3.setText("Actualizar");
        actulizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizar3ActionPerformed(evt);
            }
        });

        exportPDF8.setBackground(new java.awt.Color(102, 0, 140));
        exportPDF8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF8.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF8.setText("Exportar PDF");
        exportPDF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF8ActionPerformed(evt);
            }
        });

        exportPDF11.setBackground(new java.awt.Color(102, 0, 140));
        exportPDF11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF11.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF11.setText("Exportar PDF");
        exportPDF11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF11ActionPerformed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cerrarS2.setBackground(new java.awt.Color(204, 0, 0));
        cerrarS2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cerrarS2.setForeground(new java.awt.Color(255, 255, 255));
        cerrarS2.setText("Cerrar Sesión");
        cerrarS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarS2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarS2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearU3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPDF11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actulizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPDF8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargaM3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cerrarS2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(cargaM3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(exportPDF8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(actulizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(exportPDF11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(crearU3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane33.addTab("Clientes", jPanel5);

        jPanel6.setBackground(new java.awt.Color(6, 36, 74));

        jPanel8.setBackground(new java.awt.Color(22, 3, 50));

        exportPDF2.setBackground(new java.awt.Color(51, 153, 0));
        exportPDF2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF2.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF2.setText("Filtrar");
        exportPDF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF2ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Seleccionar Cliente");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nit:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Género:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filtrado:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cliente:");

        exportPDF3.setBackground(new java.awt.Color(51, 153, 0));
        exportPDF3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF3.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF3.setText("Nuevo Cliente");
        exportPDF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Filtrar por:");

        jSeparator1.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator2.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 102, 153));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Agregar Productos");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("No.");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Código:");

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cantidad:");

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        exportPDF4.setBackground(new java.awt.Color(51, 153, 0));
        exportPDF4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF4.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF4.setText("Agregar");
        exportPDF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total:");

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        exportPDF5.setBackground(new java.awt.Color(51, 153, 0));
        exportPDF5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF5.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF5.setText("Procesar venta");
        exportPDF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF5ActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha:");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("1/03/2023");

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Femenino");

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Masculino");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        crearU.setBackground(new java.awt.Color(102, 0, 140));
        crearU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        crearU.setForeground(new java.awt.Color(255, 255, 255));
        crearU.setText("+ Crear Usuario");
        crearU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUActionPerformed(evt);
            }
        });

        cargaM.setBackground(new java.awt.Color(102, 0, 140));
        cargaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cargaM.setForeground(new java.awt.Color(255, 255, 255));
        cargaM.setText("Carga Masiva");
        cargaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaMActionPerformed(evt);
            }
        });

        exportPDF1.setBackground(new java.awt.Color(102, 0, 140));
        exportPDF1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF1.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF1.setText("Exportar PDF");
        exportPDF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDF1ActionPerformed(evt);
            }
        });

        actulizar.setBackground(new java.awt.Color(102, 0, 140));
        actulizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        actulizar.setForeground(new java.awt.Color(255, 255, 255));
        actulizar.setText("Actualizar");
        actulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarActionPerformed(evt);
            }
        });

        exportPDF.setBackground(new java.awt.Color(102, 0, 140));
        exportPDF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportPDF.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF.setText("Exportar PDF");
        exportPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel16))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(exportPDF5))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(exportPDF4)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(226, 226, 226))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jRadioButton1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jRadioButton2))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(31, 31, 31)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(512, 512, 512)
                                        .addComponent(jLabel3))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel19))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(exportPDF2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381)
                        .addComponent(exportPDF3)
                        .addGap(431, 431, 431)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exportPDF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cargaM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actulizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearU, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cargaM, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(162, 162, 162)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exportPDF2)
                            .addComponent(exportPDF3))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel16)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(64, 64, 64)
                                        .addComponent(exportPDF4)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel14))
                                        .addGap(37, 37, 37)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(exportPDF5)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addGap(40, 40, 40))))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addGap(87, 87, 87))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(exportPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(actulizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exportPDF1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crearU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane33.addTab("Vendedores", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane33)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaMActionPerformed

    private void actulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarActionPerformed

        if (Tabla.getSelectedRow() < 0 ) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila");
        }else{
            ActualizarDatos ad = new ActualizarDatos();
        ad.mostrar(Tabla.getSelectedRow());
        ad.setVisible(true);
   dispose();
        }
    }//GEN-LAST:event_actulizarActionPerformed

    private void exportPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDFActionPerformed

    private void crearUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUActionPerformed
           CrearUsuarios Cusuario=new CrearUsuarios();
       Cusuario.setVisible(true);
     
       this.dispose();
       
       
       
    }//GEN-LAST:event_crearUActionPerformed
public void mostrar_Tabla(){
String columnas[ ]={"Código","Nombre", "Caja", "Ventas","Genero"};
DefaultTableModel jtablas = new DefaultTableModel (null,columnas);

for (Usuario sp: Usuario.usuario){
    Object filas [ ] = new Object [5];
    filas [0] = sp.getCaja();
        filas [1] = sp.getCodigo();
            filas [2] = sp.getNombre();
                filas [3] = sp.getVentas();
                    filas [4] = sp.getGenero();
                    jtablas.addRow(filas);
}

Tabla.setModel (jtablas);
}


public void mostrar_Tabla2(){
String columnas[ ]={"Código","Nombre", "Dirección", "Correo","Teléfono"};
DefaultTableModel jtablas2 = new DefaultTableModel (null,columnas);

for (Sucursales sp2: Sucursales.sucursales){
    Object filas [ ] = new Object [5];
    filas [0] = sp2.getCodigo();
        filas [1] = sp2.getNombre();
            filas [2] = sp2.getDireccion();
                filas [3] = sp2.getCorreo();
                    filas [4] = sp2.getTelefono();
                    jtablas2.addRow(filas);
}

Tabla2.setModel (jtablas2);
}


public void mostrar_Tabla3(){
String columnas[ ]={"Código","Nombre", "Descripción", "Cantidad","Precio"};
DefaultTableModel jtablas3 = new DefaultTableModel (null,columnas);

for (Productos sp3: Productos.producto){
    Object filas [ ] = new Object [5];
    filas [0] = sp3.getCodigo();
        filas [1] = sp3.getNombre();
            filas [2] = sp3.getDescripcion();
                filas [3] = sp3.getCantidad();
                    filas [4] = sp3.getPrecio();
                    jtablas3.addRow(filas);
}

Tabla3.setModel (jtablas3);
}


public void mostrar_Tabla4(){
String columnas[ ]={"Código","Nombre", "Nit", "Correo","Genero"};
DefaultTableModel jtablas4 = new DefaultTableModel (null,columnas);

for (Clientes sp4: Clientes.clientes){
    Object filas [ ] = new Object [5];
    filas [0] = sp4.getCodigo();
        filas [1] = sp4.getNombre();
            filas [2] = sp4.getNit();
                filas [3] = sp4.getCorreo();
                    filas [4] = sp4.getGenero();
                    jtablas4.addRow(filas);
}

Tabla4.setModel (jtablas4);
}
    private void cerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSActionPerformed
       Login log=new Login();
       log.setVisible(true);
       dispose();
    }//GEN-LAST:event_cerrarSActionPerformed

    private void exportPDF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF1ActionPerformed

    private void exportPDF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void exportPDF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void exportPDF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF3ActionPerformed

    private void exportPDF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF2ActionPerformed

    private void exportPDF9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF9ActionPerformed

    private void exportPDF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF6ActionPerformed

    private void actulizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actulizar1ActionPerformed

    private void cargaM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaM1ActionPerformed

    private void crearU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearU1ActionPerformed
  crearSucursal Csucursal=new crearSucursal();
       Csucursal.setVisible(true);
       this.dispose();    
    }//GEN-LAST:event_crearU1ActionPerformed

    private void crearU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearU2ActionPerformed
         crearProductos cproductos=new crearProductos();
       cproductos.setVisible(true);
       dispose();
    }//GEN-LAST:event_crearU2ActionPerformed

    private void cargaM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaM2ActionPerformed

    private void actulizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actulizar2ActionPerformed

    private void exportPDF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF7ActionPerformed

    private void exportPDF10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF10ActionPerformed

    private void cerrarS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarS1ActionPerformed

    private void crearU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearU3ActionPerformed
        crearClientes cclientes=new crearClientes();
       cclientes.setVisible(true);
       dispose();
        
        
    }//GEN-LAST:event_crearU3ActionPerformed

    private void cargaM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaM3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaM3ActionPerformed

    private void actulizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actulizar3ActionPerformed

    private void exportPDF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF8ActionPerformed

    private void exportPDF11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDF11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportPDF11ActionPerformed

    private void cerrarS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarS2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTable Tabla3;
    private javax.swing.JTable Tabla4;
    private javax.swing.JButton actulizar;
    private javax.swing.JButton actulizar1;
    private javax.swing.JButton actulizar2;
    private javax.swing.JButton actulizar3;
    private javax.swing.JButton cargaM;
    private javax.swing.JButton cargaM1;
    private javax.swing.JButton cargaM2;
    private javax.swing.JButton cargaM3;
    private javax.swing.JButton cerrarS;
    private javax.swing.JButton cerrarS1;
    private javax.swing.JButton cerrarS2;
    private javax.swing.JButton crearU;
    private javax.swing.JButton crearU1;
    private javax.swing.JButton crearU2;
    private javax.swing.JButton crearU3;
    private javax.swing.JButton exportPDF;
    private javax.swing.JButton exportPDF1;
    private javax.swing.JButton exportPDF10;
    private javax.swing.JButton exportPDF11;
    private javax.swing.JButton exportPDF2;
    private javax.swing.JButton exportPDF3;
    private javax.swing.JButton exportPDF4;
    private javax.swing.JButton exportPDF5;
    private javax.swing.JButton exportPDF6;
    private javax.swing.JButton exportPDF7;
    private javax.swing.JButton exportPDF8;
    private javax.swing.JButton exportPDF9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane33;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel nombreU;
    // End of variables declaration//GEN-END:variables
}
