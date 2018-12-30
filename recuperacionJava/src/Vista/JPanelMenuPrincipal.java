package Vista;

import Controlador.Excepciones;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JPanelMenuPrincipal extends javax.swing.JPanel {

    boolean visible = false;

    public JPanelMenuPrincipal() throws SQLException {
        initComponents();
        comprobarRegistros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonRegistrarCoche = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        buttonVisualizarCoche = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        buttonRegistrarCoche.setBackground(new java.awt.Color(102, 255, 102));
        buttonRegistrarCoche.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buttonRegistrarCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño/registro.png"))); // NOI18N
        buttonRegistrarCoche.setText("Registrar Coche");
        buttonRegistrarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarCocheActionPerformed(evt);
            }
        });

        buttonLogout.setBackground(new java.awt.Color(255, 102, 102));
        buttonLogout.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño/logout2.png"))); // NOI18N
        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        buttonVisualizarCoche.setBackground(new java.awt.Color(255, 153, 102));
        buttonVisualizarCoche.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buttonVisualizarCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño/visualizar.png"))); // NOI18N
        buttonVisualizarCoche.setText("Visualizar Coche");
        buttonVisualizarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarCocheActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 102));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño/verDatos.png"))); // NOI18N
        jButton1.setText("Ver Datos de Conexiones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño/logoMenu.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonRegistrarCoche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonVisualizarCoche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRegistrarCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonVisualizarCoche)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(buttonLogout)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarCocheActionPerformed
        JPanelInsertarCoche registrarCoche = null;

        try {
            registrarCoche = new JPanelInsertarCoche();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        registrarCoche.setSize(500, 650);
        this.removeAll();
        this.add(registrarCoche);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_buttonRegistrarCocheActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        JOptionPane.showMessageDialog(buttonLogout, "¡Hasta pronto!");
        System.exit(0);
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonVisualizarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizarCocheActionPerformed
        JPanelVisualizar verCoches;
        try {
            verCoches = new JPanelVisualizar();
            verCoches.setSize(500, 650);
            this.removeAll();
            this.add(verCoches);
            this.revalidate();
            this.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonVisualizarCocheActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JPanelVisualizarConexiones verConexiones;
        try {
            verConexiones = new JPanelVisualizarConexiones();
            verConexiones.setSize(500, 650);
            this.removeAll();
            this.add(verConexiones);
            this.revalidate();
            this.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JPanelMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(JPanelMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JPanelMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void comprobarRegistros() throws SQLException {
        System.out.println("numero: " + Controlador.Controlador.devolverNumeroCoche());
        if (Controlador.Controlador.devolverNumeroCoche() == 1) {
            buttonVisualizarCoche.setVisible(false);
        } else {
            buttonVisualizarCoche.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonRegistrarCoche;
    private javax.swing.JButton buttonVisualizarCoche;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
