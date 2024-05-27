import java.util.ArrayList;
import java.util.List;

class Menu {
    private String nombre;
    private List<Comida> comidas;
    private List<Bebida> bebidas;
    private List<Postre> postres;

    // Constructor
    public Menu(String nombre) {
        this.nombre = nombre;
        this.comidas = new ArrayList<>();
        this.bebidas = new ArrayList<>();
        this.postres = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(List<Comida> comidas) {
        this.comidas = comidas;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public List<Postre> getPostres() {
        return postres;
    }

    public void setPostres(List<Postre> postres) {
        this.postres = postres;
    }

    // Métodos para agregar y eliminar bebidas
    public void agregarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void eliminarBebida(Bebida bebida) {
        bebidas.remove(bebida);
    }

    // Métodos para agregar y eliminar comidas
    public void agregarComida(Comida comida) {
        comidas.add(comida);
    }

    public void eliminarComida(Comida comida) {
        comidas.remove(comida);
    }

    // Métodos para agregar y eliminar postres
    public void agregarPostre(Postre postre) {
        postres.add(postre);
    }

    public void eliminarPostre(Postre postre) {
        postres.remove(postre);
    }




    }

    class Bebida {
        private String nombre;
        private double precio;

        public Bebida(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }



        }



class Comida {
    private String nombre;
    private double precio;

    public Comida(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

class Postre {
    private String nombre;
    private double precio;

    public Postre(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
