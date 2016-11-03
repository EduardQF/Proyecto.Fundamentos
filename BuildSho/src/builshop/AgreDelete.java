
package builshop;


public abstract class AgreDelete {
    
    
    static void newUser(String firstname, String lastname, String rut, String clave, String email, String acces) {
        if(acces=="Administrador"){
            acces="Admin";
        }else if(acces=="Inventario"){
            acces="inventory";
        }else{
            acces="seller";
        }
    }
    
    public static void deleteUser(){
    
    }
    
    public static void newProduct(){
    
    }
    
    public static void deleteProduct(){
    
    }

    
}
