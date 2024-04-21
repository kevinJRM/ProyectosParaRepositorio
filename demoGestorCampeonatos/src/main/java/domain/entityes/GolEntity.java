package domain.entityes;

import jakarta.persistence.*;

//para guardar los datos de un objeto en una tabla
@Entity
@Table(name="goles")
public class GolEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idGol;
    private int idPartido;
    private int idJugador;
    private int minuto;
    private String sentido;
	
	public GolEntity() {}

	

	public GolEntity(Integer idGol, int idPartido, int idJugador, int minuto, String sentido) {
		this.idGol = idGol;
		this.idPartido = idPartido;
		this.idJugador = idJugador;
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

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
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

	
	
	

}
