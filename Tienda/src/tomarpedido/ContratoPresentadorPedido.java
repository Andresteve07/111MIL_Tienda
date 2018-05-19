/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomarpedido;

import java.util.List;
import modelos.Pizza;
import modelos.TamanioPizza;
import modelos.TipoPizza;
import modelos.VariedadPizza;


/**
 *
 * @author utku36
 */
public interface ContratoPresentadorPedido {
    public void procesarPizzaSeleccionada(int op);
    public List<Pizza> obtenerPizzas();
    public void iniciar();
    public boolean comprobacionOpcion (int max,int op);
    public void procesarCantidades(int op);
    public int getCantidad();
    public int getCodigoPizza();
    public void procesarConfirmacion(int op);
    public void procesarNuevoPedido(int op);

    public void procesarNombre(String nombre);

    
}
