package br.com.aula2.factory;

import br.com.aula2.repository.ProdutoRepository;
import br.com.aula2.repository.impl.ProdutoRepositoryPersistent;
import br.com.aula2.repository.impl.ProdutoRepositoryTransient;

public abstract class ProdutoRepositoryFactory {

	public static ProdutoRepository getInstance(RepositoryType type) {
		switch (type) {
		case PERSISTENT:
			return new ProdutoRepositoryPersistent();
		case TRANSIENT:
			return new ProdutoRepositoryTransient();
		default:
			break;
		}
		return null;
	}

}
