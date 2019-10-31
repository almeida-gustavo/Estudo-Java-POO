package sobrecarga;

public class Principal {


	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();
		
		
		Pessoa pessoa = new Pessoa("José", 32);
		//primeiro método cadastrar pessoa passando objeto
		cadastro.cadastrar(pessoa);
		
		// -------------------------------------
		
		//segundo método cadastrar pessoa passando string e int
		cadastro.cadastrar("Maria", 25);
		
		//terceiro método cadastrar pessoa passando aoenas string
		cadastro.cadastrar("Gustavo");
	}
}
