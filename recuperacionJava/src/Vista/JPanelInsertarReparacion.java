package Vista;

import Controlador.Excepciones;
import Modelo.Reparacion;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JPanelInsertarReparacion extends javax.swing.JPanel {

    static final int LIMITE_PRECIO = 3000;
    
    public JPanelInsertarReparacion() throws SQLException {
        initComponents();
        inicializarFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        fieldDescripcion = new javax.swing.JTextField();
        fieldPrecio = new javax.swing.JTextField();
        fieldFecha = new javax.swing.JFormattedTextField();
        fieldCoche = new javax.swing.JTextField();
        buttonRegistrar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRAR REPARACIÓN");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Fecha:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Coche:");

        fieldCodigo.setEditable(false);
        fieldCodigo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fieldCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fieldDescripcion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fieldDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDescripcionActionPerformed(evt);
            }
        });

        fieldPrecio.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fieldPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPrecioActionPerformed(evt);
            }
        });

        fieldFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fieldFecha.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        fieldCoche.setEditable(false);
        fieldCoche.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fieldCoche.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonRegistrar.setBackground(new java.awt.Color(102, 255, 102));
        buttonRegistrar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buttonRegistrar.setText("Registrar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });

        buttonCancelar.setBackground(new java.awt.Color(255, 102, 102));
        buttonCancelar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel7.setText("Debe ser inferior a 3000€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(0, 19, Short.MAX_VALUE)))))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(fieldCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(fieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(buttonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCancelar)
                .addGap(96, 96, 96))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDescripcionActionPerformed

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed

        if (!fieldDescripcion.getText().equals("") && !fieldPrecio.getText().equals("") && !fieldFecha.getText().equals("")) {
            try {
                if(Integer.parseInt(fieldPrecio.getText()) > LIMITE_PRECIO){
                    Excepciones e = new Excepciones(6);
                } else {
                    agregarReparacion();
                    JOptionPane.showMessageDialog(null, "Reparación registrada correctamente", "Mensaje de Control", WIDTH);
                    JPanelMenuPrincipal menu = new JPanelMenuPrincipal();
                    menu.setSize(500, 650);
                    this.removeAll();
                    this.add(menu);
                    this.revalidate();
                    this.repaint();
                }
            } catch (SQLException ex) {
                Excepciones e = new Excepciones(ex.getMessage(), 0);
            } catch (ParseException ex) {
                Logger.getLogger(JPanelInsertarReparacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Excepciones e = new Excepciones(2);
        }
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

        JPanelMenuPrincipal cancelar;
        try {
            cancelar = new JPanelMenuPrincipal();
            cancelar.setSize(500, 650);
            this.removeAll();
            this.add(cancelar);
            this.revalidate();
            this.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelInsertarReparacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void fieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPrecioActionPerformed

    public void agregarReparacion() throws SQLException, ParseException {

        Date fecha = cambiarFecha(fieldFecha.getText());
        Reparacion nueva = new Reparacion((JFrameLogin.Reparaciones.size() + 1), fieldDescripcion.getText(), Float.parseFloat(fieldPrecio.getText()), JPanelVisualizar.getCodigoCoche(), fecha);
        JFrameLogin.Reparaciones.add(nueva);
        Controlador.Controlador.insertarReparacion();
    }

    public static Date cambiarFecha(String fechaString) throws ParseException {

        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        fecha = (Date) fmt.parse(fechaString);
        return fecha;
    }

    public void inicializarFields() throws SQLException {

        fieldCodigo.setText("" + (JFrameLogin.Reparaciones.size() + 1));
        fieldCodigo.setEditable(false);
        fieldCoche.setText("" + JPanelVisualizar.codigoCoche);
        fieldCoche.setEditable(false);
        fieldDescripcion.setText("");
        fieldPrecio.setText("");
        fieldFecha.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JTextField fieldCoche;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldDescripcion;
    private javax.swing.JFormattedTextField fieldFecha;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
