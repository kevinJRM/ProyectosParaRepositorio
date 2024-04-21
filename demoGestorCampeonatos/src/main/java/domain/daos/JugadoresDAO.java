package domain.daos;

import domain.entityes.JugadorEntity;
import domain.hibernate.HibernateUtil;
import domain.modelo.Jugador;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class JugadoresDAO {
	
	private static JugadoresDAO instancia;
	
	private JugadoresDAO() {}
	
	public static JugadoresDAO getInstancia() {
		if(instancia == null)
			instancia = new JugadoresDAO();
		return instancia;
	}
	
	public void save(Jugador jugador) {
		JugadorEntity aux = toEntity(jugador);
		Session s = HibernateUtil.getSessionFactory(JugadorEntity.class).openSession();
		s.beginTransaction();
		s.save(aux);
		s.close();
	}
	
	
	public Jugador getJugadorByNumDocumento(int numeroDocumento) {
		Session s = HibernateUtil.getSessionFactory(JugadorEntity.class).openSession();
		s.beginTransaction();
		JugadorEntity aux = (JugadorEntity) s.createQuery("from JugadorEntity ob where ob.numeroDocumento = '"+numeroDocumento+"'").uniqueResult();
		s.close();
		return toModelo(aux);
	}
	
	public JugadorEntity getJugadorEntityByNumDocumento(int numeroDocumento) {
		Session s = HibernateUtil.getSessionFactory(JugadorEntity.class).openSession();
		s.beginTransaction();
		JugadorEntity aux = (JugadorEntity) s.createQuery("from JugadorEntity ob where ob.numeroDocumento = '"+numeroDocumento+"'").uniqueResult();
		s.close();
		return aux;
	}
	
	public Jugador getJugadorById(int id) {
		Session s = HibernateUtil.getSessionFactory(JugadorEntity.class).openSession();
		s.beginTransaction();
		JugadorEntity aux = (JugadorEntity) s.createQuery("from JugadorEntity ob where ob.idJugador = '"+id+"'").uniqueResult();
		s.close();
		return toModelo(aux);
	}
	
	@SuppressWarnings("unchecked")
	public List<JugadorEntity> getListaJugadores() {
		Session s = HibernateUtil.getSessionFactory(JugadorEntity.class).openSession();
		s.beginTransaction();
		List<JugadorEntity> aux = (List<JugadorEntity>) s.createQuery("from JugadorEntity").list();
		s.close();
		return aux;
	}
	
	JugadorEntity toEntity (Jugador jugador) {
		JugadorEntity fe = new JugadorEntity();
		
		fe.setIdJugador(jugador.getIdJugador() );
		fe.setTipoDocumento(jugador.getTipoDocumento() );
		fe.setNumeroDocumento(jugador.getNumeroDocumento() );
		fe.setNombre(jugador.getNombre() );
		fe.setApellido(jugador.getApellido() );
		fe.setClub(jugador.getIdClub() );
		fe.setFechaNac(jugador.getFechaNac() );
		fe.setCategoria(jugador.getCategoria() );
		
		return fe;
	}
	
	Jugador toModelo(JugadorEntity eu) {
		Jugador resultado = new Jugador(eu.getIdJugador(), eu.getTipoDocumento(), eu.getNumeroDocumento(), eu.getNombre(), eu.getApellido(), eu.getFechaNac(), eu.getCategoria());
		return resultado;
	}
	
	List<Jugador> toModelos(List<JugadorEntity> eu) {
		List<Jugador> resultados = new ArrayList<>();
		for (int i=0 ; i<eu.size() ; i++) {
			resultados.add(new Jugador(eu.get(i).getIdJugador(), eu.get(i).getTipoDocumento(), eu.get(i).getNumeroDocumento(), eu.get(i).getNombre(), eu.get(i).getApellido(), eu.get(i).getFechaNac(), eu.get(i).getCategoria()));
		}
		return resultados;
	}

}
