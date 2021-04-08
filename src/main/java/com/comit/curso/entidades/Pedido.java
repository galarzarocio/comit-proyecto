package com.comit.curso.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Cliente cliente;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaDeEntrega;
	private Integer totalPagar;
	@Enumerated(EnumType.STRING)
	private Estado estado;

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaDeEntrega() {
		return fechaDeEntrega;
	}

	public void setFechaDeEntrega(Date fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}

	public Integer getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(Integer totalPagar) {
		this.totalPagar = totalPagar;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

}
