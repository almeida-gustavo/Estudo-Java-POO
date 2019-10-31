package Sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{

	
	protected Date dataValidade;
	
	//quando vc chama o método com o mesmo nome da classe mãe, você está fazendo uma sobreposição do método.
	public void identificar() {
		//Esse super significa que vc ta chamando o método identificar só que lá de dentro da classe MÃE (PRODUTO)
		super.identificar();
		System.out.println("Minha data de validade é: " + dataValidade);
	}
}
