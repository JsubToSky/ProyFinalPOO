public class mesa {
    private int numero;
    private int capacidad;
    private boolean estado;
    private String propietario;
    public mesa(int numero, int capacidad, String propietario) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = false;
        this.propietario = propietario;
    }
public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void reservar() {
        this.estado = true;
    }
    public void liberar() {
        this.estado = false;
    }

}
