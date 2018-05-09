package modelos;

/**
 *
 * @author Facundo y Agustina
 */
public class VariedadPizza {
    
    private String ingredientes;
    private String nombre;

    public VariedadPizza() {
    }

    public VariedadPizza(String ingredientes, String nombre) {
        this.ingredientes = ingredientes;
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "VariedadPizza{" + "ingredientes=" + ingredientes + ", nombre=" + nombre + '}';
    }
    
}
