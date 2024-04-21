package domain.Adaptador;

import domain.modelo.Campeonato;
import domain.modelo.Club;

import java.util.List;

public class cargaDeNuevosRegistros {
	
	private List<Club> clubes;
	private List<Campeonato> campeonatos;
	
	public List<Club> getClubes() {
		return clubes;
	}
	public void setClubes(List<Club> clubes) {
		this.clubes = clubes;
	}
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	
	

}
