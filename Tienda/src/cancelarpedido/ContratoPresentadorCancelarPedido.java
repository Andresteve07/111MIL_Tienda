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
public interface ContratoPresentadorCancelarPedido {
    public void borrar(List<Pedido> pedidos);
    public List<Pedido> obtenerPedidos();

    public void iniciar();
    
    
    
}
