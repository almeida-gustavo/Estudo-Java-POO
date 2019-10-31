
public class Principal2 {

	public static void main(String[] args) {
		Proprietario dono = new Proprietario();
		dono.nome ="gustavo";
		dono.cpf = "123.238.365.951";
		dono.idade = 20;
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2018;
		meuCarro.proprietario = dono;
		
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
		System.out.println(meuCarro.proprietario.nome);

		

	} 

}
