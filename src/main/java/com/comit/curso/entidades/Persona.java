package com.comit.curso.entidades;

import java.io.Serializable;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name = "Persona")
@DiscriminatorValue("PERSONA")
public class Persona implements Serializable{
  
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long Id;
	
	 private String nombre;
	 private String apellido;
}
	
