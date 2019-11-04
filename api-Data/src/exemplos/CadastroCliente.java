package exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import model.Cliente;

public class CadastroCliente {

	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(1988, Month.AUGUST, 13));
		
		//PARA DESCOBRIR A QUANTIDADE DE ANOS, MAS VC PODE PEGAR VARIAS OUTRAS COISAS COMO DIA, SEMANA E TAL
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if (idade >= 18) {
			System.out.printf("OK, pode ser cadastrado. Sua idade é: %d", idade);
		} else {
			System.err.printf("Sua idade é: %d. Então não pode ter carteira.", idade);
		}
	
		System.out.println();
		System.out.println(LocalDate.now());
		
	}
	
}
