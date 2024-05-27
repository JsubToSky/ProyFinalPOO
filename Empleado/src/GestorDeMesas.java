import java.util.ArrayList;
import java.util.List;
public class GestorDeMesas {
    private List<Mesa> mesas;

    public GestorDeMesas() {
        this.mesas = new ArrayList<>();
    }

    public void agregarMesa(Mesa mesa) {
        mesas.add(mesa);
        System.out.println("Mesa " + mesa.getNumeroMesa() + " agregada.");
    }

    public void eliminarMesa(int numeroMesa) {
        for (Mesa mesa : mesas) {
            if (mesa.getNumeroMesa() == numeroMesa) {
                mesas.remove(mesa);
                System.out.println("Mesa " + numeroMesa + " eliminada.");
                return;
            }
        }
        System.out.println("La mesa " + numeroMesa + " no existe.");
    }
    public void cambiarEstadoMesa(int numeroMesa) {
        for (Mesa mesa : mesas) {
            if (mesa.getNumeroMesa() == numeroMesa) {
                mesa.setOcupada(!mesa.isOcupada());
                String estado = mesa.isOcupada() ? "ocupada" : "desocupada";
                System.out.println("El estado de la mesa " + numeroMesa + " ha sido cambiado a " + estado + ".");
                return;
            }
        }
        System.out.println("La mesa " + numeroMesa + " no existe.");
    }
}
