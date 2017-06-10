package br.com.aula2.partern.strategy;

public class ComplexValidatePassword implements ValidatePassword{

	@Override
	public Boolean validate(String login, String password) {
		return password.length()>3;
	}

}
