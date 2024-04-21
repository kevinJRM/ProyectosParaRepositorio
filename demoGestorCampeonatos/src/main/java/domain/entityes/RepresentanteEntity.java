package domain.entityes;

import jakarta.persistence.*;

@Entity
@Table(name="representantes")
public class RepresentanteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRepresentante;
	private String nombre;
	private String documento;
	//el idclub es para guardar en el club al que pertenece, esto viene de sql
	private int idClub;
	
	public RepresentanteEntity() { }
	
	// este constructor es para cuando venga de sql y se pueda construir con la idclub que corresponde
	public RepresentanteEntity(int idRepresentante, String nombre, String documento, int idClub) {
		this.idRepresentante = idRepresentante;
		this.nombre = nombre;
		this.documento = documento;
		this.idClub = idClub;
	}
	
	// para cuando se cree un nuevo tipo de representante para sql
	public RepresentanteEntity(String nombre, String documento, int idClub) {
		this.nombre = nombre;
		this.documento = documento;
		this.idClub = idClub;
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

}
