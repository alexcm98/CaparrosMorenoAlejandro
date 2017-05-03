package Excepciones;

public class ElementNotAllowedException extends NullPointerException {

	
	
	public ElementNotAllowedException(String mensaje){
		super(mensaje+"NO ACEPTA VALORES NULOS");
	}
}
