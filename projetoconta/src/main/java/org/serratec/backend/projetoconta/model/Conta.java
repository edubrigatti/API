package org.serratec.backend.projetoconta.model;

public class Conta {
	
	private Integer idConta;
	private Integer numConta;
	private String titularConta;
	private Double saldoConta;
	
	public Conta() {}
	
	

	public Conta(Integer idConta, Integer numConta, String titularConta, Double saldoConta) {
		super();
		this.idConta = idConta;
		this.numConta = numConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}


	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(Double saldoConta) {
		this.saldoConta = saldoConta;
	}

	
	
}
