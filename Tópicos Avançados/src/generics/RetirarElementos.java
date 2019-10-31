package generics;

import java.util.List;

public class RetirarElementos {

	//declarando apenas o m�todo como generico
	//ele ta recebendo uma list do tipo gen�rico que pode ser qualquer uma
	public static <T> T recuperaPrimeiro(List<T> lista) {
		return lista.get(0);
	}
}
