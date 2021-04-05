package com.comit.curso.entidades;

import java.io.Serializable;

public class Estado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	
     private int pago50Porciento;
     private String pagoTotal;
     private String enPreparacion;
     private String conRetraso;
     private String enviado;
     private String entregado;
 
     Estado = new estado("enPreparacion");
 
}
