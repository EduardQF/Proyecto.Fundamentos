package builshop;

import javax.swing.JOptionPane;

public abstract class AdminBSP {

    //personal 
    public static void addWorker() {
        if (DataManager.getAccess(0)) {
            AgreVendedor vend = new AgreVendedor();
            vend.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void removeWorker() {
        if (DataManager.getAccess(0)) {
            EliminarVend elim = new EliminarVend();
            elim.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void usersActived() {
        if (DataManager.getAccess(0)) {
               
        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void registerUsers() {
        if (DataManager.getAccess(0)) {

        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    //ventas
    public static void registroVentasM() {
        if (DataManager.getAccess(0)) {

        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void registroVentasA() {
        if (DataManager.getAccess(1)) {

        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    //productos
    public static void registroProduct() {
        if (DataManager.getAccess(1)) {

        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void stock() {
        if (DataManager.getAccess(1)) {

        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void addProduct() {
        if (DataManager.getAccess(0)) {

        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void removeProduct() {
        if (DataManager.getAccess(0)) {

        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void requeredProduct() {
        if (DataManager.getAccess(1)) {

        } else {
            JOptionPane.showMessageDialog(null, "no tiene acceso permitido", "PERMISO INVALIDO", JOptionPane.WARNING_MESSAGE);
        }
    }

    //Estadisticas
    public static void generateGraficM(){
    
    }
    
    public static void generateGraficA(){
    
    }
}
