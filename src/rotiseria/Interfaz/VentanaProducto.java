//Agustina Chaparro 194551 Valeria Sarro 229531
package rotiseria.Interfaz;

import dominio.Categoria;
import dominio.Producto;
import dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Usuario
 */
public class VentanaProducto extends javax.swing.JFrame {

    /**
     * Creates new form VentanaProductos
     */
    private Sistema sistema;

    public VentanaProducto(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        listarCategorias();
    }

    public boolean noExisteProducto() {
        boolean esValido = true;
        esValido = !(this.sistema.existeProducto(txtNombreProducto.getText()));
        return esValido;
    }

    public boolean ingresaNombreProducto() {
        boolean ingresoNombreProd = true;
        if (txtNombreProducto.getText() == null || txtNombreProducto.getText().equals("") || txtNombreProducto.getText().trim().equals("")) {
            ingresoNombreProd = false;
            showMessageDialog(null, "Ingrese el nombre del producto", "", JOptionPane.PLAIN_MESSAGE);
        }
        return ingresoNombreProd;
    }

    public boolean precioNumerico() {
        boolean esNumerico = false;
        try {
            Integer.parseInt(txtPrecioProducto.getText());
            esNumerico = true;
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "¡El precio solo puede contener números!", "¡Texto ingresado!", JOptionPane.CANCEL_OPTION);
        }
        return esNumerico;
    }

    public boolean ingresaPrecioProducto() {
        boolean ingresoPrecio = true;
        if (txtPrecioProducto.getText() == null || txtPrecioProducto.getText().equals("") || txtPrecioProducto.getText().trim().equals("")) {
            ingresoPrecio = false;
            showMessageDialog(null, "Ingrese un precio", "", JOptionPane.PLAIN_MESSAGE);
        }
        return ingresoPrecio;
    }

    public boolean seleccionaCategoria() {
        boolean estaSeleccionada = true;
        if (lstCategoriasProducto.getSelectedIndex() < 0) {
            showMessageDialog(null, "Seleccione una categoría", "", JOptionPane.PLAIN_MESSAGE);
            estaSeleccionada = false;
        }
        return estaSeleccionada;
    }

    public void listarCategorias() {
        lstCategoriasProducto.setListData(this.sistema.getListaCategorias().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblIngresoProducto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblNombreProducto = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        lblPrecioProducto = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblCategoriasProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCategoriasProducto = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        btnCancelarProducto = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Producto");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        lblIngresoProducto.setBackground(new java.awt.Color(204, 204, 204));
        lblIngresoProducto.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblIngresoProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblIngresoProducto.setText("Ingrese un nuevo producto");
        jPanel2.add(lblIngresoProducto);

        jPanel3.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        lblNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreProducto.setText("Nombre:");
        jPanel4.add(lblNombreProducto);

        txtNombreProducto.setBackground(new java.awt.Color(204, 255, 204));
        txtNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        jPanel4.add(txtNombreProducto);

        lblPrecioProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioProducto.setText("Precio:");
        jPanel4.add(lblPrecioProducto);

        txtPrecioProducto.setBackground(new java.awt.Color(204, 255, 204));
        txtPrecioProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });
        jPanel4.add(txtPrecioProducto);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setOpaque(false);

        lblCategoriasProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoriasProducto.setText("Seleccionar categorias del producto:");

        lstCategoriasProducto.setBackground(new java.awt.Color(204, 255, 204));
        lstCategoriasProducto.setBorder(null);
        lstCategoriasProducto.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(lstCategoriasProducto);

        jPanel6.setOpaque(false);

        btnCancelarProducto.setText("Cancelar");
        btnCancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProductoActionPerformed(evt);
            }
        });

        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarProducto)
                    .addComponent(btnAgregarProducto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoriasProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblCategoriasProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void txtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProductoActionPerformed

    private void btnCancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProductoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        if (noExisteProducto() && this.ingresaNombreProducto() && this.ingresaPrecioProducto() && precioNumerico() && seleccionaCategoria()) {
            Producto unProducto = new Producto(txtNombreProducto.getText(), Integer.parseInt(txtPrecioProducto.getText()));
            ArrayList<Categoria> categoriasProducto = this.sistema.agregarCategoriasProducto(lstCategoriasProducto.getSelectedIndices(), unProducto);
            this.sistema.agregarProductoaLista(unProducto, categoriasProducto);
            showMessageDialog(null, "¡Producto agregado con éxito!", "¡Producto agregado!", JOptionPane.PLAIN_MESSAGE);
            this.dispose();
        } else if (!noExisteProducto()) {
            showMessageDialog(null, "¡Ya existe el producto!\n Ingrese otro nombre o cancele la operación.", "¡Producto existe!", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelarProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoriasProducto;
    private javax.swing.JLabel lblIngresoProducto;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JList lstCategoriasProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
