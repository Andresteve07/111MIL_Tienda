/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion.proveedores;

import java.util.ArrayList;
import java.util.Date;
import modelos.DetallePedido;
import modelos.EstadoPedido;
import modelos.Factura;
import modelos.Pedido;
import modelos.Pizza;
import modelos.TamanioPizza;
import modelos.TipoPizza;
import modelos.VariedadPizza;

/**
 *
 * @author utku36
 */
public class FalsoProveedorFacturacion implements ContratoProveedorFacturacion {

    ArrayList<Pedido> pedidos = new ArrayList();

    public FalsoProveedorFacturacion() {
        VariedadPizza variedadPizza1 = new VariedadPizza();
        VariedadPizza variedadPizza2 = new VariedadPizza();
        VariedadPizza variedadPizza3 = new VariedadPizza();
        
        TipoPizza tipoPizza1 = new TipoPizza();
        TipoPizza tipoPizza2 = new TipoPizza();
        TipoPizza tipoPizza3 = new TipoPizza();
        
        TamanioPizza tamanioPizza1 = new TamanioPizza();
        TamanioPizza tamanioPizza2 = new TamanioPizza();
        TamanioPizza tamanioPizza3 = new TamanioPizza();
        
        /**
         * String nombre, float precio, TamanioPizza tamanio, TipoPizza tipoPizza, VariedadPizza variedad
         */
        
        Pizza pizza1 = new Pizza("Pizza 1", 50, tamanioPizza1, tipoPizza1, variedadPizza1);
        Pizza pizza2 = new Pizza("Pizza 2", 70, tamanioPizza2, tipoPizza2, variedadPizza2);
        Pizza pizza3 = new Pizza("Pizza 3", 30, tamanioPizza3, tipoPizza3, variedadPizza3);
        
        DetallePedido detallePedido1 = new DetallePedido(3, pizza1);
        DetallePedido detallePedido2 = new DetallePedido(2, pizza2);
        DetallePedido detallePedido3 = new DetallePedido(5, pizza3);
        
        EstadoPedido estadoPedido1 = new EstadoPedido();
        EstadoPedido estadoPedido2 = new EstadoPedido();
        EstadoPedido estadoPedido3 = new EstadoPedido();
        
        Factura factura1 = new Factura();
        Factura factura2 = new Factura();
        Factura factura3 = new Factura();
        
        Date date1 = new Date(2017, 5, 30);
        Date date2 = new Date(2017, 6, 05);
        Date date3 = new Date(2017, 7, 30);
        Date date4 = new Date(2017, 8, 30);
        Date date5 = new Date(2017, 9, 30);
        Date date6 = new Date(2017, 10, 30);
        
        Pedido pedido1 = new Pedido("Santiago", 1, date1, date2, factura1, estadoPedido1);
        Pedido pedido2 = new Pedido("Esteban", 2, date3, date4, factura2, estadoPedido2);
        Pedido pedido3 = new Pedido("JB", 3, date5, date6, factura3, estadoPedido3);
        
        pedido1.agregarDetalleAPedido(detallePedido1);
        pedido1.agregarDetalleAPedido(detallePedido2);
        pedido1.agregarDetalleAPedido(detallePedido3);
        
        pedido2.agregarDetalleAPedido(detallePedido2);
        
        pedido3.agregarDetalleAPedido(detallePedido2);
        pedido3.agregarDetalleAPedido(detallePedido1);
        
        pedido1.getEstadoPedido().setCodigo(2);
        pedido2.getEstadoPedido().setCodigo(2);
        pedido3.getEstadoPedido().setCodigo(2);
        
        pedido1.setNumero(4545);
        pedido2.setNumero(6666);
        pedido3.setNumero(8989);
    
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
    }
    
    @Override
    public ArrayList<Pedido> obtenerPedidos() {
        return this.pedidos;
    }
}
