package com.juegos.juego.repository;

import org.springframework.data.repository.CrudRepository;

import com.juegos.juego.modelo.Personajes;

public interface PersonajesRepository extends CrudRepository<Personajes, Integer> {
	
	Personajes findByname(String name);
}
