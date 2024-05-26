import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = sc.nextLine();

        Listaempleados ac = new Listaempleados("C:\\Users\\jorge\\OneDrive\\Escritorio\\listaempleados.txt");
        GestorDeHoras gh = new GestorDeHoras("C:\\Users\\jorge\\OneDrive\\Escritorio\\horas.txt");

        try {
            if (ac.buscarNombre(nombreUsuario)) {
                System.out.println("¡Hola, " + nombreUsuario + "! Bienvenido al sistema de gestión de empleados.");

                boolean continuar = true;
                while (continuar) {
                    System.out.println("\nSeleccione una opción:");
                    System.out.println("1. Agregar empleado");
                    System.out.println("2. Listar empleados");
                    System.out.println("3. Registrar horas trabajadas");
                    System.out.println("4. Listar horas trabajadas");
                    System.out.println("5. Salir");
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
                            int horasTrabajadas = sc.nextInt();
                            gh.registrarHoras(nombreEmpleado, horasTrabajadas);
                            gh.vacaciones();
                            break;
                        case 4:
                            gh.listarHoras();
                            break;
                        case 5:
                            continuar = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                            break;
                    }
                }
            } else {
                System.out.println("Lo siento, " + nombreUsuario + ", no eres un empleado registrado.");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}