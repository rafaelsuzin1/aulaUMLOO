package br.com.aula2.model;

import java.util.UUID;

public class ProdutoId {

	private String id;

	public ProdutoId() {
		super();
		this.id = UUID.randomUUID().toString();
	}

	public static ProdutoId produtoIdOf (){
		return new ProdutoId();
	}
	
	public String getId() {
		return id;
	}

	public ProdutoId setId(String id) {
		this.id = id;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ProdutoId other = (ProdutoId) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
