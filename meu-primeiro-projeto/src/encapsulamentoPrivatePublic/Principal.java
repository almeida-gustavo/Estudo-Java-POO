package encapsulamentoPrivatePublic;

public class Principal {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado(); // 17 - 25
		
		ar.trocarTemperatura(21);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "º");
		
		ar.trocarTemperatura(10);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "º");
		
		//ele não deixa acessar porque temperatura é private
		//ar.temperatura = 20;
	}
}
