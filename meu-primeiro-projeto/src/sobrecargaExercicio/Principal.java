package sobrecargaExercicio;

public class Principal {

	public static void main(String[] args) {
		MaquinaCafe maquinaCafe = new MaquinaCafe();
		
		maquinaCafe.acucarDisponivel = 30;
		
		maquinaCafe.fazerCafe();
		maquinaCafe.fazerCafe(12);
		maquinaCafe.fazerCafe(35);
	}
}
