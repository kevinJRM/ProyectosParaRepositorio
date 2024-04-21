package domain.entityes;

import jakarta.persistence.*;

//para guardar los datos de un objeto en una tabla
@Entity
@Table(name="clubes")
public class ClubEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idClub;
    private String nombre;
    private String direccion;
	
	public ClubEntity() {}
	
	public ClubEntity(Integer idClub, String nombre, String direccion) {
		this.idClub = idClub;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Integer getIdClub() {
		return idClub;
	}

	public void setIdClub(Integer idClub) {
		this.idClub = idClub;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre ) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/*public String getDireccion() { 
		return this.direccion;
	}*/
}
