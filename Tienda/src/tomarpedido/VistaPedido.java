/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomarpedido;

import java.util.List;
import java.util.Scanner;
import modelos.Pizza;
import tienda.ControladorVistas;

/**
 *
 * @author utku36
 */
public class VistaPedido implements ContratoVistaPedido {
    
    private final ContratoPresentadorPedido presentador;
    private final ControladorVistas controlador;
    
    public VistaPedido (ControladorVistas controlador){
        this.controlador = controlador;
        this.presentador=new PresentadorPedido(this);
        this.presentador.iniciar();
        
}
    
    @Override
    public void mostrarSeleccionPizza(){
        Scanner teclado=new Scanner(System.in);
        clearConsole();
        System.out.println("\t"+"¡Pizza!"+"\n"+
                "Ingrese una de las siguientes opciones: "+"\n"+
                "-1) Para regresar al menu principal"+"\n"+
                "NRO) El numero de pizza para seleccionarla."+"\n");
        int opcion=teclado.nextInt();
        presentador.procesarPizzaSeleccionada(opcion);
    }
    
    @Override
    public void mostrarSeleccionCantidad() {
        Scanner teclado=new Scanner(System.in);
        clearConsole();
        System.out.println("Cuantas pizzas de esta quiere?");
        int opcion = teclado.nextInt();
        this.presentador.procesarCantidades(opcion);
    }
    
    
    @Override
    public void mostrarOPcionErronea(){
        this.clearConsole();
        System.out.println("La opcion ingresada no es correcta.");
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

    @Override
    public void mostrarPizzasDisponibles() {
        List<Pizza> pizzas = this.presentador.obtenerPizzas();
        
        for (int index = 0; index < pizzas.size(); index++) {
            System.out.println("Codigo: " + index + "  -> " + "Pizza: " + pizzas.get(index).getNombre());
            
        }
    }

    @Override
    public void confirmacion() {
        Scanner teclado=new Scanner(System.in);
        int pizza= presentador.getCodigoPizza();
        int opcion;
        clearConsole();
        System.out.println("Su eleccion fue:");
        System.out.println(presentador.getCantidad()+" pizzas "+presentador.obtenerPizzas().get(pizza).getNombre());
        System.out.println("Desea confirmar su eleccion?");
        System.out.println("1)Si");
        System.out.println("2)No");
        opcion = teclado.nextInt();
        this.presentador.procesarConfirmacion(opcion);
        
    }

    @Override
    public void mostrarPreguntaNuevoPedido() {
        Scanner teclado=new Scanner(System.in);
        clearConsole();
        int opcion;
        System.out.println("Desea hacer un nuevo pedido?");
        System.out.println("1)Si");
        System.out.println("2)No");
        opcion= teclado.nextInt();
        this.presentador.procesarNuevoPedido(opcion);
    }

    @Override
    public void mostrarPreguntarNombre() {
        Scanner teclado=new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre:");
        nombre = teclado.next();
        this.presentador.procesarNombre(nombre);
    }
    
}
