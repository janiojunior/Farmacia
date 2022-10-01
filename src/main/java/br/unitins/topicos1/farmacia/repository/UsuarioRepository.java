package br.unitins.topicos1.farmacia.repository;

import java.util.List;

import javax.persistence.Query;

import br.unitins.topicos1.farmacia.model.Usuario;

public class UsuarioRepository extends Repository<Usuario> {

	public List<Usuario> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT u FROM Usuario u");
		return query.getResultList();
	}

}
