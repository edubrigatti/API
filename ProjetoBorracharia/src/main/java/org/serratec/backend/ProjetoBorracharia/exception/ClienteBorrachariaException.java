package org.serratec.backend.ProjetoBorracharia.exception;

public class ClienteBorrachariaException extends Exception {

private static final long serialVersionUID = 1L;
	
	public ClienteBorrachariaException() {
		super();
	}
	
	public ClienteBorrachariaException(String message) {
		super(message);
	}
	

	public ClienteBorrachariaException(String message, Exception cause) {
		super(message, cause);
	}
	
	public ClienteBorrachariaException(Exception e) {
		super(e);
	}

}
