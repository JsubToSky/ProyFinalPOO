import java.io.*;
import java.util.*;

public class GestorDeHoras {
    private String nombreArchivo;

    public GestorDeHoras(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    public void crear() throws IOException {
        ObjectOutputStream archivo= new ObjectOutputStream(new FileOutputStream(this.nombreArchivo));
        archivo.close();
        System.out.println("EL ARCHIVO DE HORAS SE CREO");
    }
    public void registrarHoras(String nombreEmpleado, int horasTrabajadas) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo, true))) {
            writer.println(nombreEmpleado + "//" + horasTrabajadas);
        }
        System.out.println("Horas registradas exitosamente para " + nombreEmpleado);
    }

    public void listarHoras() throws IOException {
        try (Scanner scanner = new Scanner(new File(nombreArchivo))) {
            System.out.println("Registro de horas:");
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] partes = linea.split("//");
                if (partes.length == 2) {
                    System.out.println("Empleado: " + partes[0] + ", Horas trabajadas: " + partes[1]);
                }
            }
        }
    }
    public void vacaciones(String nombreEmpleado, int horasTrabajadas) {
        if (horasTrabajadas >= 20) {
            System.out.println(nombreEmpleado + " tiene derecho a vacaciones.");
        }
    }


    public void vacaciones() {
    }
}
