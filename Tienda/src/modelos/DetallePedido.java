/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author utku30
 */

/**
 * Este clase representa a el detaale de un pedido descrito en la conmsigna del 2do tp del 11mil.
 * Como una modificacion a la consigna el metodo cancwelar sera realizado por la clase pedido.
 * @author utku32
 */
public class DetallePedido  {
    
    private int cantidad;
    private float precioOriginalUnitario;
    private Pizza pizza;
    

    public int getCantidad() {
        return cantidad;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioOriginalUnitario() {
        return precioOriginalUnitario;
    }

    public void setPrecioOriginalUnitario(float precioOriginalUnitario) {
        this.precioOriginalUnitario = precioOriginalUnitario;
    }
    public  float calcTotalItem() 
    {   float resultado;
        resultado=this.cantidad*this.precioOriginalUnitario;
        return resultado;
    }
    
   
    public DetallePedido(int cantidad, Pizza pizza) {
        this.cantidad = cantidad;
        this.precioOriginalUnitario = pizza.getPrecio();
        this.pizza = pizza;
    }
    
    public String toString(){
        return "Detalle: Cantidad: " + this.cantidad + "    Pizza: " + this.pizza + "    PrecioUnitarioOrig: " + this.precioOriginalUnitario + "     Total: " + this.calcTotalItem();
    }
}

