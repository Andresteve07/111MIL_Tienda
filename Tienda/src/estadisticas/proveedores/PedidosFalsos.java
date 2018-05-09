/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.proveedores;

import java.util.Arrays;
import java.util.List;
import modelos.Pedido;

/**
 *
 * @author utku38
 */
public class PedidosFalsos implements PedidosParaEstadisticas{
     private List<Pedido> pedidos = Arrays.asList(
            new Pedido("Maggie", 25, "", "", null, null, null),
             new Pedido("Tommy", 13, "", "", null, null, null));

    @Override
    public List<Pedido> obtenerPedidos() {
        return this.pedidos;
    }
    
}
