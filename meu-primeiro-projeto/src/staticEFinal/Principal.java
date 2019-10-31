package staticEFinal;

public class Principal {


	public static void main(String[] args) {
		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);
		
		//este método é da MatematicaUtil que está marcada como static
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("Área do círculo: " + areaCirculo);
	}

}
