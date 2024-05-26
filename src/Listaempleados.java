import java.io.*;
import java.util.Scanner;

public class Listaempleados {
    private String nombre;
    public Listaempleados (String nombre){
        this.nombre= nombre;

    }
    public void crear() throws IOException {
        ObjectOutputStream archivo= new ObjectOutputStream(new FileOutputStream(this.nombre));
        archivo.close();
        System.out.println("EL ARCHIVO SE CREO");
    }

    public boolean buscarNombre(String nombreUsuario) throws IOException, ClassNotFoundException {
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nombre));
        try {
            while (true) {
                String empleado = (String) archivo.readObject();
                String[] datosEmpleado = empleado.split("//");
                if (datosEmpleado[0].equals(nombreUsuario)) {
                    archivo.close();
                    return true;
                }
            }
        } catch (EOFException e) {
            archivo.close();
            return false;
        }
    }
    public void agregar() throws IOException {
        ObjectOutputStream copia= new ObjectOutputStream(new FileOutputStream("copiaAuxiliar.txt"));
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nombre));
        try {
            while (true){
                String empleado= (String) archivo.readObject();
                copia.writeObject(empleado);
            }
        } catch (Exception e) {
            Scanner sc= new Scanner(System.in);

            System.out.print("Ingrese el nombre del nuevo empleado: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la edad del nuevo empleado: ");
            int edad = sc.nextInt();
            sc.nextLine();  // consume the remaining newline
            System.out.print("Ingrese el sexo del nuevo empleado: ");
            String sexo = sc.nextLine();

            String nuevoempleado = nombre + "//" + edad + "//" + sexo;
            copia.writeObject(nuevoempleado);
            copia.close();
            archivo.close();

            File farchivo= new File(this.nombre);
            File fcopiaarchivo= new File("copiaAuxiliar.txt");

            farchivo.delete();
            fcopiaarchivo.renameTo(farchivo);
            System.out.println("EL EMPLEADO SE HA AGREGADO");
        }
    }
    public void listar() throws IOException {
        ObjectOutputStream copia= new ObjectOutputStream(new FileOutputStream("copiaAuxiliar.txt"));
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nombre));
        try {
            System.out.println("LISTA DE EMPLEADOS");
            while (true){
                String empleado= (String) archivo.readObject();
                System.out.println(empleado);
                copia.writeObject(empleado);
            }
        } catch (Exception e) {
            copia.close();
            archivo.close();

            File farchivo= new File(this.nombre);
            File fcopiaarchivo= new File("copiaAuxiliar.txt");

            farchivo.delete();
            fcopiaarchivo.renameTo(farchivo);
        }
    }
}
