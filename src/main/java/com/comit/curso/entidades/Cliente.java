package com.comit.curso.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
 
   @Id
   private Long id;
   
   private String apellido;
   private String nombre;
   private String direccion;
   private String localidad;
   private String provincia;
   private Long dni;
   private Long codigoPostal;
   
   
   
   
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
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

public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Long getDni() {
	return dni;
}
public void setDni(Long dni) {
	this.dni = dni;
}
public Long getCodigoPostal() {
	return codigoPostal;
}
public void setCodigoPostal(Long codigoPostal) {
	this.codigoPostal = codigoPostal;
}
}
