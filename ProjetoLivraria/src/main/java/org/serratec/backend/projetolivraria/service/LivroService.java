package org.serratec.backend.projetolivraria.service;

import org.serratec.backend.projetolivraria.DTO.LivroDTO;
import org.serratec.backend.projetolivraria.model.Livro;
import org.serratec.backend.projetolivraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LivroService {

	@Autowired
	LivroRepository livroRepository;
	
	
	public LivroDTO transformarDTOEmModel(Livro livro, LivroDTO livroDTO) {
		
		livroDTO.set
	}
	
}
