/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grafica;

import java.awt.Point;
import java.util.Arrays;
import logica.LstUsuarios;
import persistencia.Archivo;

/**
 *
 * @author mimiuwu
 */
public class FrmIniciarSesion extends javax.swing.JFrame {

    private LstUsuarios coleccion;
    
    /**
     * Creates new form NewJFrame
     */
    public FrmIniciarSesion(Point p, LstUsuarios coleccion) {
        this.coleccion = coleccion;
        initComponents();
        this.setLocation(p);
        lblIncorrecto.setVisible(false);
        lblBloqueado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBloqueado = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fieldUsuario = new javax.swing.JTextField();
        lblIncorrecto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldContrasenia = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        lblBloqueado.setForeground(new java.awt.Color(204, 0, 51));
        lblBloqueado.setText("Este usuario está bloqueado.");
        jPanel1.add(lblBloqueado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        fieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(fieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 310, -1));

        lblIncorrecto.setForeground(new java.awt.Color(204, 0, 51));
        lblIncorrecto.setText("Contraseña o usuario incorrectos.");
        jPanel1.add(lblIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        fieldContrasenia.setFocusTraversalPolicyProvider(true);
        fieldContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldContraseniaActionPerformed(evt);
            }
        });
        jPanel1.add(fieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 310, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondito.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsuarioActionPerformed

    private void fieldContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldContraseniaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmPrincipal principal = new FrmPrincipal(this.getLocation(), coleccion);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        if (verificarUsuario(fieldUsuario.getText(), String.valueOf(fieldContrasenia.getPassword())) && coleccion.devolver(fieldUsuario.getText()).devolverInicioSesiones().isHabilitado()) {
            coleccion.devolver(fieldUsuario.getText()).devolverInicioSesiones().actualizarLista();
            coleccion.devolver(fieldUsuario.getText()).devolverInicioSesiones().resetIntentos();
            Archivo.getInstancia().registrarUsuario(coleccion);
                    
            FrmSesion sesion = new FrmSesion(this.getLocation(), coleccion);
            sesion.setVisible(true);
            this.dispose();
        } else {
            coleccion.devolver(fieldUsuario.getText()).devolverInicioSesiones().sumarIntento();
            Archivo.getInstancia().registrarUsuario(coleccion);
            if (coleccion.devolver(fieldUsuario.getText()).devolverInicioSesiones().isHabilitado()) {
                lblIncorrecto.setVisible(true);
            } else {
                lblBloqueado.setVisible(true);
                lblIncorrecto.setVisible(false);
            }
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    private boolean verificarUsuario(String mail, String contrasenia) {
        try {
            return coleccion.devolver(mail).getPass().getContrasenia().equals(contrasenia);
        } catch (Exception e) {
            return false;
        }
    }
    
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
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIniciarSesion(new Point(0, 0), new LstUsuarios()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JPasswordField fieldContrasenia;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBloqueado;
    private javax.swing.JLabel lblIncorrecto;
    // End of variables declaration//GEN-END:variables
}
