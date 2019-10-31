package construtor;

public class Pessoa {


	String nome;
	int idade;
	
	Pessoa(String nome) {
		this.nome = nome;
		// Inicializa��o bem complicada de fazer...
	}
	
	Pessoa(String nome, int idade) {
		this(nome); // Deve ser a primeira instru��o dentro do construtor
		//esse this acima  ta chamando o construtor Pessoa que tem apenas um parametro, ai ele 
		//vai executar tudo que tem nele, "a inicializa��o complicada" e depois volta para as 
		//linhas abaixo... isso pra que vc n�o tenha que ficar repetindo c�digo.
		this.idade = idade;
	}
}
