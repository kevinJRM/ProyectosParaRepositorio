package domain.modelo;

import domain.daos.FaltaDAO;

public class Falta {
	private int idFalta;
	private Jugador jugador;
	private int minuto;
	private String tipo;
	
	// variables para encontrar su clase
	private int idCampeonato;
	private int idPartido;
	
	// crear nueva falta
	public Falta(Jugador jugador, int minuto, String tipo) {
		this.jugador = jugador;
		this.minuto = minuto;
		this.tipo = tipo;
	}
	
	// caundo venga de sql
	public Falta(int idFalta, Jugador jugador, int minuto, String tipo) {
		this.idFalta = idFalta;
		this.jugador = jugador;
		this.minuto = minuto;
		this.tipo = tipo;
	}
	
	public int getIdFalta() {
		return idFalta;
	}
	public int getIdPartido() {
		return idPartido;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public int getIdCampeonato() {
		return idCampeonato;
	}
	public int getMinuto() {
		return minuto;
	}
	public String getTipo() {
		return tipo;
	}

	public void setIdFalta(int idFalta) {
		this.idFalta = idFalta;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void save() {
		FaltaDAO.getInstancia().save(this);
	}
	
}
