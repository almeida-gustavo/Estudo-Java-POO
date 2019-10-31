

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	
	//colocando para associar uma classe dentro da outra
	Proprietario proprietario;
	
	//Criando método dentro da sua classe.
	void ligar() {
		//ele não vai fazer as coisas abaixo se o modelo for null
		if(modelo == null) {
			return;
		}
		System.out.println("LIGANDO O CARRO");
		this.fabricante = "GUSTAVO";
	}

}
