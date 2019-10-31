package objetoThis;

public class Carro {


	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao; 
	boolean biCombustivel;
		
	void alterarModelo(String modelo) {
		if (modelo != null) {
			//esse é um modelo que da pra usar... teoricamente se vc tivesse passando outro
			//nome no parametro que não fosse o mesmo de uma propriedade da classe, vc não
			//precisaria usar o this... mas por convenção é bom usar
			this.modelo = modelo;
		}
	}
	
	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
}
	
}
