/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

import java.util.ArrayList;
import java.util.List;
import modelos.Pedido;
import modelos.TipoPizza;
import modelos.VariedadPizza;

/**
 *
 * @author utku38
 */
public interface ContratoVistaEstadisticas {
    //public void mostrarEstadisticas(List<Pedido> pedidos);
    public void mostrarOpciones();
    public void volverAlMP();
    public void mensajeDespedida();
    //public void mostrarVariedadTop(VariedadPizza variedadTop);
    //public void mostrarTipoTop(TipoPizza tipoTop);
    //public void mostrarIngresoMedioDiario(float ingresoMedioDiario);
    public void mostrarEstadisticas(VariedadPizza variedadTop, TipoPizza tipoTop, float ingresoMedioDiario);
}
