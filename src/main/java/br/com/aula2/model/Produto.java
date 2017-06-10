package br.com.aula2.model;

public class Produto {

	private ProdutoId produtoId;

public Produto() {
		super();
		this.produtoId = ProdutoId.produtoIdOf();
	}

	public static Produto produtoOf() {
		return new Produto();
	}

	public ProdutoId getProdutoId() {
		return produtoId;
	}

	public Produto setProdutoId(ProdutoId produtoId) {
		this.produtoId = produtoId;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((produtoId == null) ? 0 : produtoId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (produtoId == null) {
			if (other.produtoId != null)
				return false;
		} else if (!produtoId.equals(other.produtoId))
			return false;
		return true;
	}
	
}
