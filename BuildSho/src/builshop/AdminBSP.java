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
            readProduct(1);
        } else {
            mesangeError();            
        }
    }//listo
    
    public static void stock() {
        if (DataManager.getAccess(1)) {
            readProduct(2);
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
    
    // ProductRegister
    private static String productStock(String[] product){
        
        String productList = "";
        productList = ("Id\tCode\tNombre\t\tStock\n");
        for (int i = 0; i < product.length; i += 7) {
            productList = productList + product[i] + "\t" + product[i + 1] + "\t" + product[i + 2] + "\t\t" + product[i + 5]+"\n";

        }
        return productList;
    }
    
    private static String productRegister(String[] product){
        String productList="";
        productList = ("Id\tCode\tNombre\t\tCosto\tPrecio\tStock\tUnit\n");
        for (int i = 0; i < product.length; i += 7) {
            productList = productList + product[i] + "\t" + product[i + 1] + "\t" + product[i + 2] + "\t\t" + product[i + 3] + "\t" + product[i + 4] + "\t" + product[i + 5]+"\t" + product[i + 6]  +"\n";

        }
        return productList;
    }
    
    private static void readProduct(int op){
        String product[] = DataReader.readData("C:/BuildShop/DB/product.buildshop");
        String productList = "";
        if(op==1){
            productList= productRegister(product);
        }else{
            productList= productStock(product);
        }
        ProductRegister pv=new ProductRegister(productList);
        pv.setVisible(true);
        
    }
}
