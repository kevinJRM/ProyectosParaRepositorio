package domain.entityes;

import jakarta.persistence.*;

@Entity
@Table(name="clubesCampeonato")
public class ClubesCampeonatoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClubesCampeonato;
	private int idClub;
	private int idCampeonato;
	
	public ClubesCampeonatoEntity() {}
	
	public ClubesCampeonatoEntity(int idClubesCampeonato, int idClub, int idCampeonato) {
		this.idClubesCampeonato = idClubesCampeonato;
		this.idClub = idClub;
		this.idCampeonato = idCampeonato;
	}
	
	// constructor para el codigo de emanuel
	public ClubesCampeonatoEntity(int idClub, int idCampeonato) {
		this.idClub = idClub;
		this.idCampeonato = idCampeonato;
	}

	public int getidClubesCampeonato() {
		return idClubesCampeonato;
	}

	public void setidClubesCampeonato(int idClubesCampeonato) {
		this.idClubesCampeonato = idClubesCampeonato;
	}

	public int getIdClub() {
		return idClub;
	}

	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}

	public int getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	
}
