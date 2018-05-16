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
 * @author utku29
 */
public class Pedido {
    
    /********** Parametros ****************/
    
    private ArrayList<DetallePedido> detalles;
    private String nombreCliente;
    private int numero;
    private Date fechaHoraCreacion;
    private Date fechaHoraEntrega;
    private Factura factura;
    private EstadoPedido estadoPedido;

    /*********** Constructores********************/
    
    public Pedido(String nombreCliente, int numero, Date fechaHoraCreacion, Date fechaHoraEntrega, Factura factura, EstadoPedido estadoPedido) {
        this.nombreCliente = nombreCliente;
        this.numero = numero;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.factura = factura;
        this.estadoPedido = estadoPedido;
        this.detalles = new ArrayList<>();
    }

    public Pedido(String juan, int i, String string, String string0) {
        this.detalles = null;
        this.numero = i;
        this.estadoPedido=new EstadoPedido();
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
    
    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }
    
    public Date getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }
    
    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }
    
    public Factura getFactura() {
        return factura;
    }
    public ArrayList<DetallePedido> getDetallePedido(){
        return detalles;
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

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }
    
    public void setFechaHoraEntrega(Date fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    
    /*************************************************************/
    
    /*
    *
    * Otros Metodos
    *
    */
    
    public void agregarDetalleDePedido(ArrayList<DetallePedido> detalles){
        this.detalles = detalles;
    }
    
    public void agregarDetalleAPedido(DetallePedido detalle) {
        detalles.add(detalle);
    }
    
    public float calcTotalPedido(){
        float total=0;
        
        for (DetallePedido detalle : detalles) {
            total += detalle.calcTotalItem();
        }
        
        return total;
    }
    
    public void cancelar(){
        this.estadoPedido.setCodigo(4);
        //if(estadoPedido.getCodigo()==4){
        //this.detalles.clear();}
        
    }
    
    public void confirmar(EstadoPedido estadodelpedido){
        
        this.estadoPedido = estadodelpedido;
        
    }
    public void facturar(){
        
        if(estadoPedido.getCodigo()==2){
            
            this.factura = new Factura();
            this.factura.setDetalle(detalles);
            this.estadoPedido.setCodigo(3);
            
        }
        
    }
    public boolean terminar(){
        
        return estadoPedido.getCodigo()==3;
    }
    
    
}
