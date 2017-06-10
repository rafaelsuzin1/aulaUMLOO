package aula2umlOO;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import br.com.aula2.patern.singleton.Universo;

public class UniversoSingletonTest {

	@Test
	public void testarPadraoSingleton(){
		assertSame(Universo.UniversoParalelo.getInstance(), Universo.UniversoParalelo.getInstance());
		assertSame(Universo.getInstance(), Universo.getInstance());
	}
}
