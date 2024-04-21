package domain.daos;

import domain.entityes.FaltaEntity;
import domain.hibernate.HibernateUtil;
import domain.modelo.Falta;
import org.hibernate.Session;

import java.util.List;

public class FaltaDAO {

	private static FaltaDAO instancia;
	
	private FaltaDAO() {}
	
	public static FaltaDAO getInstancia() {
		if(instancia == null)
			instancia = new FaltaDAO();
		return instancia;
	}
	
	public void save(Falta falta) {
		FaltaEntity aux = toEntity(falta);
		//int id = jugadoresDAO.getInstancia().getJugadorEntityByNumDocumento(falta.getJugador().getNumeroDocumento()).getIdJugador();
		//aux.setIdJugador(id);
		Session s = HibernateUtil.getSessionFactory(FaltaEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<FaltaEntity> getListaFaltaEntity() {
		Session s = HibernateUtil.getSessionFactory(FaltaEntity.class).openSession();
		s.beginTransaction();
		List<FaltaEntity> aux = (List<FaltaEntity>) s.createQuery("from FaltaEntity").list();
		s.close();
		return aux;
	}
	
	FaltaEntity toEntity (Falta falta) {
		FaltaEntity fe = new FaltaEntity();
		fe.setIdFalta(falta.getIdFalta());
		fe.setIdJugador(falta.getJugador().getIdJugador());
		fe.setMinuto(falta.getMinuto());
		fe.setTipo(falta.getTipo());
		fe.setIdCampeonato(falta.getIdCampeonato());
		fe.setIdPartido(falta.getIdPartido());
		return fe;
	}
}
