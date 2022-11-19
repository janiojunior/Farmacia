package br.unitins.topicos1.farmacia.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;

import br.unitins.topicos1.farmacia.model.Compra;

@ApplicationScoped
public class CompraRepository extends Repository<Compra> {

	public List<Compra> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT c FROM Compra c ORDER BY c.id DESC");
		return query.getResultList();
	}
	
}
