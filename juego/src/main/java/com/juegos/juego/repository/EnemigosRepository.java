package com.juegos.juego.repository;

import org.springframework.data.repository.CrudRepository;

import com.juegos.juego.modelo.Enemigos;

public interface EnemigosRepository extends CrudRepository<Enemigos, Integer> {
	
	Enemigos findByname(String name);
}
