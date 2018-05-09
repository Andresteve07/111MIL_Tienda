package modelos;

/**
 * Esta clase modela el estado de un pedido.
 * 
 * Los estados posibles se codifican de la siguiente manera:
 * 
 * 0 - Pendiente confirmación.
 * 1 - En preparación.
 * 2 - Pendiente facturación.
 * 3 - Facturado.
 * 4 - Cancelado.
 * 
 * @author Facundo y Agustina
 */
public class EstadoPedido {
    
    private String nombre;
    private int codigo;

    public EstadoPedido() {
        this.codigo = 0;
        this.nombre = "Pendiente confirmación";
    }

    public EstadoPedido(String nombre, byte codigo) {
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
        
        switch(codigo){
            case 0:
                nombre="Pendiente confirmación";
                break;
            case 1:
              nombre="En preparación";
                break;
            case 2:
                nombre="Pendiente facturación";
                break;
            case 3:
                nombre="Facturado";
                break;
            case 4:
                nombre="Cancelado";
                break;
            default:
                System.out.println("Error");
                break;
                
            }
        this.codigo = codigo;
        
        }
        
    public boolean pteConfirmacion(){
        return this.codigo == 0;
    }
    
    public boolean enPreparacion(){
        return this.codigo == 1;
    }
    
    
    public boolean esFacturada(){
        return this.codigo == 3;
       
    }
    
    public boolean esPteFacturacion(){
        return this.codigo == 2;
    }
    
    public boolean esCancelado(){
        return this.codigo == 4;
    }

    @Override
    public String toString() {
        return "EstadoPedido{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
}