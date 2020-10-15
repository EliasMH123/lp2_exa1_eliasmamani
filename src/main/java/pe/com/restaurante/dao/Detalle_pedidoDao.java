package pe.com.restaurante.dao;

import java.util.List;
import java.util.Map;

import pe.com.restaurante.entity.Detalle_pedido;

public interface Detalle_pedidoDao {
	
	Detalle_pedido read(int id);
	List<Map<String,Object>> readAll();
}
