package org.serratec.backend.projeto05.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="cliente")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cliente_cd_id")
	private Integer idCliente;
	
	@Column(name="cliente_tx_nome")
	private String nome;
	
	@Column(name="cliente_tx_cpf")
	private String cpf;	
	
	@Column(name="cliente_tx_numero_telefone")
	private String numeroTelefone;
	
	@Column(name="cliente_tx_email")
	private String email;
	
	@Column(name="cliente_dt_nascimento", unique = true)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	
		
	public Cliente() {}

	public Integer getId() {
		return idCliente;
	}

	public void setId(Integer idCliented) {
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

	public String getNumeroTelefone() {
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
