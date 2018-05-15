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
public interface ContratoPresentadorEstadisticas {
    public void iniciar();
    public void procesarOpcion(int op);
    public int calcularMayor(int[] variedades);
    
}
