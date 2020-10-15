package pe.com.restaurante.service;

import java.util.List;
import java.util.Map;

import pe.com.restaurante.entity.Detalle_pedido;

public interface Detalle_pedidoService {

	Detalle_pedido read(int id);
	List<Map<String,Object>> readAll();
}
