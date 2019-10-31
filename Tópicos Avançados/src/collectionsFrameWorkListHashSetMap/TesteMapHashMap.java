package collectionsFrameWorkListHashSetMap;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Pedro");
		
		
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		//Coloca se objetos no Mash utilizando as chaves que pode ser de qualquer tipo String, Int, etc
		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		//Pode ser colocado o mesmo objeto mas não com a mesma chave... caso contrário vai sobrescrever a chave
		alunos.put("4", a4);
		alunos.put("5", a4);
		
		imprimirAlunos(alunos);
		
		//Você pode buscar o objeto utilizando a chave que vc associou a ele
		Aluno alunoRecuperado = alunos.get("3");
		System.out.println("Aluno de chave 3: " + alunoRecuperado.getNome());
	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("Nome: " + a.getNome());
		}
	}
}
