package or.serratec.backend.projeto05.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import or.serratec.backend.projeto05.DTO.ClienteDTO;
import or.serratec.backend.projeto05.model.Cliente;
import or.serratec.backend.projeto05.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public void salvar(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		Cliente clienteSalvar  = transformarClienteEntidadeEmClienteDTOEmClienteMOdel(clienteDTO, cliente);
		clienteRepository.save(clienteSalvar);
}
	
	public Cliente transformarClienteEntidadeEmClienteDTOEmClienteMOdel(ClienteDTO clienteDTO, Cliente cliente) {
		// não etamos o id pois o mesmo é autmoático na classe
		//clienteDTO.setIdCliente(cliente.getId());
		cliente.setNome(clienteDTO.getNome());
		cliente.setCpf(clienteDTO.getCpf());
		cliente.setEmail(clienteDTO.getEmail());
		cliente.setNumeroTelefone(clienteDTO.getNumeroTelefone());
		cliente.setDataNascimento(clienteDTO.getDataNascimento());
		
		return cliente;
	}
	
	public ClienteDTO transformarClienteEntidadeEmClienteDTO(ClienteDTO clienteDTO, Cliente cliente) {
		clienteDTO.setIdCliente(cliente.getId());
		clienteDTO.setNome(cliente.getNome());
		clienteDTO.setCpf(cliente.getCpf());
		clienteDTO.setEmail(cliente.getEmail());
		clienteDTO.setNumeroTelefone(cliente.getNumeroTelefone());
		clienteDTO.setDataNascimento(cliente.getDataNascimento());
		
		return clienteDTO;
	}
	
	
	public ClienteDTO buscarPorId(Integer idCliente) {
		Optional<Cliente> cliente = clienteRepository.findById(idCliente);
		//cliente vazio
		Cliente clienteNoBanco = new Cliente();
		//clienteDTO vazio
		ClienteDTO clienteDTO = new ClienteDTO();
		
		if(cliente.isPresent()) {
			//cliente vazio recebe cliente do banco
			clienteNoBanco = cliente.get();
			clienteDTO = transformarClienteEntidadeEmClienteDTO(clienteDTO, clienteNoBanco);
		}
		return clienteDTO;
	}
	
	public void atualizar(Integer idCliente, ClienteDTO clienteDTO) {
		Optional<Cliente> cliente = clienteRepository.findById(idCliente);
		Cliente clienteNoBanco = new Cliente();
		
	if(cliente.isPresent()) {
		clienteNoBanco = cliente.get();
		if(clienteDTO.getCpf()!=null) {
		clienteNoBanco.setCpf(clienteDTO.getCpf());
		}
		
		if(clienteDTO.getDataNascimento()!=null) {
			clienteNoBanco.setDataNascimento(clienteDTO.getDataNascimento());
		}
		
		if(clienteDTO.getEmail()!=null) {
			clienteNoBanco.setEmail(clienteDTO.getEmail());
		}
		
		if(clienteDTO.getNome()!=null) {
			clienteNoBanco.setNome(clienteDTO.getNome());
		}
		
		if(clienteDTO.getNumeroTelefone()!=null) {
			clienteNoBanco.setNumeroTelefone(clienteDTO.getNumeroTelefone());
		}
		
		clienteRepository.save(clienteNoBanco);
		
		}
	}
	
	public void delete(Integer idCliente) {
		clienteRepository.deleteById(idCliente);
	}
	
	public List<Cliente> ListarTodos(){
		return clienteRepository.findAll();
	}
	
	public void salvarTodos(List<Cliente> listaCliente) {
		clienteRepository.saveAll(listaCliente);
	}

	
}