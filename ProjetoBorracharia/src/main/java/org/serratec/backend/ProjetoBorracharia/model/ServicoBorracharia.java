package org.serratec.backend.ProjetoBorracharia.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servico")
public class ServicoBorracharia implements Serializable {
	
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	@Column(name="servico_cd_id_servico")
	private Integer idServico;
	
	@Column(name="servico_tx_servico_prestado")
	private String servicoPrestado;
	
	@Column(name="servico_db_valor_servico")
	private Double valorServico;
	
	@Column(name="servico_dt_data_servico")
	private LocalDate dataServico;

	@Column(name="servico_cd_id_cliente")
	private Integer idCliente;
	
	@Column(name="servico_cd_id_carro")
	private Integer idCarro;
	
	public ServicoBorracharia() {}
	
	
	public Integer getIdCarro() {
		return idCarro;
	}


	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}


	public Integer getIdServico() {
		return idServico;
	}

	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}

	public String getServicoPrestado() {
		return servicoPrestado;
	}

	public void setServicoPrestado(String servicoPrestado) {
		this.servicoPrestado = servicoPrestado;
	}

	public Double getValorServico() {
		return valorServico;
	}

	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}

	public LocalDate getDataServico() {
		return dataServico;
	}

	public void setDataServico(LocalDate dataServico) {
		this.dataServico = dataServico;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	
}
