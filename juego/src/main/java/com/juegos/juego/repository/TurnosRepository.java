package com.juegos.juego.repository;

import org.springframework.data.repository.CrudRepository;

import com.juegos.juego.modelo.Turnos;

public interface TurnosRepository extends CrudRepository<Turnos, Integer>{
	
	Turnos findByjugadorId(Integer id);
	Turnos findByenemigoId(Integer id);

}
