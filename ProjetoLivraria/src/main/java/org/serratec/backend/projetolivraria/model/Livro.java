package org.serratec.backend.projetolivraria.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="livro_cd_id")
	private Integer idLivro;
	
	@Size(min = 5, max = 30)	
	@NotNull
	@Column(name="livro_tx_titulo_livro")	
	private String tituloLivro;
	
	@Size(min = 3, max = 20)
	@NotNull
	@Column(name="livro_tx_tipo_livro")	
	private String tipoLivro;
	
	@Size(min = 10, max = 40)	
	@NotNull
	@Column(name="livro_tx_autor_livro")
	private String autorLivro;
	
	//past aceita apenas data anterior a data atual
	@Past	
	@Column(name="livro_dt_data_publicacao")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataPublicacao;	
	
	
	public Livro() {}

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
