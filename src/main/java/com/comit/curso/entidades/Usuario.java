package com.comit.curso.entidades;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("USUARIO")
public class Usuario extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long contrasenia;
	private String mail;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Long getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(Long contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}