/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomarpedido;

import menuprincipal.*;

/**
 *
 * @author utku36
 */
public interface ContratoVistaPedido {
    public void mostrarPizzasDisponibles();
    public void mostrarSeleccionPizza();
    public void mostrarOPcionErronea();
    public void mostrarSeleccionCantidad();
    public void irMenuPrincipal();
    public void confirmacion();
    public void mostrarPreguntaNuevoPedido();

    public void mostrarPreguntarNombre();
}