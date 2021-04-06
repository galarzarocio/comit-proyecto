package com.comit.curso.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends Usuario {
	private static final long serialVersionUID = 1L;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	private String mail;
	private Long contrasenia;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Long getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(Long contrasenia) {
		this.contrasenia = contrasenia;
	}

}
