package domain.daos;

import domain.entityes.RepresentanteEntity;
import domain.hibernate.HibernateUtil;
import domain.modelo.Representante;
import org.hibernate.Session;

import java.util.List;

public class RepresentantesDAO {
	
private static RepresentantesDAO instancia;
	
	private RepresentantesDAO() {}
	
	public static RepresentantesDAO getInstancia() {
		if(instancia == null)
			instancia = new RepresentantesDAO();
		return instancia;
	}
	
	public void save(Representante representantes) {
		RepresentanteEntity aux = toEntity(representantes);
		Session s = HibernateUtil.getSessionFactory(RepresentanteEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}
	
	public RepresentanteEntity getRByNombre(int id) {
		Session s = HibernateUtil.getSessionFactory(RepresentanteEntity.class).openSession();
		s.beginTransaction();
		RepresentanteEntity aux = (RepresentanteEntity) s.createQuery("from RepresentanteEntity ob where ob.idClub = '"+id+"'").uniqueResult();
		s.close();
		return aux;
	}
	
	@SuppressWarnings("unchecked")
	public List<RepresentanteEntity> getListaRepresentantes() {
		Session s = HibernateUtil.getSessionFactory(RepresentanteEntity.class).openSession();
		s.beginTransaction();
		List<RepresentanteEntity> aux = (List<RepresentanteEntity>) s.createQuery("from RepresentanteEntity").list();
		s.close();
		
		return aux;
	}
	
	
	RepresentanteEntity toEntity (Representante representantes) {
		RepresentanteEntity fe = new RepresentanteEntity();
		fe.setIdRepresentante(representantes.getIdRepresentante());
		fe.setNombre(representantes.getNombre());
		fe.setDocumento(representantes.getDocumento());
		fe.setIdClub(representantes.getIdClub());
		
		return fe;
	}

}
