package Sobreposicao;

import java.util.Date;

public class Principal {

	

	public static void main(String[] args) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Caixa de f�sforo";
		pp.dataValidade = new Date();
		pp.identificar();
	}
}
