package domain.daos;

import domain.entityes.CampeonatoEntity;
import domain.hibernate.HibernateUtil;
import domain.modelo.Campeonato;
import org.hibernate.Session;

import java.util.List;

public class CampeonatoDAO {
	
	private static CampeonatoDAO instancia;
	
	private CampeonatoDAO() {}
	
	public static CampeonatoDAO getInstancia() {
		if(instancia == null)
			instancia = new CampeonatoDAO();
		return instancia;
	}
	
	public void save(Campeonato campeonato) {
		CampeonatoEntity aux = toEntity(campeonato);
		Session s = HibernateUtil.getSessionFactory(CampeonatoEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
		
		
		int id = CampeonatoDAO.getInstancia().getCampeonatoByDescripcion(campeonato.getDescripcion()).getIdCampeonato();
		for(int i=0 ; i<campeonato.getPartidos().size() ; i++) {
			campeonato.getPartidos().get(i).setIdCampeonato(id);
			campeonato.getPartidos().get(i).save();
		}
	}
	
	public void saveSolo(Campeonato campeonato) {
		CampeonatoEntity aux = toEntity(campeonato);
		Session s = HibernateUtil.getSessionFactory(CampeonatoEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}
	
	public Campeonato getCampeonatoById(int id) {
		Session s = HibernateUtil.getSessionFactory(CampeonatoEntity.class).openSession();
		s.beginTransaction();
		CampeonatoEntity aux = (CampeonatoEntity) s.createQuery("from CampeonatoEntity ob where ob.idCampeonato = "+id+"").uniqueResult();
		s.close();
		return toModelo(aux);
	}
	
	public Campeonato getCampeonatoByDescripcion(String descripcion) {
		Session s = HibernateUtil.getSessionFactory(CampeonatoEntity.class).openSession();
		s.beginTransaction();
		CampeonatoEntity aux = (CampeonatoEntity) s.createQuery("from CampeonatoEntity ob where ob.descripcion = '"+descripcion+"'").uniqueResult();
		s.close();
		return toModelo(aux);
	}
	
	@SuppressWarnings("unchecked")
	public List<CampeonatoEntity> getListaCampeonatosEntity() {
		Session s = HibernateUtil.getSessionFactory(CampeonatoEntity.class).openSession();
		s.beginTransaction();
		List<CampeonatoEntity> aux = (List<CampeonatoEntity>) s.createQuery("from CampeonatoEntity").list();
		s.close();
		
		return aux;
	}
	
	
	Campeonato toModelo(CampeonatoEntity eu) {
		Campeonato resultado = new Campeonato(eu.getIdCampeonato(),eu.getDescripcion(),eu.getFechaInicio(),eu.getFechaFin(),eu.getEstado() );
		return resultado;
	}
	
	CampeonatoEntity toEntity(Campeonato campeonato) {
		CampeonatoEntity ue = new CampeonatoEntity();
		ue.setIdCampeonato(campeonato.getIdCampeonato());
		ue.setDescripcion(campeonato.getDescripcion());
		ue.setFechaInicio(campeonato.getFechaInicio());
		ue.setFechaFin(campeonato.getfechaFin());
		ue.setEstado(campeonato.getEstado());
		
		return ue;
	}
	
}
