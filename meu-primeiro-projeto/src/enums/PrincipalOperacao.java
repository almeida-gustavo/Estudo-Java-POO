package enums;

public class PrincipalOperacao {


	public static void main(String[] args) {
		//chamando direto no enum
		OperacaoAritimetica o1 = OperacaoAritimetica.ADICAO;
		
		int resultado1 = o1.operacao(5, 3);
		System.out.println("O resulado é: " + resultado1);
		
		for (OperacaoAritimetica oa : OperacaoAritimetica.values()) {
			System.out.println(oa + " -> " + oa.operacao(4, 2));
		}
		
	}
}
