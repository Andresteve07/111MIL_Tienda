/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrar;

/**
 *
 * @author utku29
 */
public class PresentadorAdministrar implements ContratoPresentadorAdministrar {
    
    private final ContratoVistaAdministrar vista;
    public PresentadorAdministrar(ContratoVistaAdministrar vista) {
        this.vista = vista;
    }
    @Override
    public void procesarCategorias(int codigoCategoria){
        switch(codigoCategoria){
            case 1:
                this.vista.mostrarVariedades();
                break;
            case 2:
                this.vista.mostrarCoccion();
                break;
            case 3:
                this.vista.mostrarTamanios();
                break;
            case 4:
                this.vista.mostrarPrecios();
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