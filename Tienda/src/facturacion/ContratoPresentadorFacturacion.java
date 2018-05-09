/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.ArrayList;
import modelos.Pedido;

/**
 *
 * @author utku36
 */
public interface ContratoPresentadorFacturacion {
    
    public void iniciar();
    public ArrayList<Pedido> obtenerPedidosPendientes();
    public ArrayList<Pedido> obtenerPedidos();
    public void procesarOpcionIngresada(int numeroIngresado);
    public void procesarOpcionMenuSecundario(int numero);
    public Pedido obtenerPedido(int numero);
    
}
