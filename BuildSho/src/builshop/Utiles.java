package builshop;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduard QF
 */
public class Utiles {

    public static boolean validarClave(String cadena) {
        boolean v = cadena.matches("[a-zA-Z0-9]+");
        return v;
    }

    public static boolean validadorString(String cadena) {
        boolean v = cadena.matches("[a-zA-Z]+");
        return v;
    }

    public static boolean validadorIntPos(String cadena) {
        boolean v = cadena.matches("[0-9]+");
        return v;
    }

    public static boolean validarRut(String cadena) {
        cadena = cadena.toUpperCase();
        if (validarFormatoRut(cadena)) {
            String n = cadena.substring(0, cadena.length() - 2);
            String d = cadena.substring(cadena.length() - 1);
            n = n.replaceAll("\\.", "");
            int v = digitoVerificador(n);
            if (v < 10 && d.equals(String.valueOf(v))) {
                return true;
            } else if (v == 10 && d.equals("K")) {
                return true;
            }
        }
        return false;
    }

    private static boolean validarFormatoRut(String r) {
        return r.matches("[0-9]{1,2}\\.[0-9]{3,3}\\.[0-9]{3,3}\\-[0-9K]{1,1}");
    }

    private static int digitoVerificador(String r) {
        int v = 0;
        int c = 1;
        int s = 0;
        int d[] = new int[r.length()];
        for (int i = r.length() - 1; i >= 0; i--) {
            d[i] = Integer.valueOf(r.substring(i, i + 1));
            c++;
            if (c > 7) {
                c = 2;
            }
            s += (d[i] * c);
        }
        v = 11 - (s % 11);
        if (v == 11) {
            v = 0;
        }
        return v;
    }
    private static boolean validarFormatoCorreo(String r){
         return r.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    public static boolean validadorCorreo(String cadena) {
        boolean v = true;
        return v;
    }

    public static boolean validarIntNegativos(String cadena) {
        boolean validador;
        int num = 0;

        validador = true;

        if (cadena.matches("\\-[0-9]+")) {
            num = Integer.valueOf(cadena);
            if (num <= 0) {
                validador = true;
            }
        }

        return validador;
    }

    public static boolean validarFloatPositivos(String cadena) {
        boolean validador;
        double num = 0;

        validador = true;

        if (cadena.matches("[0-9]+")) {
            num = Double.valueOf(cadena);
            if (num >= 0) {
                validador = true;
            }
        } else if (cadena.matches("[0-9]+\\.[0-9]+")) {
            num = Double.valueOf(cadena);
            if (num >= 0) {
                validador = true;
            }
        }
        return validador;
    }

    public static boolean validarFloatNegativos(String cadena) {
        boolean validador;
        double num = 0;

        validador = true;

        if (cadena.matches("\\-[0-9]+")) {
            num = Double.valueOf(cadena);
            if (num >= 0) {
                validador = true;
            }
        } else if (cadena.matches("\\-[0-9]+\\.[0-9]+")) {
            num = Double.valueOf(cadena);
            if (num >= 0) {
                validador = true;
            }
        }
        return validador;
    }

}
