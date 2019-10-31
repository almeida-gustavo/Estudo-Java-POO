package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		conta.saldo = 6000;
		Principal.imprimirSaldo(conta);
		System.out.println();
		//--------------------------------------------------
		
		//Voc� pode criar uma variavel do tipo Conta que � instanciada com outra Classe.. Isso tb eh polimorfismo, por�m mesmo que a instancia
		// do objeto seja ContaCorrente, ele s� consegue acessar os m�todos de Conta
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);
		System.out.println();
		//--------------------------------------------------
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		//chamar o m�todo imprimirSaldo passando o objeto contaPoupanca quando se esperava um do tipo Conta � o polimorfismo
		imprimirSaldo(contaPoupanca);
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
		
		//instanceof para saber se o objeto conta que ta sendo recebido na fun��o � na verdade do tipo classe ContaCorrente
		if (conta instanceof ContaCorrente) {
			//esse (ContaCorrente) � o casting... vc transforma o conta que nessa fun��o eh do tipo Conta em um objeto do tipo ContaCorrente
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da cc � R$" + cc.getLimite());
		}
		
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da cp � R$" + cp.getRendimentos());
		}
	}
}
