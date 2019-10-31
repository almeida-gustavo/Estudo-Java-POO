package construtor;

public class Pessoa {


	String nome;
	int idade;
	
	Pessoa(String nome) {
		this.nome = nome;
		// Inicialização bem complicada de fazer...
	}
	
	Pessoa(String nome, int idade) {
		this(nome); // Deve ser a primeira instrução dentro do construtor
		//esse this acima  ta chamando o construtor Pessoa que tem apenas um parametro, ai ele 
		//vai executar tudo que tem nele, "a inicialização complicada" e depois volta para as 
		//linhas abaixo... isso pra que vc não tenha que ficar repetindo código.
		this.idade = idade;
	}
}
