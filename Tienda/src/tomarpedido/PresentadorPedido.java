/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomarpedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelos.DetallePedido;
import modelos.Pedido;
import modelos.Pizza;
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
    private String nombre;
    private ArrayList<DetallePedido> detalles = new ArrayList<>();


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
        if(op>0){
            cantidad= op;
            this.vista.confirmacion();
        }else{
            this.vista.mostrarOPcionErronea();
            this.vista.mostrarSeleccionCantidad();
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
                agregarDetallePizza();
                this.vista.mostrarPreguntaNuevoPedido();
                break;
            case 2:
                iniciar();
                break;
            default:
                this.vista.mostrarOPcionErronea();
                this.vista.confirmacion();
                break;
        }
    }

    @Override
    public void procesarNuevoPedido(int op) {
         switch(op){
            case 1:
                iniciar();
                break;
            case 2:
                this.vista.mostrarPreguntarNombre();
                Date fechaCreacion = new Date(0, 0, 0, 0, 0);
                Pedido nuevo = new Pedido(nombre, 0, fechaCreacion, null, null, null);
                nuevo.agregarDetalleDePedido(detalles);
                this.proveedorTomaPedido.guardarPedido(nuevo);
                this.vista.irMenuPrincipal();
                break;
            default:
                this.vista.mostrarOPcionErronea();
                this.vista.mostrarPreguntaNuevoPedido();
                break;
        }
    }

    @Override
    public void procesarNombre(String nombre) {
        this.nombre=nombre;
    }
    
    public void agregarDetallePizza() {
    detalles.add(new DetallePedido(cantidad,this.proveedorTomaPedido.obtenerPizzas().get(codigoPizza)));
    }
    
    
}
