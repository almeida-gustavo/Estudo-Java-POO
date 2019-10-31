package enums;

public class Carta {

	private int numero;
	private Naipe naipe;
	
	//Construtor
	public Carta(int numero, Naipe naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}
	
	//Método
	public void imprimirCarta() {
		System.out.println("Sou " + numero + " de " + naipe 
				+ ". E tenho a cor " + naipe.getCor());
	}
}
