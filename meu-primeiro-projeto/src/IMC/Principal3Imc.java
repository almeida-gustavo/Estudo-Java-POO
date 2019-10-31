package IMC;

public class Principal3Imc {

	public static void main(String[] args) {
		Paciente1 p = new Paciente1();
		p.peso = 100;
		p.altura = 1.65;
		
		//tem que ser do tipo Imc porque o resultado tem que retornar o mesmo tipo que o método está retornando;
		//se o método fosse int, ai o resultadoImc teria que ser int também.
		Imc resultadoImc = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("Abaixo do peso ideal: " + resultadoImc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + resultadoImc.pesoIdeal);
		System.out.println("Obeso: " + resultadoImc.obeso);
		System.out.println("Grau de obesidade: " + resultadoImc.grauObesidade);
	}
	
}
