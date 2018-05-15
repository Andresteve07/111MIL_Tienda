/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrar;

import java.util.List;
import java.util.Scanner;
import modelos.Pizza;
import modelos.TamanioPizza;
import modelos.TipoPizza;
import modelos.VariedadPizza;
import tienda.ControladorVistas;

/**
 *
 * @author utku29
 */
public class VistaAdministrar implements ContratoVistaAdministrar {
    
    private final ContratoPresentadorAdministrar presentador;
    private final ControladorVistas controlador;
    
    public VistaAdministrar(ControladorVistas controlador){
        this.controlador = controlador;
        this.presentador = new PresentadorAdministrar(this);
        this.presentador.iniciar();
    
    }
    
    @Override
    public void mostrarCategorias(){
        Scanner teclado = new Scanner(System.in);
        clearConsole();
        System.out.println("\t"+"¡Bienvenidos!"+"\n"+
                "Ingrese una de las siguientes opciones: "+"\n"+
                "1) Variedades."+"\n"+
                "2) Coccion."+"\n"+
                "3) Tamaño."+"\n"+
                "4) Precios."+"\n"+
                "5) Salir."+"\n");
        int codigoCategorias = teclado.nextInt();
        presentador.procesarCategorias(codigoCategorias);
        
    }
    
    @Override
    public void mostrarVariedades(List<VariedadPizza> variedades){
        for(int i=0; i<variedades.size();i++){
           
            System.out.print("Variedad " + i+1 + ": ");
            System.out.println(variedades.get(i).getNombre());
        }
    }
    
    @Override
    public void mostrarCoccion(List<TipoPizza> tipoCoccion){
        for(int i=0; i<tipoCoccion.size();i++){
           
            System.out.print("Tipo de cocción " + i+1 + ": ");
            System.out.println(tipoCoccion.get(i).getNombre());
        }
    }
    
    @Override
    public void mostrarTamanios(List<TamanioPizza> tamanios){
        for(int i=0; i<tamanios.size();i++){
           
            System.out.print("Tamaños " + i+1 + ": ");
            System.out.println(tamanios.get(i).getNombre());
        }
    }
    
    @Override
    public void mostrarPrecios(List<Pizza> pizzas){
        for(int i=0; i<pizzas.size();i++){
           
            System.out.print("Nombre " + pizzas.get(i).getNombre() + ": ");
            System.out.println(pizzas.get(i).getPrecio());
        }
    }
    
        private void clearConsole() {
        System.out.print("\033[H\033[2J");
/*
    try {
      final String os = System.getProperty("os.name");
      if (os.contains("Windows")) {
          Runtime.getRuntime().exec("cls");
      } else {
          Runtime.getRuntime().exec("clear");
      }
    } catch (final Exception e) {
        System.out.println("something went wrong :(");
    }
*/
        
  }
        @Override
        public void irMenuPrincipal() {
            this.controlador.lanzarMenuPrincipal();
        }
    
}
