package org.serratec.backend.ProjetoBorracharia.DTO;

public class CarroBorrachariaDTO {
	
	private Integer idCarro;
	private String modeloCarro;
	private String marcaCarro;
	private String anoCarro;
	private Integer idCliente;
	private Integer idServico;
	
	
	public CarroBorrachariaDTO() {}


	public CarroBorrachariaDTO(Integer idCarro, String modeloCarro, String marcaCarro, String anoCarro,
			Integer idCliente, Integer idServico) {
		super();
		this.idCarro = idCarro;
		this.modeloCarro = modeloCarro;
		this.marcaCarro = marcaCarro;
		this.anoCarro = anoCarro;
		this.idCliente = idCliente;
		this.idServico = idServico;
	}


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
