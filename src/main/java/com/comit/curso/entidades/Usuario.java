package com.comit.curso.entidades;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue("USUARIO")
public class Usuario extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
 

	private Long contrasenia;
	private String mail;
	

	
}