package com.juegos.juego.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="turnos")
public class Turnos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="turno")
	private boolean turno;
	
	@Column(name="jugador_id")
	private Integer jugadorId;
	
	@Column(name="enemigo_id")
	private Integer enemigoId;
	
	@Column(name="b_combate_termino")
	private boolean bCombateTermino;
	
	public Turnos() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	public Integer getJugadorId() {
		return jugadorId;
	}

	public void setJugadorId(Integer jugadorId) {
		this.jugadorId = jugadorId;
	}

	public Integer getEnemigoId() {
		return enemigoId;
	}

	public void setEnemigoId(Integer enemigoId) {
		this.enemigoId = enemigoId;
	}

	public boolean isbCombateTermino() {
		return bCombateTermino;
	}

	public void setbCombateTermino(boolean bCombateTermino) {
		this.bCombateTermino = bCombateTermino;
	}
	
}
