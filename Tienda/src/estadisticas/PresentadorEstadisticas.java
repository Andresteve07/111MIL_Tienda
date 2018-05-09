/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

import estadisticas.proveedores.PedidosFalsos;
import estadisticas.proveedores.PedidosParaEstadisticas;
import java.util.List;
import menuprincipal.ContratoVistaMP;
import modelos.Pedido;
import tomarpedido.proveedores.FalsoProveedorTomaPedido;

/**
 *
 * @author utku38
 */
public class PresentadorEstadisticas implements ContratoPresentadorEstadisticas{
    private final ContratoVistaEstadisticas vista;
    private PedidosParaEstadisticas proveedor;
    
    public PresentadorEstadisticas(ContratoVistaEstadisticas vista) {
        this.vista=vista;
        this.proveedor = new PedidosFalsos();
    }

    @Override
    public void iniciar() {
        List<Pedido> pedidos = this.proveedor.obtenerPedidos();
      this.vista.mostrarEstadisticas(null, null, 15.0f, 15);
      this.vista.mostrarOpciones();
    }

    @Override
    public void procesarOpcion(int op) {
        if(op==1){
            this.vista.volverAlMP();
        }
        else{
            this.vista.mensajeDespedida();
        }
        
    }
    
}
