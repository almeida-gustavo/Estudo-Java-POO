package interfaces.caixa;

import interfaces.impressao.Impressora;
import interfaces.pagamento.Cartao;
import interfaces.pagamento.Operadora;

public class Checkout {
	
	//Operadora e Impressora são interfaces então elas aceitam qualquer objeto que esteja implementando elas.
	//Nessa caso eh Operadora que está recebendo a Classe Cielo que implementa a Operadora e por isso ela eh aceitavel.
	private Operadora operadora;
	private Impressora impressora;
	
	
	//Construtor
	public Checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		//boolean autorizado = this.operadora.autorizar(autorizavel, cartao)
		//o documento autorizavel é alguem que implementa a interface autorizavel que no caso eh compra
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if(autorizado) {
			//compra também está implementando o imprimivel do método imprimir por isso vc pode usar o compra aqui
			this.impressora.imprimir(compra);
		}else {
			System.out.println("pagamento foi negado");
		}

	}

}
