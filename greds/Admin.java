
package proyectemp;

public class Admin extends javax.swing.JFrame {
/*
 ahutor Carrion Cristo, Darigo Giaccomo, Queupumil Eduardo.    
*/
    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eliminarVendedor = new javax.swing.JButton();
        AgregarVendedor = new javax.swing.JButton();
        registrosVenta = new javax.swing.JButton();
        Stock = new javax.swing.JButton();
        Pedido = new javax.swing.JButton();
        Pventa = new javax.swing.JButton();
        planilla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eliminarVendedor.setText("Eliminar vendedor");
        eliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarVendedorActionPerformed(evt);
            }
        });

        AgregarVendedor.setText("Agregar vendedor");
        AgregarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVendedorActionPerformed(evt);
            }
        });

        registrosVenta.setText("Registros de Venta");

        Stock.setText("Stock de productos");

        Pedido.setText("Requerir Pedidos");

        Pventa.setText("productos en venta");

        planilla.setText("planilla ventas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrosVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Pventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(planilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgregarVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrosVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pventa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(planilla)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVendedorActionPerformed
        agreVendedor agreVendedor=new agreVendedor();
        agreVendedor.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_AgregarVendedorActionPerformed

    private void eliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarVendedorActionPerformed
        eliminarVend eliminarVend= new eliminarVend();
        eliminarVend.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_eliminarVendedorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVendedor;
    private javax.swing.JButton Pedido;
    private javax.swing.JButton Pventa;
    private javax.swing.JButton Stock;
    private javax.swing.JButton eliminarVendedor;
    private javax.swing.JButton planilla;
    private javax.swing.JButton registrosVenta;
    // End of variables declaration//GEN-END:variables
}
