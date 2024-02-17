/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenlab5p2_mariapadilla;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author belen
 */
public class Login extends javax.swing.JFrame {
     ArrayList <Usuario> usuarios=new ArrayList ();
     ArrayList <Tramite> tramites =new ArrayList ();
    

    /**
     * Creates new form Login
     */
    public Login() throws ParseException {
       initComponents();
      
      
       Date f=new Date ();
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       Date fecha = dateFormat.parse("2024-02-16");
       
       usuarios.add(new Civiles ("Belen", "Padilla", "12341", fecha, "Femenino", "Francisco Morazan", " "));
       usuarios.add(new Empleados ("Informatico", "Ingeniero", "2005", "Luis", "Castro", "1231", f, "Masculino", "Cortes" , " "));
       usuarios.add(new Civiles ("Josue", "Rivera", "12341", fecha, "Masculini", "Francisco Morazan", " "));
       usuarios.add(new Empleados ("Informatico", "Ingeniero", "2005", "DIego", "Rosales", "1231", f, "Masculino", "Comayagua" , " "));
       Tramite t= new Tramite ("comer", "si debo comer", fecha," ");
       tramites.add(t);
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).setYear(usuarios.get(i).getYear());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Empleados = new javax.swing.JFrame();
        VentanaEmpleados = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        informacion = new javax.swing.JPanel();
        Tabla1 = new javax.swing.JScrollPane();
        Nacimiento = new javax.swing.JTable();
        Tabla2 = new javax.swing.JScrollPane();
        tab2 = new javax.swing.JTable();
        Modificacion = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        Modificar = new javax.swing.JButton();
        Civiles = new javax.swing.JFrame();
        VentanaCiviles = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        IngresarLogin = new javax.swing.JButton();

        Empleados.setResizable(false);

        VentanaEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        informacion.setBackground(new java.awt.Color(204, 204, 204));

        Nacimiento.setBackground(new java.awt.Color(153, 153, 153));
        Nacimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Identidad", "Fecha de nacimiento"
            }
        ));
        Tabla1.setViewportView(Nacimiento);

        tab2.setBackground(new java.awt.Color(153, 153, 153));
        tab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre del tramite", "Descripcion", "Fecha", "Identidad"
            }
        ));
        Tabla2.setViewportView(tab2);

        javax.swing.GroupLayout informacionLayout = new javax.swing.GroupLayout(informacion);
        informacion.setLayout(informacionLayout);
        informacionLayout.setHorizontalGroup(
            informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        informacionLayout.setVerticalGroup(
            informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informacion civiles ", informacion);

        Modificacion.setBackground(new java.awt.Color(204, 204, 204));
        Modificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Modificacion.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 22, 177, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Departamento");
        Modificacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        Modificacion.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 175, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha de nacimento");
        Modificacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));
        Modificacion.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contraseña");
        Modificacion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        Modificacion.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("sexo");
        Modificacion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Francisco Morazan", "Cortes", "Comayagua" }));
        Modificacion.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre");
        Modificacion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 66, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        Modificacion.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 190, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Apellido");
        Modificacion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));
        Modificacion.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 210, 160));

        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        Modificacion.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jTabbedPane1.addTab("Modificacion civiles", Modificacion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        VentanaEmpleados.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        javax.swing.GroupLayout EmpleadosLayout = new javax.swing.GroupLayout(Empleados.getContentPane());
        Empleados.getContentPane().setLayout(EmpleadosLayout);
        EmpleadosLayout.setHorizontalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EmpleadosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(VentanaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EmpleadosLayout.setVerticalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EmpleadosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(VentanaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        VentanaCiviles.setBackground(new java.awt.Color(255, 255, 255));
        VentanaCiviles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane3.setForeground(new java.awt.Color(153, 153, 153));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Informacion de civiles", jPanel6);

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Modificacion de civiles", jPanel7);

        VentanaCiviles.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 520, 310));

        javax.swing.GroupLayout CivilesLayout = new javax.swing.GroupLayout(Civiles.getContentPane());
        Civiles.getContentPane().setLayout(CivilesLayout);
        CivilesLayout.setHorizontalGroup(
            CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CivilesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(VentanaCiviles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CivilesLayout.setVerticalGroup(
            CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(CivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CivilesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(VentanaCiviles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 537, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 330, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 330, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 330, -1));

        IngresarLogin.setBackground(new java.awt.Color(51, 255, 255));
        IngresarLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IngresarLogin.setForeground(new java.awt.Color(0, 0, 0));
        IngresarLogin.setText("Ingrese ");
        IngresarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarLoginMouseClicked(evt);
            }
        });
        IngresarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarLoginActionPerformed(evt);
            }
        });
        jPanel1.add(IngresarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraActionPerformed

    private void IngresarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarLoginActionPerformed

    private void IngresarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarLoginMouseClicked
        // primer boton
        if (nombre.getText().equalsIgnoreCase("Belen") && apellido.getText().equalsIgnoreCase("Padilla")&& contra.getText().equalsIgnoreCase("123")) {
            Empleados.pack();
            Empleados.setVisible(true);
            this.setVisible(false);
            llenar();
            llenar2();
           
        
        }
        if (nombre.getText().equalsIgnoreCase("Maria") && apellido.getText().equalsIgnoreCase("Padilla")&& contra.getText().equalsIgnoreCase("122")) {
          Civiles.pack();
          Civiles.setVisible(true);
          this.setVisible(false);
            
        
        }
        
        
      
        
        
    }//GEN-LAST:event_IngresarLoginMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
         try {
             // TODO add your handling code here:
             SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
             Date fechaModificada = fechaModificada = formato.parse("2024-02-16");
             fechaModificada = jCalendar1.getDate();
             usuarios.get(jComboBox1.getSelectedIndex()).setNombre(jTextField1.getText());
             usuarios.get(jComboBox1.getSelectedIndex()).setContra(jTextField2.getText());
             usuarios.get(jComboBox1.getSelectedIndex()).setApellido(jTextField3.getText());
             usuarios.get(jComboBox1.getSelectedIndex()).setDepartamiento(jComboBox2.getSelectedItem().toString());
             usuarios.get(jComboBox1.getSelectedIndex()).setSexo(jComboBox3.getSelectedItem().toString());
             usuarios.get(jComboBox1.getSelectedIndex()).setFecha(fechaModificada);
         } catch (ParseException ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
         }
         DefaultTableModel model = (DefaultTableModel) Nacimiento.getModel();
         Object []modelo2={usuarios.get(jComboBox1.getSelectedIndex()).getNombre(),usuarios.get(jComboBox1.getSelectedIndex()).getApellido(),usuarios.get(jComboBox1.getSelectedIndex()).identidad(), usuarios.get(jComboBox1.getSelectedIndex()).getFecha()};
         model.addRow(modelo2);
         Nacimiento.setModel(model);
    }//GEN-LAST:event_ModificarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void llenar(){
        DefaultTableModel modelo =(DefaultTableModel )Nacimiento.getModel();
        DefaultComboBoxModel model=(DefaultComboBoxModel )jComboBox1.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).identidad());
            Object []modelo2={usuarios.get(i).getNombre(),usuarios.get(i).getApellido(),usuarios.get(i).identidad(), usuarios.get(i).getFecha()};
            modelo.addRow(modelo2);
            
            model.addElement(usuarios.get(i).identidad());
            
            
    
            
        }
        Nacimiento.setModel(modelo);
        jComboBox1.setModel(model);
        
        
    }
    
    public void llenar2(){
        DefaultTableModel modelo =(DefaultTableModel )tab2.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < tramites.size(); i++){
            System.out.println(tramites.get(i));
            Object []modelo2={tramites.get(i).getNombre(),tramites.get(i).getDescripcion(),tramites.get(i).getI()};
            modelo.addRow(modelo2);
        
        }
        tab2.setModel(modelo);
    
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Civiles;
    private javax.swing.JFrame Empleados;
    private javax.swing.JButton IngresarLogin;
    private javax.swing.JPanel Modificacion;
    private javax.swing.JButton Modificar;
    private javax.swing.JTable Nacimiento;
    private javax.swing.JScrollPane Tabla1;
    private javax.swing.JScrollPane Tabla2;
    private javax.swing.JPanel VentanaCiviles;
    private javax.swing.JPanel VentanaEmpleados;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField contra;
    private javax.swing.JPanel informacion;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tab2;
    // End of variables declaration//GEN-END:variables
}
