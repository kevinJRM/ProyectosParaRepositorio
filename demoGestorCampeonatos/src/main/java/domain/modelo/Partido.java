package domain.modelo;

import domain.daos.PartidoDAO;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	
	private Integer idPartido;
	private int nroFecha;
	private int nroZona;
	private int categoria;
	private Integer idClubLocal;
	private Integer idClubVisitante;
	private int golesLocal;
	private int golesVisitante;
	private String fechaPartido;
	private int validadoLocal;
	private int validadoVisitante;
	private int idCampeonato;
	
	// variables para el codigo de emanuel
	private List<Falta> faltas;
	private List<Gol> goles;
	private List<Jugador> jugadoresVisitante;
	private List<Jugador> jugadoresLocales;
	
	// constructor para cuando venga de sql
	public Partido(Integer idpartido, int nroFecha, int nroZona, int categoria, Integer idClubLocal, Integer idClubVisitante, int golesLocal, int golesVisitante, String fechaPartido, int validadoLocal, int validadoVisitante, int idCampeonato) {
		this.idPartido = idpartido;
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
		
		this.faltas = new ArrayList<>();
		this.goles = new ArrayList<>();
		this.jugadoresVisitante = new ArrayList<>();
		this.jugadoresLocales = new ArrayList<>();
	}
	
	// constructor para construir un nuevo partido
	public Partido(int nroFecha, int nroZona, int categoria, Integer idClubLocal, Integer idClubVisitante, int golesLocal, int golesVisitante, String fechaPartido, int validadoLocal, int validadoVisitante) {
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
		
		this.faltas = new ArrayList<>();
		this.goles = new ArrayList<>();
		this.jugadoresVisitante = new ArrayList<>();
		this.jugadoresLocales = new ArrayList<>();
	}

	public Integer getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Integer idPartidos) {
		this.idPartido = idPartidos;
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

	public Integer getIdClubLocal() {
		return idClubLocal;
	}

	public void setIdClubLocal(Integer idClubLocal) {
		this.idClubLocal = idClubLocal;
	}

	public Integer getIdClubVisitante() {
		return idClubVisitante;
	}

	public void setIdClubVisitante(Integer idClubVisitante) {
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

	public void setValidadoLocal(char validadoLocal) {
		this.validadoLocal = validadoLocal;
	}

	public int getValidadoVisitante() {
		return validadoVisitante;
	}

	public void setValidadoVisitante(char validadoVisitante) {
		this.validadoVisitante = validadoVisitante;
	}

	public int getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	
	public String toString() {
		return "ID Partido:"+idPartido+" Numero Fecha:"+nroFecha+" Numero Zona:"+nroZona+" Categoria:"+categoria+"\nID Club Local:"+idClubLocal+" ID Club Visitante:"+idClubVisitante+" Goles Locales:"+golesLocal+" Goles Visitante:"+golesVisitante+"\nFecha de Partido:"+fechaPartido+" Validado Local:"+validadoLocal+" Validado Visitante:"+validadoVisitante+" ID Campeonato:"+idCampeonato;
	}
	
	public void save() {
		PartidoDAO.getInstancia().save(this);
	}
	
	public void saveSolo() {
		PartidoDAO.getInstancia().saveSolo(this);
	}
	
	// metodos para el codigo de emanuel
	public Object getNombreLocal() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNombreVisitante() {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarGol(Gol gol) {
		this.goles.add(gol);
	}

	public void agregarFalta(Falta falta) {
		this.faltas.add(falta);
		
	}
	
	public List<Falta> getFaltas(){
		return faltas;
	}
	
	public List<Gol> getGoles(){
		return goles;
	}
	
	public List<Jugador> getJugadoresVisitante(){
		return jugadoresVisitante;
	}
	
	public List<Jugador> getJugadoresLocales(){
		return jugadoresLocales;
	}
	
	public void agregarJugadorLocal(Jugador jugador) {
		this.jugadoresLocales.add(jugador);
	}
	public void agregarJugadorVisitante(Jugador jugador) {
		this.jugadoresVisitante.add(jugador);
	}

}
