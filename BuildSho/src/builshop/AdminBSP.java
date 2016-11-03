package builshop;

import javax.swing.JOptionPane;

public abstract class AdminBSP {

    //personal 
    public static void addWorker() {
        if (DataManager.getAccess(0)) {
            AgreVendedor vend = new AgreVendedor();
            vend.setVisible(true);
        } else {
            mesangeError();            
        }
    }//listo
    
    public static void removeWorker() {
        if (DataManager.getAccess(0)) {
            EliminarVend elim = new EliminarVend();
            elim.setVisible(true);
        } else {
            mesangeError();            
        }
    }//listo
    
    public static void usersActived() {
        if (DataManager.getAccess(0)) {
            UsersActived us = new UsersActived();
            us.setVisible(true);
        } else {
            mesangeError();            
        }
    }//listo
    
    public static void registerUsers() {
        if (DataManager.getAccess(0)) {
            UsersRegister ur = new UsersRegister();
            ur.setVisible(true);
        } else {
            mesangeError();            
        }
    }//listo

    //ventas
    public static void registroVentasM() {
        if (DataManager.getAccess(0)) {
            
        } else {
            mesangeError();            
        }
    }
    
    public static void registroVentasA() {
        if (DataManager.getAccess(1)) {
            
        } else {
            mesangeError();            
        }
    }

    //productos
    public static void registroProduct() {
        if (DataManager.getAccess(1)) {
            
        } else {
            mesangeError();            
        }
    }
    
    public static void stock() {
        if (DataManager.getAccess(1)) {
            
        } else {
            mesangeError();            
        }
    }
    
    public static void addProduct() {
        if (DataManager.getAccess(0)) {
            newProduct np=new newProduct();
            np.setVisible(true);
        } else {
            mesangeError();            
        }
        
    }//listo
    
    public static void removeProduct() {
        if (DataManager.getAccess(0)) {
            
        } else {
            mesangeError();            
        }
    }
    
    public static void requeredProduct() {
        if (DataManager.getAccess(1)) {
            
        } else {
            mesangeError();            
        }
    }

    //Estadisticas
    public static void generateGraficM() {
        if (DataManager.getAccess(0)) {
            
        } else {
            mesangeError();            
        }
    }
    
    public static void generateGraficA() {
        if (DataManager.getAccess(0)) {
            
        } else {
            mesangeError();            
        }
    }

    //other
    private static void mesangeError() {
        MesangeError me = new MesangeError();
        me.setVisible(true);
    }
}
