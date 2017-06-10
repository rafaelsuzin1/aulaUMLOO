package aula2umlOO;

import org.junit.Test;

import br.com.aula2.partern.strategy.ComplexValidatePassword;
import br.com.aula2.partern.strategy.LoginManager;
import br.com.aula2.partern.strategy.PasswordException;
import br.com.aula2.partern.strategy.SimpleValidatePassword;

public class GerenciadorLoginPadraoStrategy {

	@Test(expected = PasswordException.class)
	public void testarValidadorFail() {
		LoginManager loginManager = new LoginManager(new SimpleValidatePassword());
		loginManager.definirSenha("admin", "123456");
	}

	@Test
	public void testarValidador() {
		LoginManager loginManager = new LoginManager(new ComplexValidatePassword());
		loginManager.definirSenha("admin", "123456");
	}

}
