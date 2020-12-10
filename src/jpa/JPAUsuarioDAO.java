package jpa;

import javax.persistence.Query;

import dao.UsuarioDAO;
import entidad.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, String> implements UsuarioDAO {

	public JPAUsuarioDAO() {
		super(Usuario.class);

	}
	
	@Override
	public Usuario buscar(String email, String pwd) {
		
		Query nativeQuery = em.createNativeQuery("SELECT * FROM Usuario where correo =? AND pwd=?", Usuario.class);
		nativeQuery.setParameter(1, email);
		nativeQuery.setParameter(2, pwd);
		
		return (Usuario) nativeQuery.getSingleResult();
	}

}