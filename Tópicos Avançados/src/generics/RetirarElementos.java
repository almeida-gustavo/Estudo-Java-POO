package generics;

import java.util.List;

public class RetirarElementos {

	//declarando apenas o método como generico
	//ele ta recebendo uma list do tipo genérico que pode ser qualquer uma
	public static <T> T recuperaPrimeiro(List<T> lista) {
		return lista.get(0);
	}
}
