package com.comit.curso.entidades;

import java.io.Serializable;

public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	public int diasDeRealizacion = 14;
	public String descripcion;
	public int precio;
	public boolean sinRetenzor = true;
	public String tipoMaterial = "chapa comun o acero inoxidable";
	public boolean sinMarcasDeSoldaduras = true;

}
