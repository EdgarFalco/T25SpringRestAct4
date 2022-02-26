package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Pelicula;
import main.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;

	@GetMapping("/peliculas")
	public List<Pelicula> listarPelicula() {
		return peliculaServiceImpl.listarPelicula();
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula peliculaXID(@PathVariable(name = "id") Integer codigo) {

		Pelicula pelicula_xid = new Pelicula();

		pelicula_xid = peliculaServiceImpl.peliculaXID(codigo);

		System.out.println("Pelicula XID: " + pelicula_xid);

		return pelicula_xid;
	}

	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {

		return peliculaServiceImpl.guardarPelicula(pelicula);
	}

	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name = "id") Integer codigo, @RequestBody Pelicula pelicula) {

		Pelicula pelicula_seleccionada = new Pelicula();
		Pelicula pelicula_actualizada = new Pelicula();

		pelicula_seleccionada = peliculaServiceImpl.peliculaXID(codigo);

		pelicula_seleccionada.setNombre(pelicula.getNombre());
		pelicula_seleccionada.setCalificacion_edad(pelicula.getCalificacion_edad());

		pelicula_actualizada = peliculaServiceImpl.actualizarPelicula(pelicula_seleccionada);

		System.out.println("La Pelicula actualizada es: " + pelicula_actualizada);

		return pelicula_actualizada;
	}

	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name = "id") Integer codigo) {
		peliculaServiceImpl.eliminarPelicula(codigo);
	}
}
