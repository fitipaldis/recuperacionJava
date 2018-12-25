package Vista;

import Controlador.Excepciones;
import Modelo.Reparacion;
import com.toedter.calendar.JDateChooser;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class JPanelInsertarReparacion extends javax.swing.JPanel {

    public JPanelInsertarReparacion() throws SQLException {
        initComponents();
        inicializarFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fieldCodigoReparacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldCoste = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldCodigoCoche = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("Registrar Reparación");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        fieldCodigoReparacion.setEditable(false);

        jLabel3.setText("Descripción:");

        jLabel4.setText("Coste:");

        jLabel5.setText("Fecha:");

        jLabel6.setText("Coche número:");

        fieldCodigoCoche.setEditable(false);

        jDateChooser1.setDateFormatString("dd-MM-yy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCoste, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCodigoReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldCodigoCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldCodigoCoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldCodigoReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldCoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(buttonCancelar))
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        JPanelMenuPrincipal cancelar = new JPanelMenuPrincipal();
        cancelar.setSize(400, 500);
        this.removeAll();
        this.add(cancelar);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!fieldDescripcion.getText().equals("") && !fieldCoste.getText().equals("")) {
            try {
                agregarReparacion();
                JOptionPane.showMessageDialog(null, "Reparación registrada correctamente", "Mensaje de Control", WIDTH);
                JPanelMenuPrincipal menu = new JPanelMenuPrincipal();
                menu.setSize(600, 630);
                this.removeAll();
                this.add(menu);
                this.revalidate();
                this.repaint();
            } catch (SQLException ex) {
                Excepciones e = new Excepciones(ex.getMessage(), 0);
            }
        } else {
            Excepciones e = new Excepciones(2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void agregarReparacion() throws SQLException {
        
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yy");        

        Reparacion nueva = new Reparacion(Controlador.Controlador.devolverNumeroReparacion(), fieldDescripcion.getText(), Float.parseFloat(fieldCoste.getText()), JPanelVisualizar.getCodigoCoche(), fmt.format(jDateChooser1.getDate()));
        JFrameLogin.Reparaciones.add(nueva);

        Controlador.Controlador.insertarReparacion(Controlador.Controlador.devolverNumeroReparacion(), fieldDescripcion.getText(), Float.parseFloat(fieldCoste.getText()), JPanelVisualizar.getCodigoCoche(), fmt.format(jDateChooser1.getDate()));
    }

    public void inicializarFields() throws SQLException {

        fieldCodigoReparacion.setText("" + Controlador.Controlador.devolverNumeroReparacion());
        fieldCodigoReparacion.setEditable(false);
        fieldCodigoCoche.setText("" + JPanelVisualizar.codigoCoche);
        fieldCodigoCoche.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JTextField fieldCodigoCoche;
    private javax.swing.JTextField fieldCodigoReparacion;
    private javax.swing.JTextField fieldCoste;
    private javax.swing.JTextField fieldDescripcion;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}