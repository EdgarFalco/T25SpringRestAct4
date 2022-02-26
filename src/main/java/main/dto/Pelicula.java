package main.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pelicula")
public class Pelicula {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private int calificacion_edad;

	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Sala> sala;

	// Constructores
	public Pelicula() {
	}

	public Pelicula(int codigo, String nombre, int calificacion_edad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
	}

	// Getters and Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalificacion_edad() {
		return calificacion_edad;
	}

	public void setCalificacion_edad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sala")
	public List<Sala> getSala() {
		return sala;
	}

	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	// ToString
	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacion_edad=" + calificacion_edad + "]";
	}
}