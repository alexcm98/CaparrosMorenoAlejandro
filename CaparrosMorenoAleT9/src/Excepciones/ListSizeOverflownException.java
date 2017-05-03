package Excepciones;

public class ListSizeOverflownException extends RuntimeException {

	
	public ListSizeOverflownException (String mensaje){
		super(mensaje+"NO ACEPTA MÁS DE 100 VALORES");
	}
}
