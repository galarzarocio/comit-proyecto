package com.comit.curso.entidades;


<<<<<<< HEAD

import javax.persistence.Id;
=======
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
>>>>>>> branch 'main' of git@github.com:galarzarocio/comit-proyecto.git


<<<<<<< HEAD
public class Cliente extends Persona {
	
	
=======

@Data
@Entity
@DiscriminatorValue("CLIENTE")
public class Cliente extends Persona implements Serializable {
>>>>>>> branch 'main' of git@github.com:galarzarocio/comit-proyecto.git
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
   
   @Id
   private Long id;
   
  
=======
 
>>>>>>> branch 'main' of git@github.com:galarzarocio/comit-proyecto.git
   private String direccion;
   private String localidad;
<<<<<<< HEAD
=======
   private String provincia;
   private String telefono;
>>>>>>> branch 'main' of git@github.com:galarzarocio/comit-proyecto.git
   private Long dni;
   private Long telefono;
   
   
<<<<<<< HEAD
   
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
=======
}
>>>>>>> branch 'main' of git@github.com:galarzarocio/comit-proyecto.git
