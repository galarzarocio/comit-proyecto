package com.comit.curso.entidades.repositorios;





import java.util.Optional;

import javax.transaction.Transactional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.comit.curso.entidades.Cliente;

@Repository
@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

   

	static Object findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	void saveAndFlush(Cliente cliente);
   

   



	
	
}
