package pe.com.restaurante.service;

import java.util.List;
import java.util.Map;

import pe.com.restaurante.entity.Usuario;

public interface UsuarioService {
	
	Usuario read(int id);
	List<Map<String,Object>> readAll();
}
