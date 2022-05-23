package org.serratec.backend.projetoconta.exception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(ContaException.class)
	public ResponseEntity<String> trataTodoNotFound(ContaException exception){
		String msg = String.format("Saldo não disponível", exception.getIdConta());
		return ResponseEntity.notFound()
				.header("x-erro-msg", msg)
				.header("x-erro-code","TODO NOT FOUND")
				.header("x-erro-value", exception.getIdConta().toString())
				.build();					
	}

}
