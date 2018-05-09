/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import cancelarpedido.VistaCancelarPedido;
import menuprincipal.VistaMP;
import tomarpedido.VistaPedido;
import tomarpedido.proveedores.FalsoProveedorTomaPedido;

/**
 *
 * @author utku36
 */
public class Tienda implements ControladorVistas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        ControladorVistas controlador = new Tienda();
        controlador.lanzarCancelarPedido();
    }

    @Override
    public void lanzarMenuPrincipal() {
        VistaMP vistaMP = new VistaMP(this);
    }

    @Override
    public void lanzarTomarPedido() {
        VistaPedido vistaPedido = new VistaPedido(this);
    }

    @Override
    public void lanzarCancelarPedido() {
        VistaCancelarPedido vcp = new VistaCancelarPedido(this);
        
        
    }
    
    
    
}
