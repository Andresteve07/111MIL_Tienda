/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.Pedido;
import tienda.ControladorVistas;

/**
 *
 * @author utku36
 */
public class VistaFacturacion implements ContratoVistaFacturacion {
    private final ContratoPresentadorFacturacion presentador;
    private final ControladorVistas controlador;

    public VistaFacturacion(ControladorVistas controlador) {
        this.controlador = controlador;
        this.presentador = new PresentadorFacturacion(this);
        this.presentador.iniciar();
    }
    
    @Override
    public void facturar() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pedido> pedidos = presentador.obtenerPedidosPendientes();
        
        System.out.println("");
        for(Pedido pedido: pedidos) {
            System.out.println("_Pedido N" + pedido.getNumero() + " _Cliente: " + pedido.getNombreCliente());
        }
        
        System.out.println("Ingrese un numero por teclado, correspondiente al numero de pedido a facturar.");
        int numeroIngresado = scan.nextInt();
        presentador.procesarOpcionIngresada(numeroIngresado);
    }
    
    @Override
    public void imprimirFactura(int numero) {
        System.out.println("El pedido " + (numero + 1) + " se ha facturado correctamente.");
        System.out.println("La factura se muestra a continuacion:");
        System.out.println("**** Factura Numero: " + presentador.obtenerPedidosPendientes().get(numero).getFactura().getNumero());
        System.out.println("Nombre Cliente: " + presentador.obtenerPedidosPendientes().get(numero).getNombreCliente());
        System.out.println("Fecha y Hora de Creacion: " + presentador.obtenerPedidosPendientes().get(numero).getFechaHoraCreacion());
        System.out.println("Fecha y Hora de Entrega: " + presentador.obtenerPedidosPendientes().get(numero).getFechaHoraEntrega());
        System.out.println("");
        System.out.println("");
        System.out.println("Total a pagar: " + presentador.obtenerPedidosPendientes().get(numero).calcTotalPedido());
    }
    
    @Override
    public void mostarOpcionInvalida() {
        System.out.println("Ha ingresado un numero inválido.");
        facturar();
    }
    
    @Override
    public void mostrarMenuSecundario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese una de las siguiente opciones");
        System.out.println("1. Facturar otro pedido");
        System.out.println("2. Regresar al menu principal");
        System.out.println("3. Salir del programa");
        
        int numero = scan.nextInt();
        presentador.procesarOpcionMenuSecundario(numero);
    }
    
    @Override
    public void irMenuPrincipal() {
        controlador.lanzarMenuPrincipal();
    }
    
    @Override
    public void mostrarSaludoDespedida() {
        System.out.println("Fin de operaciones. Buen dia!");
    }
}

