package heranca;

public class Principal {

	public static void main(String[] args) {
		
		Jogador j = new Jogador();
		//Esse j tem acesso a tudo de jogador e aquilo de pessoa que está disponivel para jogador
		j.nome = "Ronaldo";
		j.idade = 33;
		
		j.seApresentar();
		j.dizerSeAindaJoga();
				
	}
}
