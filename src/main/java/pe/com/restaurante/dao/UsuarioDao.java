package pe.com.restaurante.dao;

import java.util.List;
import java.util.Map;

import pe.com.restaurante.entity.Usuario;

public interface UsuarioDao {
	
	Usuario read(int id);
	List<Map<String,Object>> readAll();
	
	public Usuario read(String nomuser);
	
}
