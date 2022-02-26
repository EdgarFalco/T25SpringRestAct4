package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.ISalaDao;
import main.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	ISalaDao iSalaDao;

	@Override
	public List<Sala> listarSala() {

		return iSalaDao.findAll();
	}

	@Override
	public Sala salaXID(Integer id) {

		return iSalaDao.findById(id).get();
	}

	@Override
	public Sala guardarSala(Sala sala) {

		return iSalaDao.save(sala);
	}

	@Override
	public Sala actualizarSala(Sala sala) {

		return iSalaDao.save(sala);
	}

	@Override
	public void eliminarSala(Integer id) {

		iSalaDao.deleteById(id);
	}
}