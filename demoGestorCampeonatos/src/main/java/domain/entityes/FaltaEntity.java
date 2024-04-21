package domain.entityes;

import jakarta.persistence.*;

@Entity
@Table(name="faltas")
public class FaltaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFalta;
	private int idPartido;
	private int idJugador;
	private int idCampeonato;
	private int minuto;
	private String tipo;
	
	public FaltaEntity()  {}
	
	public FaltaEntity(int idFalta, int idPartido, int idJugador, int idCampeonato, int minuto, String falta) {
		this.idFalta = idFalta;
		this.idPartido = idPartido;
		this.idJugador = idJugador;
		this.idCampeonato = idCampeonato;
		this.minuto = minuto;
		this.tipo = falta;
	}

	public int getIdFalta() {
		return idFalta;
	}

	public void setIdFalta(int idFalta) {
		this.idFalta = idFalta;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public int getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
