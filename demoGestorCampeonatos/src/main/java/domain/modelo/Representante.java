package domain.modelo;

import domain.daos.RepresentantesDAO;

public class Representante {
	
	private int idRepresentante;
	private String nombre;
	private String documento;
	private int idClub;
	
	// constructor para cuando se construya un representante para un club
	public Representante(String nombre, String documento) {
		this.nombre = nombre;
		this.documento = documento;
	}
	
	// constructor para cuando se cargue un representante que vino de sql para el club que corresponde
	public Representante(int idRepresentante, String nombre, String documento) {
		this.idRepresentante = idRepresentante;
		this.nombre = nombre;
		this.documento = documento;
	}

	public int getIdRepresentante() {
		return idRepresentante;
	}

	public void setIdRepresentante(int idRepresentante) {
		this.idRepresentante = idRepresentante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public int getIdClub() {
		return idClub;
	}

	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}
	
	public void save() {
		RepresentantesDAO.getInstancia().save(this);
	}

}
