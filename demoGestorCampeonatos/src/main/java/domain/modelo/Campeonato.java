package domain.modelo;

import domain.daos.CampeonatoDAO;

import java.util.ArrayList;
import java.util.List;

public class  Campeonato{
	
    private Integer idCampeonato;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    
    // variables para el codigo de emanuel
    private int cantidadJugadores; // esto se usa para hacer la tabla en Controller
    private List<Partido> partidos;
    private String categoria; // esto se usa para hacer la tabla en Controller
    
    private List<ClubesCampeonato> clubescampeonatos;
    
    // constructor para construir un nuevo campeonato
    public Campeonato(String descripcion, String fechaInicio,String fechaFin,String estado) {
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.partidos = new ArrayList<>();
        this.clubescampeonatos = new ArrayList<>();
    }
    
    // constructor para cuando venga de sql
    public Campeonato(Integer idCampeonato,String descripcion, String fechaInicio,String fechaFin,String estado) {
        this.idCampeonato = idCampeonato;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.partidos = new ArrayList<>();
        this.clubescampeonatos = new ArrayList<>();
    }
    
    public Integer getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(Integer idCampeonato) {
		this.idCampeonato = idCampeonato;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public String getfechaFin() {
		return fechaFin;
	}
	
	public void setfechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
    
	public String toString() {
		return "Campeonato: "+idCampeonato+" Descripcion: "+descripcion+" Fecha Inicio: "+fechaInicio+" Fecha Fin: "+fechaFin+" Estado: "+estado;
	}
	
	public void save() {
		CampeonatoDAO.getInstancia().save(this);
	}
	
	public void saveSolo() {
		CampeonatoDAO.getInstancia().saveSolo(this);
	}
	
	// metodo para el codigo de emanuel
	public List<Partido> getPartidos() {
		return partidos;
	}
	
	public int getCantidadJugadores() {
		return cantidadJugadores;
	}
	
	public void setCantidadJugadores(int cantidadJugadores) {
		this.cantidadJugadores = cantidadJugadores;
	}

	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
	}

	public Partido buscarPartido(int id) {
		for(Partido p : this.partidos) {
			if (p.getIdPartido() == id) {
				return p;
			}
		}
		return null;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void agregarCC(ClubesCampeonato clubescampeonato) {
		this.clubescampeonatos.add(clubescampeonato);
	}
	
	public List<ClubesCampeonato> getCC() {
		
		return clubescampeonatos;
	}
	

}