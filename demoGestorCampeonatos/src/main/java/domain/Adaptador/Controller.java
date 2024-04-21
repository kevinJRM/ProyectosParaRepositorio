package domain.Adaptador;

import domain.entityes.*;
import domain.modelo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Controller {
	
	private List<Club> clubes = new ArrayList<>();
	private List<Campeonato> campeonatos = new ArrayList<>();

	// ============================ CARGA ============================
	// Las clases entity se vuelven modelo y se guardan en el controller
	// El proceso se debe hacer 1 vez y en orden:
	// 1- club
	// 2- representante, tabla, jugador
	// 3- campeonato
	// 4- partido
	// 5- gol, falta
	// si no se sigue el orden lo que se guarde mal va a estar nulo y va a borrar lo que haya en SQL si se guarda asi

	// La opcion A solo carga el club al sistema si este no estaba cargado
	// La opcion B carga el club al sistema sin importar si estaba cargado, esto se puede usar para "cancelar" cambios de ser necesario
	
	public void cargarClubA(ClubEntity clubEntity) {
		if(this.clubes.stream().filter(club -> club.getNombre().equals(clubEntity.getNombre())).collect(Collectors.toList()).isEmpty()) {
			this.clubes.add( new Club(
				clubEntity.getIdClub(), 
				clubEntity.getNombre(), 
				clubEntity.getDireccion() ) );
		}
	}
	
	public void cargarClubB(ClubEntity clubEntity) {
		this.clubes.add( new Club(
			clubEntity.getIdClub(), 
			clubEntity.getNombre(), 
			clubEntity.getDireccion() ) );
	}
	
	private Club buscarClub(int id) {
		for(Club club : this.clubes) {
			if (club.getIdClub() == id) {
				return club; //retorna un club?
			}
		}
		return null;
	}

	public void cargarRepresentante(RepresentanteEntity re) {
		buscarClub(re.getIdClub()).agregarRepresentante(new Representante(
				re.getIdRepresentante(), 
				re.getNombre(), 
				re.getDocumento() ) );
	}

	public void cargarTabla(TablaPosicionesEntity tpe) {

		buscarClub(tpe.getIdClub()).setTabla(new TablaPosiciones(
				tpe.getCantidadJugados(), 
				tpe.getCantidadGanados(), 
				tpe.getCantidadPerdidos(), 
				tpe.getCantidadEmpatados(), 
				tpe.getGolesFavor(), 
				tpe.getGolesContra(), 
				tpe.getDiferenciaGoles(), 
				tpe.getPuntos(), 
				tpe.getPromedio()));

	}
	

	public TablaPosiciones hacerTabla(int ca, Club cl) {
		
		int ganados = 3; int empatados = 1; int perdidos = 0;
		int partidosGanados = 0;
		int partidosPerdidos = 0;
		int partidosEmpatados = 0;
		int totalGfavor = 0;
		int totalGcontra = 0;
		Double partidosJugados = 0.0;
		for(Partido p : this.campeonatos.get(ca).getPartidos()) {
			// valida si el club estuvo en el partido y si fue local o visitante
			boolean esLocal;
			if(p.getNombreLocal().equals(cl.getNombre())) {
				esLocal = true;
			} else if (p.getNombreVisitante().equals(cl.getNombre())) {
				esLocal = false;
			} else {
				continue;
			}
			partidosJugados += 1.0;
			int gl = p.getGolesLocal();
			int gv = p.getGolesVisitante();

			if (gl == gv) {
				partidosEmpatados++;
			} else if (gl < gv) {
				if (esLocal) {
					partidosPerdidos--;
				} else {
					partidosGanados++;
				}
			}
			
			if (esLocal) {
				totalGfavor += gl;
				totalGcontra += gv;
			} else {
				totalGcontra += gl;
				totalGfavor += gv;
			}
		}
		return new TablaPosiciones(
				0, 
				cl.cantJugadores(this.campeonatos.get(ca).getCategoria()), 
				partidosGanados, 
				partidosPerdidos, 
				partidosEmpatados, 
				totalGfavor, 
				totalGcontra, 
				(partidosGanados*ganados+partidosPerdidos*perdidos+partidosEmpatados*empatados), 
				(((double)totalGfavor)/partidosJugados));
	}

	public void cargarJugador(JugadorEntity je) {
		buscarClub(je.getIdClub()).agregarJugador( new Jugador(
				je.getIdJugador(), 
				je.getTipoDocumento(), 
				je.getNumeroDocumento(), 
				je.getNombre(), 
				je.getApellido(), 
				je.getFechaNac(), 
				je.getCategoria()  ) );
	}

	public void cargarCampeonato(CampeonatoEntity ce) {
		this.campeonatos.add(new Campeonato(
				ce.getIdCampeonato(), 
				ce.getDescripcion(), 
				ce.getFechaInicio(), 
				ce.getFechaFin(), 
				ce.getEstado() ) );
	}

	private Campeonato buscarCampeonato(int id) {
		for(Campeonato campeonato: this.campeonatos) {
			if (campeonato.getIdCampeonato() == id) {
				return campeonato;
			}
		}
		return null;
	}
	

	public void cargarPartido(PartidoEntity pe) {
		buscarCampeonato(pe.getIdCampeonato()).agregarPartido(new Partido(
				pe.getIdPartido(), 
				pe.getNroFecha(), 
				pe.getNroZona(), 
				pe.getCategoria(), 
				pe.getIdClubLocal(), 
				pe.getIdClubVisitante(), 
				pe.getGolesLocal(), 
				pe.getGolesVisitante(), 
				pe.getFechaPartido(), 
				pe.getValidadoLocal(), 
				pe.getValidadoVisitante(), 
				pe.getIdCampeonato() ) );
	}

	private Partido buscarPartido(int id) { // este buscar partido va en el controller
		for(Campeonato campeonato : this.campeonatos) {
			if(campeonato.buscarPartido(id) != null) {
				return campeonato.buscarPartido(id);
			}
		}
		return null;
	}
	
	private Jugador buscarJugador(int id) { // este buscar va en el controller
		for(Club club : this.clubes) {
			if(club.buscarJugador(id) != null) {
				club.buscarJugador(id);
			}
		}
		return null;
	}

	public void cargarGol(GolEntity ge) {
		buscarPartido(ge.getIdPartido()).agregarGol(new Gol(
			ge.getIdGol(), 
			buscarJugador(ge.getIdJugador()), 
			ge.getMinuto(), 
			ge.getSentido()));
	}

	public void cargarFalta(FaltaEntity fe) {
		buscarCampeonato(fe.getIdCampeonato()).buscarPartido(fe.getIdPartido()).agregarFalta(new Falta(
				fe.getIdFalta(),
				buscarJugador(fe.getIdJugador()),
				fe.getMinuto(),
				fe.getTipo()));
	}
	
	public void cargarClubesCampeonato(ClubesCampeonatoEntity cce) {
		new ClubesCampeonato(
				cce.getidClubesCampeonato(), 
				buscarClub(cce.getIdClub()), 
				buscarCampeonato(cce.getIdCampeonato()));
	}
	
	public void cargarListaJugadoresPartido(ListaJugadoresPartidoEntity ljpe) {
		if ( buscarPartido(ljpe.getIdPartido()).getIdClubLocal() == ljpe.getIdClub() ) {
			buscarPartido(ljpe.getIdPartido()).agregarJugadorLocal(buscarJugador(ljpe.getIdJugadores()));
		}
		
		if ( buscarPartido(ljpe.getIdPartido()).getIdClubVisitante() == ljpe.getIdClub() ) {
			buscarPartido(ljpe.getIdPartido()).agregarJugadorVisitante(buscarJugador(ljpe.getIdJugadores()));
		}
	}

	
	
	
	
	
	// get y set
	public List<Club> getClubes() {
		return clubes;
	}

	public void setClubes(List<Club> clubes) {
		this.clubes = clubes;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	
}
