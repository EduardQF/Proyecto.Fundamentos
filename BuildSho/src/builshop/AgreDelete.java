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
        DataManager.newUser(rut, clave, acces, firstname, lastname, email);
        DataManager.writeUsers();
        System.out.println("agregado completo");
    }
    
    public static void deleteUser(){
    
    }
    
    static void newProduct(String producto, String id, String cantidad, String codigo, String precioVenta, String costo, String unit, String descripcion) {
        int cost=Integer.parseInt(costo);
        int price=Integer.parseInt(precioVenta);
        int stoc=Integer.parseInt(cantidad);
        DataManager.newProduct(id, codigo, producto, cost, price, stoc, unit);
        DataManager.writeProducts();
        System.out.println("agregado completo");
    }
    
    public static void deleteProduct(){
    
    }

    

    
}
