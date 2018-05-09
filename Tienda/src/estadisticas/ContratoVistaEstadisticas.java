/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

/**
 *
 * @author utku38
 */
public interface ContratoVistaEstadisticas {
    public void mostrarEstadisticas(String variedadTop, String tipoTop, float ingresosDiarios, int cantPedidosDiarios);
    public void mostrarOpciones();
    public void volverAlMP();
    public void mensajeDespedida();
}
