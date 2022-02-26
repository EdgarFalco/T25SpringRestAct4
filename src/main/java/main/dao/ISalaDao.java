package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Sala;

public interface ISalaDao extends JpaRepository<Sala, Integer> {

}
