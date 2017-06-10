package br.com.aula2.partern.strategy;

public class LoginManager {
	
	private ValidatePassword validatePassword;

	public LoginManager(ValidatePassword validatePassword){
		this.validatePassword = validatePassword;
	}
	
	public void definirSenha(String login, String password){
		if (!validatePassword.validate(login, password))
			throw new PasswordException("Usuário ou senha incorretos");
	}
}
