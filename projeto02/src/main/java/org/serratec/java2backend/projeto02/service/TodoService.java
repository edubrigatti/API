package org.serratec.java2backend.projeto02.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.serratec.java2backend.projeto02.model.Todo;
import org.serratec.java2backend.projeto02.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
//	@Autowired
//	TodoRepository todoRepository;
	
	List<Todo> lista = new ArrayList<>();
	
	public void adicionar(Todo todo) {
		lista.add(todo);
	}
	
	public List<Todo> listaTodo(){
		return this.lista;
	}
	
	public void atualizar(Integer posicaoLista, Todo todoDaApi) {
		//idTodo é posição
		Todo tododaListaSalva = new Todo();
		tododaListaSalva = lista.get(posicaoLista);
		
		tododaListaSalva.setId(todoDaApi.getId());
		tododaListaSalva.setDescricao(todoDaApi.getDescricao());
		todoDaApi.setTitulo(todoDaApi.getTitulo());
		
		}
	
	public void deletar(int posicaoLista) {
		lista.remove(posicaoLista);
	}
	
}
