
package builshop;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class Utiles {
    public static void main(String[] args) {
        
    }
    public static boolean validadorString(String cadena){
        boolean v=cadena.matches("[a-zA-Z]+");
        return v;
    }
    
    public static boolean validadorIntPos(String cadena){
        boolean v= cadena.matches("[0-9]+");
        return v;
    }
    
    public static boolean validarRut(String cadena){
        cadena = cadena.toUpperCase();
        if (validarFormatoRut(cadena)){
            String n = cadena.substring(0, cadena.length()-2);
            String d = cadena.substring(cadena.length()-1);
            n = n.replaceAll("\\.","");
            int v = digitoVerificador(n);
            if (v < 10 && d.equals(String.valueOf(v))){ return true;
            } else if (v == 10 && d.equals("K")) return true;
        }
        return false;
    }
    
    private static boolean validarFormatoRut(String r)
    {   return r.matches("[0-9]{1,2}\\.[0-9]{3,3}\\.[0-9]{3,3}\\-[0-9K]{1,1}");}
    
    private static int digitoVerificador(String r)
    {
        int v = 0;int c = 1;int s = 0;
        int d[] = new int[r.length()];
        for (int i = r.length()-1; i >= 0; i--){
            d[i] = Integer.valueOf(r.substring(i, i+1));
            c ++;
            if (c > 7) c = 2;
            s += (d[i]*c);
        }
        v = 11-(s%11);
        if (v == 11) v = 0;
        return v;
    }
    
    public static boolean validadorCorreo(String cadena){
        boolean v=false;
        return v;
    }
    
    
    public static void mostrarPP(int op){
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "ingrese solamente letras");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "ingrese solamente numeros");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "ingrese puntos y guion");
                break;
            case 4:
                
                break;
            default:
                throw new AssertionError();
        }
    }
}
