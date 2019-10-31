package generics;


import java.util.ArrayList;
import java.util.List;

//gaveta eh uma classe generica assim como List e ArrayList que podem ser de qualquer tipo
public class Gaveta<E> {

	//nesse caso a list que ela eh é dela mesmo...
	private List<E> colecao = new ArrayList<>();
	
	public void colocar(E e) {
		colecao.add(e);
	}
	
	public E retirarPrimeiro() {
		return colecao.get(0);
	}
}
