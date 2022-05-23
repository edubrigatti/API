package org.serratec.backend.projetoconta.service;

import java.util.ArrayList;

import java.util.List;

import org.serratec.backend.projetoconta.exception.ContaException;
import org.serratec.backend.projetoconta.model.Conta;
import org.springframework.stereotype.Service;

@Service
public class ContaService {
	
	List<Conta> contaBanco = new ArrayList<>();
	
	public List<Conta> listaDeContas(){
		return this.contaBanco;
	}	
	
	
	public void inserirConta (Conta numConta) {
		contaBanco.add(numConta);
	}
	
	public void deletarConta (int numConta) {
		contaBanco.remove(numConta);
	}
	
	
	public void atualizarConta(Integer numConta, Conta contaApi) {
		
		Conta bancoNovaLista = new Conta();
				
		bancoNovaLista.setNumConta(contaApi.getNumConta());
		bancoNovaLista.setTitularConta(contaApi.getTitularConta());
	}
	
	public Conta buscarContaPorId(Integer idConta) {
		Conta contaApi = new Conta();
		for(Conta conta : contaBanco) {
			if(conta.getNumConta().equals(idConta)) {
				contaApi = conta;
			}
			
		}
		return contaApi;
		
	}
	
	public Conta buscarContaPorNumero(Integer numConta) {
		Conta contaApi = new Conta();
		for(Conta conta : contaBanco) {
			if(conta.getIdConta().equals(numConta)) {
				contaApi = conta;
			}
			
		}
		return contaApi;
		
	}	
	
		
	public void creditarNaConta(Integer idConta, Double valorCredito) {
		Conta contaUsada = contaBanco.get(idConta);
		contaUsada.setSaldoConta(contaUsada.getSaldoConta() + valorCredito);
	}
	
	public void debitarDaConta(Integer idConta, Double valordebitado) throws ContaException {
		Conta contaUsada = contaBanco.get(idConta);
		if(contaUsada.getSaldoConta() >= valordebitado) {
			contaUsada.setSaldoConta(contaUsada.getSaldoConta() - valordebitado);
		} else{
			throw new ContaException(idConta);
			
		}
				
	}
		
		
	}


