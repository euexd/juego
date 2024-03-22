package com.juegos.juego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juegos.juego.service.CombateService;

@RestController
@RequestMapping("/combate")
public class CombateController {

	@Autowired
	private CombateService servicio;

	@PostMapping("/iniciar")
	public ResponseEntity<String> iniciarCombate() {

		return null;
	}

}
