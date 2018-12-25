package Vista;

import Controlador.Excepciones;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class JPanelVisualizar extends javax.swing.JPanel {

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

        labelCliente.setText("Coches del cliente");

        labelCodigo.setText("Código:");

        labelMarca.setText("Marca:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelCodigo)
                        .addGap(125, 125, 125)
                        .addComponent(labelMarca)))
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(labelMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSig)
                    .addComponent(buttonAnt)
                    .addComponent(buttonMenu))
                .addContainerGap(182, Short.MAX_VALUE))
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
        JPanelMenuPrincipal cancelar = new JPanelMenuPrincipal();
        cancelar.setSize(400, 500);
        this.removeAll();
        this.add(cancelar);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_buttonMenuActionPerformed

    public void verCoches() throws IOException, SQLException, ParseException {

        ResultSet rset = Controlador.Controlador.mostrarDatosCoches(contador);

        codigoCoche = rset.getInt(1);
        mostrarDatos(rset.getInt(1), rset.getString(2), rset.getInt(3), rset.getString(4));
    }

    public void mostrarDatos(int codigoCoche, String marca, int codCliente, String foto) throws SQLException {

        labelCodigo.setText("Código Coche: " + codigoCoche + "\n");
        labelMarca.setText("Marca: " + marca + "\n");
        rsscalelabel.RSScaleLabel.setScaleLabel(labelImagen, foto);

    }

    public void inicializarLabels() {

        Icon icon = null;
        labelImagen.setIcon(icon);
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
    private javax.swing.JButton buttonAnt;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonSig;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelMarca;
    // End of variables declaration//GEN-END:variables
}
