package com.comit.curso.entidades;

import java.io.Serializable;



public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private int diasDeRealizacion = 14;
	private String descripcion;
	private int precio;
	private boolean sinRetenzor = true;
	private String tipoMaterial = "chapa comun o acero inoxidable";
	private boolean sinMarcasDeSoldaduras = true;

}
