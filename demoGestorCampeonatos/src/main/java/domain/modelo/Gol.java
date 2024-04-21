package domain.modelo;

import domain.daos.GolDAO;

public class Gol {
	
    private Integer idGol;
    private Jugador jugador;
    private int minuto;
    private String sentido;
    
    private int idPartido;
    
    public Gol(Jugador jugador, int minuto, String sentido) {
        this.jugador = jugador;
        this.minuto = minuto;
        this.sentido = sentido;
    }
    public Gol(Integer idGol, Jugador jugador, int minuto, String sentido) {
        this.idGol = idGol;
        this.jugador = jugador;
        this.minuto = minuto;
        this.sentido = sentido;
    }
    
    public Integer getIdGol() {
		return idGol;
	}

	public void setIdGol(Integer idGol) {
		this.idGol = idGol;
	}
	
	
	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public Jugador getIdJugador() {
		return jugador;
	}

	public void setIdJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public String getSentido() {
		return sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}

	
	public void save() {
		GolDAO.getInstancia().save(this);
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
}
