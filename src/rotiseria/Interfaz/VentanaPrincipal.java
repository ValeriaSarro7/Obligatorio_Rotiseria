/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotiseria.Interfaz;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jButton8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductosDePedido = new javax.swing.JList<>();
        btnEliminarItem = new javax.swing.JButton();
        btnGrabarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setLayout(new java.awt.GridLayout(3, 0));

        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        elegirCliente.setBackground(new java.awt.Color(225, 235, 244));
        elegirCliente.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        elegirCliente.setForeground(new java.awt.Color(0, 0, 0));
        elegirCliente.setText("Elegir Cliente");
        elegirCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        elegirCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        elegirCliente.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        elegirCliente.setOpaque(true);
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
        rbtnAlfabetico.setText("Categorías por orden Alfabético");
        rbtnAlfabetico.setActionCommand("");
        rbtnAlfabetico.setBorderPainted(true);
        rbtnAlfabetico.setFocusCycleRoot(true);
        rbtnAlfabetico.setOpaque(false);
        rbtnAlfabetico.setPreferredSize(new java.awt.Dimension(174, 19));
        jPanel2.add(rbtnAlfabetico);

        rbtnPrioridad.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rbtnPrioridad);
        rbtnPrioridad.setFont(new java.awt.Font("Segoe UI Variable", 0, 10)); // NOI18N
        rbtnPrioridad.setForeground(new java.awt.Color(0, 0, 0));
        rbtnPrioridad.setText("Categorías por orden Prioridad");
        rbtnPrioridad.setActionCommand("");
        rbtnPrioridad.setBorderPainted(true);
        rbtnPrioridad.setFocusCycleRoot(true);
        rbtnPrioridad.setOpaque(false);
        rbtnPrioridad.setPreferredSize(new java.awt.Dimension(171, 19));
        rbtnPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPrioridadActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnPrioridad);

        jPanel1.add(jPanel2);

        jPanel5.setLayout(new java.awt.GridLayout());

        btnClientes.setBackground(new java.awt.Color(225, 235, 244));
        btnClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(btnClientes);

        btnCategorias.setBackground(new java.awt.Color(225, 235, 244));
        btnCategorias.setForeground(new java.awt.Color(0, 0, 0));
        btnCategorias.setText("Categorías");
        btnCategorias.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(btnCategorias);

        btnProductos.setBackground(new java.awt.Color(225, 235, 244));
        btnProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnProductos.setText("Productos");
        btnProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(btnProductos);

        btnVerPedidos.setBackground(new java.awt.Color(225, 235, 244));
        btnVerPedidos.setForeground(new java.awt.Color(0, 0, 0));
        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(btnVerPedidos);

        jPanel1.add(jPanel5);

        jPanel3.setLayout(new java.awt.GridLayout());

        cmbCategoria.setBackground(new java.awt.Color(204, 204, 204));
        cmbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cmbCategoria.setToolTipText("");
        cmbCategoria.setAutoscrolls(true);
        cmbCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(88, 142, 210)));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCategoria);

        jPanel1.add(jPanel3);

        jPanel6.setLayout(new java.awt.GridLayout(2, 0));

        btnReiniciarPedido.setBackground(new java.awt.Color(225, 235, 244));
        btnReiniciarPedido.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        btnReiniciarPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnReiniciarPedido.setText("Reiniciar Pedido");
        btnReiniciarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(btnReiniciarPedido);

        lblCostoTotal.setBackground(new java.awt.Color(204, 255, 204));
        lblCostoTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblCostoTotal.setOpaque(true);
        jPanel6.add(lblCostoTotal);

        jPanel1.add(jPanel6);

        pnlProductos.setBackground(new java.awt.Color(204, 255, 204));
        pnlProductos.setForeground(new java.awt.Color(0, 0, 0));
        pnlProductos.setLayout(new java.awt.GridLayout(3, 0));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Empanada");
        jButton8.setToolTipText("");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlProductos.add(jButton8);

        jPanel1.add(pnlProductos);

        jPanel7.setLayout(new java.awt.GridLayout());

        lstProductosDePedido.setBackground(new java.awt.Color(255, 255, 255));
        lstProductosDePedido.setFont(new java.awt.Font("Segoe UI Variable", 0, 10)); // NOI18N
        lstProductosDePedido.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(lstProductosDePedido);

        jPanel7.add(jScrollPane1);

        btnEliminarItem.setBackground(new java.awt.Color(225, 235, 244));
        btnEliminarItem.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        btnEliminarItem.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarItem.setText("Eliminar Item");
        btnEliminarItem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(btnEliminarItem);

        btnGrabarPedido.setBackground(new java.awt.Color(225, 235, 244));
        btnGrabarPedido.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        btnGrabarPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnGrabarPedido.setText("Grabar Pedido");
        btnGrabarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(btnGrabarPedido);

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1);

        setBounds(0, 0, 919, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void tfdObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdObservacionesActionPerformed

    private void rbtnPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnPrioridadActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

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
    private javax.swing.JButton jButton8;
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
    private javax.swing.JList<String> lstProductosDePedido;
    private javax.swing.JPanel pnlProductos;
    private javax.swing.JRadioButton rbtnAlfabetico;
    private javax.swing.JRadioButton rbtnPrioridad;
    private javax.swing.JTextField tfdObservaciones;
    // End of variables declaration//GEN-END:variables
}
