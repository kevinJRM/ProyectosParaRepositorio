package domain.entityes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tablaPosiciones")
public class TablaPosicionesEntity {
	
	@Id
	private int idClub;
	private int cantidadJugados;
	private int cantidadganados;
	private int cantidadempatados;
	private int cantidadperdidos;
	private int golesFavor;
	private int golesContra;
	private int diferenciaGoles;
	private int puntos;
	private Double promedio;
	
	public TablaPosicionesEntity() {}
	
	public TablaPosicionesEntity(int idClub,  int cantidadJugados,  int cantidadGanados,  int cantidadPerdidos,  int cantidadEmpatados,  int golesFavor,  int golesContra, int diferenciaGoles , int puntos,  Double promedio) {
		this.idClub = idClub;
		this.cantidadJugados = cantidadJugados;
		this.cantidadganados = cantidadGanados;
		this.cantidadperdidos = cantidadPerdidos;
		this.cantidadempatados = cantidadEmpatados;
		this.golesFavor = golesFavor;
		this.golesContra = golesContra;
		this.diferenciaGoles = diferenciaGoles;
		this.puntos = puntos;
		this.promedio = promedio;
	}

	public int getIdClub() {
		return idClub;
	}

	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}

	public int getCantidadJugados() {
		return cantidadJugados;
	}

	public void setCantidadJugados(int cantidadJugadores) {
		this.cantidadJugados = cantidadJugadores;
	}

	public int getCantidadGanados() {
		return cantidadganados;
	}

	public void setCantidadGanados(int cantidadGanados) {
		this.cantidadganados = cantidadGanados;
	}

	public int getCantidadPerdidos() {
		return cantidadperdidos;
	}

	public void setCantidadPerdidos(int cantidadPerdidos) {
		this.cantidadperdidos = cantidadPerdidos;
	}

	public int getCantidadEmpatados() {
		return cantidadempatados;
	}

	public void setCantidadEmpatados(int cantidadEmpatados) {
		this.cantidadempatados = cantidadEmpatados;
	}

	public int getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	public int getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}
	
	public int getDiferenciaGoles() {
		return diferenciaGoles;
	}

	public void setDiferenciaGoles(int diferenciaGoles) {
		this.diferenciaGoles = diferenciaGoles;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}
	
	
}
