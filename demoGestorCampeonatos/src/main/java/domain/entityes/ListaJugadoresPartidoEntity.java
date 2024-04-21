package domain.entityes;

import jakarta.persistence.*;

@Entity
@Table(name="listaJugadoresPartido")
public class ListaJugadoresPartidoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLista;
	private int idJugador;
	private int idClub;
	private int idPartido;
	
	public ListaJugadoresPartidoEntity() {}

	public ListaJugadoresPartidoEntity (Integer idLista, int idJugador, int idClub, int idPartido) {
		this.idLista = idLista;
		this.idJugador = idJugador;
		this.idClub = idClub;
		this.idPartido = idPartido;
	}
	
	// constructor para el codigo de emanuel
	public ListaJugadoresPartidoEntity (int idJugador, int idClub, int idPartido) {
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

	public Integer getIdJugadores() {
		return idJugador;
	}

	public void setIdJugadores(Integer idJugador) {
		this.idJugador = idJugador;
	}

	public Integer getIdClub() {
		return idClub;
	}

	public void setIdClub(Integer idClub) {
		this.idClub = idClub;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
}
