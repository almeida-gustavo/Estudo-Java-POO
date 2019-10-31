
public class Principal3 {

	public static void main(String[] args) {
		Paciente p = new Paciente();
		p.altura = 1.79;
		p.peso = 84.5;
		
		System.out.println(p.calcularImc());
		double resultado = p.calcularImc();
		System.out.println(resultado);
		
	}

}
