package br.edu.infnet.appvenda.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appvenda.model.domain.Produto;
import br.edu.infnet.appvenda.model.service.ICountable;

@Repository
public interface ProdutoRepository extends ICountable<Produto> {
	@Query("from Produto p where p.vendedor.id = :vendedorId")
	Collection<Produto> obterLista(Integer vendedorId);
}
