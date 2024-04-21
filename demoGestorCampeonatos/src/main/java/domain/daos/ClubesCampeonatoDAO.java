package domain.daos;

import domain.entityes.ClubesCampeonatoEntity;
import domain.hibernate.HibernateUtil;
import domain.modelo.ClubesCampeonato;
import org.hibernate.Session;

import java.util.List;

public class ClubesCampeonatoDAO {

	private static ClubesCampeonatoDAO instancia;
	
	private ClubesCampeonatoDAO() {}
	
	public static ClubesCampeonatoDAO getInstancia() {
		if(instancia == null)
			instancia = new ClubesCampeonatoDAO();
		return instancia;
	}
	
	public void save(ClubesCampeonato cp) {
		Integer idclub = ClubDAO.getInstancia().getClubByNombre(cp.getClub().getNombre()).getIdClub();
		Integer idcampeonato = CampeonatoDAO.getInstancia().getCampeonatoByDescripcion(cp.getCampeonato().getDescripcion()).getIdCampeonato();

		ClubesCampeonatoEntity aux = new ClubesCampeonatoEntity( idclub, idcampeonato);
		
		Session s = HibernateUtil.getSessionFactory(ClubesCampeonatoEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}
	
	public ClubesCampeonatoEntity getClubesCampeonatoById(int id) {
		Session s = HibernateUtil.getSessionFactory(ClubesCampeonatoEntity.class).openSession();
		s.beginTransaction();
		ClubesCampeonatoEntity aux = (ClubesCampeonatoEntity) s.createQuery("from ClubesCampeonatoEntity ob where ob.idClubesCampeonato = '"+id+"'").uniqueResult();
		s.close();
		return aux;
	}
	

	public List<ClubesCampeonatoEntity> getListaClubesCampeonatoEntity() {
		Session s = HibernateUtil.getSessionFactory(ClubesCampeonatoEntity.class).openSession();
		s.beginTransaction();
		List<ClubesCampeonatoEntity> aux = (List<ClubesCampeonatoEntity>) s.createQuery("from ClubesCampeonatoEntity").list();
		s.close();
		return aux;
	}
	
	
	ClubesCampeonatoEntity toEntity (ClubesCampeonato clubescampeonato, int idclub, int idcampeonato) {
		ClubesCampeonatoEntity ce = new ClubesCampeonatoEntity();
		ce.setidClubesCampeonato(clubescampeonato.getIdClubesCampeonato());
		ce.setIdClub(idclub);
		ce.setIdCampeonato(idcampeonato);
		return ce;
	}
	
	
}
