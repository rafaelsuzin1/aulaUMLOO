package br.com.aula2.repository;

import java.util.List;

import br.com.aula2.model.Produto;

public interface ProdutoRepository {

	void save(Produto produto);
	void remove(Produto produto);
	void removeById(String id);
	Produto findById(String id);
	List<Produto> findAll();
	
	
}
