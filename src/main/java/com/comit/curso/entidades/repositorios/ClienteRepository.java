package com.comit.curso.entidades.repositorios;







import javax.transaction.Transactional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.comit.curso.entidades.Cliente;

@Repository
@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

   

	
   

   



	
	
}
