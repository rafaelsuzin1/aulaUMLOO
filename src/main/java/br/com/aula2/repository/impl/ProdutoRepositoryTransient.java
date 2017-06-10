package br.com.aula2.repository.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import br.com.aula2.model.Produto;
import br.com.aula2.repository.ProdutoRepository;

public class ProdutoRepositoryTransient implements ProdutoRepository {

	private List<Produto> produtos;

	public void save(Produto produto) {
		if (produtos == null)
			produtos = new ArrayList<Produto>();
		if (!produtos.contains(produto))
			produtos.add(produto);
	}

	public void remove(Produto produto) {
		if (produtos.contains(produto))
			produtos.remove(produto);
	}

	public void removeById(String id) {
		Optional<Produto> produto = produtos.stream()
				.filter(p -> p.getProdutoId().getId().equals(id)).findAny();
		if (produto.isPresent())
		produtos.remove(produto.get());
	}

	public Produto findById(String id) {
		return produtos.stream()
				.filter(p -> p.getProdutoId().getId().equals(id)).findAny().get();
	}

	public List<Produto> findAll() {
		return Collections.unmodifiableList(produtos);
	}
}
