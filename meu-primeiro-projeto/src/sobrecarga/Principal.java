package sobrecarga;

public class Principal {


	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();
		
		
		Pessoa pessoa = new Pessoa("Jos�", 32);
		//primeiro m�todo cadastrar pessoa passando objeto
		cadastro.cadastrar(pessoa);
		
		// -------------------------------------
		
		//segundo m�todo cadastrar pessoa passando string e int
		cadastro.cadastrar("Maria", 25);
		
		//terceiro m�todo cadastrar pessoa passando aoenas string
		cadastro.cadastrar("Gustavo");
	}
}
