package domain.daos;

import domain.entityes.TablaPosicionesEntity;
import domain.hibernate.HibernateUtil;
import domain.modelo.TablaPosiciones;
import org.hibernate.Session;

import java.util.List;

public class TablaPosicionesDAO {

	private static TablaPosicionesDAO instancia;
	
	private TablaPosicionesDAO() {}
	
	public static TablaPosicionesDAO getInstancia() {
		if(instancia == null)
			instancia = new TablaPosicionesDAO();
		return instancia;
	}
	
	public void save(TablaPosiciones tp) {
		TablaPosicionesEntity aux = toEntity(tp);
		Session s = HibernateUtil.getSessionFactory(TablaPosicionesEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}

	public List<TablaPosicionesEntity> getListaTablaPosiciones() {
		Session s = HibernateUtil.getSessionFactory(TablaPosicionesEntity.class).openSession();
		s.beginTransaction();
		List<TablaPosicionesEntity> aux = (List<TablaPosicionesEntity>) s.createQuery("from TablaPosicionesEntity").list();
		s.close();
		return aux;
	}
	
	TablaPosicionesEntity toEntity(TablaPosiciones tablaposicones) {
		TablaPosicionesEntity te = new TablaPosicionesEntity();
		te.setIdClub(tablaposicones.getIdClub());
		te.setCantidadJugados(tablaposicones.getCantidadJugados());
		te.setCantidadGanados(tablaposicones.getCantidadGanados());
		te.setCantidadPerdidos(tablaposicones.getCantidadPerdidos());
		te.setCantidadEmpatados(tablaposicones.getCantidadEmpatados());
		te.setGolesFavor(tablaposicones.getGolesFavor());
		te.setGolesContra(tablaposicones.getGolesContra());
		te.setDiferenciaGoles(tablaposicones.getDiferenciaGoles());
		te.setPuntos(tablaposicones.getPuntos());
		te.setPromedio(tablaposicones.getPromedio());
		return te;
	}
}
