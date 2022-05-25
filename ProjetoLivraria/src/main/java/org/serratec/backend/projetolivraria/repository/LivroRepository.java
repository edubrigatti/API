package org.serratec.backend.projetolivraria.repository;

import org.serratec.backend.projetolivraria.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Integer>{

}
