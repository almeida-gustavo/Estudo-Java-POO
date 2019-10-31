package varags;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	
	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();
		
//		correio.enviarEmails(new String[] {"joao@joao.com", "maria@maria.com"});
		
		//tá passando três strings de uma vez
		correio.enviarEmails("joao@joao.com", "maria@maria.com", "pedro@pedro.com");
		
		List<String> testes = new ArrayList<String>();
		testes.add("gustavo@email.com");
		testes.add("joao@gmail.com");
		testes.add("Teste@gmail.com");
		
		for(String teste : testes) {
			//ta passando duas string de cada vez
			correio.enviarEmails(teste, "ola");
		}
	}
}
