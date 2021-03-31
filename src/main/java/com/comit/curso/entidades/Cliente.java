package com.comit.curso.entidades;



import javax.persistence.Id;


public class Cliente extends Persona {
	
	
	private static final long serialVersionUID = 1L;
   
   @Id
   private Long id;
   
  
   private String direccion;
   private String localidad;
   private Long dni;
   private Long telefono;
   
   
   
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
   
}  
