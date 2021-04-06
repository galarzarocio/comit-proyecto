package com.comit.curso.entidades.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comit.curso.entidades.repositorios.ClienteRepository;

@Controller
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	ClienteRepository repo;

	@GetMapping(value = "")
	public String listarClientes(Model model) {

		model.addAttribute("clientes", repo.findAll());
		return "listado";
	}
}
