/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.proveedores;

import java.util.Arrays;
import java.util.List;
import modelos.DetallePedido;
import modelos.EstadoPedido;
import modelos.Pedido;
import modelos.Pizza;
import modelos.TamanioPizza;
import modelos.TipoPizza;
import modelos.VariedadPizza;


/**
 *
 * @author utku38
 */
public class PedidosFalsos implements PedidosParaEstadisticas{
    
    private EstadoPedido estadoParatodos = new EstadoPedido();
    private Pizza miPizza = new Pizza("mazaG", 189.22f, new TamanioPizza(12, "grande"), new TipoPizza("dsfasdfsd", "Horno"), new VariedadPizza("sdfsdfgfdsf", "Muzzarella"));
    private Pizza miPizza2 = new Pizza("Especial", 170.5f, new TamanioPizza(8 , "mediana"), new TipoPizza("askd", "Piedra"), new VariedadPizza("kajsdjkas", "Anana"));
    private List<VariedadPizza> variedades = Arrays.asList(
              new VariedadPizza("askjdkj", "Muzzarella"),
              new VariedadPizza("asdsaasd", "Anana"),
              new VariedadPizza("sjakdkajsd", "A"),
              new VariedadPizza("sjakdkajsd", "Especial"),
              new VariedadPizza("sjakdkajsd", "B"),
              new VariedadPizza("sjakdkajsd", "C"),
              new VariedadPizza("sjakdkajsd", "D"),
              new VariedadPizza("sjakdkajsd", "E"),
              new VariedadPizza("sjakdkajsd", "F"),
              new VariedadPizza("sjakdkajsd", "G"),
              new VariedadPizza("sjakdkajsd", "H"),
              new VariedadPizza("sjakdkajsd", "I"),
              new VariedadPizza("sjakdkajsd", "J"));

 private List<TipoPizza> tiposDePizza = Arrays.asList(
             new TipoPizza ("kajada", "Horno"), 
             new TipoPizza ("kajada", "Piedra"), 
             new TipoPizza ("kajada", "Parrilla")); 
            
 
            
     private List<Pedido> pedidos = Arrays.asList(
            new Pedido("Maggie", 25, "", "", null, estadoParatodos, new DetallePedido(9, miPizza)),
             new Pedido("Tommy", 13, "", "", null, estadoParatodos, new DetallePedido(7, miPizza)),
             new Pedido("Agustin", 35, "5:32", "6:04", null, estadoParatodos, new DetallePedido(4, miPizza2)),
             new Pedido("Manuel", 76, "8:16", "9:10", null, estadoParatodos, new DetallePedido(5, miPizza2)),
             new Pedido("Steve", 6546, "6-6-6H22.30", "6-6-6H23.00", null, estadoParatodos, new DetallePedido(3, miPizza)));


     @Override
    public List<Pedido> obtenerPedidos() {
        return this.pedidos;
    }

    @Override
    public List<TipoPizza> obtenerTiposPizza() {
        return this.tiposDePizza;
    }

    @Override
    public List<VariedadPizza> obtenerVariedadesPizza() {
        return this.variedades;
    }
}

   
