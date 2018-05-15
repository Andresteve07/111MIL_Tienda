/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrar;

import administrar.proveedores.ContratoProveedorAdministrar;
import administrar.proveedores.FalsoProveedorAdministrador;
import java.util.List;
import modelos.TipoPizza;

/**
 *
 * @author utku29
 */
public class PresentadorAdministrar implements ContratoPresentadorAdministrar {
    
    private final ContratoVistaAdministrar vista;
    private ContratoProveedorAdministrar proveedor;
    public PresentadorAdministrar(ContratoVistaAdministrar vista) {
        this.vista = vista;
        this.proveedor= new FalsoProveedorAdministrador();
    }
    @Override
    public void procesarCategorias(int codigoCategoria){
        switch(codigoCategoria){
            case 1:
                this.vista.mostrarVariedades(this.proveedor.obtenerVariedades());
                this.vista.mostrarCategorias();
                break;
            case 2:
                this.vista.mostrarCoccion(this.proveedor.obtenerTipos());
                this.vista.mostrarCategorias();
                break;
            case 3:
                this.vista.mostrarTamanios(this.proveedor.obtenerTamanios());
                this.vista.mostrarCategorias();
                break;
            case 4:
                this.vista.mostrarPrecios(this.proveedor.obtenerPizzas());
                this.vista.mostrarCategorias();
                break;
            case 5:
                this.vista.irMenuPrincipal();
                break;
            default:
                break;
            
        }
        
    }
    
    public void iniciar(){
        this.vista.mostrarCategorias();
    }
}