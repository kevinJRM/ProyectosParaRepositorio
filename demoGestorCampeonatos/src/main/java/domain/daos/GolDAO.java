package domain.daos;

import domain.entityes.GolEntity;
import domain.hibernate.HibernateUtil;
import domain.modelo.Gol;
import org.hibernate.Session;

import java.util.List;

public class GolDAO {
	
	private static GolDAO instancia;
	
	private GolDAO() {}
	
	public static GolDAO getInstancia() {
		if(instancia == null)
			instancia = new GolDAO();
		return instancia;
	}
	
	public void save(Gol gol) {
		GolEntity aux = toEntity(gol);
		//int id = jugadoresDAO.getInstancia().getJugadorEntityByNumDocumento(gol.getJugador().getNumeroDocumento()).getIdJugador();
		//aux.setIdJugador(id);
		Session s = HibernateUtil.getSessionFactory(GolEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<GolEntity> getListaGolesEntity() {
		Session s = HibernateUtil.getSessionFactory(GolEntity.class).openSession();
		s.beginTransaction();
		List<GolEntity> aux = (List<GolEntity>) s.createQuery("from GolEntity").list();
		s.close();
		return aux;
	}
	
	
	GolEntity toEntity(Gol gol) {
		GolEntity ue = new GolEntity();
		ue.setIdGol( gol.getIdGol() );
		ue.setIdJugador( gol.getJugador().getIdJugador() );
		ue.setMinuto( gol.getMinuto() );
		ue.setSentido( gol.getSentido() );
		ue.setIdPartido(gol.getIdPartido());
		
		return ue;
	}
	
}
