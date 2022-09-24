package br.unitins.topicos1.farmacia.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.unitins.topicos1.farmacia.model.Estado;

public class EstadoRepository {

	private EntityManager entityManager = null;
	
	public Estado buscarPeloId(Integer id) {
		return getEntityManager().find(Estado.class, id);
	}

	private EntityManager getEntityManager() {
		if (entityManager == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Farmacia");
			entityManager = emf.createEntityManager();
		}
		return entityManager;
	}

	public List<Estado> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT e FROM Estado e ORDER BY e.nome");
		return query.getResultList();
	}

	public void salvar(Estado estado) {
		getEntityManager().getTransaction().begin();
		getEntityManager().merge(estado);
		getEntityManager().getTransaction().commit();
	}

	public void deletar(int id) {
		Estado estado = getEntityManager().find(Estado.class, id);
		if (estado != null) {
			getEntityManager().getTransaction().begin();
			getEntityManager().remove(estado);
			getEntityManager().getTransaction().commit();
		}

	}

}
