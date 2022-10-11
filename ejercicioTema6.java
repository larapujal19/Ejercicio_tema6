public class ejercicioTema6 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 34;
        cliente.nombre = "Ana";
        cliente.telefono = 543223444;
        cliente.credito = 500;
        System.out.println("Edad: "+ cliente.edad); 
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Teléfono: " + cliente.telefono);
        System.out.println("Crédito: $" + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 45;
        trabajador.nombre = "Carlos";
        trabajador.telefono = 543225567;
        trabajador.salario = 2000;
        System.out.println("Edad: "+ trabajador.edad);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Teléfono: " + trabajador.telefono);
        System.out.println("Crédito: $" + trabajador.salario);
}



}

class Persona {
	int edad;
	String nombre;
	int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}