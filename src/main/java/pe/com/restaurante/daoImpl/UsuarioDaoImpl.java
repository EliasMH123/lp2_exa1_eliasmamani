package pe.com.restaurante.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.com.restaurante.dao.UsuarioDao;
import pe.com.restaurante.entity.Usuario;
@Repository
public class UsuarioDaoImpl implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

@Override
public Usuario read(int id) {
	// TODO Auto-generated method stub
	String SQL = "select *from usuario where idpersona=?";
	return jdbcTemplate.queryForObject(SQL,new Object[] {id},new BeanPropertyRowMapper<Usuario>(Usuario.class));
}

@Override
public List<Map<String, Object>> readAll() {
	// TODO Auto-generated method stub
	String SQL = "select *from usuario";
	return jdbcTemplate.queryForList(SQL);
}
public Usuario read(String nomuser) {
	String SQL = "select *from usuario Where nomuser=?";
	return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
}
}
