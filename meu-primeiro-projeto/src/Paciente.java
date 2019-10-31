
public class Paciente {
	
	double peso;
	double altura;
	
	double calcularImc() {
		double imc =  peso / (altura * altura);
		return imc;
	}

}
