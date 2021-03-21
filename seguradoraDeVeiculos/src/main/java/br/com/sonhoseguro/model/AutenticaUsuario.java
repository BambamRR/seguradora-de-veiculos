package br.com.sonhoseguro.model;

public class AutenticaUsuario {
	//O campo login pode conter caracteres que representam cpf, telefone ou apelido com até 
	//20 caracteres
	
	private String login;
	private String password;
	private CadastroUtilizadores cadastro;
	
	public String getLogin() {
		return login;
	}
	//O campo login pode conter caracteres que representam cpf, telefone ou apelido com até 
		//20 caracteres
	
	public void cadastoLogin(CadastroUtilizadores cadastro, String login, String password) {
		this.cadastro = cadastro;
		this.login = login;
		this.password = password;
	}


	public void autenticaUser(String login, String password) {
		if (this.login == login && this.password == password) {
			System.out.println(" Seja bem vindo: " + this.login);
		} else {
			System.out.println("Login ou senha inválidos");
		}
	}

}
