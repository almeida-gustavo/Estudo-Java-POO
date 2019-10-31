package interfaces.principal;

import interfaces.caixa.Checkout;
import interfaces.caixa.Compra;
import interfaces.impressao.Impressora;
import interfaces.impressao.impressoras.ImpressoraEpson;
import interfaces.impressao.impressoras.ImpressoraHP;
import interfaces.pagamento.Cartao;
import interfaces.pagamento.Operadora;
import interfaces.pagamento.operadoras.Cielo;
import interfaces.pagamento.operadoras.Master;

public class TesteCheckout {

	public static void main(String[] args) {

		//vc não pode criar uma instancia de objeto para interfaces, ai tem que criar as classes que implementam as interfaces referentes
		Operadora operadora = new Cielo();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Gustavo Melo");
		cartao.setNumeroCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("gustavo de aguiar melo almeida");
		compra.setProduto("banana");
		compra.setValorTotal(25);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
		
	}

}
