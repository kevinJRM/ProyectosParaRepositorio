package domain.entityes;

import jakarta.persistence.*;

@Entity
@Table(name="partidos")
public class PartidoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPartido;
	private int nroFecha;
	private int nroZona;
	private int categoria;
	private int idClubLocal;
	private int idClubVisitante;
	private int golesLocal;
	private int golesVisitante;
	private String fechaPartido;
	private int validadoLocal;
	private int validadoVisitante;
	private int idCampeonato;
	
	// para codigo de emanuel
	//private List<JugadorEntity> jugadoresVisitante;
	//private List<JugadorEntity> jugadoresLocales;
	
	public PartidoEntity() { }
	
	public PartidoEntity(Integer idPartido, int nroFecha, int nroZona, int categoria, int idClubLocal, int idClubVisitante, int golesLocal, int golesVisitante, String fechaPartido, int validadoLocal, int validadoVisitante, int idCampeonato) {
		this.idPartido = idPartido;
		this.nroFecha = nroFecha;
		this.nroZona = nroZona;
		this.categoria = categoria;
		this.idClubLocal = idClubLocal;
		this.idClubVisitante = idClubVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.fechaPartido = fechaPartido;
		this.validadoLocal = validadoLocal;
		this.validadoVisitante = validadoVisitante;
		this.idCampeonato = idCampeonato;
	}

	public Integer getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Integer idPartido) {
		this.idPartido = idPartido;
	}

	public int getNroFecha() {
		return nroFecha;
	}

	public void setNroFecha(int nroFecha) {
		this.nroFecha = nroFecha;
	}

	public int getNroZona() {
		return nroZona;
	}

	public void setNroZona(int nroZona) {
		this.nroZona = nroZona;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getIdClubLocal() {
		return idClubLocal;
	}

	public void setIdClubLocal(int idClubLocal) {
		this.idClubLocal = idClubLocal;
	}

	public int getIdClubVisitante() {
		return idClubVisitante;
	}

	public void setIdClubVisitante(int idClubVisitante) {
		this.idClubVisitante = idClubVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public String getFechaPartido() {
		return fechaPartido;
	}

	public void setFechaPartido(String fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	public int getValidadoLocal() {
		return validadoLocal;
	}

	public void setValidadoLocal(int validadoLocal) {
		this.validadoLocal = validadoLocal;
	}

	public int getValidadoVisitante() {
		return validadoVisitante;
	}

	public void setValidadoVisitante(int validadoVisitante) {
		this.validadoVisitante = validadoVisitante;
	}

	public int getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	
	// para el codigo de emanuel
	/*
	public List<JugadorEntity> getJugadoresVisitante() {
		return jugadoresVisitante;
	}

	public void setJugadoresVisitante(List<JugadorEntity> jugadoresVisitante) {
		this.jugadoresVisitante = jugadoresVisitante;
	}

	public List<JugadorEntity> getJugadoresLocales() {
		return jugadoresLocales;
	}

	public void setJugadoresLocales(List<JugadorEntity> jugadoresLocales) {
		this.jugadoresLocales = jugadoresLocales;
	}*/
}
