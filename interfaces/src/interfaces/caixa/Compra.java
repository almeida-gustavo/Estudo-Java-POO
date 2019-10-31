package interfaces.caixa;

import interfaces.impressao.Imprimivel;
import interfaces.pagamento.Autorizavel;

//a classe Compra como implementa Autorizavel, ela precisa implementar todos os métodos que estão na interface
public class Compra implements Autorizavel, Imprimivel {

	private double valorTotal;
	private String produto;
	private String nomeCliente;
	
	
	//Esse daqui é o que veio implementado lá da interface Autorizavel
	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	
	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " - " + this.getValorTotal();
	}

	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}

	

}
