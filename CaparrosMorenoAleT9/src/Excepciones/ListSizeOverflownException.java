package Excepciones;

public class ListSizeOverflownException extends RuntimeException {

	
	public ListSizeOverflownException (String mensaje){
		super(mensaje+"NO ACEPTA M�S DE 100 VALORES");
	}
}
