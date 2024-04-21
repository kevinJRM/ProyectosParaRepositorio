package domain.daos;

import domain.entityes.PartidoEntity;
import domain.hibernate.HibernateUtil;
import domain.modelo.Partido;
import org.hibernate.Session;

import java.util.List;

public class PartidoDAO {

	private static PartidoDAO instancia;
	
	private PartidoDAO() {}
	
	public static PartidoDAO getInstancia() {
		if(instancia == null)
			instancia = new PartidoDAO();
		return instancia;
	}
	
	public void save(Partido partido) {
		PartidoEntity aux = toEntity(partido);
		Session s = HibernateUtil.getSessionFactory(PartidoEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
		
		int id = PartidoDAO.getInstancia().getPartidoByNCidCFP(partido.getNroZona(), partido.getCategoria(), partido.getIdClubLocal(), partido.getIdClubVisitante(), partido.getFechaPartido()).getIdPartido();
		//int id = partido.getIdPartido();
		for(int i=0 ; i<partido.getGoles().size() ; i++) {
			partido.getGoles().get(i).setIdPartido(id);
			partido.getGoles().get(i).save();
		}
		for(int i=0 ; i<partido.getFaltas().size() ; i++) {
			partido.getFaltas().get(i).setIdPartido(id);
			partido.getFaltas().get(i).setIdCampeonato(partido.getIdCampeonato());
			partido.getFaltas().get(i).save();
		}
		for(int i=0 ; i<partido.getJugadoresLocales().size() ; i++) {
			ListaJugadoresPartidoDAO.getInstancia().save(partido.getJugadoresLocales().get(i).getIdJugador(), partido.getIdClubLocal(), id);
		}
		for(int i=0 ; i<partido.getJugadoresVisitante().size() ; i++) {
			ListaJugadoresPartidoDAO.getInstancia().save(partido.getJugadoresVisitante().get(i).getIdJugador(), partido.getIdClubVisitante(), id);
		}
		
	}
	
	public void saveSolo(Partido partido) {
		PartidoEntity aux = toEntity(partido);
		Session s = HibernateUtil.getSessionFactory(PartidoEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}
	
	public Partido getPartidoById(int id) {
		Session s = HibernateUtil.getSessionFactory(PartidoEntity.class).openSession();
		s.beginTransaction();
		PartidoEntity aux = (PartidoEntity) s.createQuery("from PartidoEntity ob where ob.idPartido = '"+id+"'").uniqueResult();
		s.close();
		return toModelo(aux);
	}
	
	public PartidoEntity getPartidoByNCidCFP(int nroZona, int categoria, int idClubLocal, int idClubVisitante, String fechaPartido) {
		Session s = HibernateUtil.getSessionFactory(PartidoEntity.class).openSession();
		s.beginTransaction();
		PartidoEntity aux = (PartidoEntity) s.createQuery("from PartidoEntity ob where ob.nroZona = '"+nroZona+"' and ob.categoria = '"+categoria+"' and ob.idClubLocal = '"+idClubLocal+"' and ob.idClubVisitante = '"+idClubVisitante+"' and ob.fechaPartido = '"+fechaPartido+"'").uniqueResult();
		s.close();
		return aux;
	}

	public List<PartidoEntity> getListaPartidosEntity() {
		Session s = HibernateUtil.getSessionFactory(PartidoEntity.class).openSession();
		s.beginTransaction();
		List<PartidoEntity> aux = (List<PartidoEntity>) s.createQuery("from PartidoEntity").list();
		s.close();
		return aux;
	}
	
	
	PartidoEntity toEntity(Partido usuario) {
		PartidoEntity ue = new PartidoEntity();
		ue.setCategoria(usuario.getCategoria());
		ue.setFechaPartido(usuario.getFechaPartido());
		ue.setGolesLocal(usuario.getGolesLocal());
		ue.setGolesVisitante(usuario.getGolesVisitante());
		ue.setIdCampeonato(usuario.getIdCampeonato());
		ue.setIdClubLocal(usuario.getIdClubLocal());
		ue.setIdClubVisitante(usuario.getIdClubVisitante());
		ue.setIdPartido(usuario.getIdPartido());
		ue.setNroFecha(usuario.getNroFecha());
		ue.setNroZona(usuario.getNroZona());
		ue.setValidadoLocal(usuario.getValidadoLocal());
		ue.setValidadoVisitante(usuario.getValidadoVisitante());
		
		return ue;
	}
	
	Partido toModelo(PartidoEntity eu) {
		Partido resultado = new Partido(
				eu.getIdPartido(), 
				eu.getNroFecha(), 
				eu.getNroZona(), 
				eu.getCategoria(), 
				eu.getIdClubLocal(), 
				eu.getIdClubVisitante(), 
				eu.getGolesLocal(), 
				eu.getGolesVisitante(), 
				eu.getFechaPartido(), 
				eu.getValidadoLocal(), 
				eu.getValidadoVisitante(), 
				eu.getIdCampeonato()/*, 
				jugadoresDAO.getInstancia().toModelos(eu.getJugadoresVisitante()), 
				jugadoresDAO.getInstancia().toModelos(eu.getJugadoresLocales())*/ );
		return resultado;
	}

}
