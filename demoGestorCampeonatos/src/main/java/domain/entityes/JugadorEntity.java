package domain.entityes;

import jakarta.persistence.*;

@Entity
@Table(name="jugadores")

public class JugadorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJugador;
	private int idclub;
	private String tipoDocumento;
	private int numeroDocumento;
	private String nombre;
	private String apellido;
	private String fechaNac;
	private String categoria;
	
	public JugadorEntity() { }
	
	public JugadorEntity(int idJugador, int club, String tipoDocumento, int numeroDocumento, String nombre, String apellido, String fechaNac, String categoria) {
		this.idJugador = idJugador;
		this.idclub = club;
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

	public int getIdClub() {
		return idclub;
	}

	public void setClub(int club) {
		this.idclub = club;
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

}
