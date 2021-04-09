package com.comit.curso.entidades.controladores;


import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.comit.curso.entidades.Cliente;

import com.comit.curso.entidades.Pedido;

import com.comit.curso.entidades.repositorios.ClienteRepository;
import com.comit.curso.entidades.repositorios.PedidoRepository;
import com.comit.curso.entidades.repositorios.ProductoRepository;




@Controller
@RequestMapping(value = "/pedido")
public class PedidoController {

	@Autowired
	PedidoRepository repo;

	@Autowired
	ClienteRepository clienteRepo;

	@Autowired
	ProductoRepository productoRepo;


	
	
	
	@GetMapping(value = "/listado")
	public String listarPedidos(Model model) {

		model.addAttribute("pedidos", repo.findAll());
		return "listado";


	
	}
	@RequestMapping("/crear")
	public String crear(Model model) {
		Pedido pedido = new Pedido();
		pedido.setCliente(new String());
		pedido.setTotalPagar(null);
		model.addAttribute("pedido", pedido);

		return "crear";
		
		
	}
	

	@RequestMapping(value = "/guardar", method = { RequestMethod.POST, RequestMethod.PUT })
	public String pedido(@PathVariable(value = "id") Long id, @PathVariable(value = "estado") String estado,
			@PathVariable(value = "cliente") String cliente, @PathVariable(value = "producto") String producto,
			Model model) throws ParseException {

		Cliente cli2 = clienteRepo.findById(id).get();
		if (cli2 == null)
			return "redirect:/error";

		Pedido pedido = new Pedido();
	   
		pedido.setFechaDeEntrega(null);
		pedido.setTotalPagar(null);
		model.addAttribute("pedidos", pedido);
		repo.save(pedido);
		return "redirect:/pedido/listado";
	
	}
	
	
	
	

	
	
	
	
	
	
	
	
	

}
