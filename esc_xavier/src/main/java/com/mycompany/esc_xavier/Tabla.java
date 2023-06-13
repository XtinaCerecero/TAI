package com.mycompany.esc_xavier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;

public class Tabla extends javax.swing.JFrame {
    MiBD conexion = null;

    public Tabla() {
        initComponents();
        conexion = new MiBD();
    }
    
    public void mostrarProfesores() {
        String [] titulos = {"CURP", "Nombre", "Edad", "Num. Personal", "Clases", "Sueldo", "Contrato"};    //Creamos un arreglo de los titulos de mis columnas
        String [] registro = new String[7]; //Arreglo donde se alojaran los valores que vaya sacando de los result (consultas)
        String consulta = "SELECT * FROM profesores";   //Creamos una cadena que contiene la sentencia SQL
        
        DefaultTableModel modelo = new DefaultTableModel (null,titulos);    //Instanciamos el objeto modelo de la clase Default Table Model
        
        try {
            PreparedStatement ps = conexion.getConnection().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                registro[0] = rs.getString("curp");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("edad"); 
                registro[3] = rs.getString("no_personal");
                registro[4] = rs.getString("total_clases_imp");
                registro[5] = rs.getString("fk_sueldo");
                registro[6] = rs.getString("fk_contrato");

                modelo.addRow(registro);
            }
            tbProfesores.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error durante el procedimiento" + e.getMessage());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProfesores = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("PROFESORES");

        tbProfesores.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CURP", "Nombre", "Edad", "Num de Personal", "Clases", "Sueldo", "Contrato"
            }
        ));
        tbProfesores.setSelectionForeground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(tbProfesores);

        btnMostrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(373, 373, 373))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        this.mostrarProfesores();
    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProfesores;
    // End of variables declaration//GEN-END:variables
}
