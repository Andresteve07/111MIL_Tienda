/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrar;

import java.util.List;
import modelos.Pizza;
import modelos.TamanioPizza;
import modelos.TipoPizza;
import modelos.VariedadPizza;

/**
 *
 * @author utku29
 */
public interface ContratoVistaAdministrar {
    
    public void irMenuPrincipal();
    public void mostrarCategorias();
    public void mostrarCoccion(List<TipoPizza> tipoCoccion);
    public void mostrarTamanios(List<TamanioPizza> tamanios);
    public void mostrarVariedades(List<VariedadPizza> variedades);
    public void mostrarPrecios(List<Pizza> precios);
    
}
