package com.juegos.juego.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juegos.juego.constants.PersonajesClases;
import com.juegos.juego.modelo.Personajes;
import com.juegos.juego.repository.PersonajesRepository;

@Service
public class PersonajesService implements CrearPersonajeInicialInterface {
	
	@Autowired
	private PersonajesRepository personajeRepository;
	
	public Personajes obtenerPersonaje(String name) {
		
		return personajeRepository.findByname(name);
		
	}
	
	public String personajeACrear(Personajes personaje) {
		
		Personajes creado = new Personajes();
		String respuesta = "";
		
		if(personaje.getClase().equalsIgnoreCase(PersonajesClases.MAGO.clase)) {
			creado = crearMago(personaje);
			if (creado != null) {
				respuesta = "Mago creado con éxito.";
			}
		}
		else if(personaje.getClase().equalsIgnoreCase(PersonajesClases.GUERRERO.clase)){
			creado = crearGuerrero(personaje);
			if (creado != null) {
				respuesta = "Guerrero creado con éxito.";
			}
		}
		else if(personaje.getClase().equalsIgnoreCase(PersonajesClases.ARQUERO.clase)){
			creado = crearArquero(personaje);
			if (creado != null) {
				respuesta = "Arquero creado con éxito.";
			}
		}
		else {
			// dar un error
			respuesta = "No se pudo crear el personaje, las clases aceptadas son: mago, guerrero o arquero.";
		}
		
		creado = personajeRepository.save(creado);
		return respuesta;
		
	}

	@Override
	public Personajes crearMago(Personajes mago) {
		Personajes personajeMago = new Personajes();
		personajeMago.setName(mago.getName());
		personajeMago.setClase(mago.getClase());
		personajeMago.setNivel(1);
		personajeMago.setExperiencia(0);
		personajeMago.setInteligencia(10);
		personajeMago.setFuerza(4);
		personajeMago.setAgilidad(6);
		personajeMago.setDefensaFisica(2);
		personajeMago.setDefensaMagica(6);
		personajeMago.setHp(1000);
		personajeMago.setMaxHp(1000);
		personajeMago.setMp(600);
		personajeMago.setMaxMp(600);
		
		return personajeMago;
		
	}

	@Override
	public Personajes crearGuerrero(Personajes guerrero) {
		Personajes personajeGuerrero = new Personajes();
		personajeGuerrero.setName(guerrero.getName());
		personajeGuerrero.setClase(guerrero.getClase());
		personajeGuerrero.setNivel(1);
		personajeGuerrero.setExperiencia(0);
		personajeGuerrero.setInteligencia(3);
		personajeGuerrero.setFuerza(10);
		personajeGuerrero.setAgilidad(7);
		personajeGuerrero.setDefensaFisica(6);
		personajeGuerrero.setDefensaMagica(2);
		personajeGuerrero.setHp(1300);
		personajeGuerrero.setMaxHp(1300);
		personajeGuerrero.setMp(300);
		personajeGuerrero.setMaxMp(300);
		
		return personajeGuerrero;
	}
	
	@Override
	public Personajes crearArquero(Personajes arquero) {
		Personajes personajeArquero = new Personajes();
		personajeArquero.setName(arquero.getName());
		personajeArquero.setClase(arquero.getClase());
		personajeArquero.setNivel(1);
		personajeArquero.setExperiencia(0);
		personajeArquero.setInteligencia(5);
		personajeArquero.setFuerza(5);
		personajeArquero.setAgilidad(10);
		personajeArquero.setDefensaFisica(4);
		personajeArquero.setDefensaMagica(4);
		personajeArquero.setHp(1000);
		personajeArquero.setMaxHp(1000);
		personajeArquero.setMp(450);
		personajeArquero.setMaxMp(450);
		
		return personajeArquero;
		
	}
}
