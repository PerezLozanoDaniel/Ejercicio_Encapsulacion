public class Empleado {

        private int ID;
        private String nombre;
        private String seguridadSocial;
        private double salario;

    public Empleado(int ID, String nombre, String seguridadSocial, double salario) {
        this.ID = ID;
        this.cambiaNombre(nombre);
        this.seguridadSocial = seguridadSocial;
        this.subeSalario(salario);
    }
    public Empleado(int ID, String nombre, String seguridadSocial) {
        this(ID,nombre,seguridadSocial,1500);
    }

    public Empleado(int ID, String nombre) {
        this(ID,nombre,"XXXXXXXXX",1200);
    }

    public String toString() {
        return "\nEmpleado{" +
                "ID=" + getID() +
                ", nombre='" + getNombre() + '\'' +
                ", seguridadSocial='" + getSeguridadSocial() + '\'' +
                ", salario=" + getSalario() +
                '}';
    }

    public Empleado(int ID) {
        this(ID,"desconocido","YYYYYYYYYYY",1000);
    }

    public Empleado() {
        this(9999,"desconocido","ZZZZZZZZZZZ",800);
    }

    public void cambiaNombre(String nuevoNombre){
            if(nuevoNombre!=""){
                this.nombre=nuevoNombre;
            }
        }
    public void subeSalario(double subida){
        if(subida>0) {
            this.salario += subida;
        }
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSeguridadSocial() {
        return seguridadSocial;
    }

    public double getSalario() {
        return salario;
    }
}
