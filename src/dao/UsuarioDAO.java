package dao;

import entidad.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, String> {

	Usuario buscar(String email, String pwd);

}