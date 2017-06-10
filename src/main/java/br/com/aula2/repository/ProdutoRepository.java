package br.com.aula2.repository;

import java.util.List;

import br.com.aula2.model.Produto;
import br.com.aula2.model.ProdutoId;

public interface ProdutoRepository {

	void save(Produto produto);
	void remove(Produto produto);
	void removeById(ProdutoId id);
	Produto findById(ProdutoId id);
	List<Produto> findAll();
	
	
}
