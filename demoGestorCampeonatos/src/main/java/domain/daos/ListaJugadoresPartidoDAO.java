package domain.daos;

import domain.entityes.ListaJugadoresPartidoEntity;
import domain.hibernate.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class ListaJugadoresPartidoDAO {
	
	private static ListaJugadoresPartidoDAO instancia;
	
	private ListaJugadoresPartidoDAO() {}
	
	public static ListaJugadoresPartidoDAO getInstancia() {
		if(instancia == null)
			instancia = new ListaJugadoresPartidoDAO();
		return instancia;
	}
	
	public void save(Integer idjugador, Integer idclub, int idpartido) {
		ListaJugadoresPartidoEntity aux = new ListaJugadoresPartidoEntity(idjugador, idclub, idpartido);
		Session s = HibernateUtil.getSessionFactory(ListaJugadoresPartidoEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}

	public List<ListaJugadoresPartidoEntity> getListaJugadoresPartidoEntity() {
		Session s = HibernateUtil.getSessionFactory(ListaJugadoresPartidoEntity.class).openSession();
		s.beginTransaction();
		List<ListaJugadoresPartidoEntity> aux = (List<ListaJugadoresPartidoEntity>) s.createQuery("from ListaJugadoresPartidoEntity").list();
		s.close();
		return aux;
	}
	
	ListaJugadoresPartidoEntity toEntity (int idLista, Integer idJugadores, Integer idClub, int idPartido) {
		ListaJugadoresPartidoEntity le = new ListaJugadoresPartidoEntity();
		le.setIdLista(idLista);
		le.setIdJugadores(idJugadores);
		le.setIdClub(idClub);
		le.setIdPartido(idPartido);
		return le;
	}
}
