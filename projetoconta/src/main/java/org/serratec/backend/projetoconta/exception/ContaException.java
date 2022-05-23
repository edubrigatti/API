package org.serratec.backend.projetoconta.exception;

public class ContaException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private Integer idConta;
	
	public ContaException(Integer idConta) {
		this.idConta = idConta;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setId(Integer idConta) {
		this.idConta = idConta;
	}
}
