package Models;

import Models.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import Excepciones.ElementNotAllowedException;
import Excepciones.ListSizeOverflownException;

public class ListaOrdenada<T> extends ArrayList<T>{
	
private static Persona p;

	ArrayList<ListaOrdenada> lista = new ArrayList<ListaOrdenada>();
	
	


	public ListaOrdenada(Comparator<T> comp,ArrayList<ListaOrdenada> lista) {
		super();
		this.lista = lista;
	}







	public void reverse(){
		
		
	}
	
	
	
	@Override
	public boolean add(T element) {
		if(lista.size()== 100){
			throw new ListSizeOverflownException("");
		}
	   else if(element.equals(null)){
			throw new ElementNotAllowedException("");
		}else{
			lista.add((ListaOrdenada) element);
		}
		
		return super.add(element);
	}


	public T min(Collection<? extends T>coll,Comparator<? super T>comp){
		
		return;
	}
	
    public T max(Collection<? extends T>coll,Comparator<? super T>comp){
		
		return;
	}
	
	
	
	
	
	
	
	
}
