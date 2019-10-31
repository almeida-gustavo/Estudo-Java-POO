package interfaces.pagamento.operadoras;

import interfaces.pagamento.Autorizavel;
import interfaces.pagamento.Cartao;
import interfaces.pagamento.Operadora;

public class Master implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("456")
				&& autorizavel.getValorTotal() > 100; 
	}


}
