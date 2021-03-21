package br.com.sonhoseguro.model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class CadastroDePessoas extends CadastroUtilizadores{
	//id, Cep, Logradouro, Numero, Bairro, Localidade, Uf, IBGE
	
	private Integer id;
	private String cpf, nome;
	private Calendar dataDeNascCriacao;
	private Integer numeroDoImovel;
	private String cep, logadouro, bairro, localidade, uf;
	
	
	public CadastroDePessoas(Integer id, String cpf, String nome, Calendar dataNasc){
		super(id, cpf, nome);
				
	}
	
	// Para o cadastro de pessoas deverá ter uma tabela de endereço com os campos:
	// Id, Cep, Logradouro, Numero, Bairro, Localidade, Uf, IBGE.

	
	
	public void cadastroDeEndereco(String cep, String logadouro, 
			int numero, String bairro,String localidade, String uf) {
		this.cep = cep;
		this.logadouro = logadouro;
		this.numeroDoImovel = numero;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	
	}
		

	public String toString() {
		return "ID: [" + super.getId() + "]  - " +  "Nome: " + super.getNome() + "\n" + "CPF: " + super.getCpf() + "\n" ; 
		
	}

}
