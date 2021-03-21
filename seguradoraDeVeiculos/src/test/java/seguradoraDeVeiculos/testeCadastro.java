package seguradoraDeVeiculos;

import br.com.sonhoseguro.model.*;

public class testeCadastro {

	public static void main(String[] args) {
	
		
		CadastroDePessoas cdp = new CadastroDePessoas(12, "080.188.845-43", "User Test", null);
		cdp.cadastroDeEndereco("53.251-123", "Rua dos testes", 10, "Bairrinho", "CidadeTeste", "Pernambuco");
		AutenticaUsuario au = new AutenticaUsuario();
		
		//cadastro de usuario com login e senha
		au.cadastoLogin(cdp, "login", "senha");
		
		
		System.out.println("Teste com a senha incorreta");
		au.autenticaUser("logon", "senho");
		
		System.out.println("-------------------------------");
		
		System.out.println("Teste com a senha correta");
		au.autenticaUser("login", "senha");
		
	
	}
	
}
