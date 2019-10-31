package Sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{

	
	protected Date dataValidade;
	
	//quando vc chama o m�todo com o mesmo nome da classe m�e, voc� est� fazendo uma sobreposi��o do m�todo.
	public void identificar() {
		//Esse super significa que vc ta chamando o m�todo identificar s� que l� de dentro da classe M�E (PRODUTO)
		super.identificar();
		System.out.println("Minha data de validade �: " + dataValidade);
	}
}
