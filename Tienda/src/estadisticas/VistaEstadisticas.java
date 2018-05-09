/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

import java.util.Scanner;
import menuprincipal.ContratoPresentadorMP;
import menuprincipal.PresentadorMP;
import tienda.ControladorVistas;

/**
 *
 * @author utku38
 */
public class VistaEstadisticas implements ContratoVistaEstadisticas{
     private final ContratoPresentadorEstadisticas presentador;
    private final ControladorVistas controlador;
    
    public VistaEstadisticas (ControladorVistas controlador){
        this.controlador = controlador;
        this.presentador = new PresentadorEstadisticas(this);
        this.presentador.iniciar();  
    }

    @Override
    public void mostrarEstadisticas(String variedadTop, String tipoTop, float ingresosDiarios, int cantPedidosDiarios) {
        System.out.println("\t"+"Estadisticas."+"\n"+
                "Variedad mas pedida: "+variedadTop+"\n"+
                "Tipo mas pedido: "+tipoTop+"\n"+
                "Promedio de ingresos por dia: "+ingresosDiarios+"\n"+
                "Promedio de pedidos por dia: "+cantPedidosDiarios);
 
    }

    @Override
    public void mostrarOpciones() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una de las siguientes opciones: "+"\n"+
                "1. Volver al Menu Principal."+"\n"+
                "2. Salir del programa.");
        int opcion=teclado.nextInt();
        this.presentador.procesarOpcion(opcion);

    }

    @Override
    public void volverAlMP() {
        this.controlador.lanzarMenuPrincipal();
    }

    @Override
    public void mensajeDespedida() {
       System.out.println("Hasta luego!");
    }
    
}
