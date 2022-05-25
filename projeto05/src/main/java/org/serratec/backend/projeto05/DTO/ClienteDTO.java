package org.serratec.backend.projeto05.DTO;

import java.util.Date;



public class ClienteDTO {
	
	private Integer idCliente;	
	private String nome;	
	private String cpf;	
	private String numeroTelefone;
	private String email;	
	private Date dataNascimento;
	
	public  ClienteDTO() {}	
		
	public ClienteDTO(Integer idCliente, String nome, String cpf, String numeroTelefone, String email,
			Date dataNascimento) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
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
	
	public String getNumeroTelefone(){
		return numeroTelefone;
	}
	
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	

}
