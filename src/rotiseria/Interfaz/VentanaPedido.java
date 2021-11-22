//Agustina Chaparro 194551 Valeria Sarro 229531
package rotiseria.Interfaz;

import dominio.Pedido;
import dominio.Producto;
import dominio.Sistema;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Usuario
 */
public class VentanaPedido extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPedido
     */
    private Sistema sistema;

    public VentanaPedido(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        lstPedidosPedido.setListData(this.sistema.getListaPedidos().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblDetallePedido = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblNumeroPedido = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblSeleccionePedido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPedidosPedido = new javax.swing.JList();
        jPanel7 = new javax.swing.JPanel();
        lblProductoPedido = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstProductoPedido = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        lblClientePedido = new javax.swing.JLabel();
        lblClientePedidoSeleccionado = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblPrecioPedidoSeleccionado = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jArDatosPedidos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Pedidos");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setOpaque(false);

        lblDetallePedido.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblDetallePedido.setForeground(new java.awt.Color(0, 0, 0));
        lblDetallePedido.setText("Detalle del pedido:");

        lblNumeroPedido.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblNumeroPedido.setForeground(new java.awt.Color(0, 0, 0));
        lblNumeroPedido.setText("Número del pedido:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblDetallePedido)
                .addGap(145, 145, 145)
                .addComponent(lblNumeroPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDetallePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setOpaque(false);

        lblSeleccionePedido.setForeground(new java.awt.Color(0, 0, 0));
        lblSeleccionePedido.setText("Seleccione un pedido:");

        lstPedidosPedido.setBackground(new java.awt.Color(204, 255, 204));
        lstPedidosPedido.setForeground(new java.awt.Color(0, 0, 0));
        lstPedidosPedido.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lstPedidosPedido.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPedidosPedidoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPedidosPedido);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(lblSeleccionePedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeleccionePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel6);

        jPanel7.setOpaque(false);

        lblProductoPedido.setForeground(new java.awt.Color(0, 0, 0));
        lblProductoPedido.setText("Productos del pedido:");

        lstProductoPedido.setBackground(new java.awt.Color(204, 255, 204));
        lstProductoPedido.setForeground(new java.awt.Color(0, 0, 0));
        lstProductoPedido.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(lstProductoPedido);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProductoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel7);

        jPanel5.setOpaque(false);

        lblClientePedido.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblClientePedido.setForeground(new java.awt.Color(0, 0, 0));
        lblClientePedido.setText("Cliente:");

        lblClientePedidoSeleccionado.setForeground(new java.awt.Color(0, 0, 0));

        lblPrecio.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("Precio:");

        lblPrecioPedidoSeleccionado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClientePedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClientePedidoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecioPedidoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClientePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblClientePedidoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblPrecioPedidoSeleccionado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jArDatosPedidos.setBackground(new java.awt.Color(204, 255, 204));
        jArDatosPedidos.setColumns(20);
        jArDatosPedidos.setForeground(new java.awt.Color(0, 0, 0));
        jArDatosPedidos.setRows(5);
        jScrollPane3.setViewportView(jArDatosPedidos);

        jPanel8.add(jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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

    private void setLista(ArrayList<Producto> lista) {
        lstProductoPedido.setListData(lista.toArray());
    }
    private void lstPedidosPedidoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPedidosPedidoValueChanged
        Pedido eleccion = (Pedido) lstPedidosPedido.getSelectedValue();
        int numero = eleccion.getNumero();
        setLista(eleccion.getListaProdcutos());
        // lstProductoPedido.setListData(eleccion.getListaProdcutos().toArray());
        lblNumero.setText(String.valueOf(eleccion.getNumero()));
        lblClientePedidoSeleccionado.setText(eleccion.getUnCliente().getNombre());
        lblPrecioPedidoSeleccionado.setText("$" + Integer.toString(eleccion.getPrecioTotal()));
        jArDatosPedidos.setText("Observaciones: " + eleccion.getObservaciones());
    }//GEN-LAST:event_lstPedidosPedidoValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jArDatosPedidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblClientePedido;
    private javax.swing.JLabel lblClientePedidoSeleccionado;
    private javax.swing.JLabel lblDetallePedido;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroPedido;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioPedidoSeleccionado;
    private javax.swing.JLabel lblProductoPedido;
    private javax.swing.JLabel lblSeleccionePedido;
    private javax.swing.JList lstPedidosPedido;
    private javax.swing.JList lstProductoPedido;
    // End of variables declaration//GEN-END:variables
}
