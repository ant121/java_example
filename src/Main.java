import company.*;

import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Empleado
        Empleado empleado = new Empleado();
        // Crear objeto de la clase Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
        // Leer los datos del empleado
        System.out.println("Ingrese el nombre : ");
        empleado.setNombre(scanner.nextLine());
        System.out.println("Ingrese la cedula : ");
        empleado.setCedula(scanner.nextLine());
        System.out.println("Ingrese la edad : ");
        empleado.setEdad(Integer.parseInt(scanner.nextLine()));
        System.out.println("Ingrese el salario : ");
        empleado.setSalario(Double.parseDouble(scanner.nextLine()));
        System.out.println("Ingrese el estado civil : ");
        empleado.setCasado(Objects.equals(scanner.nextLine(), "casado"));
        // Aumentar el salario del empleado en un 10%
        empleado.aumentarSalario(10);

        // Crear un objeto Programador
        Programador programador = new Programador("Pedro Alvarado", "1725412", 18, false, 1000.0, 100, "Java");

        // Imprimir los datos del empleado
        System.out.println("\nDatos del empleado\n" + empleado);
        System.out.println("Nivel " + empleado.obtenerNivel());

        // Imprimir los datos del programador
        System.out.println("Datos del programador\n"+ programador);
        System.out.println("Nivel " + programador.obtenerNivel());
    }
}