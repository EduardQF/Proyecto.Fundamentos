
package builshop;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Eduard QF
 */
public class BuildShopP extends javax.swing.JFrame {

    public BuildShopP() {
        initComponents();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("C:/BuildShop/IMG/Logo64x64.png");
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jProductos = new javax.swing.JPanel();
        jVenta = new javax.swing.JPanel();
        deletePventa = new javax.swing.JButton();
        addOne = new javax.swing.JButton();
        deleteOne = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registroMensual = new javax.swing.JMenuItem();
        fullVentas = new javax.swing.JMenuItem();
        planillaVentas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        detallesP = new javax.swing.JMenuItem();
        stock = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        AgregarProductos = new javax.swing.JMenuItem();
        QuitarProductos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        usersActived = new javax.swing.JMenuItem();
        registerUsers = new javax.swing.JMenuItem();
        modificarWorker = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        addWorker = new javax.swing.JMenuItem();
        deleteWorker = new javax.swing.JMenuItem();
        estadisticas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        ventasMens = new javax.swing.JMenuItem();
        ventasAnu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BuildShop");
        setAlwaysOnTop(true);
        setFocusTraversalPolicyProvider(true);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jProductos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jProductosLayout = new javax.swing.GroupLayout(jProductos);
        jProductos.setLayout(jProductosLayout);
        jProductosLayout.setHorizontalGroup(
            jProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        jProductosLayout.setVerticalGroup(
            jProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 494;
        gridBagConstraints.ipady = 487;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jProductos, gridBagConstraints);

        jVenta.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jVentaLayout = new javax.swing.GroupLayout(jVenta);
        jVenta.setLayout(jVentaLayout);
        jVentaLayout.setHorizontalGroup(
            jVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jVentaLayout.setVerticalGroup(
            jVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 521;
        gridBagConstraints.ipady = 366;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        getContentPane().add(jVenta, gridBagConstraints);

        deletePventa.setText("Eliminar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 48, 0, 0);
        getContentPane().add(deletePventa, gridBagConstraints);

        addOne.setText("Agregar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(addOne, gridBagConstraints);

        deleteOne.setText("Quitar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(deleteOne, gridBagConstraints);

        jMenu1.setText("Venta");

        registroMensual.setText("Registro Ventas mensuales");
        registroMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroMensualActionPerformed(evt);
            }
        });
        jMenu1.add(registroMensual);

        fullVentas.setText("ventas Totales");
        fullVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullVentasActionPerformed(evt);
            }
        });
        jMenu1.add(fullVentas);

        planillaVentas.setText("Planillas de venta");
        jMenu1.add(planillaVentas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inventario");

        detallesP.setText("Detralles de los Productos");
        detallesP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesPActionPerformed(evt);
            }
        });
        jMenu2.add(detallesP);

        stock.setText("Stock de productos");
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        jMenu2.add(stock);

        jMenu7.setText("Agregar/Quitar");

        AgregarProductos.setText("Agregar productos");
        AgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductosActionPerformed(evt);
            }
        });
        jMenu7.add(AgregarProductos);

        QuitarProductos.setText("Quitar productos");
        QuitarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarProductosActionPerformed(evt);
            }
        });
        jMenu7.add(QuitarProductos);

        jMenu2.add(jMenu7);

        jMenuItem1.setText("requerir Pedido");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Personal");

        usersActived.setText("Usuarios activos");
        usersActived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActivedActionPerformed(evt);
            }
        });
        jMenu3.add(usersActived);

        registerUsers.setText("Usuarios registrados");
        registerUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUsersActionPerformed(evt);
            }
        });
        jMenu3.add(registerUsers);

        modificarWorker.setText("Modificar personal");
        jMenu3.add(modificarWorker);

        jMenu5.setText("Agregar/Eliminar");

        addWorker.setText("Agregar trabajador");
        addWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWorkerActionPerformed(evt);
            }
        });
        jMenu5.add(addWorker);

        deleteWorker.setText("Eliminar Vendedor");
        deleteWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteWorkerActionPerformed(evt);
            }
        });
        jMenu5.add(deleteWorker);

        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        estadisticas.setText("Estadisticas");

        jMenuItem2.setText("Generar datos de venta en una planilla exe");
        estadisticas.add(jMenuItem2);

        jMenu4.setText("Generar Graficos ");

        ventasMens.setText("Ventas Mensuales");
        ventasMens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasMensActionPerformed(evt);
            }
        });
        jMenu4.add(ventasMens);

        ventasAnu.setText("Ventas Anuales");
        ventasAnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasAnuActionPerformed(evt);
            }
        });
        jMenu4.add(ventasAnu);

        estadisticas.add(jMenu4);

        jMenuBar1.add(estadisticas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteWorkerActionPerformed
        AdminBSP.removeWorker();
    }//GEN-LAST:event_deleteWorkerActionPerformed

    private void addWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWorkerActionPerformed
        AdminBSP.addWorker();
        
    }//GEN-LAST:event_addWorkerActionPerformed

    private void registerUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUsersActionPerformed
        AdminBSP.registerUsers();
    }//GEN-LAST:event_registerUsersActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        AdminBSP.stock();
    }//GEN-LAST:event_stockActionPerformed

    private void detallesPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesPActionPerformed
        AdminBSP.registroProduct();
    }//GEN-LAST:event_detallesPActionPerformed

    private void usersActivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActivedActionPerformed
        AdminBSP.usersActived();
    }//GEN-LAST:event_usersActivedActionPerformed

    private void registroMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroMensualActionPerformed
        AdminBSP.registroVentasM();
    }//GEN-LAST:event_registroMensualActionPerformed

    private void fullVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullVentasActionPerformed
        AdminBSP.registroVentasA();
    }//GEN-LAST:event_fullVentasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AdminBSP.requeredProduct();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductosActionPerformed
        AdminBSP.addProduct();
    }//GEN-LAST:event_AgregarProductosActionPerformed

    private void QuitarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarProductosActionPerformed
        AdminBSP.removeProduct();
    }//GEN-LAST:event_QuitarProductosActionPerformed

    private void ventasMensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasMensActionPerformed
        AdminBSP.generateGraficM();
    }//GEN-LAST:event_ventasMensActionPerformed

    private void ventasAnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasAnuActionPerformed
        AdminBSP.generateGraficA();
    }//GEN-LAST:event_ventasAnuActionPerformed

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
            java.util.logging.Logger.getLogger(BuildShopP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildShopP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildShopP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildShopP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildShopP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarProductos;
    private javax.swing.JMenuItem QuitarProductos;
    private javax.swing.JButton addOne;
    private javax.swing.JMenuItem addWorker;
    private javax.swing.JButton deleteOne;
    private javax.swing.JButton deletePventa;
    private javax.swing.JMenuItem deleteWorker;
    private javax.swing.JMenuItem detallesP;
    private javax.swing.JMenu estadisticas;
    private javax.swing.JMenuItem fullVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPanel jProductos;
    private javax.swing.JPanel jVenta;
    private javax.swing.JMenuItem modificarWorker;
    private javax.swing.JMenuItem planillaVentas;
    private javax.swing.JMenuItem registerUsers;
    private javax.swing.JMenuItem registroMensual;
    private javax.swing.JMenuItem stock;
    private javax.swing.JMenuItem usersActived;
    private javax.swing.JMenuItem ventasAnu;
    private javax.swing.JMenuItem ventasMens;
    // End of variables declaration//GEN-END:variables
}
