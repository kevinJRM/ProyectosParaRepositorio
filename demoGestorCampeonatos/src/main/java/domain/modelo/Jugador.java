package domain.modelo;

import domain.daos.JugadoresDAO;

public class Jugador {
	
	private int idJugador;
	private String tipoDocumento;
	private int numeroDocumento;
	private String nombre;
	private String apellido;
	private Integer idClub;
	private String fechaNac;
	private String categoria;
	
	// constructor para construir un jugador para un club
	public Jugador(String tipoDocumento, int numeroDocumento, String nombre, String apellido, String fechaNac, String categoria) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.categoria = categoria;
	}
	
	// constructor para cuando vuelva de la base de datos sql
	public Jugador(int idJugador, String tipoDocumento, int numeroDocumento, String nombre, String apellido, String fechaNac, String categoria) {
		this.idJugador = idJugador;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.categoria = categoria;
	}

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getIdClub() {
		return idClub;
	}

	public void setClub(Integer club) {
		this.idClub = club;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String toString() {
		return "Jugador "+idJugador+" nombre: "+nombre+" apellido: "+apellido+" numero Doc: "+numeroDocumento+" id club: "+idClub+" categoria: "+categoria;
	}
	
	public void save() {
		JugadoresDAO.getInstancia().save(this);
	}
	
	

}
