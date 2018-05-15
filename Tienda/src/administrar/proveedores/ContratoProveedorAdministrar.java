/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrar.proveedores;
import tomarpedido.proveedores.*;
import modelos.*;
import java.util.List;
/**
 *
 * @author andresteve07
 */
public interface ContratoProveedorAdministrar {
    List<VariedadPizza> obtenerVariedades();
    List<TipoPizza> obtenerTipos();
    List<TamanioPizza> obtenerTamanios();
    List<Pizza> obtenerPizzas();
    
}
