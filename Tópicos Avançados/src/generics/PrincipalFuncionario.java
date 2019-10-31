package generics;


import java.util.ArrayList;
import java.util.List;


public class PrincipalFuncionario {


	public static void main(String[] args) {
		//List e ArrayList s�o genericos, por isso vc pode colocar qualquer coisa dentro dos  < >
		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Funcionario("Jo�o"));
		funcionarios.add(new Funcionario("Maria"));
		
//		funcionarios.add("Ricardo");
				
		for (Funcionario f : funcionarios) {
			System.out.println("Nome do funcion�rio: " + f.getNome());
		}
		
	}
	
}
