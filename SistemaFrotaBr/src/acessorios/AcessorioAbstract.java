package acessorios;

public abstract class AcessorioAbstract{

	protected String tipo;
	protected String aplicacao;
	protected double peso;
	protected double capacidade;
	
	
	public AcessorioAbstract() {
		this.tipo = null;
		this.aplicacao = null;
		this.peso = 0;
		this.capacidade = 0;
	}
	
	
	public abstract double setPeso(int peso);
	public abstract double setCapacidade(int capacidade);

}
