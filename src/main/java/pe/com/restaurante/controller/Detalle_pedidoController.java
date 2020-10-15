package pe.com.restaurante.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.restaurante.service.Detalle_pedidoService;
import pe.com.restaurante.entity.Detalle_pedido;

@RestController
@RequestMapping("/detallepedidos")
public class Detalle_pedidoController {
	@Autowired
	private Detalle_pedidoService detalle_pedidoService;
	
	@GetMapping("/lista")
	public List<Map<String,Object>> listar(){
		return detalle_pedidoService.readAll();
		
	}
	@GetMapping("/{id}")
	public Detalle_pedido read(@PathVariable int id) {
		return detalle_pedidoService.read(id);
}}
