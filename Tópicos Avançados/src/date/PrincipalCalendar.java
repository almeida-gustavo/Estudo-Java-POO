package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrincipalCalendar {

	public static void main(String[] args) {
		
	
	Calendar c = new GregorianCalendar();
		
	c.set(GregorianCalendar.DAY_OF_MONTH, 31);
	c.set(GregorianCalendar.MONTH, 0);
	c.set(GregorianCalendar.YEAR, 2010);
	c.set(GregorianCalendar.HOUR_OF_DAY, 10);
	c.set(GregorianCalendar.MINUTE, 30);
	c.set(GregorianCalendar.SECOND, 0);
	
	DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	System.out.println(formatador.format(c.getTime()));
	
	//o add vai ir somando como se vc tivesse em um calendário real
	c.add(GregorianCalendar.MONTH, 1);
	System.out.println(formatador.format(c.getTime()));
	//indo pro mês de março
	c.add(GregorianCalendar.DAY_OF_MONTH, 1);
	System.out.println(formatador.format(c.getTime()));
	
	//o roll só vai rolar a data do dia mes ou ano e não vai serguir o padrão do calendario
	c.roll(GregorianCalendar.DAY_OF_MONTH,-2);
	System.out.println(formatador.format(c.getTime()));

	
}

}