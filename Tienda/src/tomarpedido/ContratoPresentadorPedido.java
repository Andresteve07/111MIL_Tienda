/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomarpedido;

import java.util.List;
import modelos.TipoPizza;
import modelos.VariedadPizza;


/**
 *
 * @author utku36
 */
public interface ContratoPresentadorPedido {
    public void procesarTipoPizzaIngresado(int op);
    public void procesarCoccionSeleccionada(int op);
    public void iniciar();
    public List<VariedadPizza> obtenerVariedades();
    public List<TipoPizza> obtenerTiposCoccion();
}
