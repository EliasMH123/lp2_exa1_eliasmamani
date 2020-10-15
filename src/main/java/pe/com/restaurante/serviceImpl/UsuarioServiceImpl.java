package pe.com.restaurante.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.restaurante.dao.UsuarioDao;
import pe.com.restaurante.entity.Usuario;
import pe.com.restaurante.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}
}
