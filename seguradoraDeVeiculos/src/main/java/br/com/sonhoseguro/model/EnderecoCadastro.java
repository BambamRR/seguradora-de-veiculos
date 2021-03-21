package br.com.sonhoseguro.model;
import br.com.sonhoseguro.model.CadastroDePessoas;

public abstract class EnderecoCadastro {
	private CadastroDePessoas id;
	private int numero;
	private String cep, logadouro, bairro, localidade, uf;

	public void cadastroDeEndereco(CadastroDePessoas id, String cep, String logadouro, 
			int numero, String bairro,String localidade, String uf) {
		this.id = id;
		this.cep = cep;
		this.logadouro = logadouro;
		this.numero = numero;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	
	}
	
}
