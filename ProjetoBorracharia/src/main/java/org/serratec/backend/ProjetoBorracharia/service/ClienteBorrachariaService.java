package org.serratec.backend.ProjetoBorracharia.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.serratec.backend.ProjetoBorracharia.DTO.ClienteBorrachariaDTO;
import org.serratec.backend.ProjetoBorracharia.exception.ClienteBorrachariaException;
import org.serratec.backend.ProjetoBorracharia.model.ClienteBorracharia;
import org.serratec.backend.ProjetoBorracharia.repository.CarroBorrachariaRepository;
import org.serratec.backend.ProjetoBorracharia.repository.ClienteBorrachariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteBorrachariaService {
	
	@Autowired
	ClienteBorrachariaRepository clienteBorrachariaRepository;
	
	@Autowired
	CarroBorrachariaRepository carroBorrachariaRepository;
	
	
	public ClienteBorrachariaDTO transformarModelEmDTO(ClienteBorracharia clienteBorracharia, 
			ClienteBorrachariaDTO clienteBorrachariaDTO) {
		clienteBorrachariaDTO.setIdCliente(clienteBorracharia.getIdCliente());
		clienteBorrachariaDTO.setNome(clienteBorracharia.getNome());
		clienteBorrachariaDTO.setCpf(clienteBorracharia.getCpf());
		clienteBorrachariaDTO.setEmail(clienteBorracharia.getEmail());
		
		return clienteBorrachariaDTO;		
	}
	
	public ClienteBorracharia transformarDTOEmModel(ClienteBorracharia clienteBorracharia, 
			ClienteBorrachariaDTO clienteBorrachariaDTO) {
		clienteBorracharia.setIdCliente(clienteBorrachariaDTO.getIdCliente());
		clienteBorracharia.setNome(clienteBorrachariaDTO.getNome());
		clienteBorracharia.setCpf(clienteBorrachariaDTO.getCpf());
		clienteBorracharia.setEmail(clienteBorrachariaDTO.getEmail());
		
		return clienteBorracharia;
	}
	
	public String salvar(ClienteBorrachariaDTO clienteBorrachariaDTO) {
		ClienteBorracharia clienteBorracharia = new ClienteBorracharia();
		transformarDTOEmModel(clienteBorracharia, clienteBorrachariaDTO);
		clienteBorrachariaRepository.save(clienteBorracharia);
		return "O cliente criado foi com o id: "+clienteBorracharia.getIdCliente();		
	}
	
	public ClienteBorrachariaDTO buscarPorId(Integer idCliente) throws ClienteBorrachariaException{
		Optional<ClienteBorracharia> clienteBorracharia = clienteBorrachariaRepository.findById(idCliente);
		ClienteBorracharia ClienteBorrachariaNaLoja = new ClienteBorracharia();
		ClienteBorrachariaDTO clienteBorrachariaDTO = new ClienteBorrachariaDTO();
		if(clienteBorracharia.isPresent()) {
			ClienteBorrachariaNaLoja = clienteBorracharia.get();
			transformarModelEmDTO(ClienteBorrachariaNaLoja,clienteBorrachariaDTO);
			return clienteBorrachariaDTO;
		}
		throw new ClienteBorrachariaException("Cliente com o id informado nao encontrado");
	}
	
	public void deletar(Integer idCliente) {
		clienteBorrachariaRepository.deleteById(idCliente);
	}
	
	public String atualizar(Integer idCliente,ClienteBorrachariaDTO clienteBorrachariaDTO) throws ClienteBorrachariaException {
		Optional<ClienteBorracharia> clienteBorracharia = clienteBorrachariaRepository.findById(idCliente);
		ClienteBorracharia ClienteBorrachariaLoja = new ClienteBorracharia();
		if (clienteBorracharia.isPresent()) {
			ClienteBorrachariaLoja = clienteBorracharia.get();
			if (clienteBorrachariaDTO.getNome() != null) {
				ClienteBorrachariaLoja.setNome(clienteBorrachariaDTO.getNome());
			}
			if (clienteBorrachariaDTO.getCpf() != null) {
				ClienteBorrachariaLoja.setNome(clienteBorrachariaDTO.getNome());
			}
			
			if (clienteBorrachariaDTO.getEmail() != null) {
				ClienteBorrachariaLoja.setEmail(clienteBorrachariaDTO.getEmail());
			}
			clienteBorrachariaRepository.save(ClienteBorrachariaLoja);
			return "O cliente com o id "+ClienteBorrachariaLoja.getIdCliente()+" foi atualizado";
		}
		throw new ClienteBorrachariaException("O cliente nao foi atualizado");
	}
		
	public List<ClienteBorrachariaDTO> buscarTodos(){
		List<ClienteBorracharia> listaClienteBorrachariaModel = clienteBorrachariaRepository.findAll();
		List<ClienteBorrachariaDTO> listaClienteBorrachariaDTO= new ArrayList<>();
		
		
		for (ClienteBorracharia clienteBorracharia : listaClienteBorrachariaModel) {
			ClienteBorrachariaDTO clienteBorrachariaDTO = new ClienteBorrachariaDTO();
			transformarModelEmDTO(clienteBorracharia,clienteBorrachariaDTO);
			listaClienteBorrachariaDTO.add(clienteBorrachariaDTO);
		}
		
		return listaClienteBorrachariaDTO;
	}
	
	public void salvarListaClienteBorracharia(List<ClienteBorrachariaDTO> listaClienteBorrachariaDTO) {
		for(ClienteBorrachariaDTO clienteBorrachariaDTO : listaClienteBorrachariaDTO) {
			ClienteBorracharia clienteBorracharia = new ClienteBorracharia();
			transformarDTOEmModel(clienteBorracharia, clienteBorrachariaDTO);
			clienteBorrachariaRepository.save(clienteBorracharia);
		}
	}
		
	}
	


