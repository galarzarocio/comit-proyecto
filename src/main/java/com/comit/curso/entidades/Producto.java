package com.comit.curso.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private int diasDeRealizacion = 14;
	private String descripcion;
	private int precio;
	private boolean retenzor = true;
	private String tipoMaterial = "chapa comun o acero inoxidable";
	private boolean marcasSoldaduras = true;

	public Producto() {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return Id;
	}


	public int getDiasDeRealizacion() {
		return diasDeRealizacion;
	}


	public void setDiasDeRealizacion(int diasDeRealizacion) {
		this.diasDeRealizacion = diasDeRealizacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public boolean isRetenzor() {
		return retenzor;
	}


	public void setRetenzor(boolean retenzor) {
		this.retenzor = retenzor;
	}


	public String getTipoMaterial() {
		return tipoMaterial;
	}


	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}


	public boolean isMarcasSoldaduras() {
		return marcasSoldaduras;
	}


	public void setMarcasSoldaduras(boolean marcasSoldaduras) {
		this.marcasSoldaduras = marcasSoldaduras;
	}

}
