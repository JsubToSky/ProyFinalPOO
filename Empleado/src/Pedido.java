import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> items;

    public Pedido() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemPedido itemPedido) {
        items.add(itemPedido);
    }

    public double getTotal() {
        double total = 0;
        for (ItemPedido item : items) {
            total += item.getTotal();
        }
        return total;
    }

    public void mostrarPedidos() {
        System.out.println("Lista de Pedidos:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Pedido " + (i + 1) + ":");
            System.out.println(items.get(i));
            System.out.println("--------------------");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido:\n");
        for (ItemPedido item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total: $").append(getTotal());
        return sb.toString();
    }
}
