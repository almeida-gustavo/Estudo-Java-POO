package interfaces.impressao.impressoras;

import interfaces.impressao.Impressora;
import interfaces.impressao.Imprimivel;

public class ImpressoraHP implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("ESSE EH O TESTE DA IMPRESSORA HP");
	
	}

}
