package modelos;

/**
 * Esta clase modela el estado de una factura.
 * 
 * Los estados posibles se codifican de la siguiente manera:
 * 
 * 0 - Generada
 * 1 - Cancelada
 * 
 * @author Facundo y Agustina
 */
public class EstadoFactura {
    
    private String nombre;
    private int codigo;

    public EstadoFactura() {
    }

    public EstadoFactura(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void ponerCancelado(){
        this.codigo = 1;
    }
    
    public void ponerGenerado(){
        this.codigo=0;
    }
    
    public boolean esGenerada(){
        return (this.codigo == 0);
        
    }
    
    public boolean esCancelada(){
        return (this.codigo == 1);
    }

    @Override
    public String toString() {
        return "EstadoFactura{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
}
