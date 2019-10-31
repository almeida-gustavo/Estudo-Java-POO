package desafio;

public class Barco implements Seguravel {

	private String nome;
	private double valor;
	
	
	public Barco(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	@Override
	public double calculcarValorApolice() {
		double valorFinal = this.valor *2;
		return valorFinal;
	}

	@Override
	public String obterDescricao() {
		return this.nome + " - " + this.valor;
	}

}
