import java.util.Scanner;

class MenuTest {
    public static void main(String[] args) {
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
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (opcion) {
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
        }

        scanner.close();
    }
}
