package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(hoje));
		
		//Formatando de string para data
		String dataAniversario = "20/01/1985";
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
		//quando fizer isso necessariamente vc precisa usar o try catch porque ele manda uma exceção checada
		try {
			Date aniversario = formatador2.parse(dataAniversario);
			System.out.println(formatador.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de data inválido");
		}
	}
}
