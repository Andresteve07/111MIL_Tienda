/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancelarpedido.proveedores;

import tomarpedido.proveedores.*;
import java.util.Arrays;
import java.util.List;
import modelos.Pedido;
import modelos.TipoPizza;
import modelos.VariedadPizza;

/**
 *
 * @author andresteve07
 */
public class FalsoProveedorCancelarPedido implements ProveedorCancelarPedido{

     private List<Pedido> pedidos = Arrays.asList(
             new Pedido("juan", 10,"",""),
             new Pedido("jorge",11,"",""));

    @Override
    public List<Pedido> obtenerPedidos() {
        return this.pedidos;
    }
     
     
    
}
