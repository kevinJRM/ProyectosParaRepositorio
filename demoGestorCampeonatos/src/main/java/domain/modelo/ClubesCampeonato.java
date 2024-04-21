package domain.modelo;

import domain.daos.ClubesCampeonatoDAO;

public class ClubesCampeonato {
	
	private Integer idClubesCampeonato;
	private Club club;
	private Campeonato campeonato;
	
	// para cuando venga de sql
	public ClubesCampeonato (int idClubesCampeonato, Club club, Campeonato campeonato) {
		this.idClubesCampeonato = idClubesCampeonato;
		this.club = club;
		this.campeonato = campeonato;
		this.club.agregarCC(this);
		this.campeonato.agregarCC(this);
	}
	
	// para una clase clubescampeonato
	public ClubesCampeonato (Club club, Campeonato campeonato) {
		this.club = club;
		this.campeonato = campeonato;
		this.club.agregarCC(this);
		this.campeonato.agregarCC(this);
	}

	public int getIdClubesCampeonato() {
		return idClubesCampeonato;
	}

	public void setidClubesCampeonato(int idClubesCampeonato) {
		this.idClubesCampeonato = idClubesCampeonato;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	public String toString() {
		return "Id Club Campeonato: "+idClubesCampeonato+" Id Club: "+0+" Id Campeonato: "+0;
	}
	
	public void save() {
		ClubesCampeonatoDAO.getInstancia().save(this);
	}
	
}
