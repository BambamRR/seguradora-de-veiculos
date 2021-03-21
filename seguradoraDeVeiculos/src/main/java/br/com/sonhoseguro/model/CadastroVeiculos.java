package br.com.sonhoseguro.model;

import java.util.Date;

public class CadastroVeiculos {

	private int id;
	private String placa;
	private String chassi;
	private String descricao;
	private Double valorDeMercado;
	private Date dataFabricacao;
	private boolean zeroKM;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValorDeMercado() {
		return valorDeMercado;
	}
	public void setValorDeMercado(Double valorDeMercado) {
		this.valorDeMercado = valorDeMercado;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public boolean isZeroKM() {
		return zeroKM;
	}
	public void setZeroKM(boolean zeroKM) {
		this.zeroKM = zeroKM;
	}
	
	
	
}

		