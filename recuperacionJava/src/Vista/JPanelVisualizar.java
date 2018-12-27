package Vista;

import Controlador.Excepciones;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class JPanelVisualizar extends javax.swing.JPanel {

    String foto = "";
    static int contador = 0;
    static String marca = null;
    public static int codigoCoche = 0;

    public JPanelVisualizar() {
        initComponents();
        inicializarLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCliente = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        buttonSig = new javax.swing.JButton();
        buttonAnt = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaReparacion = new javax.swing.JTable();
        buttonEliminarCoche = new javax.swing.JButton();
        labelNomCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldMarcaActualizar = new javax.swing.JTextField();
        buttonActualizarMarca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buttonExaminarIMG = new javax.swing.JButton();
        buttonActualizarImagen = new javax.swing.JButton();

        labelCliente.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        labelCliente.setText("Coches del cliente:");

        labelCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");

        labelMarca.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelMarca.setText("Marca:");

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgdefault.png"))); // NOI18N
        labelImagen.setBorder(new javax.swing.border.MatteBorder(null));

        buttonSig.setText("Siguiente");
        buttonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSigActionPerformed(evt);
            }
        });

        buttonAnt.setText("Anterior");
        buttonAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAntActionPerformed(evt);
            }
        });

        buttonMenu.setText("Menú Principal");
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar Reparación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTablaReparacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(jTablaReparacion);

        buttonEliminarCoche.setText("Eliminar coche");
        buttonEliminarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarCocheActionPerformed(evt);
            }
        });

        labelNomCliente.setText("nombre");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Modificaciones:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Marca:");

        buttonActualizarMarca.setText("Actualizar");
        buttonActualizarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarMarcaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Imagen:");

        buttonExaminarIMG.setText("Examinar");
        buttonExaminarIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExaminarIMGActionPerformed(evt);
            }
        });

        buttonActualizarImagen.setText("Actualizar");
        buttonActualizarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSig, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCodigo)
                                .addGap(108, 108, 108)
                                .addComponent(labelMarca))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCliente)
                                .addGap(18, 18, 18)
                                .addComponent(labelNomCliente))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonExaminarIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldMarcaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buttonActualizarMarca)
                                            .addComponent(buttonActualizarImagen))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonEliminarCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCliente)
                    .addComponent(labelNomCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(labelMarca))
                .addGap(11, 11, 11)
                .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAnt)
                            .addComponent(buttonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(fieldMarcaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonActualizarMarca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(buttonEliminarCoche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonExaminarIMG)
                        .addComponent(buttonActualizarImagen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSigActionPerformed
        try {

            Moverse(true);
        } catch (IOException ex) {

            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {

            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {

            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSigActionPerformed

    private void buttonAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAntActionPerformed
        try {

            Moverse(false);
        } catch (IOException ex) {

            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {

            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {

            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAntActionPerformed

    public void Moverse(boolean bandera) throws IOException, SQLException, ParseException {

        if (JFrameLogin.Coches.size() > 0) {

            if (contador < JFrameLogin.Coches.size() && bandera) {

                contador++;
                verCoches();
            } else {

                if (contador > 1 && !bandera) {

                    contador--;
                    verCoches();
                } else {

                    JOptionPane.showMessageDialog(null, "Se ha llegado al extremo de la lista", "Mensaje de Error", WIDTH);
                }
            }
        }
    }

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        contador = 0;
        JPanelMenuPrincipal cancelar;
        try {
            cancelar = new JPanelMenuPrincipal();
            cancelar.setSize(500, 650);
            this.removeAll();
            this.add(cancelar);
            this.revalidate();
            this.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        contador--;
        try {
            JPanelInsertarReparacion reparar = new JPanelInsertarReparacion();
            reparar.setSize(500, 650);
            this.removeAll();
            this.add(reparar);
            this.revalidate();
            this.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonEliminarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarCocheActionPerformed
        Statement stmt = null;
        try {
            ResultSet rset = Controlador.Controlador.mostrarDatosCoches(contador);
            stmt = Controlador.Conexion.connection.createStatement();
            String sql;
            if (JFrameLogin.Reparaciones.size() > 0) {
                sql = "DELETE FROM REPARACION WHERE CODCOCHE = " + rset.getInt(1); //primero elimino las relaciones del coche con las reparaciones
                stmt.executeUpdate(sql);
            }
            sql = "DELETE FROM COCHE WHERE CODIGO = " + rset.getInt(1); // luego elimino el coche 
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(buttonEliminarCoche, "Coche eliminado correctamente", "Confirmacion de eliminacion", WIDTH);
            contador--;
            JPanelMenuPrincipal cancelar = new JPanelMenuPrincipal();
            cancelar.setSize(500, 650);
            this.removeAll();
            this.add(cancelar);
            this.revalidate();
            this.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonEliminarCocheActionPerformed

    private void buttonExaminarIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExaminarIMGActionPerformed
        JFileChooser nuevaIMG = new JFileChooser();
        nuevaIMG.setDialogTitle("Cargar");
        nuevaIMG.setFileSelectionMode(JFileChooser.FILES_ONLY);
        nuevaIMG.setCurrentDirectory(new File("./src/Imagenes/Coches"));

        if (nuevaIMG.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            rsscalelabel.RSScaleLabel.setScaleLabel(labelImagen, nuevaIMG.getSelectedFile().toString());
            foto = nuevaIMG.getSelectedFile().toString();
        }
    }//GEN-LAST:event_buttonExaminarIMGActionPerformed

    private void buttonActualizarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarImagenActionPerformed
        if (!foto.equals("")) {
            Statement stmt = null;
            try {

                ResultSet rset = Controlador.Controlador.mostrarDatosCoches(contador);
                stmt = Controlador.Conexion.connection.createStatement();
                String sql = "UPDATE COCHE SET IMAGEN = '" + foto + "' WHERE CODIGO = " + rset.getInt(1);
                stmt.executeUpdate(sql);
                verCoches();
                JOptionPane.showMessageDialog(buttonActualizarImagen, "Foto actualizada correctamente", "Confirmacion de actualizacion", WIDTH);
            } catch (IOException ex) {

                Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {

                Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Excepciones ex = new Excepciones(3);
        }
    }//GEN-LAST:event_buttonActualizarImagenActionPerformed

    private void buttonActualizarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarMarcaActionPerformed

        if (!fieldMarcaActualizar.equals("")) {
            Statement stmt = null;
            try {
                ResultSet rset = Controlador.Controlador.mostrarDatosCoches(contador);
                stmt = Controlador.Conexion.connection.createStatement();
                String sql = "UPDATE COCHE SET MARCA = '" + fieldMarcaActualizar.getText() + "' WHERE CODIGO = " + rset.getInt(1);
                stmt.executeUpdate(sql);
                verCoches();
            } catch (IOException ex) {
                Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Excepciones ex = new Excepciones(3);
        }
    }//GEN-LAST:event_buttonActualizarMarcaActionPerformed

    public void verCoches() throws IOException, SQLException, ParseException {

        ResultSet rset = Controlador.Controlador.mostrarDatosCoches(contador);

        codigoCoche = rset.getInt(1);
        Controlador.Controlador.tablaCochesReparacion(codigoCoche);
        mostrarDatos(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4));
    }

    public void mostrarDatos(int codigoCoche, String marca, int codCliente, String foto) throws SQLException {

        labelCodigo.setText("Código Coche: " + codigoCoche + "\n");
        labelMarca.setText("Marca: " + marca + "\n");
        rsscalelabel.RSScaleLabel.setScaleLabel(labelImagen, foto);

    }

    public void inicializarLabels() {

        //Icon icon = null;
        //labelImagen.setIcon(icon);
        labelCliente.setText("");
        labelCodigo.setText("");
        labelMarca.setText("");
    }

    public static int getCodigoCoche() {
        return codigoCoche;
    }

    public static int getcontador() {
        return contador - 1;
    }

    public static void setContador(int num) {
        contador = num;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActualizarImagen;
    private javax.swing.JButton buttonActualizarMarca;
    private javax.swing.JButton buttonAnt;
    private javax.swing.JButton buttonEliminarCoche;
    private javax.swing.JButton buttonExaminarIMG;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonSig;
    private javax.swing.JTextField fieldMarcaActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTablaReparacion;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelNomCliente;
    // End of variables declaration//GEN-END:variables
}
