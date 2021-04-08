package com.comit.curso.entidades.repositorios;

import java.util.ArrayList;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.comit.curso.entidades.Cliente;

@Repository
@Transactional
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

List<Cliente> cliente = new ArrayList<>();
	
	
}
