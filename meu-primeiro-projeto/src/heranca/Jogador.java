package heranca;

public class Jogador extends Pessoa {

	//Jogador está pegando tudo de Pessoa que está protected ou public

	protected boolean aindaJoga = false;
	
	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
}
