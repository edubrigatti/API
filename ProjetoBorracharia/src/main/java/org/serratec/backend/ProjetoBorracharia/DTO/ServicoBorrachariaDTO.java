package org.serratec.backend.ProjetoBorracharia.DTO;

import java.time.LocalDate;

public class ServicoBorrachariaDTO {
	
	private Integer idServico;
	private String servicoPrestado;
	private Double valorServico;
	private LocalDate dataServico;
	private Integer idCarro;
	private Integer idCliente;
	
	public ServicoBorrachariaDTO() {}

	public ServicoBorrachariaDTO(Integer idServico, String servicoPrestado, Double valorServico, LocalDate dataServico,
			Integer idCarro, Integer idCliente) {
		super();
		this.idServico = idServico;
		this.servicoPrestado = servicoPrestado;
		this.valorServico = valorServico;
		this.dataServico = dataServico;
		this.idCarro = idCarro;
		this.idCliente = idCliente;
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

	public Integer getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	
	

}
