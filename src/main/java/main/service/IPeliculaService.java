package main.service;

import java.util.List;

import main.dto.Pelicula;

public interface IPeliculaService {
	
	public List<Pelicula> listarPelicula();
	
	public Pelicula peliculaXID(Integer id);
	
	public Pelicula guardarPelicula(Pelicula pelicula);
			
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void eliminarPelicula(Integer id);

}
