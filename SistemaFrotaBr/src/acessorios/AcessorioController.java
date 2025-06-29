package acessorios;

import java.util.ArrayList;
import minicarregadeiras.*;

public class AcessorioController {

	private ArrayList<AcessorioAbstract> acessorios;
	private int controle;
	private MinicarregadeiraController mc;
	
	public AcessorioController() {
		this.acessorios = new ArrayList<>();
		this.controle = 0;
		this.mc = new MinicarregadeiraController();
	}
	
	
	public int cadastraCCes(int dentes) {
		CacEscavacao cesc = new CacEscavacao(dentes);
		acessorios.add(cesc);
		controle++;
		return controle;
	}
	
	public int cadastraCCar(double largura) {
		CacCarregadora ccar = new CacCarregadora(largura);
		acessorios.add(ccar);
		controle++;
		return controle;
	}
	
	public int cadastraCGal(double larguraCorte) {
		CortGalho cgal = new CortGalho(larguraCorte);
		acessorios.add(cgal);
		controle++;
		return controle;
	}
	
	public void setAcessorio(int iDMiniCar, int iDAcessorio ) {
		if(iDAcessorio > acessorios.size() || iDAcessorio < 0) {
			throw new IllegalArgumentException("Id do acessório inválido.");
		}
		
		if(iDMiniCar < mc.minicarregadeiras.size() || iDMiniCar < 0) {
			throw new IllegalArgumentException("Id da MiniCarregadeira inválido.");
		}
		
		MiniCarregadeira atual = mc.minicarregadeiras.get(iDMiniCar);
		atual.setAcessorio(acessorios.get(iDAcessorio));

	}
}
