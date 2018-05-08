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
public class VistaAdministrar implements ContratoVistaAdministrar {
    
    
    @Override
    public void mostrarCategorias(){
        
    }
    
    @Override
    public void mostrarVariedades(List<VariedadPizza> variedades){
        for(int i=0; i<variedades.size();i++){
           
            System.out.print("Variedad " + i+1 + ": ");
            System.out.println(variedades.get(i).getNombre());
        }
    }
    
}
