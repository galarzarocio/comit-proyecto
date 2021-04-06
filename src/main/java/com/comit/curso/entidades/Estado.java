package com.comit.curso.entidades;

public enum Estado {

	PAGO_50_PORC("pago50Porciento"), PAGO_TOTAL("pagoTotal"), EN_PREPARACION("enPreparacion"),
	CON_RETRASO("conRetraso"), ENVIADO("enviado"), ENTREGADO("entregado");

	private String descripcion;

	Estado(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
