package or.serratec.backend.projeto05.projeto05.controller;

import java.util.List;

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

import or.serratec.backend.projeto05.projeto05.model.Cliente;
import or.serratec.backend.projeto05.projeto05.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@PostMapping("/salvar")
	public ResponseEntity<Void> salvar (@RequestBody Cliente cliente){
		clienteService.salvar(cliente);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
	@GetMapping("/buscar{idCliente")
	public ResponseEntity<Cliente> buscarPorId(@PathVariable Integer idCliente){
		return ResponseEntity.ok(clienteService.buscarPorId(idCliente));
	}
	
	@PutMapping("/atualizar{idCliente")
	public ResponseEntity<Void> delete(@PathVariable Integer idCliente, @RequestBody Cliente cliente){
		clienteService.atualizar(idCliente, cliente);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{posicaoLista}")
	public ResponseEntity<Void> deletar(@PathVariable Integer idCliente) {
		clienteService.delete(idCliente);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}	
	
	@GetMapping("/lista")
	public ResponseEntity<List<Cliente>> listaTodos(){
		return ResponseEntity.ok(clienteService.ListarTodos());		
	}
	
	@PostMapping("/salvar-lista")
	public ResponseEntity<Void> salvarLista(@RequestBody List<Cliente> listaCliente){
	clienteService.salvarTodos(listaCliente);
	return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
	

