//Agustina Chaparro 194551 Valeria Sarro 229531
package rotiseria.Interfaz;

import java.util.*;
import dominio.Categoria;
import dominio.Cliente;
import dominio.Pedido;
import dominio.Producto;
import dominio.Sistema;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import utils.OrdenAlfabetico;
import utils.OrdenPrioridad;

/**
 *
 * @author Usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame implements PropertyChangeListener {

    private Sistema sistema;

    public VentanaPrincipal(Sistema unSistema) {
        initComponents();
        this.sistema = unSistema;
        this.sistema.agregarListenerpCS1(this);
        this.cerrarVentana();
    }
    public void cerrarVentana(){
        addWindowListener (new WindowAdapter (){
            @Override
            public void windowClosing (WindowEvent  e){
                showMessageDialog(null, "¡Datos guardados exitosamente!", "¡Guardado!", JOptionPane.INFORMATION_MESSAGE);
                System.exit (0);
            }
         });
    }

    public void clienteElegido(Cliente unCliente) {
        lblDatosCliente.setText(unCliente.toString());
    }
    public void cargarCombo(){
        if(!this.sistema.getListaCategorias().isEmpty()){
            cmbCategoria.removeAllItems();
            if(rbtnPrioridad.isSelected()){
                Collections.sort(this.sistema.getListaCategorias(),new OrdenPrioridad());
            }else{
                Collections.sort(this.sistema.getListaCategorias(),new OrdenAlfabetico());
            }
            for(int i=0; i<this.sistema.getListaCategorias().size(); i++){
                cmbCategoria.addItem(this.sistema.getListaCategorias().get(i).toString());
            }
        }
    }
    public void setCliente(){
        lblDatosCliente.setText("");
        if(!this.sistema.getClienteSeleccionado().getNombre().equals("")){
            lblDatosCliente.setText(this.sistema.getClienteSeleccionado().toString());
        }
    }
    public void agregarBotones(String categoria){
        if(!this.sistema.getListaProductos().isEmpty()){
            pnlProductos.removeAll();
            for(int i=0; i<this.sistema.getListaProductos().size(); i++){
                for(Categoria unaCategoria:this.sistema.getListaProductos().get(i).getListaCategorias()){
                    if(unaCategoria.getNombre().equalsIgnoreCase(categoria)){
                        JButton nuevo = new JButton(" ");
                        nuevo.setMargin(new Insets(-5, -5, -5, -5));
                        nuevo.setBackground(Color.BLACK);
                        nuevo.setForeground(Color.WHITE);
                        nuevo.setText( this.sistema.getListaProductos().get(i).getNombre()+"- $"+ this.sistema.getListaProductos().get(i).getPrecio()); 
                        nuevo.addActionListener(new ProductoListener(this.sistema));
                        pnlProductos.add(nuevo);
                    }
                }
            }
        }
    }
    
    public class ProductoListener implements ActionListener {
        
        private Sistema sistema;
        
        public ProductoListener(Sistema sistema){
            this.sistema=sistema;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton cual = ((JButton) e.getSource());
            this.sistema.agregarAListaProductosSeleccionados(this.sistema.darProducto(cual.getText().split("-")[0]));
        }
    }    
    
    public void mostrarTotal(){
        lblCostoTotal.setText("$ " + String.valueOf((this.sistema.precioPedidoEnCurso())));
    }
    
    public void generarListaProductos(){
        String [] vacio =new String [0];
        lstProductosDePedido.setListData(vacio);
        if(!this.sistema.getListaProdcutosSeleccionados().isEmpty()){
            lstProductosDePedido.setListData(sistema.getListaProdcutosSeleccionados().toArray());
        }
        
    }
    private void resetearPedido(){
        Iterator<Producto> it=this.sistema.getListaProdcutosSeleccionados().iterator();
        while(it.hasNext()){
            this.sistema.getListaProdcutosSeleccionados().remove(0);
        }
        tfdObservaciones.setText("");
        this.sistema.setClienteSeleccionado(new Cliente("","",""));
        this.cargarCombo();
        this.setCliente();
        this.mostrarTotal();
        this.generarListaProductos(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        elegirCliente = new javax.swing.JButton();
        lblDatosCliente = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        tfdObservaciones = new javax.swing.JTextField();
        rbtnAlfabetico = new javax.swing.JRadioButton();
        rbtnPrioridad = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVerPedidos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        btnReiniciarPedido = new javax.swing.JButton();
        lblCostoTotal = new javax.swing.JLabel();
        pnlProductos = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductosDePedido = new javax.swing.JList();
        btnEliminarItem = new javax.swing.JButton();
        btnGrabarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rotisería");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(3, 0));

        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        elegirCliente.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        elegirCliente.setText("Elegir Cliente");
        elegirCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        elegirCliente.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        elegirCliente.setOpaque(true);
        elegirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirClienteActionPerformed(evt);
            }
        });
        jPanel2.add(elegirCliente);

        lblDatosCliente.setBackground(new java.awt.Color(204, 255, 204));
        lblDatosCliente.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lblDatosCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblDatosCliente.setName(""); // NOI18N
        lblDatosCliente.setOpaque(true);
        jPanel2.add(lblDatosCliente);

        lblObservaciones.setBackground(new java.awt.Color(204, 255, 204));
        lblObservaciones.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        lblObservaciones.setText("Observaciones:");
        lblObservaciones.setOpaque(true);
        jPanel2.add(lblObservaciones);

        tfdObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        tfdObservaciones.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        tfdObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        tfdObservaciones.setCaretColor(new java.awt.Color(0, 0, 0));
        tfdObservaciones.setOpaque(true);
        tfdObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdObservacionesActionPerformed(evt);
            }
        });
        jPanel2.add(tfdObservaciones);

        rbtnAlfabetico.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rbtnAlfabetico);
        rbtnAlfabetico.setFont(new java.awt.Font("Segoe UI Variable", 0, 10)); // NOI18N
        rbtnAlfabetico.setForeground(new java.awt.Color(0, 0, 0));
        rbtnAlfabetico.setSelected(true);
        rbtnAlfabetico.setText("Categorías por orden Alfabético");
        rbtnAlfabetico.setActionCommand("");
        rbtnAlfabetico.setBorderPainted(true);
        rbtnAlfabetico.setFocusCycleRoot(true);
        rbtnAlfabetico.setPreferredSize(new java.awt.Dimension(174, 19));
        rbtnAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAlfabeticoActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnAlfabetico);

        rbtnPrioridad.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rbtnPrioridad);
        rbtnPrioridad.setFont(new java.awt.Font("Segoe UI Variable", 0, 10)); // NOI18N
        rbtnPrioridad.setForeground(new java.awt.Color(0, 0, 0));
        rbtnPrioridad.setText("Categorías por orden Prioridad");
        rbtnPrioridad.setActionCommand("");
        rbtnPrioridad.setBorderPainted(true);
        rbtnPrioridad.setFocusCycleRoot(true);
        rbtnPrioridad.setPreferredSize(new java.awt.Dimension(171, 19));
        rbtnPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPrioridadActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnPrioridad);

        jPanel1.add(jPanel2);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel5.add(btnClientes);

        btnCategorias.setText("Categorías");
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        jPanel5.add(btnCategorias);

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel5.add(btnProductos);

        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });
        jPanel5.add(btnVerPedidos);

        jPanel1.add(jPanel5);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        cmbCategoria.setBackground(new java.awt.Color(204, 204, 204));
        cmbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cmbCategoria.setToolTipText("");
        cmbCategoria.setAutoscrolls(true);
        cmbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoriaItemStateChanged(evt);
            }
        });
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCategoria);

        jPanel1.add(jPanel3);

        jPanel6.setLayout(new java.awt.GridLayout(2, 0));

        btnReiniciarPedido.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        btnReiniciarPedido.setText("Reiniciar Pedido");
        btnReiniciarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarPedidoActionPerformed(evt);
            }
        });
        jPanel6.add(btnReiniciarPedido);

        lblCostoTotal.setBackground(new java.awt.Color(204, 255, 204));
        lblCostoTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblCostoTotal.setOpaque(true);
        jPanel6.add(lblCostoTotal);

        jPanel1.add(jPanel6);

        pnlProductos.setBackground(new java.awt.Color(204, 255, 204));
        pnlProductos.setForeground(new java.awt.Color(0, 0, 0));
        pnlProductos.setLayout(new java.awt.GridLayout(3, 0));
        jPanel1.add(pnlProductos);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        lstProductosDePedido.setBackground(new java.awt.Color(255, 255, 255));
        lstProductosDePedido.setFont(new java.awt.Font("Segoe UI Variable", 0, 10)); // NOI18N
        lstProductosDePedido.setForeground(new java.awt.Color(0, 0, 0));
        lstProductosDePedido.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(lstProductosDePedido);

        jPanel7.add(jScrollPane1);

        btnEliminarItem.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        btnEliminarItem.setText("Eliminar Item");
        btnEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarItemActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminarItem);

        btnGrabarPedido.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        btnGrabarPedido.setText("Grabar Pedido");
        btnGrabarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarPedidoActionPerformed(evt);
            }
        });
        jPanel7.add(btnGrabarPedido);

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1);

        setSize(new java.awt.Dimension(919, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfdObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdObservacionesActionPerformed

    private void rbtnPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPrioridadActionPerformed
        this.cargarCombo();
    }//GEN-LAST:event_rbtnPrioridadActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed

    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        VentanaCliente agregarCliente = new VentanaCliente(sistema);
        agregarCliente.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        VentanaCategoria ventCategoria = new VentanaCategoria(sistema);
        ventCategoria.setVisible(true);
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        VentanaProducto agregarProducto = new VentanaProducto(sistema);
        agregarProducto.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed
        if(this.sistema.getListaPedidos().isEmpty()){
            showMessageDialog(null, "¡Primero debe ingresar un pedido!", "¡Ingrese Pedido!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            VentanaPedido verPedido = new VentanaPedido(sistema);
            verPedido.setVisible(true);
        }
    }//GEN-LAST:event_btnVerPedidosActionPerformed

    private void elegirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirClienteActionPerformed
        VentanaElegirCliente elegirCliente = new VentanaElegirCliente(sistema);
        elegirCliente.setVisible(true);
    }//GEN-LAST:event_elegirClienteActionPerformed

    private void btnGrabarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarPedidoActionPerformed
        
        Cliente unC=this.sistema.getClienteSeleccionado();
        ArrayList <Producto> lstP=this.sistema.getListaProdcutosSeleccionados();
        if(unC.getNombre().equalsIgnoreCase("")){
            showMessageDialog(null, "¡Primero debe elegir un Cliente!", "¡Problema!", JOptionPane.INFORMATION_MESSAGE);
        }else if(lstP.size()==0){
            showMessageDialog(null, "¡Primero debe elegir por lo menos un producto!", "¡Problema!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String obs=tfdObservaciones.getText();
            int num= this.sistema.getListaPedidos().size()+1;
            int precioT= this.sistema.precioPedidoEnCurso();
            this.sistema.agregarPedidoALista(new Pedido(num, unC,precioT,obs, lstP));
            showMessageDialog(null, "Pedido agregado con éxito!", "¡ÉXITO!", JOptionPane.PLAIN_MESSAGE);
        }
        resetearPedido();
    }//GEN-LAST:event_btnGrabarPedidoActionPerformed

    private void btnEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarItemActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar pedido?", "¡Eliminar Pedido!", JOptionPane.OK_CANCEL_OPTION);
        //0 es OK
        //2 es Cancel
        if (respuesta == 0) {
            this.sistema.getListaProdcutosSeleccionados().remove(lstProductosDePedido.getSelectedIndex());
            this.generarListaProductos();
            this.mostrarTotal();
        }
    }//GEN-LAST:event_btnEliminarItemActionPerformed

    private void rbtnAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAlfabeticoActionPerformed
        this.cargarCombo();
    }//GEN-LAST:event_rbtnAlfabeticoActionPerformed

    private void cmbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriaItemStateChanged
        if(cmbCategoria.getSelectedItem()!= null){
            String contenido=cmbCategoria.getSelectedItem().toString().split("-")[0];
            this.agregarBotones(contenido);
        } 
    }//GEN-LAST:event_cmbCategoriaItemStateChanged

    private void btnReiniciarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarPedidoActionPerformed
        resetearPedido();
    }//GEN-LAST:event_btnReiniciarPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEliminarItem;
    private javax.swing.JButton btnGrabarPedido;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReiniciarPedido;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JButton elegirCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCostoTotal;
    private javax.swing.JLabel lblDatosCliente;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JList lstProductosDePedido;
    private javax.swing.JPanel pnlProductos;
    private javax.swing.JRadioButton rbtnAlfabetico;
    private javax.swing.JRadioButton rbtnPrioridad;
    private javax.swing.JTextField tfdObservaciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        //this.agregarBotones(this.sistema.getListaCategorias().get(0).toString());
        this.cargarCombo();
        this.setCliente();
        this.mostrarTotal();
        this.generarListaProductos();
    }
}
