package com.comit.curso.entidades;




import javax.persistence.Id;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;





@Data
@Entity
@DiscriminatorValue("CLIENTE")
public class Cliente extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;

   
   @Id
   private Long id;
   
  

   private String direccion;
   private String localidad;

   private String provincia;
  
   private Long dni;
   private Long telefono;
   
   
}