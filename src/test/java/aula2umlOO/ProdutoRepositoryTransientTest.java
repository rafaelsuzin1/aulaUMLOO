package aula2umlOO;

import static br.com.aula2.factory.ProdutoRepositoryFactory.getInstance;
import static br.com.aula2.model.Produto.produtoOf;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.aula2.factory.RepositoryType;
import br.com.aula2.model.Produto;
import br.com.aula2.repository.ProdutoRepository;

public class ProdutoRepositoryTransientTest {

	private ProdutoRepository produtoRepository;

	@Before
	public void inicializaRepositorio() {
		produtoRepository = getInstance(RepositoryType.TRANSIENT);
	}

	@Test
	public void testarIdsDiferente() {
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
		assertNotNull(produtoRepository.findById(produto.getProdutoId()));
	}

	@Test
	public void testarConsultarTodosProdutoTransisent() {
		for (int i = 0; i < 10; i++) {
			Produto produto = produtoOf();
			produtoRepository.save(produto);
		}
		assertTrue(produtoRepository.findAll().size() == 10);
	}

	@Test
	public void testarRemoverProdutoTransisent() {
		Produto produto = produtoOf();
		produtoRepository.save(produto);
		assertTrue(produtoRepository.findAll().size() == 1);
		produtoRepository.remove(produto);
		assertTrue(produtoRepository.findAll().isEmpty());
	}

	@Test
	public void testarRemoverProdutoTransientPorId() {
		Produto produto = produtoOf();
		produtoRepository.save(produto);
		assertTrue(produtoRepository.findAll().size() == 1);
		produtoRepository.removeById(produto.getProdutoId());
		assertTrue(produtoRepository.findAll().isEmpty());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testarEncapsulamentoLista() {
		produtoRepository.save(produtoOf());
		produtoRepository.findAll().add(produtoOf());
	}

}
