package com.comit.curso.entidades.controladores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.comit.curso.entidades.Cliente;
import com.comit.curso.entidades.Estado;
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
	public String crear() {
		return "crearPedido";

	}

	@RequestMapping(value = "/guardar", method = { RequestMethod.POST, RequestMethod.PUT })
	public String pedido(@RequestParam(value = "idCliente") Long idCliente,
			@RequestParam(value = "estado") String estado, @RequestParam(value = "totalPagar") Integer totalPagar,
			@RequestParam(value = "descripcion") String descripcion,
			@RequestParam(value = "tipoDeMaterial") String tipoDeMaterial,
			@RequestParam(value = "fechaDeEntrega") String fechaDeEntrega,
			@RequestParam(value = "marcasDeSoldaduras", required = false) Boolean marcasDeSoldaduras,
			@RequestParam(value = "retenzor", required = false) Boolean retenzor, Model model) throws ParseException {

		Cliente cli2 = clienteRepo.findById(idCliente).get();
		if (cli2 == null)
			return "redirect:/error";

		Pedido pedido = new Pedido();

		Date fecha = new SimpleDateFormat("dd-MM-yyyy").parse(fechaDeEntrega);

		pedido.setFechaDeEntrega(fecha);
		pedido.setTotalPagar(totalPagar);
		pedido.setEstado(Estado.valueOf(estado));
		pedido.setCliente(cli2);

		model.addAttribute("pedidos", repo.findAll());
		repo.save(pedido);
		return "redirect:/pedido/listado";

	}

}
