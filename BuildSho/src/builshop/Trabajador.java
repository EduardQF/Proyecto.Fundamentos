
package builshop;

/**
 * @author Eduard QF
 */
public class Trabajador {
    private String rut;
    private String firstname;
    private String lastname;
    private int age;
    private String clave;
    private int saled;
    
    public void Trabajador(String run,String nombre,String apellido,int edad,String cla){
        this.rut=run;
        this.firstname=nombre;
        this.lastname=apellido;
        this.age=edad;
        this.clave=cla;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public String getClave() {
        return clave;
    }

    public String getLastname() {
        return lastname;
    }

    public String getRut() {
        return rut;
    }

    public int getSaled() {
        return saled;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setSaled(int saled) {
        this.saled = saled;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
            
}
