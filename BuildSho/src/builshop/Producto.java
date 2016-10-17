package builshop;

public class Producto {

    private int cantidad;
    private String nombre;
    private String marca;
    private String codigo;
    private String tipo;
    private String fVencimiento;
    private String fElavoracion;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(String fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public String getfElavoracion() {
        return fElavoracion;
    }

    public void setfElavoracion(String fElavoracion) {
        this.fElavoracion = fElavoracion;
    }

    public Producto(int cantidad, String nombre, String marca, String codigo, String tipo, String fVencimiento, String fElavoracion) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.marca = marca;
        this.codigo = codigo;
        this.tipo = tipo;
        this.fVencimiento = fVencimiento;
        this.fElavoracion = fElavoracion;

    }

}
