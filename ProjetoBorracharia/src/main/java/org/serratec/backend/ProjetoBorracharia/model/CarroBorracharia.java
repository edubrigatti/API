package org.serratec.backend.ProjetoBorracharia.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="carro")
public class CarroBorracharia implements Serializable {
	
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="carro_cd_id")
	private Integer idCarro;
	
	@Column(name="carro_tx_modelo")
	private String modeloCarro;
	
	@Column(name="carro_tx_marca")
	private String marcaCarro;
	
	@Column(name="carro_tx_ano")
	private String anoCarro;	
	
	@Column(name="carro_cd_id_cliente")
	private Integer idCliente;
	
	@Column(name="carro_cd_id_servico")
	private Integer idServico;
	
		
//	@JsonIgnore
//	@ManyToOne(mappedBy = "carro")
//	private List<ClienteBorracharia> listaClienteBorracharia;
//	
	public CarroBorracharia() {}


	public Integer getIdCarro() {
		return idCarro;
	}


	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}


	public String getModeloCarro() {
		return modeloCarro;
	}


	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}


	public String getMarcaCarro() {
		return marcaCarro;
	}


	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}


	public String getAnoCarro() {
		return anoCarro;
	}


	public void setAnoCarro(String anoCarro) {
		this.anoCarro = anoCarro;
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public Integer getIdServico() {
		return idServico;
	}


	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}


	
	
	
}
