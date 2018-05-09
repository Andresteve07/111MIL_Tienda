/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomarpedido;

import java.util.List;
import modelos.Pizza;
import modelos.TipoPizza;
import modelos.VariedadPizza;
import modelos.TamanioPizza;
import tomarpedido.proveedores.FalsoProveedorTomaPedido;
import tomarpedido.proveedores.ProveedorTomaPedido;


/**
 *
 * @author utku36
 */
public class PresentadorPedido implements ContratoPresentadorPedido{
    
    private final ContratoVistaPedido vista;
    private final ProveedorTomaPedido proveedorTomaPedido;
    private int codigoPizza;
    private int cantidad;

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int getCodigoPizza() {
        return codigoPizza;
    }

    public PresentadorPedido(ContratoVistaPedido vista) {
        this.vista = vista;
        this.proveedorTomaPedido = new FalsoProveedorTomaPedido();
    }
    
    
    @Override
    public void iniciar(){
        this.vista.mostrarPizzasDisponibles();
        this.vista.mostrarSeleccionPizza();
    }
    
    @Override
    public void procesarPizzaSeleccionada(int op) {
        if(comprobacionOpcion(obtenerPizzas().size(), op)){
            switch(op){
            case -1:
                this.vista.irMenuPrincipal();
                break;
            default:
                codigoPizza = op;
                this.vista.mostrarSeleccionCantidad();
            }
        }else{
            this.vista.mostrarOPcionErronea();
            iniciar();
        }
        
    }
    
    @Override
    public void procesarCantidades(int op){
        switch(op){
            case 0:
                iniciar();
                break;
            default:
                cantidad= op;
                this.vista.confirmacion();
                break;
        }
    }
    
    
        

    @Override
    public List<Pizza> obtenerPizzas() {
        return proveedorTomaPedido.obtenerPizzas();
    }

    @Override
    public boolean comprobacionOpcion(int max, int op) {
        return op<max;
    }

    @Override
    public void procesarConfirmacion(int op) {
        switch(op){
            case 1:
                
                break;
            case 2:
                this.vista.irMenuPrincipal();
                break;
            default:
                this.vista.mostrarOPcionErronea();
                this.vista.confirmacion();
                break;
        }
    }

    
}
