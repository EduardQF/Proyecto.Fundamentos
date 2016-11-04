
package builshop;

import java.awt.Image;
import java.awt.Toolkit;


public class UsersRegister extends javax.swing.JFrame {

 
    public UsersRegister() {
        initComponents();
        read();
    }

   @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("C:/BuildShop/IMG/Logo64x64.png");
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        most = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        most.setColumns(20);
        most.setRows(5);
        jScrollPane1.setViewportView(most);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void read() {
                String users[]=DataReader.readData("C:/BuildShop/DB/users.buildshop");
                String userList="";
                userList=("Usuario\tClave\tPermiso \tNombre\tApellido\tCorreo\n");
                for (int i = 0; i < users.length; i+=6) {
                    userList=userList+users[i]+"\t"+users[i+1]+"\t"+users[i+2]+"\t"+users[i+3]+"\t"+users[i+4]+"\t"+users[i+5]+"\n";
                    
                    
                }
                most.setText(userList);
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea most;
    // End of variables declaration//GEN-END:variables
}
