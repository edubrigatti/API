package org.serratec.backend.projetolivraria.DTO;

import java.util.Date;

public class LivroDTO {
	
	private Integer idLivro;
	private String tituloLivro;
	private String tipoLivro;
	private String autorLivro;
	private Date dataPublicacao;
	
	public LivroDTO() {}

	public LivroDTO(Integer idLivro, String tituloLivro, String tipoLivro, String autorLivro, Date dataPublicacao) {
		super();
		this.idLivro = idLivro;
		this.tituloLivro = tituloLivro;
		this.tipoLivro = tipoLivro;
		this.autorLivro = autorLivro;
		this.dataPublicacao = dataPublicacao;
	}

	public Integer getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}

	public String getTituloLivro() {
		return tituloLivro;
	}

	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}

	public String getTipoLivro() {
		return tipoLivro;
	}

	public void setTipoLivro(String tipoLivro) {
		this.tipoLivro = tipoLivro;
	}

	public String getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	
	
	

}
