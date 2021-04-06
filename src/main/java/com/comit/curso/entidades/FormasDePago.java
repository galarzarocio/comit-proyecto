package com.comit.curso.entidades;



public enum FormasDePago {

	PAGOS_TARJ("IngresarDatosTarjeta"), PAGOS_CONTADO("IngresarValor"), 
	PAGOS_TRANSF("IngresarCBU"), PAGOS_MP("LINK");
	
	
		private String descripcion;
		
	FormasDePago(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	
	
	
	
	



}
