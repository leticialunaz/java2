package acessorios;

public class CacEscavacao extends AcessorioAbstract {
	
	private int dentes;
	private String aplicacao = "construção";
	private double peso;
	private double capacidade;
	
	
	public CacEscavacao(int dentes) {
		this.dentes = dentes;
		this.peso = setPeso(dentes);
		this.capacidade = setCapacidade(dentes);
	}


	@Override
	public double setPeso(int dentes) {
		return dentes * 15;
	}


	@Override
	public double setCapacidade(int dentes) {
		return dentes * 10;
	}
}
