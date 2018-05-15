/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrar.proveedores;

import tomarpedido.proveedores.*;
import java.util.Arrays;
import java.util.List;
import modelos.Pizza;
import modelos.TamanioPizza;
import modelos.TipoPizza;
import modelos.VariedadPizza;

/**
 *
 * @author andresteve07
 */
public class FalsoProveedorAdministrador implements ContratoProveedorAdministrar{
       
       
    
    private List<TamanioPizza> tamanios = Arrays.asList(
        new TamanioPizza(12, "Grande"),
        new TamanioPizza(10, "Mediana"),
        new TamanioPizza(8, "Chica"));
     
     
    private List<VariedadPizza> variedades = Arrays.asList(
        new VariedadPizza("salame, otros.", "calabresa"),
        new VariedadPizza("jamon, otros.", "especial"),
        new VariedadPizza("queso, otros.", "muzzarella"));
    
    private List<TipoPizza> tipos = Arrays.asList(
            new TipoPizza("carbon vegetal", "parrilla"),
            new TipoPizza("horno gas", "horno"),
            new TipoPizza("horno lenia", "piedra"));
    
    private List<Pizza> pizzas = Arrays.asList(
            new Pizza("25demayo", 150.5f, tamanios.get(1), tipos.get(0), variedades.get(0)));
    
    

    @Override
    public List<VariedadPizza> obtenerVariedades() {
        return this.variedades;
    }

    @Override
    public List<TipoPizza> obtenerTipos() {
        return this.tipos;
    }

    @Override
    public List<TamanioPizza> obtenerTamanios() {
       return this.tamanios;
    }

    @Override
    public List<Pizza> obtenerPizzas() {
        return this.pizzas;
        
    }
    
}
