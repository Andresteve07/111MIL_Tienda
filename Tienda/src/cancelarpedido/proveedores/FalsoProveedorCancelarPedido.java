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
import cancelarpedido.PresentadorCancelarPedido;
import cancelarpedido.VistaCancelarPedido;
import java.util.ArrayList;
/**
 *
 * @author andresteve07
 */
public class FalsoProveedorCancelarPedido implements ProveedorCancelarPedido{

     private List<Pedido> pedidos;

    public FalsoProveedorCancelarPedido() {
        this.pedidos = new ArrayList<>();
        this.pedidos.add(new Pedido("juan", 10,"",""));
        this.pedidos.add(new Pedido("jorge",11,"",""));
        
    }
     
    
    @Override
    public List<Pedido> obtenerPedidos() {
        return this.pedidos;
    }

    @Override
    public boolean cancelarPedido(int NroPedido) {
        for(Pedido estePedido : this.pedidos){
            if(estePedido.getNumero() == NroPedido){
                estePedido.cancelar();
                //this.pedidos.remove(estePedido);
            }
        }
        return true;
    }
    
    
    
    
    
}