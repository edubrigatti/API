package org.serratec.backend.projetoconta.controller;

import java.util.List;

import org.serratec.backend.projetoconta.model.Conta;
import org.serratec.backend.projetoconta.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/conta")
public class ContaController {
	
	@Autowired
	ContaService contaService;
	
	@GetMapping("/lista")
	public List<Conta> listaDeCliente(){
		return contaService.listaDeContas();
	}
	
	@GetMapping("/{idConta}")
	public ResponseEntity<Conta>buscarContaPorId(@PathVariable Integer idConta){
		return ResponseEntity.ok(contaService.buscarContaPorId(idConta));
	}
	
	@GetMapping("/{numConta}")
	public ResponseEntity<Conta>buscarContaPorNumero(@RequestParam Integer numConta, @RequestBody Conta contaApi){
		return ResponseEntity.ok(contaService.buscarContaPorNumero(numConta));
	}
	
	@PostMapping("/inserir")
	public ResponseEntity<Void> inserirConta(@RequestBody Conta conta){
		contaService.inserirConta(conta);
		return new ResponseEntity<>(HttpStatus.CREATED);		
	}
	
	@DeleteMapping("/delete/{idConta}")
	public ResponseEntity<Void> deletarConta(@PathVariable int idConta) {
		contaService.deletarConta(idConta);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}	
	
	@PutMapping("/atualizar/{idConta}")
	public ResponseEntity<Void> atualizarConta(@RequestParam Integer numConta, @RequestBody Conta conta) {
		contaService.atualizarConta(numConta, conta);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping("/{idConta}/credito/{valorOperacao}")
	public ResponseEntity<Void> creditarNaConta(@PathVariable Integer idConta, @PathVariable Double valorOperacao){
		contaService.creditarNaConta(idConta, valorOperacao);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
		

}
