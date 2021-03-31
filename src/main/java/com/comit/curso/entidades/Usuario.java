package com.comit.curso.entidades;

public class Usuario extends Persona {

	
	private static final long serialVersionUID = 1L;
 

	private long contrasenia;


	
	public long getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(long contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}