package heranca;

public class Jogador extends Pessoa {

	//Jogador est� pegando tudo de Pessoa que est� protected ou public

	protected boolean aindaJoga = false;
	
	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
}
