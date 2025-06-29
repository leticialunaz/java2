package minicarregadeiras;

import acessorios.AcessorioAbstract;

public class MiniCarregadeira implements Comparable<MiniCarregadeira>{

	protected double potencia;
	protected double capacidade; 
	protected double peso;
	protected int id;
	protected AcessorioAbstract acessorio;
	protected String aplicacao;
	
	
	public MiniCarregadeira(double potencia, double capacidade, double peso) {
		this.potencia = potencia;
		this.capacidade = capacidade;
		this.peso = peso;
		this.id = 0;
		this.acessorio = null;
		this.aplicacao = "geral";
		
	}
	
	
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "MiniCar [id=" + id + ", potencia=" + potencia + ", con=" + capacidade
				+ ", peso=" + peso + ", aplicacao=" + aplicacao + "]";
	}


	public int getId() {
		return id;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	public double getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getAcessorio() {
		return acessorio.toString();
	}


	public void setAcessorio(AcessorioAbstract acessorio) {
		this.acessorio = acessorio;
		this.peso += acessorio.getPeso();
		this.capacidade += acessorio.getCapacidade();
		this.aplicacao = acessorio.getAplicacao();
	}


	public String getAplicacao() {
		return aplicacao;
	}


	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}


	@Override
	public int compareTo(MiniCarregadeira o) {
		if(o == null) {
	        throw new NullPointerException("Objeto a ser comparado não pode ser nulo");
		}
		if(getId() == null && o.getId() == null) {
			
		}
		
		
		
		return getId().compareTo(o.getId());
	}
	
	
	
	
	
	
}
