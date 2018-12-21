package Vista;

import Controlador.Excepciones;
import Modelo.Coche;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class JPanelInsertarCoche extends javax.swing.JPanel {

    String foto = "";

    public JPanelInsertarCoche() throws SQLException {
        initComponents();
        inicializarFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldCodigoCoche = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldCodigoCliente = new javax.swing.JTextField();
        labelImagen = new javax.swing.JLabel();
        buttonExaminarFoto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fieldMarca = new javax.swing.JTextField();
        labelIMG = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("REGISTRAR COCHE");

        jLabel2.setText("Código: ");

        jLabel3.setText("Cliente:");

        labelImagen.setText("Imagen:");

        buttonExaminarFoto.setText("Examinar");
        buttonExaminarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExaminarFotoActionPerformed(evt);
            }
        });

        jLabel5.setText("Marca:");

        labelIMG.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fieldCodigoCliente)
                                .addComponent(fieldCodigoCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(82, 82, 82)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelImagen)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buttonExaminarFoto))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(jButton1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2)
                        .addComponent(labelIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldCodigoCoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelImagen)
                    .addComponent(buttonExaminarFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(labelIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JPanelMenuPrincipal cancelar = new JPanelMenuPrincipal();
        cancelar.setSize(400, 500);
        this.removeAll();
        this.add(cancelar);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!fieldMarca.getText().equals("")) {
            try {

                agregarCoche();
                JOptionPane.showMessageDialog(null, "Coche registrado correctamente", "Mensaje de Control", WIDTH);
                JPanelMenuPrincipal menu = new JPanelMenuPrincipal();
                menu.setSize(400, 500);
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

    private void buttonExaminarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExaminarFotoActionPerformed
        JFileChooser nuevaIMG = new JFileChooser();
        nuevaIMG.setDialogTitle("Cargar");
        nuevaIMG.setFileSelectionMode(JFileChooser.FILES_ONLY);
        nuevaIMG.setCurrentDirectory(new File("./src/Imagenes/Coches"));

        if (nuevaIMG.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            rsscalelabel.RSScaleLabel.setScaleLabel(labelIMG, nuevaIMG.getSelectedFile().toString());
            foto = nuevaIMG.getSelectedFile().toString();
        }
    }//GEN-LAST:event_buttonExaminarFotoActionPerformed

    public void agregarCoche() throws SQLException {

        Coche nuevo;

        if (foto.equals("")) {
            nuevo = new Coche((Controlador.Controlador.devolverNumeroCoche()), fieldMarca.getText(), JFrameLogin.codigoCliente, "./src/Imagenes/notFound.png");
        } else {
            nuevo = new Coche((Controlador.Controlador.devolverNumeroCoche()), fieldMarca.getText(), JFrameLogin.codigoCliente, foto);
        }
        JFrameLogin.Coches.add(nuevo);

        Controlador.Controlador.insertarCoche(Controlador.Controlador.devolverNumeroCoche(), fieldMarca.getText(), Vista.JFrameLogin.codigoCliente, labelImagen.getText());
    }

    public void inicializarFields() throws SQLException {
        int num = Controlador.Controlador.devolverNumeroCoche();
        fieldCodigoCoche.setText("" + num);
        fieldCodigoCoche.setEditable(false);
        fieldCodigoCliente.setText("" + JFrameLogin.codigoCliente);
        fieldCodigoCliente.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExaminarFoto;
    private javax.swing.JTextField fieldCodigoCliente;
    private javax.swing.JTextField fieldCodigoCoche;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelIMG;
    private javax.swing.JLabel labelImagen;
    // End of variables declaration//GEN-END:variables
}
