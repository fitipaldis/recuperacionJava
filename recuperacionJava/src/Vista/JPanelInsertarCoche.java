package Vista;

import Controlador.Excepciones;
import Modelo.Coche;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRAR COCHE");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Código: ");

        fieldCodigoCoche.setEditable(false);
        fieldCodigoCoche.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        fieldCodigoCliente.setEditable(false);
        fieldCodigoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelImagen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelImagen.setText("Imagen:");

        buttonExaminarFoto.setBackground(new java.awt.Color(204, 153, 255));
        buttonExaminarFoto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        buttonExaminarFoto.setText("Examinar");
        buttonExaminarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExaminarFotoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Marca:");

        fieldMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelIMG.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
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
            .addComponent(labelIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldCodigoCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fieldCodigoCliente)
                    .addComponent(buttonExaminarFoto))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldCodigoCliente)
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelImagen)
                            .addComponent(buttonExaminarFoto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addComponent(fieldCodigoCoche, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(labelIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JPanelMenuPrincipal cancelar;
        try {
            cancelar = new JPanelMenuPrincipal();
            cancelar.setSize(500, 658);
            this.removeAll();
            this.add(cancelar);
            this.revalidate();
            this.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelInsertarCoche.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!fieldMarca.getText().equals("")) {
            try {

                agregarCoche();
                JOptionPane.showMessageDialog(null, "Coche registrado correctamente", "Mensaje de Control", WIDTH);
                JPanelMenuPrincipal menu = new JPanelMenuPrincipal();
                menu.setSize(500, 658);
                this.removeAll();
                this.add(menu);
                this.revalidate();
                this.repaint();

            } catch (SQLException ex) {
                try {
                    Excepciones e = new Excepciones(ex.getMessage(), 0);
                } catch (IOException ex1) {
                    Logger.getLogger(JPanelInsertarCoche.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        } else {
            try {
                Excepciones e = new Excepciones(2);
            } catch (IOException ex) {
                Logger.getLogger(JPanelInsertarCoche.class.getName()).log(Level.SEVERE, null, ex);
            }
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
