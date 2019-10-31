package abstratas;

public abstract class Produto {


	protected String descricao;
	
	public abstract void imprimirDescricao();
	
	public String getDescricao() {
		return descricao;
	}
}
