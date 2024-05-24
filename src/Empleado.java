import java.util.Scanner;

public class Empleado extends Persona {
    private String cargo;


    public Empleado(String nombre, int edad, String sexo, String cargo) {
        super(nombre, edad, sexo);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void reservarMesa(mesa mesa) {
        mesa.reservar();
        System.out.println("La mesa " + mesa.getNumero() + " ha sido reservada por " + this.getNombre());
    }

    public void liberarMesa(mesa mesa) {
        mesa.liberar();
        System.out.println("la mesa " + mesa.getNumero() + " ha sido liberada");
    }


}
