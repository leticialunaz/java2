package acessorios;

public class CacCarregadora extends AcessorioAbstract {
	
	public CacCarregadora(double largura) {
		this.peso = largura * 200;
		this.capacidade = largura / 0.004;
		this.aplicacao = "agricultura";
	}

}