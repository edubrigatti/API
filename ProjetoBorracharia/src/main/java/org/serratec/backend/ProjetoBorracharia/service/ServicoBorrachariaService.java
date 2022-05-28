package org.serratec.backend.ProjetoBorracharia.service;

import java.util.Optional;

import org.serratec.backend.ProjetoBorracharia.DTO.ServicoBorrachariaDTO;
import org.serratec.backend.ProjetoBorracharia.exception.ServicoBorrachariaException;
import org.serratec.backend.ProjetoBorracharia.model.ServicoBorracharia;
import org.serratec.backend.ProjetoBorracharia.repository.ServicoBorrachariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoBorrachariaService {
	
	@Autowired
	ServicoBorrachariaRepository servicoBorrachariaRepository;
	
	public ServicoBorrachariaDTO transformarModelEmDTO(ServicoBorracharia servicoBorracharia, 
			ServicoBorrachariaDTO servicoBorrachariaDTO) {
		servicoBorrachariaDTO.setIdServico(servicoBorracharia.getIdServico());
		servicoBorrachariaDTO.setServicoPrestado(servicoBorracharia.getServicoPrestado());
		servicoBorrachariaDTO.setValorServico(servicoBorracharia.getValorServico());
		servicoBorrachariaDTO.setDataServico(servicoBorracharia.getDataServico());
		servicoBorrachariaDTO.setIdCarro(servicoBorracharia.getIdCarro());	
		
		
		return servicoBorrachariaDTO;		
	}
	
	public ServicoBorracharia transformarDTOEmModel(ServicoBorracharia servicoBorracharia, 
			ServicoBorrachariaDTO servicoBorrachariaDTO) {
		servicoBorracharia.setServicoPrestado(servicoBorrachariaDTO.getServicoPrestado());
		servicoBorracharia.setValorServico(servicoBorrachariaDTO.getValorServico());
		servicoBorracharia.setDataServico(servicoBorrachariaDTO.getDataServico());
		servicoBorracharia.setIdCarro(servicoBorrachariaDTO.getIdCarro());	
				
		return servicoBorracharia;
	}
	
	public String salvar(ServicoBorrachariaDTO servicoBorrachariaDTO) {
		ServicoBorracharia servicoBorracharia = new ServicoBorracharia();
		transformarDTOEmModel(servicoBorracharia, servicoBorrachariaDTO);
		servicoBorrachariaRepository.save(servicoBorracharia);
		return "Número do serviço criado: " + servicoBorracharia.getIdServico();
	}
	
	public ServicoBorrachariaDTO buscarPorId(Integer idServico) throws ServicoBorrachariaException{
		Optional<ServicoBorracharia> servicoBorracharia = servicoBorrachariaRepository.findById(idServico);
		ServicoBorracharia servicoNaLoja = new ServicoBorracharia();
		ServicoBorrachariaDTO servicoBorrachariaDTO = new ServicoBorrachariaDTO();
		if(servicoBorracharia.isPresent()) {
			servicoNaLoja = servicoBorracharia.get();
			transformarModelEmDTO(servicoNaLoja,servicoBorrachariaDTO);
			return servicoBorrachariaDTO;
		}
		throw new ServicoBorrachariaException("Serviço com este pedido não fora encontado.");
	}
	
	public void deletar(Integer idServico) {
		servicoBorrachariaRepository.deleteById(idServico);
	}
	
	public String atualizar(Integer idServico, ServicoBorrachariaDTO servicoBorrachariaDTO) throws ServicoBorrachariaException{
		Optional<ServicoBorracharia> servicoBorracharia = servicoBorrachariaRepository.findById(idServico);
		ServicoBorracharia servicoNaLoja = new ServicoBorracharia();
		if(servicoBorracharia.isPresent()) {
			servicoNaLoja = servicoBorracharia.get();
			if(servicoBorrachariaDTO.getServicoPrestado() != null) {
				servicoNaLoja.setServicoPrestado(servicoBorrachariaDTO.getServicoPrestado());
			}
		}
	
	}
	
	

}
