import java.util.Scanner;

public class ItemPedido {
    private Postre postre;
    private Bebida bebida;
    private Comida comida;

    public ItemPedido() {
        solicitarPedido();
    }

    // Método para solicitar el pedido al usuario
    void solicitarPedido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué postre desea ordenar?");
        System.out.print("Nombre del postre: ");
        String nombrePostre = scanner.nextLine();
        System.out.print("Precio del postre: ");
        double precioPostre = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("¿Qué bebida desea ordenar?");
        System.out.print("Nombre de la bebida: ");
        String nombreBebida = scanner.nextLine();
        System.out.print("Precio de la bebida: ");
        double precioBebida = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("¿Qué comida desea ordenar?");
        System.out.print("Nombre de la comida: ");
        String nombreComida = scanner.nextLine();
        System.out.print("Precio de la comida: ");
        double precioComida = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Crear objetos Postre, Bebida y Comida basados en la entrada del usuario
        this.postre = new Postre(nombrePostre, precioPostre);
        this.bebida = new Bebida(nombreBebida, precioBebida);
        this.comida = new Comida(nombreComida, precioComida);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para obtener el total del pedido
    public double getTotal() {
        double total = 0;
        total += postre.getPrecio();
        total += bebida.getPrecio();
        total += comida.getPrecio();
        return total;
    }}