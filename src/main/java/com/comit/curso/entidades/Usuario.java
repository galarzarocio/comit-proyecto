package com.comit.curso.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue("USUARIO")
public class Usuario extends Persona {

	
	private static final long serialVersionUID = 1L;
 
<<<<<<< HEAD

	private long contrasenia;


	
	public long getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(long contrasenia) {
		this.contrasenia = contrasenia;
	}
=======
	private Long contrasenia;
	private String mail;
	
>>>>>>> branch 'main' of git@github.com:galarzarocio/comit-proyecto.git
	
}