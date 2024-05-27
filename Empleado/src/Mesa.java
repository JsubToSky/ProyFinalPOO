import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numeroMesa;
    private int capacidad;
    private boolean ocupada;

    public Mesa(int numeroMesa, int capacidad) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.ocupada = false; // Al crear la mesa, inicialmente no está ocupada
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}