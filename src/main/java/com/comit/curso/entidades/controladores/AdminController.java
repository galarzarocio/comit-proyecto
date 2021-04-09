package com.comit.curso.entidades.controladores;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.comit.curso.entidades.Admin;
import com.comit.curso.entidades.repositorios.AdminRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminRepository repo;

	@RequestMapping("/crear")
	public String crear(Model model) {
		Admin admin = new Admin();
		admin.setMail(new String());
		admin.setContraseña(new String());
		model.addAttribute("administrador", admin);

		return "crear";
	}

	@RequestMapping(value = "/guardar", method = { RequestMethod.POST, RequestMethod.PUT })
	public String guardarAdmin(@RequestParam(value = "mail") String mail,
			@RequestParam(value = "contraseña") String contraseña, Model model) throws ParseException {

		Admin admin = new Admin();
		admin.setMail(mail);
		admin.setContraseña(contraseña);
		repo.save(admin);
		return "redirect:/admin/listadoAdmin";
	}

	@RequestMapping("/listadoAdmin")
	public String listado(Model model) {
		model.addAttribute("administradores", repo.findAll());
		return "listadoAdmin";
	}

}
