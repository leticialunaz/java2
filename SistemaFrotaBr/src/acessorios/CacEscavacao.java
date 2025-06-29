package acessorios;

public class CacEscavacao extends AcessorioAbstract {
	
	
	public CacEscavacao(int dentes) {
		this.aplicacao = "construção";
		this.peso = dentes * 15;
		this.capacidade = dentes * 10;
	}

}
