import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = sc.nextLine();

        Listaempleados ac = new Listaempleados("C:\\Users\\jorge\\OneDrive\\Escritorio\\listaempleados.txt");
        GestorDeHoras gh = new GestorDeHoras("C:\\Users\\jorge\\OneDrive\\Escritorio\\horas.txt");

        System.out.println("¡Hola, " + nombreUsuario + "! Bienvenido al sistema de gestión de empleados.");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Registrar horas trabajadas");
            System.out.println("4. Listar horas trabajadas");
            System.out.println("5. Administrar mesas");
            System.out.println("6. Salir");

            while (!sc.hasNextInt()) {
                System.out.println("Por favor ingrese una opción válida.");
                sc.next(); // consume the invalid input
            }
            int opcion = sc.nextInt();
            sc.nextLine();  // consume the remaining newline

            switch (opcion) {
                case 1:
                    ac.agregar();
                    break;
                case 2:
                    ac.listar();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = sc.nextLine();
                    System.out.print("Ingrese las horas trabajadas: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Por favor ingrese un número válido.");
                        sc.next(); // consume the invalid input
                    }
                    int horasTrabajadas = sc.nextInt();
                    sc.nextLine();  // consume the remaining newline
                    gh.registrarHoras(nombreEmpleado, horasTrabajadas);
                    break;
                case 4:
                    gh.listarHoras();
                    break;
                case 5:

                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        sc.close();
    }
}
