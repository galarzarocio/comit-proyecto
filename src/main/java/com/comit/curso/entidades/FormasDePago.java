package com.comit.curso.entidades;

import java.io.Serializable;


public class FormasDePago implements Serializable {

       private static final long serialVersionUID = 1L;
      
     private String formaDePagoTarjeta;
     private String formaDePagoContado;
     private String formaDePagoTransferencia;
     private String formaDePagoMercadoPago;
     
     int cantidadDePagos;
     int fechaDePagos;
     int pagosRealizados;
     
     
    
     
     
     
     
     
	public String getFormaDePagoTarjeta() {
		return formaDePagoTarjeta;
	}
	public void setFormaDePagoTarjeta(String formaDePagoTarjeta) {
		this.formaDePagoTarjeta = formaDePagoTarjeta;
	}
	public String getFormaDePagoContado() {
		return formaDePagoContado;
	}
	public void setFormaDePagoContado(String formaDePagoContado) {
		this.formaDePagoContado = formaDePagoContado;
	}
	public String getFormaDePagoTransferencia() {
		return formaDePagoTransferencia;
	}
	public void setFormaDePagoTransferencia(String formaDePagoTransferencia) {
		this.formaDePagoTransferencia = formaDePagoTransferencia;
	}
	public String getFormaDePagoMercadoPago() {
		return formaDePagoMercadoPago;
	}
	public void setFormaDePagoMercadoPago(String formaDePagoMercadoPago) {
		this.formaDePagoMercadoPago = formaDePagoMercadoPago;
	}
      
       
   
   
	

        	   
}
