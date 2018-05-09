/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
/**
 *
 * @author utku29
 */
public class Pedido {
    
    /********** Parametros ****************/
    
    private final ArrayList<DetallePedido> detalles;
    private String nombreCliente;
    private int numero;
    private String fechaHoraCreacion;
    private String fechaHoraEntrega;
    private Factura factura;
    private EstadoPedido estadoPedido;
    private DetallePedido detallePedido;

    /*********** Constructores********************/
    
    public Pedido(String nombreCliente, int numero, String fechaHoraCreacion, String fechaHoraEntrega, Factura factura, EstadoPedido estadoPedido, DetallePedido detallePedido) {
        this.nombreCliente = nombreCliente;
        this.numero = numero;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.factura = factura;
        this.estadoPedido = estadoPedido;
        this.detallePedido = detallePedido;
        this.detalles = new ArrayList<>();
    }

    public Pedido(String juan, int i, String string, String string0) {
        this.detalles = null;
        this.numero = i;
    }
    
    /*
    *
    * Metodos GET
    *
    */
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }
    
    public String getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }
    
    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }
    
    public Factura getFactura() {
        return factura;
    }
    
    public DetallePedido getDetallePedido() {
        return detallePedido;
    }
    
    /********************************************************************/
    
    /*
    *
    * Metodos SET
    *
    */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaHoraCreacion(String fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }
    
    public void setFechaHoraEntrega(String fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }
    
    
    /*************************************************************/
    
    /*
    *
    * Otros Metodos
    *
    */
    
    public void agregarDetalleDePedido(){
        
        if(estadoPedido.getCodigo()==0 || estadoPedido.getCodigo()==1)
        detalles.add(detallePedido);
        
    }
    

    public float calcTotalPedido(){
        float total=0;
        
        for (DetallePedido detalle : detalles) {
            total += detalle.calcTotalItem();
        }
        
        return total;
    }
    
    public void cancelar(){
        
        if(estadoPedido.getCodigo()==4){
        this.detalles.clear();}
        
    }
    
    public void confirmar(EstadoPedido estadodelpedido){
        
        this.estadoPedido = estadodelpedido;
        
    }
    public void facturar(){
        
        if(estadoPedido.getCodigo()==2){
            
            this.factura = new Factura();
            this.factura.setDetalle(detalles);
            
        }
        
    }
    public boolean terminar(){
        
        return estadoPedido.getCodigo()==3;
    }
    
    
}
