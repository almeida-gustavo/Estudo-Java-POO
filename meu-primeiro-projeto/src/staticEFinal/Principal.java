package staticEFinal;

public class Principal {


	public static void main(String[] args) {
		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("N�mero de Fibonacci da posi��o 8: " + numeroFibonacci);
		
		//este m�todo � da MatematicaUtil que est� marcada como static
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("�rea do c�rculo: " + areaCirculo);
	}

}
