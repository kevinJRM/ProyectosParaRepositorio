package domain.entityes;

import jakarta.persistence.*;


//para guardar los datos de un objeto en una tabla
@Entity
@Table(name="campeonatos")
public class CampeonatoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idCampeonato;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
	
	public CampeonatoEntity() {}

	public CampeonatoEntity(Integer idCampeonato, String descripcion, String fechaInicio,String fechaFin, String estado) {
		this.idCampeonato = idCampeonato;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
	}

	public Integer getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(Integer idCampeonato) {
		this.idCampeonato = idCampeonato;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion ) {
		this.descripcion = descripcion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public String getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(String fechaFin) {
			this.fechaFin = fechaFin;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
