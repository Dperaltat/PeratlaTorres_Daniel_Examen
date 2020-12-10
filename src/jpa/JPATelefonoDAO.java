package jpa;

import java.util.List;

import javax.persistence.Persistence;
import javax.persistence.Query;

import dao.TelefonoDAO;
import entidad.Telefono;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono, String> implements TelefonoDAO {

	public JPATelefonoDAO() {
		super(Telefono.class);
		this.em = Persistence.createEntityManagerFactory("JPA").createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Telefono> buscarCedula(String cedula) {
		
		System.out.println("Consulta Realizada...");
		Query nativeQuery = em.createNativeQuery("SELECT * FROM telefono WHERE telefono.USUARIO_ID =?", Telefono.class);
		 nativeQuery.setParameter(1, cedula);
		System.out.println("Consulta Realizada...");
		return (List<Telefono>)nativeQuery.getResultList();
	}
}
