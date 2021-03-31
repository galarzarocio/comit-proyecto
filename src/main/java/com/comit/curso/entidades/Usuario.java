package com.comit.curso.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue("USUARIO")
public class Usuario extends Persona {

	
	private static final long serialVersionUID = 1L;
 
	private Long contrasenia;
	private String mail;
	
	
}