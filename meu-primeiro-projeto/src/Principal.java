
public class Principal {

	public static void main(String[] args) {
		
		Carro variavelCarro = new Carro();
		
		variavelCarro.modelo = "Palio";
		variavelCarro.anoDeFabricacao = 2018;
		
		System.out.println("Modelo: " + variavelCarro.modelo);
		System.out.println("Ano: " + variavelCarro.anoDeFabricacao);
		
		variavelCarro.ligar();
		System.out.println("Fabricante: " + variavelCarro.fabricante);

		
	}

}
