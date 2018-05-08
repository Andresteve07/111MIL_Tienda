/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion.proveedores;

import java.util.ArrayList;
import modelos.Pedido;

/**
 *
 * @author utku36
 */
public class FalsoProveedorFacturacion implements ContratoProveedorFacturacion {

    ArrayList<Pedido> pedidos = new ArrayList();

    public FalsoProveedorFacturacion() {
        
        /*
        String nombreCliente, int numero, String fechaHoraCreacion, String fechaHoraEntrega, 
        Factura factura, EstadoPedido estadoPedido, DetallePedido detallePedido
        */
        
    }
    
    @Override
    public ArrayList<Pedido> obtenerPedidos() {
        
        return null;
    }
    
    
    
}
