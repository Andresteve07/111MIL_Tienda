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
    
    public void iniciar() {
        this.vista.iniciarFacturacion();
    }

    @Override
    public ArrayList<Pedido> obtenerPedidos() {
        return (this.proveedorFacturacion.obtenerPedidos());
    }
    
    
}
