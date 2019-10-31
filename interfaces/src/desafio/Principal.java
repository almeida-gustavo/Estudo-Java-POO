package desafio;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(92000, 320);
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		
		
		Barco meuBarco = new Barco("mac", 200);
		corretora.fazerPropostaSeguro(meuBarco);
	}
	
	
}
