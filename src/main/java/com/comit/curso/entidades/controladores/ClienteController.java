package com.comit.curso.entidades.controladores;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.comit.curso.entidades.Cliente;
import com.comit.curso.entidades.repositorios.ClienteRepository;

@Controller
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	ClienteRepository repo;
	private String localidad;

	@GetMapping(value = "")
	public String listarClientes(Model model) {

		model.addAttribute("clientes", repo.findAll());
		return "listado";

	}

	@RequestMapping(value = "/save", method = { RequestMethod.POST, RequestMethod.PUT })
	public String save(@RequestParam(value = "nombre") String nombre, @RequestParam(value = "apellido") String apellido,
			@RequestParam(value = "dni") long dni, Model model) throws ParseException {

		Cliente cliente = new Cliente(apellido, nombre, dni);
		repo.saveAndFlush(cliente);

		model.addAttribute("cliente", cliente);
		return "redirect:/listado";

	}

	@RequestMapping(value = "/edit/{id}", method = { RequestMethod.POST, RequestMethod.PUT })
	public String edit(@PathVariable(value = "id") Integer id, @RequestParam(value = "nombre") String nombre,
			@RequestParam(value = "apellido") String apellido, @RequestParam(value = "dni") Long dni, Model model)
			throws ParseException {

		Cliente cliente = new Cliente();
		cliente.setApellido(apellido);
		cliente.setNombre(nombre);
		cliente.setDni(dni);
		String direccion = null;
		cliente.setDireccion(direccion);
		cliente.setLocalidad(localidad);
		String provincia = null;
		cliente.setProvincia(provincia);
		cliente.setTelefono(null);

		repo.save(cliente);

		return "redirect:/listado";

	}

}
