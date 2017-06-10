package aula2umlOO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static br.com.aula2.model.Produto.produtoOf;
import br.com.aula2.model.Produto;
import br.com.aula2.repository.ProdutoRepository;
import br.com.aula2.repository.impl.ProdutoRepositoryTransient;

public class ProdutoRepositoryTransientTest {

	private ProdutoRepository produtoRepository;

	@Before
	public void inicializaRepositorio() {
		produtoRepository = new ProdutoRepositoryTransient();
	}
	
	@Test
	public void testarIdsDiferente(){
		Produto produto = produtoOf();
		Produto produto1 = produtoOf();
		
		assertNotNull(produto);
		assertNotNull(produto.getProdutoId());
		assertNotNull(produto.getProdutoId().getId());
		assertNotNull(produto1);
		assertNotNull(produto1.getProdutoId());
		assertNotNull(produto1.getProdutoId().getId());
		assertNotEquals(produto.getProdutoId().getId(), produto1.getProdutoId().getId());
	}

	@Test
	public void testarSalvarProdutoTransisent() {
		Produto produto = produtoOf();
		produtoRepository.save(produto);
		assertTrue(produtoRepository.findAll().size() > 0);
	}

	@Test
	public void testarConsultarProdutoTransisentPorId() {
		Produto produto = produtoOf();
		produtoRepository.save(produto);
		assertNotNull(produtoRepository.findById(produto.getProdutoId().getId()));
	}

	@Test
	public void testarConsultarTodosProdutoTransisent() {
		for (int i = 0; i<10; i++){
			Produto produto = produtoOf();
			produtoRepository.save(produto);	
		}
		assertTrue(produtoRepository.findAll().size() == 10);
	}

	@Test
	public void testarRemoverProdutoTransisent() {
		Produto produto = produtoOf();
		produtoRepository.save(produto);
		assertTrue(produtoRepository.findAll().size() ==1);
		produtoRepository.remove(produto);
		assertTrue(produtoRepository.findAll().isEmpty());
	}

	@Test
	public void testarRemoverProdutoTransientPorId() {
		Produto produto = produtoOf();
		produtoRepository.save(produto);
		assertTrue(produtoRepository.findAll().size() ==1);
		produtoRepository.removeById(produto.getProdutoId().getId());
		assertTrue(produtoRepository.findAll().isEmpty());
	}

}
