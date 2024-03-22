package com.juegos.juego.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juegos.juego.modelo.Enemigos;
import com.juegos.juego.service.EnemigosService;

@RestController
@RequestMapping("/enemigos")
public class EnemigosController {
	
	@Autowired
	private EnemigosService servicio;
	
	@PostMapping("/crear")
	public ResponseEntity<List<Enemigos>> crearEnemigos() {
		
		try {
			return new ResponseEntity<>(servicio.crearEnemigos(),HttpStatusCode.valueOf(201));
		}catch (Exception msj) {
			return null;
		}
	}
	
	
}
