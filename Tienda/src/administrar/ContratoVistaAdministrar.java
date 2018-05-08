/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrar;

import java.util.List;
import modelos.VariedadPizza;

/**
 *
 * @author utku29
 */
public interface ContratoVistaAdministrar {

    public void mostrarCategorias();
    public void mostrarVariedades(List<VariedadPizza> variedades);
    
}
