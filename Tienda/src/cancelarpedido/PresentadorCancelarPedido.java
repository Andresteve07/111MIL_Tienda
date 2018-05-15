/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancelarpedido;

import cancelarpedido.proveedores.FalsoProveedorCancelarPedido;
import cancelarpedido.proveedores.ProveedorCancelarPedido;
import java.util.List;
import modelos.Pedido;
import java.util.Scanner;
import modelos.Pedido;
/**
 *
 * @author utku35
 */
public class PresentadorCancelarPedido implements ContratoPresentadorCancelarPedido {
    
    ContratoVistaCancelarPedido vista;
    private ProveedorCancelarPedido proveedor;
    
    public PresentadorCancelarPedido (ContratoVistaCancelarPedido vista){
        this.vista = vista;
        this.proveedor = new FalsoProveedorCancelarPedido();
    }
    @Override
    public List<Pedido> obtenerPedidos() {
        return this.proveedor.obtenerPedidos();
    }
    
    @Override
    public void borrar(int nroPedido) {
        this.proveedor.cancelarPedido(nroPedido);
        this.vista.mostrarPedidos(this.proveedor.obtenerPedidos());
    }
    
    

    @Override
    public void iniciar() {
        this.vista.mostrarPedidos(this.proveedor.obtenerPedidos());
        this.vista.borrar();
        
    }

    
    
    
    
}
