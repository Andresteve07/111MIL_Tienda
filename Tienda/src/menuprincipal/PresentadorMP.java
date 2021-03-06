/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;


/**
 *
 * @author utku36
 */
public class PresentadorMP implements ContratoPresentadorMP{
    
    private final ContratoVistaMP vista;

    public PresentadorMP(ContratoVistaMP vista) {
        this.vista = vista;
    }
    
    
    @Override
    public void procesarOpcionIngresada(int op){
        switch(op){
            case 1:
                this.vista.irTomarPedido();
                break;
            case 2:
                this.vista.irCancelarPedido();
                break;
            case 3:
                this.vista.irFacturar();
                break;
            case 4:
                this.vista.irEstadisticas();
                break;
            case 5:
                this.vista.irAdministrar();
                break;
            case 6:
                this.vista.mostrarSaludoDespedida();
                break;
            default:
                this.vista.mostrarOPcionErronea();
                this.vista.mostrarMenuPrincipal();
                break;
            
        }
    }
    
    @Override
    public void iniciar(){
        this.vista.mostrarMenuPrincipal();
    }
}
