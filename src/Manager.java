public class Manager extends Empleado {
    private int ID;
    private String nombre;
    private String seguridadSocial;
    private double salario;
    private String departamento="Managers";

    public Manager(int ID, String nombre, String seguridadSocial, double salario) {
        super(ID, nombre, seguridadSocial, salario);
        //this.departamento="Managers";
    }

    public Manager(int ID, String nombre, String seguridadSocial) {
        super(ID, nombre, seguridadSocial);
    }

    public Manager(int ID, String nombre) {
        super(ID, nombre);
    }

    public Manager(int ID) {
        super(ID);
    }

    public Manager() {
    }


    public String toString() {
        return "\nManager{" +
                "ID=" + getID() +
                ", nombre='" + getNombre() + '\'' +
                ", seguridadSocial='" + getSeguridadSocial() + '\'' +
                ", salario=" + getSalario() +
                ", departamento='" + getDepartamento() + '\'' +
                '}';
    }

    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getSeguridadSocial() {
        return super.getSeguridadSocial();
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    public String getDepartamento() {
        return this.departamento;
    }
}


