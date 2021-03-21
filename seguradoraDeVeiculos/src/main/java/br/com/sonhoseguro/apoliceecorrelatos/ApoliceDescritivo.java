package br.com.sonhoseguro.apoliceecorrelatos;

import java.util.Date;

import br.com.sonhoseguro.model.CadastroDePessoas;
import br.com.sonhoseguro.model.CadastroUtilizadores;

public class ApoliceDescritivo {

//	As apólices inicialmente serão cotações no sistema com os campos:
//	Id, Inicio Vigência, Fim Vigência, Valor Prêmio, Valor Cobertura,Cancelada, 
//	Apólice (se a cotação se tornou uma apólice válida), Veículo, Cadastro (estipulante), 
//	Cadastro(beneficiário), Endereço (endereço do beneficiário), Veículo a Trabalho, 
//	Pernoita Garagem.
		
	private int apoliceId;
	private Date inicioVigencia;
	private Date fimVigencia;
	private Double valorPremio;
	private Double valorCobertura;
	private boolean canceladaApolice;
	private CadastroDePessoas cadastroBeneficiario;
	private CadastroUtilizadores cadastroEstipulante;
	private boolean veiculoTrabalho;
	private boolean veiculoPernoiteGaragem;
	
	
	
	
	public int getApoliceId() {
		return apoliceId;
	}
	public void setApoliceId(int apoliceId) {
		this.apoliceId = apoliceId;
	}
	public Date getInicioVigencia() {
		return inicioVigencia;
	}
	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}
	public Date getFimVigencia() {
		return fimVigencia;
	}
	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}
	public Double getValorPremio() {
		return valorPremio;
	}
	public void setValorPremio(Double valorPremio) {
		this.valorPremio = valorPremio;
	}
	public Double getValorCobertura() {
		return valorCobertura;
	}
	public void setValorCobertura(Double valorCobertura) {
		this.valorCobertura = valorCobertura;
	}
	public boolean isCanceladaApolice() {
		return canceladaApolice;
	}
	public void setCanceladaApolice(boolean canceladaApolice) {
		this.canceladaApolice = canceladaApolice;
	}
	public CadastroDePessoas getCadastroBeneficiario() {
		return cadastroBeneficiario;
	}
	public void setCadastroBeneficiario(CadastroDePessoas cadastroBeneficiario) {
		this.cadastroBeneficiario = cadastroBeneficiario;
	}
	public CadastroUtilizadores getCadastroEstipulante() {
		return cadastroEstipulante;
	}
	public void setCadastroEstipulante(CadastroUtilizadores cadastroEstipulante) {
		this.cadastroEstipulante = cadastroEstipulante;
	}
	public boolean isVeiculoTrabalho() {
		return veiculoTrabalho;
	}
	public void setVeiculoTrabalho(boolean veiculoTrabalho) {
		this.veiculoTrabalho = veiculoTrabalho;
	}
	public boolean isVeiculoPernoiteGaragem() {
		return veiculoPernoiteGaragem;
	}
	public void setVeiculoPernoiteGaragem(boolean veiculoPernoiteGaragem) {
		this.veiculoPernoiteGaragem = veiculoPernoiteGaragem;
	}
	
	

	
}
