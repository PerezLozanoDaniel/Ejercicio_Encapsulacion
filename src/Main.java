// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Empleado Pepe =new Empleado(23,"Pepe");

        Empleado unoCualquiera=new Empleado();
        Empleado otroCualquiera=new Empleado(10);

        Empleado Manolo=new Manager(14,"Manolo","289867989");

        Empleado Paco=new Director(47,"Paco","1797678687",2500);

        System.out.println(Pepe);
        System.out.println(unoCualquiera);
        System.out.println(otroCualquiera);
        System.out.println(Manolo);
        System.out.println(Paco);


        }
}
