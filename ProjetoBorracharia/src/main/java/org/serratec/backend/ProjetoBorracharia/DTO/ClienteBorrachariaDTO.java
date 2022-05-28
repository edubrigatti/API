package org.serratec.backend.ProjetoBorracharia.DTO;

public class ClienteBorrachariaDTO {
	
	private Integer idCliente;
	private String nome;
	private String cpf;	
	private String email;
	
	public ClienteBorrachariaDTO() {}

	public ClienteBorrachariaDTO(Integer idCliente, String nome, String cpf, String email) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
