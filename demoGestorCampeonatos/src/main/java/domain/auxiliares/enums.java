package domain.auxiliares;

import domain.enumeraciones.EstadoCampeonato;
import domain.enumeraciones.TipoFalta;

public class enums {
	
	 private static enums instancia;

	 private enums() {}
	
	 public static enums getInstancia() {
	        if(instancia == null)
	            instancia = new enums();
	        return instancia;
	    }
	
	public static String toString(TipoFalta falta) {
		return falta.toString();
	}
	
	public static TipoFalta toTipoFalta(String falta) {
		if (falta.equals("AMARILLA")) {
			return TipoFalta.AMARILLA;
		} else {
			return TipoFalta.ROJA;
		}
	}
	
	public static EstadoCampeonato toEstadoCampeonato(String estado) {
		if(estado.equals("ACTIVO")) {
			return EstadoCampeonato.ACTIVO;
		} else {
			return EstadoCampeonato.INACTIVO;
		}
	}
	
	public static String toString(EstadoCampeonato estado) {
		return estado.toString();
	}
}
