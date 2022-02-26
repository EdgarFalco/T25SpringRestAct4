package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Pelicula;

public interface IPeliculaDao extends JpaRepository<Pelicula, Integer> {

}
