package passeioCachorro;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Bruna";
		
		p.cachorro = new Cachorro();
		
		p.cachorro.nome = "Baymax";
		
		Caminhada passeio = new Caminhada();
		passeio.caminhar(p);
	}

}
