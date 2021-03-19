package com.comit.curso.entidades;

public class Usuario extends Persona {

	
	private static final long serialVersionUID = 1L;
 
	private String nmbre;
	private String apellido;
	private long contrasenia;
	private String mail;


	public String getNmbre() {
		return nmbre;
	}
	public void setNmbre(String nmbre) {
		this.nmbre = nmbre;
	}
	public long getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(long contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}