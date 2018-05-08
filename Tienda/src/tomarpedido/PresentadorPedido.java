/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomarpedido;

import java.util.List;
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
    private int codigoTipoPizza;
    private int codigoCoccion;
    private int codigoTamanio;
    private int cantidad;
    

    public PresentadorPedido(ContratoVistaPedido vista) {
        this.vista = vista;
        this.proveedorTomaPedido = new FalsoProveedorTomaPedido();
    }
    
    
    @Override
    public void procesarTipoPizzaIngresado(int op){
        switch(op){
            case -1:
                this.vista.irMenuPrincipal();
                break;
            default:
                this.codigoTipoPizza = op;
                this.vista.mostrarTiposCoccionDisponibles();
                this.vista.mostrarSeleccionCoccion();
                break;
            
        }
    }
    @Override
    public void iniciar(){
        this.vista.mostrarVariedadesDisponibles();
        this.vista.mostrarSeleccionVariedadPizza();
    }

    @Override
    public void procesarCoccionSeleccionada(int op) {
        switch(op){
            case -1:
                this.vista.irMenuPrincipal();
                break;
            case -2:
                this.vista.mostrarVariedadesDisponibles();
                this.vista.mostrarSeleccionVariedadPizza();
                break;
            default:
                this.codigoCoccion = op;
                this.vista.mostrarTamaniosDisponibles();
                this.vista.mostrarSeleccionarTamanioPizza();
                break;
        }
    }
    
    @Override
    public void procesarTamanioSeleccionado(int op) {
        switch(op){
            case -1:
                this.vista.irMenuPrincipal();
                break;
            case -2:
                this.vista.mostrarTiposCoccionDisponibles();
                this.vista.mostrarSeleccionCoccion();
                break;
            default:
                this.codigoTamanio = op;
                this.vista.irMenuPrincipal();
                break;
        }
    }

    @Override
    public List<VariedadPizza> obtenerVariedades() {
        return this.proveedorTomaPedido.obtenerVariedades();
    }

    @Override
    public List<TipoPizza> obtenerTiposCoccion() {
        return this.proveedorTomaPedido.obtenerTipos();
    }
    
    @Override
    public List<TamanioPizza> obtenerTamanioPizza(){
        return this.proveedorTomaPedido.obtenerTamanio();
    }
}
