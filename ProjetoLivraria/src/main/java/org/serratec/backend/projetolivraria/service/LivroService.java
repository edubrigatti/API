package org.serratec.backend.projetolivraria.service;

import java.util.List;
import java.util.Optional;

import org.serratec.backend.projetolivraria.DTO.LivroDTO;
import org.serratec.backend.projetolivraria.exception.LivroException;
import org.serratec.backend.projetolivraria.model.Livro;
import org.serratec.backend.projetolivraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

	@Autowired
	LivroRepository livroRepository;

	public LivroDTO transformarModelEmDTO(Livro livro, LivroDTO livroDTO) {

		livroDTO.setIdLivro(livro.getIdLivro());
		livroDTO.setTituloLivro(livro.getTituloLivro());
		livroDTO.setTipoLivro(livro.getTipoLivro());
		livroDTO.setAutorLivro(livro.getAutorLivro());
		livroDTO.setDataPublicacao(livro.getDataPublicacao());

		return livroDTO;
	}

	public Livro transformarDTOEmModel(Livro livro, LivroDTO livroDTO) {

		// o id é cadastrado automaticamente
		livro.setTituloLivro(livroDTO.getTituloLivro());
		livro.setTipoLivro(livroDTO.getTipoLivro());
		livro.setAutorLivro(livroDTO.getAutorLivro());
		livro.setDataPublicacao(livroDTO.getDataPublicacao());

		return livro;
	}

	public String salvar(LivroDTO livroDTO) {
		Livro livro = new Livro();
		transformarDTOEmModel(livro, livroDTO);
		livroRepository.save(livro);
		return "O cartao criado foi com o id: " + livro.getIdLivro();
	}

	public LivroDTO buscarPorId(Integer idLivro) throws LivroException {
		Optional<Livro> livro = livroRepository.findById(idLivro);
		Livro livroNaLivraria = new Livro();
		LivroDTO livroDTO = new LivroDTO();
		if (livro.isPresent()) {
			livroNaLivraria = livro.get();
			transformarModelEmDTO(livroNaLivraria, livroDTO);
			return livroDTO;
		}
		throw new LivroException("Livro com o id informado não foi encontrado");
	}

	public void atualizar(Integer idLivro, LivroDTO livroDTO) {
		Optional<Livro> livro = livroRepository.findById(idLivro);
		Livro livroNaLivraria = new Livro();

		if (livro.isPresent()) {
			livroNaLivraria = livro.get();
			if (livroDTO.getTituloLivro() != null) {
				livroNaLivraria.setTituloLivro(livroDTO.getTituloLivro());
			}

			if (livroDTO.getTipoLivro() != null) {
				livroNaLivraria.setTipoLivro(livroDTO.getTipoLivro());
			}

			if (livroDTO.getAutorLivro() != null) {
				livroNaLivraria.setAutorLivro(livroDTO.getAutorLivro());
			}

			if (livroDTO.getDataPublicacao() != null) {
				livroNaLivraria.setDataPublicacao(livroDTO.getDataPublicacao());
			}

			livroRepository.save(livroNaLivraria);
		}
	}

	public void deletar(Integer idLivro) {
		livroRepository.deleteById(idLivro);
	}

	public List<Livro> ListarTodos() {
		return livroRepository.findAll();
	}

	public void salvarTodos(List<Livro> listaLivro) {
		livroRepository.saveAll(listaLivro);
	}

}
