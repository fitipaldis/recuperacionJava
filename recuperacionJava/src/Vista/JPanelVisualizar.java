package Vista;

import Controlador.Conexion;
import Controlador.Excepciones;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public JPanelVisualizar() throws SQLException {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        buttonCalcular = new javax.swing.JButton();
        fieldCalcular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        labelCliente.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        labelCliente.setText("COCHES DEL CLIENTE:");

        labelCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");

        labelMarca.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelMarca.setText("Marca:");

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño/imgdefault.png"))); // NOI18N
        labelImagen.setBorder(new javax.swing.border.MatteBorder(null));

        buttonSig.setBackground(new java.awt.Color(255, 153, 102));
        buttonSig.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        buttonSig.setText("Siguiente");
        buttonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSigActionPerformed(evt);
            }
        });

        buttonAnt.setBackground(new java.awt.Color(255, 153, 102));
        buttonAnt.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        buttonAnt.setText("Anterior");
        buttonAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAntActionPerformed(evt);
            }
        });

        buttonMenu.setBackground(new java.awt.Color(102, 153, 255));
        buttonMenu.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buttonMenu.setText("Menú Principal");
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setText("Registrar Reparación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTablaReparacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
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

        buttonEliminarCoche.setBackground(new java.awt.Color(255, 102, 102));
        buttonEliminarCoche.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        buttonEliminarCoche.setText("Eliminar coche");
        buttonEliminarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarCocheActionPerformed(evt);
            }
        });

        labelNomCliente.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        labelNomCliente.setText("nombre");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Modificaciones:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Marca:");

        buttonActualizarMarca.setBackground(new java.awt.Color(204, 255, 102));
        buttonActualizarMarca.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        buttonActualizarMarca.setText("Actualizar");
        buttonActualizarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarMarcaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Imagen:");

        buttonExaminarIMG.setBackground(new java.awt.Color(204, 153, 255));
        buttonExaminarIMG.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        buttonExaminarIMG.setText("Examinar");
        buttonExaminarIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExaminarIMGActionPerformed(evt);
            }
        });

        buttonActualizarImagen.setBackground(new java.awt.Color(204, 255, 102));
        buttonActualizarImagen.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        buttonActualizarImagen.setText("Actualizar");
        buttonActualizarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarImagenActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Reparaciones:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Calcular Importe:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Fecha:");

        buttonCalcular.setBackground(new java.awt.Color(255, 153, 255));
        buttonCalcular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(labelCliente)
                                .addGap(18, 18, 18)
                                .addComponent(labelNomCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(labelCodigo)
                                .addGap(122, 122, 122)
                                .addComponent(labelMarca)))
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(fieldMarcaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(buttonExaminarIMG)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(buttonActualizarMarca)
                                                    .addComponent(buttonActualizarImagen)))
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonEliminarCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(fieldDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(29, 29, 29))
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(buttonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                    .addComponent(fieldCalcular))))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCliente)
                    .addComponent(labelNomCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(labelMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSig)
                            .addComponent(buttonAnt, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(buttonEliminarCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(fieldMarcaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonActualizarMarca))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonExaminarIMG)
                                        .addComponent(buttonActualizarImagen))
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
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

                    JOptionPane.showMessageDialog(null, "No hay mas coches registrados", "Mensaje de Error", WIDTH);
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
            try {
                Excepciones ex = new Excepciones(7);
            } catch (IOException ex1) {
                Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_buttonActualizarImagenActionPerformed

    private void buttonActualizarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarMarcaActionPerformed

        if (!fieldMarcaActualizar.getText().equals("")) {
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
            try {
                Excepciones ex = new Excepciones(2);
            } catch (IOException ex1) {
                Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_buttonActualizarMarcaActionPerformed

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed

        try {
            fieldCalcular.setText(Controlador.Controlador.devolverCosteReparaciones() + " euros");            
        } catch (SQLException ex) {
            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCalcularActionPerformed

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
        fieldCalcular.setText("");

    }

    public void inicializarLabels() throws SQLException {

        //Icon icon = null;
        //labelImagen.setIcon(icon);
        labelCodigo.setText("");
        labelMarca.setText("");
        labelNomCliente.setText(Controlador.Controlador.devolverNombreCliente().toUpperCase());
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
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JButton buttonEliminarCoche;
    private javax.swing.JButton buttonExaminarIMG;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonSig;
    private javax.swing.JTextField fieldCalcular;
    public static com.toedter.calendar.JDateChooser fieldDateChooser;
    private javax.swing.JTextField fieldMarcaActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTablaReparacion;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelNomCliente;
    // End of variables declaration//GEN-END:variables
}
