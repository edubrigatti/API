package org.serratec.backend.projeto05.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;

public class CartaoDTO {
	
	private Integer idCartao;	
	private Double limiteCartao;	
	private String numeroCartao;		
	private String nomeTitular;	
	private LocalDate dataValidade;
	
	public CartaoDTO() {}

	public Integer getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(Integer idCartao) {
		this.idCartao = idCartao;
	}

	public Double getLimiteCartao() {
		return limiteCartao;
	}

	public void setLimiteCartao(Double limiteCartao) {
		this.limiteCartao = limiteCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
}