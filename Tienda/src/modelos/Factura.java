/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author: Agustin y Jose.
 */
public class Factura {
    /**
     * ATRIBUTOS
     */
    private Date fechaHoraEmision;
    private int numero;
    private EstadoFactura estado;
    private ArrayList<DetallePedido> detalles;
    private float TotalAPagar;

    /**
     * CONSTRUCTORES
     */
    public Factura() {
        this.fechaHoraEmision = new Date();
        estado = new EstadoFactura();
        this.detalles = new ArrayList<>();
        
        
    }

    public Factura(Date fechaHoraEmision, int numero,EstadoFactura estado, float TotalAPagar) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
        estado = new EstadoFactura();
        this.TotalAPagar = TotalAPagar;
    }

    /**
     * METODOS GET 
     */
    public int getNumero() {
        return this.numero;
    }
 
    public Date getFechaHoraEmision() {
        return this.fechaHoraEmision;
    }

    public EstadoFactura getEstado() {
        return estado;
    }

    public ArrayList<DetallePedido> getPedidos() {
        return detalles;
    }

    public float getTotalAPagar() {
        return TotalAPagar;
    }
    
    /**
     * METODOS SET
     */
    public void setEstado(EstadoFactura estado) {
        this.estado= estado;
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setDetalle(ArrayList<DetallePedido> detallePedido) {
        if(detallePedido.size() > 0) {
            for(DetallePedido pedido : detallePedido) {
            detalles.add(pedido);
            }
        }
    }

    public void setTotalAPagar(float TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }
    
    
    /**
     * OTROS METODOS
     */
    public void imprimirDetalleFactura () {
        for (DetallePedido pedido : detalles) {
            System.out.println(pedido.toString());
        }
    }
    
    public void imprimirTotalAPagar() {
        float total = 0;
        for (DetallePedido pedido : detalles) {
            total += pedido.calcTotalItem();
        }
        
        System.out.println("El total a pagar es: " + total);
    }
    
}
