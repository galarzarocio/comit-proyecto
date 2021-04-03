package com.comit.curso.entidades;

import java.io.Serializable;

import javax.persistence.Id;



public class Pedido implements Serializable {
	



	private static final long serialVersionUID = 1L;
	@Id
	private String nombre;
	
	private int fechaDeEntrega;
    private int totalPagar;
    
    
	public int getFechaDeEntrega() {
		return fechaDeEntrega;
	}
	public void setFechaDeEntrega(int fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}
	public int getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(int totalPagar) {
		this.totalPagar = totalPagar;
	}

}
