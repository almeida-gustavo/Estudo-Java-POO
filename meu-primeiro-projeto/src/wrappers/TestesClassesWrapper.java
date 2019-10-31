package wrappers;

public class TestesClassesWrapper {

	public static void main(String[] args) {
		// byte, short, int,     long, float, double e char
		// Byte, Short, Integer, Long, Float, Double e Character
		
		int x = 5;
		Integer i = x;
		
	
		byte y = i.byteValue();
		// xxxValue();
		
		String valor = "15.5";
		Float v = Float.parseFloat(valor);
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("27"); // parseXXX
		System.out.println("Daqui a 5 anos voc� ter�: " + (idade + 5) + " anos.");
		
		try {
			double custo = Double.parseDouble("Vinte e tres reais e cinquenta centavos");
			System.out.println("Custo total: " + custo);
		} catch (NumberFormatException e) {
			System.err.println("Numero inv�lido para convers�o.");
		}
	}
}
