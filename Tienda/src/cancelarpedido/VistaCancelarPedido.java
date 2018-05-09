/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancelarpedido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelos.Pedido;
import tienda.ControladorVistas;

/**
 *
 * @author utku35
 */
public class VistaCancelarPedido implements ContratoVistaCancelarPedido {
   private ControladorVistas controlador;
   private ContratoPresentadorCancelarPedido presentador;
   private List <Pedido> pedidos;
   
   
   public VistaCancelarPedido(ControladorVistas controladorVistas){
       this.controlador = controladorVistas;
       this.presentador = new PresentadorCancelarPedido(this);
       this.presentador.iniciar();
       this.pedidos=new ArrayList();
   }
   
    

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    

    @Override
    public void cancelar() {
        System.out.println("desea borrar 0_para si 1_ para no");
    }
  
    @Override
    public void mostrarPedidos(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos) {
         
            System.out.println(pedido.getNumero()+" ");
            System.out.println(pedido.getDetallePedido());
        }
    }
    @Override
    public void borrar(){
        System.out.println("Ingrese el numero de pedido que desea cancelar");  
    }
    
   
}
