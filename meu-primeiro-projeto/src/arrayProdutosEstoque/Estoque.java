package arrayProdutosEstoque;

public class Estoque {

	//iniciando um variavel de array da classe Produto
	Produto[] produtos;
	
	void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("------------------------");
				
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}
}
