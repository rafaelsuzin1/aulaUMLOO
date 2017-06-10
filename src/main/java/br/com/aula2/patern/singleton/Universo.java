package br.com.aula2.patern.singleton;

public class Universo {
	private static Universo universo;

	private Universo() {
	}

	public static Universo getInstance() {
		if (Universo.universo == null)
			universo = new UniversoParalelo();
		return universo;
	}	

	public static class UniversoParalelo extends Universo{
		
	}
}
