package domain.daos;

import domain.entityes.ClubEntity;
import domain.hibernate.HibernateUtil;
import domain.modelo.Club;
import org.hibernate.Session;

import java.util.List;

public class ClubDAO {
	
	private static ClubDAO instancia;
	
	private ClubDAO() {}
	
	public static ClubDAO getInstancia() {
		if(instancia == null)
			instancia = new ClubDAO();
		return instancia;
	}
	
	public void save(Club club) {
		ClubEntity aux = toEntity(club);
		Session s = HibernateUtil.getSessionFactory(ClubEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
		
		for (int i=0 ; i<club.getCC().size() ; i++) {
			club.getCC().get(i).save();
		}
		
		
		int id = ClubDAO.getInstancia().getClubByNombre(club.getNombre()).getIdClub();
		club.getRepresentante().setIdClub(id);
		club.getRepresentante().save();
		club.getTablaposiciones().setIdClub(id);
		club.getTablaposiciones().save();
		for(int i=0 ; i<club.getJugadores().size() ; i++) {
			club.getJugadores().get(i).setClub(id);
			club.getJugadores().get(i).save();
		}
	}
	
	public void saveSolo(Club club) {
		ClubEntity aux = toEntity(club);
		Session s = HibernateUtil.getSessionFactory(ClubEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}
	
	public ClubEntity getClubByNombre(String nombre) {
		Session s = HibernateUtil.getSessionFactory(ClubEntity.class).openSession();
		s.beginTransaction();
		ClubEntity aux = (ClubEntity) s.createQuery("from ClubEntity ob where ob.nombre = '"+nombre+"'").uniqueResult();
		s.close();
		return aux;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<ClubEntity> getListaClubes() {
		Session s = HibernateUtil.getSessionFactory(ClubEntity.class).openSession();
		s.beginTransaction();
		List<ClubEntity> aux = (List<ClubEntity>) s.createQuery("from ClubEntity").list();
		s.close();
		return aux;
	}
	
	ClubEntity toEntity(Club club) {
		ClubEntity ue = new ClubEntity();
		ue.setIdClub(club.getIdClub());
		ue.setNombre(club.getNombre());
		ue.setDireccion(club.getDireccion());	
		return ue;
	}
	
}
