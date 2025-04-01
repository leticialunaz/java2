package acessorios;

import java.util.ArrayList;

public class AcessorioController {

	private ArrayList<AcessorioAbstract> acessorios;
	private int controle;
	
	public AcessorioController() {
		this.acessorios = new ArrayList<>();
		this.controle = 0;
	}
	
	
	public int cadastraCCes(int dentes) {
		CacEscavacao cesc = new CacEscavacao(dentes);
		acessorios.add(cesc);
		controle++;
		return controle;
	}
	
	public int cadastraCCar(double largura) {
		CacEscavacao cesc = new CacEscavacao(dentes);
		acessorios.add(cesc);
		controle++;
		return controle;
	}
	
	public int cadastraCGal(double larguraCorte) {
		
	}
	
	public void setAcessorio(int iDMiniCar, int iDAcessorio ) {
		
	}
}
