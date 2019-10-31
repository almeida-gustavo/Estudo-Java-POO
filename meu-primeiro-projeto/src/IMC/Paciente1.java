package IMC;

public class Paciente1 {

	double peso;
	double altura;
	
	//Fun��o do tipo Imc que � uma classe... � o mesmo esquema de quando � double, int, float etc.
	Imc calcularIndiceDeMassaCorporal() {
		Imc imc = new Imc();
		double indice = peso / (altura * altura);
		imc.indice = indice;
		
		if (indice < 18.5) {
			imc.abaixoDoPesoIdeal = true;
		} else if (indice < 25) {
			imc.pesoIdeal = true;
		} else {
			imc.obeso = true;
			
			if (indice < 30) {
				imc.grauObesidade = "Acima do peso";  
			} else if (indice < 35) {
				imc.grauObesidade = "I";
			} else if (indice < 40) {
				imc.grauObesidade = "II";
			} else {
				imc.grauObesidade = "III";
			}
		}
		
		return imc;
	}

}
