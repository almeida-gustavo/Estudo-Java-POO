package desafioPolimorfismoEClassesAbstratas;

public class ContaReceber extends Conta {

private Cliente cliente;
	
	public ContaReceber() {
	}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public void exibirDetalhes() {
		System.out.println("\nConta a Receber");
		System.out.println("===================================");
		System.out.println("Cliente: " + this.getCliente().getNome());
		System.out.println("Descri��o: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situa��o: " + this.getSituacaoConta());
		System.out.println("===================================");
	}
	
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
