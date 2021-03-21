package br.com.sonhoseguro.model;

import java.util.Calendar;
import java.util.GregorianCalendar;



public abstract class CadastroUtilizadores {
	
	//id, Cpf/Cnpj, Nome, Data Nascimento (quando for CNPJ representa Data Constituição).
	private Integer id;
	private String cpf, cnpj;
	private String nome;
	private Calendar dataDeNascCriacao;
	
	
	public  CadastroUtilizadores(Integer id, String cpf, String nome) {
	this.id = id;
	this.cpf = cpf;
	this.nome = nome;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Calendar getDataDeNascCriacao() {
		return dataDeNascCriacao;
	}
	public void setDataDeNascCriacao(Calendar dataDeNascCriacao) {
		this.dataDeNascCriacao = dataDeNascCriacao;
		}
	
	
	

}
