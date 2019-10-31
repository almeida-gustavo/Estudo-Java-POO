package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		conta.saldo = 6000;
		Principal.imprimirSaldo(conta);
		System.out.println();
		//--------------------------------------------------
		
		//Você pode criar uma variavel do tipo Conta que é instanciada com outra Classe.. Isso tb eh polimorfismo, porém mesmo que a instancia
		// do objeto seja ContaCorrente, ele só consegue acessar os métodos de Conta
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);
		System.out.println();
		//--------------------------------------------------
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		//chamar o método imprimirSaldo passando o objeto contaPoupanca quando se esperava um do tipo Conta é o polimorfismo
		imprimirSaldo(contaPoupanca);
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
		
		//instanceof para saber se o objeto conta que ta sendo recebido na função é na verdade do tipo classe ContaCorrente
		if (conta instanceof ContaCorrente) {
			//esse (ContaCorrente) é o casting... vc transforma o conta que nessa função eh do tipo Conta em um objeto do tipo ContaCorrente
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da cc é R$" + cc.getLimite());
		}
		
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da cp é R$" + cp.getRendimentos());
		}
	}
}
