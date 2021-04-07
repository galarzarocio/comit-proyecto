package com.comit.curso.entidades;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CLIENTE")
public class Cliente extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	private String direccion;
	private String localidad;
	private String provincia;
	private Long dni;
	private Long telefono;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String apellido, String nombre, long dni2) {
		// TODO Auto-generated constructor stub
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return getId() + ") " + getNombre() + " - " + getApellido();
	}
}