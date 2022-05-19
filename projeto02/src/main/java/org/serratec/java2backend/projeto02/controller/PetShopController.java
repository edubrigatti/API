package org.serratec.java2backend.projeto02.controller;

import java.util.Arrays;
import java.util.List;

import org.serratec.java2backend.projeto02.model.PetShop;
import org.serratec.java2backend.projeto02.service.PetShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/petshop")
public class PetShopController {	
		
		@Autowired
		PetShopService petShopService;
		
		@GetMapping("/listapet{posicaoLista}")
		public List<PetShop> getPetShop(@PathVariable Integer posicaoLista){
			return petShopService.ListaPetShop();
		}
		
		@PostMapping("/adicionarpet")
		public void adicionar(@RequestBody PetShop petshop) {
			petShopService.adicionar(petshop);
		}
		
//		@PutMapping("/atualizarpet")
//		public void atualizar(@RequestParam Integer posicaoLista, @RequestBody PetShop petshopDaApi) {
//			petShopService.atualizar(posicaoLista, petshopDaApi);
//		}
		
		@PutMapping("/atualizarpet/{posicaolista}")
		public void atualizar(@PathVariable Integer posicaoLista, @RequestBody PetShop petshopDaApi) {
			petShopService.atualizar(posicaoLista, petshopDaApi);
		}
		
		@DeleteMapping("/deletarpet/{posicaoLista}")
		public void deletar(@PathVariable int posicaoLista) {
			petShopService.deletar(posicaoLista);
		}
}


