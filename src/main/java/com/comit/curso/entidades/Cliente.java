package com.comit.curso.entidades;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;


@Data
@Entity
@DiscriminatorValue("CLIENTE")
public class Cliente extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;
 
   private String direccion;
   private String localidad;
   private String provincia;
   private String telefono;
   private Long dni;
   private Long codigoPostal;
   
   
}
