package org.serratec.backend.projeto05.service;


import java.io.Serializable;
import java.time.LocalDate;


	import javax.persistence.Column;

	public class CartaoDTO implements Serializable{
		
		private static final long serialVersionUID = 1L;
		
		private Integer IdCartao;	
		private Double LimiteCartao;	
		private Integer NumeroCartao;		
		private String NomeTitular;	
		private LocalDate DataValidade;
		
		public CartaoDTO() {}

		public Integer getIdCartao() {
			return IdCartao;
		}

		public void setIdCartao(Integer idCartao) {
			IdCartao = idCartao;
		}

		public Double getLimiteCartao() {
			return LimiteCartao;
		}

		public void setLimiteCartao(Double limiteCartao) {
			LimiteCartao = limiteCartao;
		}

		public Integer getNumeroCartao() {
			return NumeroCartao;
		}

		public void setNumeroCartao(Integer numeroCartao) {
			NumeroCartao = numeroCartao;
		}

		public String getNomeTitular() {
			return NomeTitular;
		}

		public void setNomeTitular(String nomeTitular) {
			NomeTitular = nomeTitular;
		}

		public LocalDate getDataValidade() {
			return DataValidade;
		}

		public void setDataValidade(LocalDate dataValidade) {
			DataValidade = dataValidade;
		}
		
		
		
	}

