package equalsAndHashCode;

import java.util.Set;

public class Principal {


	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		// De alguma forma, sorteia o nome do aluno e constrói o objeto Aluno
		Aluno alunoSorteado = new Aluno("Maria");
		
		//Ver na classe aluno o fucionamento do hash e equals
		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parabéns " + alunoSorteado.getNome() +"! Você ganhou um brinde!");
		} else {
			System.out.println("Aluno não cadastrado no banco de dados.");
		}
	}
}
