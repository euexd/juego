package com.juegos.juego.factory;

public class EnemigosFactory {
	
	public IEnemigos crearEnemigo(int index) {
		
		switch(index) {
		case 1: return new Slime();
		case 2: return new Goblin();
		case 3: return new Drake();
		}
		
		return null;
		
	}

}
