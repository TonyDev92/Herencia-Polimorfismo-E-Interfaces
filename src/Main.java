public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.edad = 32;
        cliente.nombre = "Jim";
        cliente.teléfono = 923845234;
        cliente.crédito = true;
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.teléfono);
        System.out.println(cliente.crédito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 45;
        trabajador.nombre = "Marcus";
        trabajador.teléfono = 231543325;
        trabajador.salario = 1945;
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.salario);
        System.out.println(trabajador.teléfono);
    }
}

class Persona {
    int edad;
    String nombre;
    int teléfono;


}

class Cliente extends Persona {
    boolean crédito;

}

class Trabajador extends Persona {
    int salario;
}