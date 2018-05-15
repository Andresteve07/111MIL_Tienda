/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancelarpedido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import modelos.Pedido;
import tienda.ControladorVistas;

/**
 *
 * @author utku35
 */
public class VistaCancelarPedido implements ContratoVistaCancelarPedido {
   private ControladorVistas controlador;
   private ContratoPresentadorCancelarPedido presentador;
   Scanner scan=new Scanner(System.in);
   
   
   public VistaCancelarPedido(ControladorVistas controladorVistas){
       this.controlador = controladorVistas;
       this.presentador = new PresentadorCancelarPedido(this);
       this.presentador.iniciar();
   }
    

    @Override
    public void cancelar() {
        System.out.println("desea borrar 0_para si 1_ para no");
    }
  
    @Override
    public void mostrarPedidos(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos) {
         
            System.out.println(pedido.getNumero()+" ");
            System.out.println(pedido.getEstadoPedido());
        }
    }
    @Override
    public void borrar(){
        System.out.println("Ingrese el numero de pedido que desea cancelar");
        int nroPedido= scan.nextInt();
        this.presentador.borrar(nroPedido);
    }
    
   
}
