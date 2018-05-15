/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomarpedido.proveedores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelos.Pedido;
import modelos.Pizza;
import modelos.TipoPizza;
import modelos.VariedadPizza;
import modelos.TamanioPizza;

/**
 *
 * @author andresteve07
 */
public class FalsoProveedorTomaPedido implements ProveedorTomaPedido{

    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    /*private List<VariedadPizza> variedades = Arrays.asList(
        new VariedadPizza("salame, otros.", "calabresa"),
        new VariedadPizza("jamon, otros.", "especial"),
        new VariedadPizza("queso, otros.", "muzzarella"));
    
    private List<TipoPizza> tipos = Arrays.asList(
            new TipoPizza("carbon vegetal", "parrilla"),
            new TipoPizza("horno gas", "horno"),
            new TipoPizza("horno lenia", "piedra"));
    
    private List<TamanioPizza> tamanios = Arrays.asList(
            new TamanioPizza(8,"Chica"),
            new TamanioPizza(10,"Mediana"),
            new TamanioPizza(12,"Grande"));
    */
     private List<Pizza> pizzas = Arrays.asList(
        new Pizza("calagrande", 120.5f,new TamanioPizza(8,"Chica"), new TipoPizza("dsdfsdvsdv", "piedra"), new VariedadPizza("dvsdvsd", "calabresa")));
    
    @Override
    public List<Pizza> obtenerPizzas() {
        return this.pizzas;
    }

    @Override
    public void guardarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    
    
    
}
