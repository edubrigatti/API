package org.serratec.java2backend.projeto02.service;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.serratec.java2backend.projeto02.model.PetShop;
import org.serratec.java2backend.projeto02.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PetShopService {	
	
	
	List<PetShop> lista = new ArrayList<>();
	
	public void adicionar(PetShop petshop) {
		lista.add(petshop);		
	}
	
	public List<PetShop> ListaPetShop(){
		return this.lista;
	}
	
	public void atualizar(Integer posicaoLista, PetShop petshopDaApi) {
		
		PetShop petshopdaListaSalva = new PetShop();
		petshopdaListaSalva = lista.get(posicaoLista);
		
		petshopdaListaSalva.setId(petshopDaApi.getId());
		petshopdaListaSalva.setDescricao(petshopDaApi.getDescricao());
		petshopdaListaSalva.setTitulo(petshopDaApi.getTitulo());
		
		}
	
	public void deletar(int posicaoLista) {
		lista.remove(posicaoLista);
	}
		
	}
	
	

