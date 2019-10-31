package numeros.desafio;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

		System.out.println("Valor do produto:");
		double valor = entrada.nextDouble();
	
		BigDecimal numero = new BigDecimal(valor);
		numero = numero.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		
		String valorFormatado = formatador.format(numero);
		System.out.println("10% do valor é: " + valorFormatado);
		}
	
	
}
