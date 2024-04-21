package domain.modelo;

import domain.daos.TablaPosicionesDAO;

public class TablaPosiciones {

	private int idClub;
	private int cantidadJugados;
	private int cantidadGanados;
	private int cantidadEmpatados;
	private int cantidadPerdidos;
	private int golesFavor;
	private int golesContra;
	private int diferenciaGoles;
	private int puntos;
	private Double promedio;
	
	/*
	public TablaPosiciones(int idClub,  int cantidadJugados,  int cantidadGanados,  int cantidadPerdidos,  int cantidadEmpatados,  int golesFavor,  int golesContra, int diferenciaGoles ,  int puntos,  Double promedio) {
		this.idClub = idClub;
		this.cantidadJugados = cantidadJugados;
		this.cantidadGanados = cantidadGanados;
		this.cantidadPerdidos = cantidadPerdidos;
		this.cantidadEmpatados = cantidadEmpatados;
		this.golesFavor = golesFavor;
		this.golesContra = golesContra;
		this.diferenciaGoles = diferenciaGoles;
		this.puntos = puntos;
		this.promedio = promedio;	
	}*/
	
	public TablaPosiciones(int cantidadJugados,  int cantidadGanados,  int cantidadPerdidos,  int cantidadEmpatados,  int golesFavor,  int golesContra, int diferenciaGoles ,  int puntos,  Double promedio) {
		
		this.cantidadJugados = cantidadJugados;
		this.cantidadGanados = cantidadGanados;
		this.cantidadPerdidos = cantidadPerdidos;
		this.cantidadEmpatados = cantidadEmpatados;
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
		return cantidadGanados;
	}

	public void setCantidadGanados(int cantidadGanados) {
		this.cantidadGanados = cantidadGanados;
	}

	public int getCantidadPerdidos() {
		return cantidadPerdidos;
	}

	public void setCantidadPerdidos(int cantidadPerdidos) {
		this.cantidadPerdidos = cantidadPerdidos;
	}

	public int getCantidadEmpatados() {
		return cantidadEmpatados;
	}

	public void setCantidadEmpatados(int cantidadEmpatados) {
		this.cantidadEmpatados = cantidadEmpatados;
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

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public int getDiferenciaGoles() {
		return diferenciaGoles;
	}

	public void setDiferenciaGoles(int diferenciaGoles) {
		this.diferenciaGoles = diferenciaGoles;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}
	
	public void save() {
		TablaPosicionesDAO.getInstancia().save(this);
	}

}
