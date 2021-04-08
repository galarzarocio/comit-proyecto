package com.comit.curso.entidades.controladores;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.comit.curso.entidades.Cliente;
import com.comit.curso.entidades.Estado;
import com.comit.curso.entidades.Pedido;
import com.comit.curso.entidades.repositorios.ClienteRepository;
import com.comit.curso.entidades.repositorios.PedidoRepository;



@Controller
@RequestMapping(value = "/pedidos")
public class PedidoController {
	
@Autowired
	PedidoRepository repo;
	
	private Model addAttribute;
	
	
	
	@GetMapping(value = "")
	public String listarPedidos(Model model) {

		model.addAttribute("pedidos", repo.findAll());
		return "listado";

	}
	@RequestMapping(value = "/pedidos/{id}", method = { RequestMethod.POST, RequestMethod.PUT })
	public String pedido(@PathVariable(value = "id") Long id, @RequestParam(value = "fechaDeEntrega") String fechaDeEntrega,
			@PathVariable(value = "estado") Estado estado, Model model) throws ParseException {

		Date fecha = (Date) new SimpleDateFormat("yyyy-mm-dd").parse(fechaDeEntrega);
		
		Cliente cli = ClienteRepository.findById(id).get();
		model.addAttribute("pedido", repo);
		
	  return "/listado";

	}

}
