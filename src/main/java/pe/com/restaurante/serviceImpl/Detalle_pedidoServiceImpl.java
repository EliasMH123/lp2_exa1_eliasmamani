package pe.com.restaurante.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.restaurante.service.Detalle_pedidoService;
import pe.com.restaurante.dao.Detalle_pedidoDao;
import pe.com.restaurante.entity.Detalle_pedido;

@Service
public class Detalle_pedidoServiceImpl implements Detalle_pedidoService{

	@Autowired
	private Detalle_pedidoDao detalle_pedidoDao;

	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.readAll();
	}
}
