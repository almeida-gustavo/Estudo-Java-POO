package encapsulamentoPrivatePublic;

public class Principal {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado(); // 17 - 25
		
		ar.trocarTemperatura(21);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "�");
		
		ar.trocarTemperatura(10);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "�");
		
		//ele n�o deixa acessar porque temperatura � private
		//ar.temperatura = 20;
	}
}
