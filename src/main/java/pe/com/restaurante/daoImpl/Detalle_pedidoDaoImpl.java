package pe.com.restaurante.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.com.restaurante.dao.Detalle_pedidoDao;
import pe.com.restaurante.entity.Detalle_pedido;
@Repository
public class Detalle_pedidoDaoImpl implements Detalle_pedidoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select *from persona where idpersona=?";
		return jdbcTemplate.queryForObject(SQL,new Object[] {id},new BeanPropertyRowMapper<Detalle_pedido>(Detalle_pedido.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from detalle_pedido";
		return jdbcTemplate.queryForList(SQL);
	}
}
