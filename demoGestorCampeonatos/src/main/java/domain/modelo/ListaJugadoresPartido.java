package domain.modelo;

import java.util.List;

public class ListaJugadoresPartido {
	
	private Integer idLista;
	private List<Integer> idJugador;
	private List<Integer> idClub;
	private int idPartido;
	
	public ListaJugadoresPartido (List<Integer> idJugador, List<Integer> idClub, int idPartido) {
		this.idJugador = idJugador;
		this.idClub = idClub;
		this.idPartido = idPartido;
	}
	
	public ListaJugadoresPartido (int idLista, List<Integer> idJugador, List<Integer> idClub, int idPartido) {
		this.idLista = idLista;
		this.idJugador = idJugador;
		this.idClub = idClub;
		this.idPartido = idPartido;
	}

	public int getIdLista() {
		return idLista;
	}

	public void setIdLista(int idLista) {
		this.idLista = idLista;
	}

	public List<Integer> getIdJugadores() {
		return idJugador;
	}

	public void setIdJugadores(List<Integer> idJugador) {
		this.idJugador = idJugador;
	}

	public List<Integer> getIdClub() {
		return idClub;
	}

	public void setIdClub(List<Integer> idClub) {
		this.idClub = idClub;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	
	/*
	public void save() {
		ListaJugadoresPartidoDAO.getInstancia().save(this);
	}*/
	
	
}
