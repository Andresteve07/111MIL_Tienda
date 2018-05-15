/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

import estadisticas.proveedores.PedidosFalsos;
import estadisticas.proveedores.PedidosParaEstadisticas;
import java.util.ArrayList;
import java.util.List;
import menuprincipal.ContratoVistaMP;
import modelos.Pedido;
import modelos.TipoPizza;
import modelos.VariedadPizza;
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
      
      this.calcularValoresYMostrar();
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
    @Override
        public int calcularMayor(int[] arreglo){
            int mayor; 
            if(arreglo[0]>arreglo[1]){
                mayor = 0;
            }
            else{
                mayor= 1;
            }
            if(arreglo[2]>mayor){
                mayor=2;
            }
            return mayor;
        }

    private void calcularValoresYMostrar() {
        int[] variedadesPizzas = new int[3];
        int[] tiposPizzas = new int[3];
        
        for(int i=0; i<variedadesPizzas.length; i++){
            variedadesPizzas[i]=0;
            
        }
        List<Pedido> pedidos = this.proveedor.obtenerPedidos();
        for (Pedido pedido : pedidos) {
            if(pedido.getDetallePedido().getPizza().getVariedad().getNombre().equals("Muzzarella")){
                variedadesPizzas[0]++;
            }
            if(pedido.getDetallePedido().getPizza().getVariedad().getNombre().equals("Anana")){
                variedadesPizzas[1]++;
            }
            if(pedido.getDetallePedido().getPizza().getVariedad().getNombre().equals("Especial")){
                variedadesPizzas[2]++;
            }
            
        }
         for (Pedido pedido : pedidos) {
            if(pedido.getDetallePedido().getPizza().getTipoPizza().getNombre().equals("Horno")){
                tiposPizzas[0]++;
            }
            if(pedido.getDetallePedido().getPizza().getTipoPizza().getNombre().equals("Piedra")){
                tiposPizzas[1]++;
            }
            if(pedido.getDetallePedido().getPizza().getTipoPizza().getNombre().equals("Parrilla")){
                tiposPizzas[2]++;
            }
        }
         TipoPizza tipoTop = this.proveedor.obtenerTiposPizza().get(this.calcularMayor(tiposPizzas));
         VariedadPizza variedadTop = this.proveedor.obtenerVariedadesPizza().get(this.calcularMayor(variedadesPizzas));
         
         float sumatoria = 0.0f;
         for (Pedido pedido : pedidos) {
             sumatoria = sumatoria + pedido.calcTotalPedido();
         }
         float ingresoMedioDiario = sumatoria/pedidos.size();
         
         this.vista.mostrarEstadisticas(variedadTop, tipoTop, ingresoMedioDiario);
        
    }
    
}
