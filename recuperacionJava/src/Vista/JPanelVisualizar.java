package Vista;

import Controlador.Excepciones;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.SQLException;
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
        buttonReparacion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        buttonReparacion.setText("Registrar Reparación");
        buttonReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReparacionActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Fecha", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(buttonSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonReparacion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReparacionActionPerformed
        JPanelInsertarReparacion registrarReparacion = null;

        try {
            registrarReparacion = new JPanelInsertarReparacion();
        } catch (SQLException ex) {
            Logger.getLogger(JPanelVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }

        registrarReparacion.setSize(400, 500);
        this.removeAll();
        this.add(registrarReparacion);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_buttonReparacionActionPerformed

    private void buttonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSigActionPerformed
        try {
            controlSigAnte(true);

        } catch (SQLException ex) {
            Excepciones e = new Excepciones(ex.getMessage(), 0);
        }
    }//GEN-LAST:event_buttonSigActionPerformed

    private void buttonAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAntActionPerformed
        try {

            controlSigAnte(false);
        } catch (SQLException ex) {
            Excepciones e = new Excepciones(ex.getMessage(), 0);
        }
    }//GEN-LAST:event_buttonAntActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        contador = 0;
        JPanelMenuPrincipal cancelar = new JPanelMenuPrincipal();
        cancelar.setSize(400, 500);
        this.removeAll();
        this.add(cancelar);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_buttonMenuActionPerformed
    public void controlSigAnte(boolean flag) throws SQLException {

        if (JFrameLogin.Coches.size() > 0) {
            if (contador < JFrameLogin.Coches.size() && flag) {
                contador++;
                contadorCoches(true);
            } else {
                if (contador > 1 && !flag) {
                    contador--;
                    contadorCoches(false);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas coches registrados", "Mensaje de Error", WIDTH);
                }
            }
        }
    }

    public void contadorCoches(boolean flag) throws SQLException {

        ListIterator iterator = JFrameLogin.Coches.listIterator();
        Modelo.Coche next = null;
        for (int i = 0; i < contador; i++) {

            next = (Modelo.Coche) iterator.next();

        }
        codigoCoche = next.getCodigo();
        marca = next.getMarca();

        Controlador.Controlador.tablaCocheReparacion(JPanelVisualizar.getCodigoCoche());
        mostrarCoches(next.getCodigo(), next.getMarca(), next.getCodcliente(), next.getImagen());
    }

    public void mostrarCoches(int codigoCoche, String marca, int codCliente, String foto) throws SQLException {

        labelCliente.setText("Coches del Cliente " + Controlador.Controlador.devolverNombreCliente() + "\n");
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
    private javax.swing.JButton buttonReparacion;
    private javax.swing.JButton buttonSig;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelMarca;
    // End of variables declaration//GEN-END:variables
}
