package com.juegos.juego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juegos.juego.modelo.Personajes;
import com.juegos.juego.service.PersonajesService;

@RestController
@RequestMapping("/personajes")
public class PersonajesController {
	
	@Autowired
	private PersonajesService servicio;
	
	@GetMapping("/{name}")
	public ResponseEntity<Personajes> obtenerPersonaje(@PathVariable String name){
		
		try {
			return new ResponseEntity<>(servicio.obtenerPersonaje(name),HttpStatusCode.valueOf(200));
		}catch (Exception msj) {
			return new ResponseEntity<>(null,HttpStatusCode.valueOf(406));
		}
		
		
	}
	
	@PostMapping("/crear")
	public ResponseEntity<String> crearPersonajes(@RequestBody Personajes personajeACrear) {
		
		try {
			return new ResponseEntity<>(servicio.personajeACrear(personajeACrear),HttpStatusCode.valueOf(201));
		}catch (Exception msj) {
			return new ResponseEntity<>("Lo sentimos, no pudimos crear el personaje.",HttpStatusCode.valueOf(406));
		}
	}
	
	
}
