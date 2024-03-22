package com.juegos.juego.service;

import com.juegos.juego.modelo.Personajes;

public interface CrearPersonajeInicialInterface {
	Personajes crearMago(Personajes mago);
	Personajes crearGuerrero(Personajes guerrero);
	Personajes crearArquero(Personajes arquero);
}
