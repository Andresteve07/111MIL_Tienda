/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author utku36
 */
public interface ContratoVistaFacturacion {
    
    public void facturar();
    public void resultadoFacturacion(int numero);
    public void mostarOpcionInvalida();
    public void mostrarMenuSecundario();
    public void irMenuPrincipal();
    public void mostrarSaludoDespedida();
    
}