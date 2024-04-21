package domain.modelo;

import domain.daos.ClubDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Club {
    private Integer idClub;
    private String nombre;
    private String direccion;
    
    // variables para el codigo de emanuel
    private Representante representante;
    private TablaPosiciones tablaposiciones;
    private List<Jugador> jugadores;
    
    private List<ClubesCampeonato> clubescampeonatos;
    
    // este es para cuando se construya un nuevo club
    public Club(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.jugadores = new ArrayList<>();
        this.clubescampeonatos = new ArrayList<>();
    }
    
    // este es para cuando el club se construya al venir de la base de datos de sql
    public Club(Integer idClub,String nombre, String direccion) {
        this.idClub = idClub;
        this.nombre = nombre;
        this.direccion = direccion;
        this.jugadores = new ArrayList<>();
        this.clubescampeonatos = new ArrayList<>();
    }
    
    public Integer getIdClub() {
		return idClub;
	}

	public void setIclub(Integer idClub) {
		this.idClub = idClub;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		return "Club "+idClub+": "+nombre;
	}
	
	public void save() {
		ClubDAO.getInstancia().save(this);
	}
	
	public void saveSolo() {
		ClubDAO.getInstancia().saveSolo(this);
	}
	
	// metodos para el codigo de emanuel
	public void setTabla(TablaPosiciones tablaposiciones) {
		this.tablaposiciones = tablaposiciones;
	}

	public void agregarRepresentante(Representante representante) {
		this.representante = representante;
	}

	public void agregarJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	public int cantJugadores(String categoria) {
		return this.jugadores.stream().filter(jugador -> jugador.getCategoria().equals(categoria)).collect(Collectors.toList()).size();
	}

	public Representante getRepresentante() {
		return representante;
	}
	
	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public TablaPosiciones getTablaposiciones() {
		return tablaposiciones;
	}

	public void setTablaposiciones(TablaPosiciones tablaposiciones) {
		this.tablaposiciones = tablaposiciones;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}
	
	public void setJugadores(List<Jugador> jugadores) {
		
		if (this.idClub != null) {
			List<Jugador> lj = new ArrayList<>();
			for(int i=0 ; i<jugadores.size() ; i++) {
				if (jugadores.get(i).getIdClub() == null) {
					Jugador j = jugadores.get(i);
					j.setClub(this.idClub);
					lj.add(j);
				}
			}
			this.jugadores = jugadores;
		} else {
			this.jugadores = jugadores;
		}
		
	}
	
	public Jugador buscarJugador(int id) { // este buscar va en clubes
		for(Jugador jugador : this.jugadores) {
			if(jugador.getIdJugador() == id) {
				return jugador;
			}
		}
		return null;
	}
	
	public void agregarCC(ClubesCampeonato clubescampeonato) {
		this.clubescampeonatos.add(clubescampeonato);
	}

	public List<ClubesCampeonato> getCC() {
		
		return clubescampeonatos;
	}
	
}