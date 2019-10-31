package preco;

public class Principal {

	public static void main(String[] args) {

		Preco preco1 = new Preco();
		preco1.valorCustos = 140;
		
		Produto produto = new Produto();
		produto.definirPreco(preco1, 20, 15);
		
		System.out.println("Valor custos: " + preco1.valorCustos);
		System.out.println("Valor impostos: " + preco1.valorImpostos);
		System.out.println("Valor lucro: " + preco1.valorLucro);
		System.out.println("Preço venda: " + preco1.precoVenda);
		
	}

}
