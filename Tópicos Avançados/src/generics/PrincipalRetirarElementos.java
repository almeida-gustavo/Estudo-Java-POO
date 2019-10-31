package generics;


import java.util.ArrayList;
import java.util.List;


public class PrincipalRetirarElementos {

	public static void main(String[] args) {
		List<Funcionario> nomes = new ArrayList<>();
		nomes.add(new Funcionario("Ricardo"));
		
		Funcionario f = RetirarElementos.recuperaPrimeiro(nomes);
		System.out.println(f.getNome());
	}
}
