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
            readUsers(1);
        } else {
            mesangeError();            
        }
    }//listo
    
    public static void registerUsers() {
        if (DataManager.getAccess(0)) {
            readUsers(0);
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
            NewProduct np=new NewProduct();
            np.setVisible(true);
        } else {
            mesangeError();            
        }
        
    }//listo
    
    public static void removeProduct() {
        if (DataManager.getAccess(0)) {
            ProductDelete pd=new ProductDelete();
            pd.setVisible(true);
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
    
      private static String[] titulo(int i) {
        switch (i) {
            case 0:
                String tituloa[] = {"Id","Code","Nombre","Costo","Precio","Stock","Unit"};
                return tituloa;
            case 1:
                String titulob[] = {"Id","Code","Nombre","Stock"};
                return titulob;
            default:
                String titul[]={"Usuario","Contraseña","Permiso","Nombre","Apellido","correo"};
                return titul;
        }
    }
    
    // ProductRegister
    private static String[][] productStock(String[] product){
        int tam=product.length/7,j=0;
        String productList [][]=new String [tam][4];
        //productList = {"Id","Code","Nombre","Stock"};
        System.out.println("started read");
        for (int i = 0; i < product.length; i += 7) {
            System.out.println("\tread:"+j);
            productList[j][0]=product[i];
            productList[j][1]=product[i+1];
            productList[j][2]=product[i+2];
            //productList[j][3]=product[i+3];
            //productList[j][4]=product[i+4];
            productList[j][3]=product[i+5];
            //productList[j][6]=product[i+6];
            j++;
        }
        return productList;
    }
    
    private static String[][] productRegister(String[] product){
        int tam=product.length/7,j=0;
        String productList[][]= new String[tam][7];
        //productList = {"Id","Code","Nombre","Costo","Precio","Stock","Unit"};
        System.out.println("read started");
        for (int i = 0; i < product.length; i += 7) {
            System.out.println("read:"+j);
            productList[j][0]=product[i];
            productList[j][1]=product[i+1];
            productList[j][2]=product[i+2];
            productList[j][3]=product[i+3];
            productList[j][4]=product[i+4];
            productList[j][5]=product[i+5];
            productList[j][6]=product[i+6];
            j++;
        }
        return productList;
    }
    
    private static void readProduct(int op){
        String product[] = DataReader.readData("C:/BuildShop/DB/products.buildshop");
        String productList[][],title[];
        if(op==1){
            title=titulo(0);
            productList= productRegister(product);
        }else{
            title=titulo(1);
            productList= productStock(product);
        }
        Register pv=new Register(title,productList);
        pv.setVisible(true);
    }
    
  
    //userRegister
   
    private static String[][] userRegist(String[] users){
        int i=0;
        int tm=users.length/6;
        String userList[][]=new String[tm][6];
        System.out.println("started read");
        for (int j = 0; j < users.length; j += 6) {
            System.out.println("read:"+i);
            userList[i][0] = users[j];
            userList[i][1] = ("******");
            userList[i][2] = users[j + 2];
            userList[i][3] = users[j + 3];
            userList[i][4] = users[j + 4];
            userList[i][5] = users[j + 5];
            i++;
        }
        return userList;
    }
    
    private static String[][] userActiv(String[] users){
        System.out.println("created");
        String o[][]={{""},{""}};
        return o;
    }
    
    private static void readUsers(int op){
        String users[] = DataReader.readData("C:/BuildShop/DB/users.buildshop");
        String usersList[][],title[];
        if(op==0){
            title=titulo(2);
            usersList=userRegist(users);
        }else{
            title=titulo(2);
            usersList=userActiv(users);
        }
        Register pv=new Register(title,usersList);
        pv.setVisible(true);
        
        
    }
}
