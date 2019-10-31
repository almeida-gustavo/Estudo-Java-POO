package enums;

public enum OperacaoAritimetica {

	ADICAO {
		public int operacao(int x, int y) {
			return x + y;
		}
	},
	SUBTRACAO {
		public int operacao(int x, int y) {
			return x - y;
		}
	};
	
	//chamando o método de acordo com cada enum
	public abstract int operacao(int x, int y);
}
