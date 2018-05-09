/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancelarpedido;

import java.util.List;
import modelos.Pedido;

/**
 *
 * @author utku35
 */
public interface ContratoVistaCancelarPedido {
    
    public void borrar();
    public void mostrarPedidos(List<Pedido> pedidos);
    public void cancelar();
    
}
