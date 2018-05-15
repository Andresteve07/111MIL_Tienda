/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.proveedores;
import modelos.*;
import java.util.List;
/**
 *
 * @author utku38
 */
public interface PedidosParaEstadisticas {
    List<Pedido> obtenerPedidos();
    List<TipoPizza> obtenerTiposPizza();
    List<VariedadPizza> obtenerVariedadesPizza();
    
}
