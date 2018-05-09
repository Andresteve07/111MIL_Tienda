package modelos;

/**
 *
 * @author Facundo y Agustina
 */
public class TamanioPizza {
    
    private int cantPorciones;
    private String nombre;

    public TamanioPizza() {
    }

    public TamanioPizza(int cantPorciones, String nombre) {
        this.cantPorciones = cantPorciones;
        this.nombre = nombre;
    }

    public int getCantPorciones() {
        return cantPorciones;
    }

    public void setCantPorciones(int cantPorciones) {
        this.cantPorciones = cantPorciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TamanioPizza{" + "cantPorciones=" + cantPorciones + ", nombre=" + nombre + '}';
    }
    
}
