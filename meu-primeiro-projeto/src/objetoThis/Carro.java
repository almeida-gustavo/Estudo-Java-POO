package objetoThis;

public class Carro {


	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao; 
	boolean biCombustivel;
		
	void alterarModelo(String modelo) {
		if (modelo != null) {
			//esse � um modelo que da pra usar... teoricamente se vc tivesse passando outro
			//nome no parametro que n�o fosse o mesmo de uma propriedade da classe, vc n�o
			//precisaria usar o this... mas por conven��o � bom usar
			this.modelo = modelo;
		}
	}
	
	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
}
	
}
