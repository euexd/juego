package com.juegos.juego.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juegos.juego.factory.Drake;
import com.juegos.juego.factory.EnemigosFactory;
import com.juegos.juego.factory.Goblin;
import com.juegos.juego.modelo.Enemigos;
import com.juegos.juego.repository.EnemigosRepository;
import com.juegos.juego.factory.IEnemigos;
import com.juegos.juego.factory.Slime;

@Service
public class EnemigosService {
	
	@Autowired
	private EnemigosRepository enemigosRepository;
		
	public List<Enemigos> crearEnemigos(){
		
		List<IEnemigos> listaIEnemigos = new ArrayList<>();
		
		List<Enemigos> listaEnemigos = new ArrayList<>();
				
		EnemigosFactory enemigos = new EnemigosFactory();
		
		
		for(int i = 1; i <= 3; i++){
			
			listaIEnemigos.add(enemigos.crearEnemigo(i));
			
		}
		
		for(int i = 0; i < 3; i++) {
			
			listaEnemigos.add(transformar(listaIEnemigos.get(i)));
			
		}
		
		enemigosRepository.saveAll(listaEnemigos);
		
		return listaEnemigos;
	}
	
	private Enemigos transformar(IEnemigos enemigoATransformar) {
		
		String nombreClase = enemigoATransformar.getClass().getName();
		Enemigos nuevoEnemigo = new Enemigos();
		
		if("com.juegos.juego.factory.Slime".equals(nombreClase)) {

        	Slime enemigo = (Slime) enemigoATransformar;
        	nuevoEnemigo.setName(enemigo.getName());
        	nuevoEnemigo.setAgilidad(enemigo.getAgilidad());
        	nuevoEnemigo.setDefensaFisica(enemigo.getDefensaFisica());
        	nuevoEnemigo.setDefensaMagica(enemigo.getDefensaMagica());
        	nuevoEnemigo.setExperiencia(enemigo.getExperiencia());
        	nuevoEnemigo.setFuerza(enemigo.getFuerza());
        	nuevoEnemigo.setHp(enemigo.getHp());
        	nuevoEnemigo.setMaxHp(enemigo.getMaxHp());
        	nuevoEnemigo.setInteligencia(enemigo.getInteligencia());
        	nuevoEnemigo.setMp(enemigo.getMp());
        	nuevoEnemigo.setMaxMp(enemigo.getMaxMp());
        	nuevoEnemigo.setNivel(enemigo.getNivel());
        	nuevoEnemigo.setTipo(enemigo.getTipo());
        }
        else if ("com.juegos.juego.factory.Goblin".equals(nombreClase)){

        	Goblin enemigo1 = (Goblin) enemigoATransformar;
            nuevoEnemigo.setName(enemigo1.getName());
        	nuevoEnemigo.setAgilidad(enemigo1.getAgilidad());
        	nuevoEnemigo.setDefensaFisica(enemigo1.getDefensaFisica());
        	nuevoEnemigo.setDefensaMagica(enemigo1.getDefensaMagica());
        	nuevoEnemigo.setExperiencia(enemigo1.getExperiencia());
        	nuevoEnemigo.setFuerza(enemigo1.getFuerza());
        	nuevoEnemigo.setHp(enemigo1.getHp());
        	nuevoEnemigo.setMaxHp(enemigo1.getMaxHp());
        	nuevoEnemigo.setInteligencia(enemigo1.getInteligencia());
        	nuevoEnemigo.setMp(enemigo1.getMp());
        	nuevoEnemigo.setMaxMp(enemigo1.getMaxMp());
        	nuevoEnemigo.setNivel(enemigo1.getNivel());
        	nuevoEnemigo.setTipo(enemigo1.getTipo());
        }
        else if ("com.juegos.juego.factory.Drake".equals(nombreClase)) {

        	Drake enemigo2 = (Drake) enemigoATransformar;
            nuevoEnemigo.setName(enemigo2.getName());
        	nuevoEnemigo.setAgilidad(enemigo2.getAgilidad());
        	nuevoEnemigo.setDefensaFisica(enemigo2.getDefensaFisica());
        	nuevoEnemigo.setDefensaMagica(enemigo2.getDefensaMagica());
        	nuevoEnemigo.setExperiencia(enemigo2.getExperiencia());
        	nuevoEnemigo.setFuerza(enemigo2.getFuerza());
        	nuevoEnemigo.setHp(enemigo2.getHp());
        	nuevoEnemigo.setMaxHp(enemigo2.getMaxHp());
        	nuevoEnemigo.setInteligencia(enemigo2.getInteligencia());
        	nuevoEnemigo.setMp(enemigo2.getMp());
        	nuevoEnemigo.setMaxMp(enemigo2.getMaxMp());
        	nuevoEnemigo.setNivel(enemigo2.getNivel());
        	nuevoEnemigo.setTipo(enemigo2.getTipo());

        }
		
		return nuevoEnemigo;
	}
	
	
	
}
