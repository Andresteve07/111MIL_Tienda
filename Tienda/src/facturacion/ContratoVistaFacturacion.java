/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import modelos.Pedido;

/**
 *
 * @author utku36
 */
public interface ContratoVistaFacturacion {
    
    public void listarFacturasPendientes();
    public void mostarOpcionInvalida();
    public void mostrarMenuSecundario();
    public void irMenuPrincipal();
    public void mostrarSaludoDespedida();
    public void imprimirFactura(int numero,Pedido pedido);
    public void mostrarInexistenciaPedidos();
    
}
