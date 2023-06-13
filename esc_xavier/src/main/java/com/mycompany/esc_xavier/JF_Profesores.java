package com.mycompany.esc_xavier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.multi.MultiLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JF_Profesores extends javax.swing.JFrame {
    MiBD conexion;
    
    public JF_Profesores() {
        conexion = new MiBD(); //Establecemos conexion con la base de datos
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumPersonal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtClasesImp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxSueldo = new javax.swing.JComboBox<>();
        cbxContrato = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel1.setText("CURP");

        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel4.setText("Número de personal");

        txtNumPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumPersonalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel5.setText("Total de clases impartidas");

        txtClasesImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClasesImpActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel6.setText("Sueldo");

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel7.setText("Contrato");

        cbxSueldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Fijo", "Por clase" }));

        cbxContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Tiempo completo", "Medio tiempo" }));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel8.setText("Base de datos Escuela Xavier");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setText("Registro de Profesores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(62, 62, 62))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumPersonal)
                                    .addComponent(txtClasesImp)
                                    .addComponent(cbxSueldo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtEdad)
                                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel9)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtClasesImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed

    }//GEN-LAST:event_txtCurpActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNumPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumPersonalActionPerformed

    }//GEN-LAST:event_txtNumPersonalActionPerformed

    private void txtClasesImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClasesImpActionPerformed

    }//GEN-LAST:event_txtClasesImpActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // UPDATE tabla SET campo1 = valor1, campo2 = valor2, ... WHERE curp = curp-especificado
        String curp = txtCurp.getText();
        String nombre = txtNombre.getText();
        int edad =  Integer.parseInt(txtEdad.getText());
        int no_personal =  Integer.parseInt(txtNumPersonal.getText());
        int total_clases_imp = Integer.parseInt(txtClasesImp.getText());
        String sueldo = cbxSueldo.getSelectedItem().toString();
        String contrato = cbxContrato.getSelectedItem().toString();
        
        try {
            //conexion.getQuery("update into profesores");
            PreparedStatement ps = conexion.getConnection().prepareStatement("UPDATE profesores Set nombre=?, edad=?, no_personal=?, total_clases_imp=?, fk_sueldo=?, fk_contrato=? WHERE curp = ?");
            ps.setString(1,nombre);
            ps.setInt(2, edad);
            ps.setInt(3,no_personal);
            ps.setInt(4, total_clases_imp);
            
            if (sueldo.equals("Fijo")){
                 ps.setInt(5, 1);
            }
            if (sueldo.equals("Por clase")){
                 ps.setInt(5, 2);
            }
            
            if (contrato.equals("Tiempo completo")){
                 ps.setInt(6, 1);
            }
            if (contrato.equals("Medio tiempo")){
                 ps.setInt(6, 2);
            }
            ps.setString(7, curp);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se modificó correctamente :D");
            
        } catch (SQLException ex) {
            Logger.getLogger(JF_Profesores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se modificó :( ");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        try {
            PreparedStatement ps = conexion.getConnection().prepareStatement("SELECT * from Profesores WHERE curp=?");
            ResultSet rs = null;        //Devuelve una respuesta de una sentencia SQL
            ps.setString(1, txtCurp.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtCurp.setText(rs.getString("curp"));
                txtNombre.setText(rs.getString("nombre"));
                txtEdad.setText(rs.getString("edad"));
                txtNumPersonal.setText(rs.getString("no_personal"));
                txtClasesImp.setText(rs.getString("total_clases_imp"));
                cbxSueldo.setSelectedIndex(rs.getInt("fk_sueldo"));
                cbxContrato.setSelectedIndex(rs.getInt("fk_contrato"));
            }
            
            JOptionPane.showMessageDialog(null, "Se encontró correctamente :D");
            
        } catch (SQLException ex) {
            Logger.getLogger(JF_Profesores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encontró :( ");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        String curp = txtCurp.getText();
        String nombre = txtNombre.getText();
        int edad =  Integer.parseInt(txtEdad.getText());
        int no_personal =  Integer.parseInt(txtNumPersonal.getText());
        int total_clases_imp = Integer.parseInt(txtClasesImp.getText());
        String sueldo = cbxSueldo.getSelectedItem().toString();
        String contrato = cbxContrato.getSelectedItem().toString();
        
        try {
            //conexion.getQuery("insert into profesores");
            PreparedStatement ps = conexion.getConnection().prepareStatement("INSERT INTO profesores (curp, nombre, edad, no_personal, total_clases_imp, fk_sueldo, fk_contrato) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, curp);
            ps.setString(2,nombre);
            ps.setInt(3, edad);
            ps.setInt(4,no_personal);
            ps.setInt(5, total_clases_imp);
            
            if (sueldo.equals("Fijo")){
                 ps.setInt(6, 1);
            }
            if (sueldo.equals("Por clase")){
                 ps.setInt(6, 2);
            }
            
            if (contrato.equals("Tiempo completo")){
                 ps.setInt(7, 1);
            }
            if (contrato.equals("Medio tiempo")){
                 ps.setInt(7, 2);
            }
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente :D");
            
        } catch (SQLException ex) {
            Logger.getLogger(JF_Profesores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se inserto :( ");
        }
       
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCurp.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtNumPersonal.setText("");
        txtClasesImp.setText("");
        cbxSueldo.setSelectedIndex(0);
        cbxContrato.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            PreparedStatement ps = conexion.getConnection().prepareStatement("DELETE from Profesores WHERE curp = ?");
            ps.setString(1, txtCurp.getText());

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Se eliminó correctamente :D");
            } else {
                JOptionPane.showMessageDialog(null, "No se eliminó :( ");
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(JF_Profesores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
             try {
                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(JF_Profesores.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                new JF_Profesores().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxContrato;
    private javax.swing.JComboBox<String> cbxSueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtClasesImp;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumPersonal;
    // End of variables declaration//GEN-END:variables
}
