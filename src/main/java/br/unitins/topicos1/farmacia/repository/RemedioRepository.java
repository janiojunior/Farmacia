package br.unitins.topicos1.farmacia.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;

import br.unitins.topicos1.farmacia.model.Remedio;

@ApplicationScoped
public class RemedioRepository extends Repository<Remedio> {

	public List<Remedio> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT r FROM Remedio r ORDER BY r.nome");
		return query.getResultList();
	}
	
	public List<Remedio> buscarPeloNome(String nome) {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append("SELECT "); 
		jpql.append("  r ");
		jpql.append("FROM ");
		jpql.append("  Remedio r ");
		jpql.append("WHERE ");
		jpql.append("  upper(r.nome) LIKE upper(:nome) ");
		jpql.append("ORDER BY r.nome ");
		
		Query query = getEntityManager().createQuery(jpql.toString());
		query.setParameter("nome", "%"+nome+"%");
		
		return query.getResultList();
		
	}

}
