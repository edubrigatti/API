package org.serratec.backend.projeto05.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cartao")
public class Cartao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cartao_id")
	private Integer idCartao;
	
	@Column(name="cartao_limite")
	@NotNull
	private Double limiteCartao;
	
	@Column(name="cartao_numero")
	@NotNull
	private String numeroCartao;
	
	@Column(name="cartao_nome_titular")
	@NotNull
	private String nomeTitular;
	
	@Column(name="cartao_data_validade")
	@NotNull
	private LocalDate dataValidade;
	
	public Cartao() {}

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
