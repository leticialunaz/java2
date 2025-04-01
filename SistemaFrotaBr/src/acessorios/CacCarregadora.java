package acessorios;
mas 
public class CacCarregadora extends AcessorioAbstract {
	
	private double largura;
	private String aplicacao = "agricultura";
	private double peso;
	private double capacidade;
	
	
	public CacCarregadora(double largura) {
		this.largura = largura;
		this.peso = setPeso(largura);
		this.capacidade = setCapacidade(largura);
	}


	@Override
	public double setPeso(double largura) {
		return largura * 200;
	}


	public double setCapacidade(double largura) {
		return largura/0.004;
	}


}