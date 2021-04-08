package com.comit.curso.entidades.repositorios;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comit.curso.entidades.Producto;

@Repository
@Transactional
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	

	
}
