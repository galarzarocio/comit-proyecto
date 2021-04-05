package com.comit.curso.entidades;

import java.io.Serializable;
import java.sql.Date;


import javax.persistence.Id;





public class Pedido implements Serializable {
	



	private static final long serialVersionUID = 1L;
	@Id
	private String nombre;
	
	private Date fechaDeEntrega;
    private int totalPagar;
   
	

}
