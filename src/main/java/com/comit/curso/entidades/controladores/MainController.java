package com.comit.curso.entidades.controladores;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.comit.curso.entidades.Admin;
import com.comit.curso.entidades.Cliente;
import com.comit.curso.entidades.repositorios.AdminRepository;
import com.comit.curso.entidades.repositorios.ClienteRepository;

@Controller
public class MainController {
	@Autowired
	 ClienteRepository clienteRepo;
	
	@Autowired
	AdminRepository adminRepo;

	private CrudRepository<Admin, Long> repo;
	
	
	
	
	
	
	
		@RequestMapping("/crear")
		public String crear(Model model) {
			Admin admin = new Admin();
			admin.setMail(new String());
			admin.setContraseña(new String());
			model.addAttribute("administrador", admin);

			return "crear";
		}
	    
		@RequestMapping(value = "/guardar", method = { RequestMethod.POST, RequestMethod.PUT })
		public String guardarAdmin(@RequestParam(value = "mail") String mail, @RequestParam(value = "contraseña") String contraseña,Model model) throws ParseException {

			Admin admin = new Admin();
			admin.setMail(mail);
			admin.setContraseña(contraseña);
			repo.save(admin);
			model.addAttribute("administrador",admin);
			return "redirect:/listado";
		}

        


}

