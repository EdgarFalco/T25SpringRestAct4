package main.service;

import java.util.List;

import main.dto.Sala;

public interface ISalaService {

	public List<Sala> listarSala(); 
	
	public Sala salaXID(Integer id);
	
	public Sala guardarSala(Sala sala);	
		
	public Sala actualizarSala(Sala sala);
	
	public void eliminarSala(Integer id);
}
