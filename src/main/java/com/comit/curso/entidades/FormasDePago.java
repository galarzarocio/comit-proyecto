package com.comit.curso.entidades;

import java.io.Serializable;
import java.sql.Date;

public class FormasDePago implements Serializable {

	private static final long serialVersionUID = 1L;

	private  cantidadDePagos;
	
	private String formaDePagoTarjeta;
	private String formaDePagoContado;
	private String formaDePagoTransferencia;
	private String formaDePagoMercadoPago;

	private Integer cantidadDePagos;
	private Date fechaDePagos;
	private Integer pagosRealizados;

	private Double monto;
	private Date fecha;
	private boolean aceptada = false;

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

	public Integer getCantidadDePagos() {
		return cantidadDePagos;
	}

	public void setCantidadDePagos(Integer cantidadDePagos) {
		this.cantidadDePagos = cantidadDePagos;
	}

	public Date getFechaDePagos() {
		return fechaDePagos;
	}

	public void setFechaDePagos(Date fechaDePagos) {
		this.fechaDePagos = fechaDePagos;
	}

	public Integer getPagosRealizados() {
		return pagosRealizados;
	}

	public void setPagosRealizados(Integer pagosRealizados) {
		this.pagosRealizados = pagosRealizados;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isAceptada() {
		return aceptada;
	}

	public void setAceptada(boolean aceptada) {
		this.aceptada = aceptada;
	}

}
