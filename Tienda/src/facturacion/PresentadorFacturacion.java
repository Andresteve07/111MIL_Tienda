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
        this.vista.facturar();
    }

    @Override
    public void procesarOpcionIngresada(int numeroIngresado) {
        switch(numeroIngresado) {
            case 1:
                this.proveedorFacturacion.obtenerPedidos().get(numeroIngresado - 1).facturar();
                vista.resultadoFacturacion(numeroIngresado);
                vista.mostrarMenuSecundario();
                break;
            case 2:
                this.proveedorFacturacion.obtenerPedidos().get(numeroIngresado - 1).facturar();
                vista.resultadoFacturacion(numeroIngresado);
                vista.mostrarMenuSecundario();
                break;
            case 3:
                this.proveedorFacturacion.obtenerPedidos().get(numeroIngresado - 1).facturar();
                vista.resultadoFacturacion(numeroIngresado);
                vista.mostrarMenuSecundario();
                break;
            default:
                vista.mostarOpcionInvalida();
                vista.mostrarMenuSecundario();
                break;
        }
    }
    
    @Override
    public ArrayList<Pedido> obtenerPedidos() {
        return (this.proveedorFacturacion.obtenerPedidos());
    }
    
    @Override
    public void procesarOpcionMenuSecundario(int numero) {
        switch(numero) {
            case 1:
                vista.facturar();
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
}
