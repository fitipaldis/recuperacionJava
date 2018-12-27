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

        jLabel1 = new javax.swing.JLabel();
        buttonRegistrarCoche = new javax.swing.JButton();
        buttonVisualizarCoche = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("MENÚ PRINCIPAL");

        buttonRegistrarCoche.setText("Registrar Coche");
        buttonRegistrarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarCocheActionPerformed(evt);
            }
        });

        buttonVisualizarCoche.setText("Visualizar Coche");
        buttonVisualizarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarCocheActionPerformed(evt);
            }
        });

        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        jButton1.setText("Ver Datos de Conexiones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRegistrarCoche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonVisualizarCoche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(buttonRegistrarCoche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonVisualizarCoche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(buttonLogout)
                .addContainerGap(393, Short.MAX_VALUE))
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
        JPanelVisualizar verCoches = new JPanelVisualizar();
        verCoches.setSize(500, 650);
        this.removeAll();
        this.add(verCoches);
        this.revalidate();
        this.repaint();
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
