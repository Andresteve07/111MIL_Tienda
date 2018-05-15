/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import facturacion.proveedores.ContratoProveedorFacturacion;
import facturacion.proveedores.FalsoProveedorFacturacion;
import java.util.ArrayList;
import modelos.Pedido;

/**
 *
 * @author utku36
 */
public class PresentadorFacturacion implements ContratoPresentadorFacturacion {
    private ContratoVistaFacturacion vista;
    private final ContratoProveedorFacturacion proveedorFacturacion;
    
    public PresentadorFacturacion(ContratoVistaFacturacion vista) {
        this.vista = vista;
        proveedorFacturacion = new FalsoProveedorFacturacion();
    }
    
    @Override
    public void iniciar() {
        if(obtenerPedidosPendientes().size() > 0) {
            this.vista.listarFacturasPendientes();
        }
        else {
            this.vista.mostrarInexistenciaPedidos();
            vista.mostrarMenuSecundario();
        }
    }

    @Override
    public void procesarOpcionIngresada(int numeroIngresado) {
        if(numeroIngresado >= 1 && numeroIngresado <= obtenerPedidosPendientes().size()) {
            obtenerPedidosPendientes().get(numeroIngresado - 1).facturar();
            vista.imprimirFactura(numeroIngresado - 1,obtenerPedidosPendientes().get(numeroIngresado - 1) );
            obtenerPedidosPendientes().get(numeroIngresado - 1).getEstadoPedido().setCodigo(3);
            vista.mostrarMenuSecundario();
        }
        else {
            vista.mostarOpcionInvalida();
        }
    }
    
    @Override
    public ArrayList<Pedido> obtenerPedidosPendientes() {
        ArrayList<Pedido> pedidosPendientes = new ArrayList();
        ArrayList<Pedido> pedidosTotales = obtenerPedidos();
        
        
        for(Pedido pedido: pedidosTotales) {
            if(pedido.getEstadoPedido().getCodigo() == 2) {
                pedidosPendientes.add(pedido);
            }
        }
        return pedidosPendientes;
    }
    
    @Override
    public ArrayList<Pedido> obtenerPedidos() {
        return (this.proveedorFacturacion.obtenerPedidos());
    }
    
    @Override
    public void procesarOpcionMenuSecundario(int numero) {
        switch(numero) {
            case 1:
                if(obtenerPedidosPendientes().size() > 0) {
                    this.vista.listarFacturasPendientes();
                }
                else {
                    this.vista.mostrarInexistenciaPedidos();
                    vista.mostrarMenuSecundario();
                }
                break;
            case 2:
                vista.irMenuPrincipal();
                break;
            case 3:
                vista.mostrarSaludoDespedida();
                break;
            default:
                vista.mostarOpcionInvalida();
                break;
        }
    }
    
    @Override
    public Pedido obtenerPedido(int numero) {
        return obtenerPedidos().get(numero);
    }
}
