import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = sc.nextLine();

        Listaempleados ac = new Listaempleados("C:\\Users\\jorge\\OneDrive\\Escritorio\\listaempleados.txt");
        GestorDeHoras gh = new GestorDeHoras("C:\\Users\\jorge\\OneDrive\\Escritorio\\horas.txt");
        GestorDeMesas gm = new GestorDeMesas();

        System.out.println("¡Hola, " + nombreUsuario + "! Bienvenido al sistema de gestión.");


        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Registrar horas trabajadas");
            System.out.println("4. Listar horas trabajadas");
            System.out.println("5. Gestionar mesas");
            System.out.println("6. opciones de menu");
            System.out.println("7. realizar pedido");
            System.out.println("8. Salir");

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
                    System.out.println("\nSeleccione una opción:");
                    System.out.println("1. Agregar mesa");
                    System.out.println("2. Eliminar mesa");
                    System.out.println("3. Cambiar estado de mesa");

                    while (!sc.hasNextInt()) {
                        System.out.println("Por favor ingrese una opción válida.");
                        sc.next(); // consume the invalid input
                    }
                    int opcionMesa = sc.nextInt();
                    sc.nextLine();  // consume the remaining newline

                    switch (opcionMesa) {
                        case 1:
                            System.out.print("Ingrese el número de mesa: ");
                            int numeroMesa = sc.nextInt();
                            System.out.print("Ingrese la capacidad de la mesa: ");
                            int capacidad = sc.nextInt();
                            gm.agregarMesa(new Mesa(numeroMesa, capacidad));
                            break;
                        case 2:
                            System.out.print("Ingrese el número de mesa a eliminar: ");
                            int mesaEliminar = sc.nextInt();
                            gm.eliminarMesa(mesaEliminar);
                            break;
                        case 3:
                            System.out.print("Ingrese el número de mesa: ");
                            int mesaCambiar = sc.nextInt();
                            gm.cambiarEstadoMesa(mesaCambiar);
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                            break;
                    }
                    break;
                case 6:
                    Menu menu = new Menu("Menú del Día");
                    Scanner scanner = new Scanner(System.in);
                    boolean exit = false;

                    while (!exit) {
                        System.out.println("\nOpciones del Menú:");
                        System.out.println("1. Agregar Comida");
                        System.out.println("2. Eliminar Comida");
                        System.out.println("3. Agregar Bebida");
                        System.out.println("4. Eliminar Bebida");
                        System.out.println("5. Agregar Postre");
                        System.out.println("6. Eliminar Postre");
                        System.out.println("7. Ver Menú");
                        System.out.println("8. Salir");
                        System.out.print("Elige una opción: ");
                        int Eleccion = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline

                        switch (Eleccion) {
                            case 1:
                                System.out.print("Nombre de la comida: ");
                                String nombreComida = scanner.nextLine();
                                System.out.print("Precio de la comida: ");
                                double precioComida = scanner.nextDouble();
                                scanner.nextLine(); // Consume the newline
                                menu.agregarComida(new Comida(nombreComida, precioComida));
                                break;
                            case 2:
                                System.out.print("Nombre de la comida a eliminar: ");
                                String comidaEliminar = scanner.nextLine();
                                menu.eliminarComida(new Comida(comidaEliminar, 0));
                                break;
                            case 3:
                                System.out.print("Nombre de la bebida: ");
                                String nombreBebida = scanner.nextLine();
                                System.out.print("Precio de la bebida: ");
                                double precioBebida = scanner.nextDouble();
                                scanner.nextLine(); // Consume the newline
                                menu.agregarBebida(new Bebida(nombreBebida, precioBebida));
                                break;
                            case 4:
                                System.out.print("Nombre de la bebida a eliminar: ");
                                String bebidaEliminar = scanner.nextLine();
                                menu.eliminarBebida(new Bebida(bebidaEliminar, 0));
                                break;
                            case 5:
                                System.out.print("Nombre del postre: ");
                                String nombrePostre = scanner.nextLine();
                                System.out.print("Precio del postre: ");
                                double precioPostre = scanner.nextDouble();
                                scanner.nextLine(); // Consume the newline
                                menu.agregarPostre(new Postre(nombrePostre, precioPostre));
                                break;
                            case 6:
                                System.out.print("Nombre del postre a eliminar: ");
                                String postreEliminar = scanner.nextLine();
                                menu.eliminarPostre(new Postre(postreEliminar, 0));
                                break;
                            case 7:
                                System.out.println("\nMenú: " + menu.getNombre());
                                System.out.println("Comidas:");
                                for (Comida comida : menu.getComidas()) {
                                    System.out.println("- " + comida.getNombre() + ": $" + comida.getPrecio());
                                }
                                System.out.println("Bebidas:");
                                for (Bebida bebida : menu.getBebidas()) {
                                    System.out.println("- " + bebida.getNombre() + ": $" + bebida.getPrecio());
                                }
                                System.out.println("Postres:");
                                for (Postre postre : menu.getPostres()) {
                                    System.out.println("- " + postre.getNombre() + ": $" + postre.getPrecio());
                                }

                                break;

                            case 8:
                                exit = true;
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    }break;

                case 7:
                    ItemPedido pedido = new ItemPedido();
                    pedido.solicitarPedido();
                    System.out.println("Total del pedido: $" + pedido.getTotal());
                    break;
                case 8:
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
