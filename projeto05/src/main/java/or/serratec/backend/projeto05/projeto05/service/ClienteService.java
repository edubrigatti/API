package or.serratec.backend.projeto05.projeto05.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import or.serratec.backend.projeto05.projeto05.model.Cliente;
import or.serratec.backend.projeto05.projeto05.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public void salvar(Cliente cliente) {
		clienteRepository.save(cliente);
}

	public Cliente buscarPorId(Integer idCliente) {
		Optional<Cliente> cliente = clienteRepository.findById(idCliente);
		Cliente clienteNoBanco = new Cliente();
		if(cliente.isPresent()) {
			clienteNoBanco = cliente.get();
		}
		return clienteNoBanco;
	}
	
	public void atualizar(Integer idCliente, Cliente cliente) {
		Cliente clienteNoBanco = buscarPorId(idCliente);
		
		if(cliente.getCpf()!=null) {
		clienteNoBanco.setCpf(cliente.getCpf());
		}
		
		if(cliente.getDataNascimento()!=null) {
			clienteNoBanco.setDataNascimento(cliente.getDataNascimento());
		}
		
		if(cliente.getEmail()!=null) {
			clienteNoBanco.setEmail(cliente.getEmail());
		}
		
		if(cliente.getNome()!=null) {
			clienteNoBanco.setNome(cliente.getNome());
		}
		
		if(cliente.getNumeroTelefone()!=null) {
			clienteNoBanco.setNumeroTelefone(cliente.getNumeroTelefone());
		}
		
		clienteRepository.save(clienteNoBanco);
		
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