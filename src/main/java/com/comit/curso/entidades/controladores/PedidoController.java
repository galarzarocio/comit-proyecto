package com.comit.curso.entidades.controladores;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
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
import com.comit.curso.entidades.Producto;
import com.comit.curso.entidades.repositorios.ClienteRepository;
import com.comit.curso.entidades.repositorios.PedidoRepository;
import com.comit.curso.entidades.repositorios.ProductoRepository;




@Controller
@RequestMapping(value = "/pedidos")
public class PedidoController {
	
@Autowired
	PedidoRepository repo;

@Autowired
 ClienteRepository clienteRepo;

@Autowired
 ProductoRepository productoRepo;

private final Cliente cli;

private Date fecha;

private Optional<Cliente> cli2;

private Date fecha2;

 
	
	
	
	@GetMapping(value = "")
	public String listarPedidos(Model model) {

		model.addAttribute("pedidos", repo.findAll());
		return "listado";


	
	}
	

	@RequestMapping(value = "/pedido/{id}", method = { RequestMethod.POST, RequestMethod.PUT })
	public String pedido(@PathVariable(value = "id") Long id,@PathVariable(value = "fechaDeEntrega")String fechaDeEntrega,
			@PathVariable(value = "estado") Estado estado, @PathVariable(value = "cliente") Cliente cliente,
			@PathVariable(value = "producto") Producto producto, Model model)  throws ParseException {

		fecha2 = (Date) new SimpleDateFormat("yyyy-mm-dd").parse(fechaDeEntrega);

		cli2 = clienteRepo.findById(id);
	    producto.setDescripcion(fechaDeEntrega);
		producto.setDiasDeRealizacion(20);
		producto.setMarcasSoldaduras(true);
		producto.setPrecio(20000);
		producto.setRetenzor(true);
		producto.setTipoMaterial(null);


		return "redirect:/listado";
	
	}
	
	
	
	

	
	
	
	
	
	
	
	
	

}
