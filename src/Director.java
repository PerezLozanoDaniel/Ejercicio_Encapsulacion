public class Director extends Manager {
    private int ID;
    private String nombre;
    private String seguridadSocial;
    private double salario;
    private String departamento = "Dirección";

    public Director(int ID, String nombre, String seguridadSocial, double salario) {
        super(ID, nombre, seguridadSocial, salario);
    }

    public Director(int ID, String nombre, String seguridadSocial) {
        super(ID, nombre, seguridadSocial);
    }

    public Director(int ID, String nombre) {
        super(ID, nombre);
    }

    public Director(int ID) {
        super(ID);
    }

    public Director() {
    }


    @Override
    public String toString() {
        return "\nDirector{" +
                "ID=" + super.getID() +
                ", nombre='" + super.getNombre() + '\'' +
                ", seguridadSocial='" + super.getSeguridadSocial() + '\'' +
                ", salario=" + super.getSalario() +
                ", departamento='" + this.departamento + '\'' +
                '}';
    }
}





