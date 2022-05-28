package org.serratec.backend.ProjetoBorracharia.exception;

public class ServicoBorrachariaException extends Exception {

private static final long serialVersionUID = 1L;
	
	public ServicoBorrachariaException() {
		super();
	}
	
	public ServicoBorrachariaException(String message) {
		super(message);
	}
	

	public ServicoBorrachariaException(String message, Exception cause) {
		super(message, cause);
	}
	
	public ServicoBorrachariaException(Exception e) {
		super(e);
	}

}
