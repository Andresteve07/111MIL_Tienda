/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.ArrayList;
import modelos.Pedido;
import tienda.ControladorVistas;

/**
 *
 * @author utku36
 */
public class VistaFacturacion implements ContratoVistaFacturacion {
    private final ContratoPresentadorFacturacion presentador;
    private final ControladorVistas controlador;

    public VistaFacturacion(ControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorFacturacion(this);
        this.presentador.iniciar();
    }
    
    @Override
    public void iniciarFacturacion() {
        ArrayList<Pedido> pedidos = presentador.obtenerPedidos();
    }
    
    
}

