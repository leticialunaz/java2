package acessorios;

public class CortGalho extends AcessorioAbstract {
		
		private double larguraCorte;
		private String aplicacao = "paisagismo";
		private double peso;
		private double capacidade;
		
		
		public CortGalho(double larguraCorte) {
			this.larguraCorte = larguraCorte;
			this.peso = setPeso(larguraCorte);
			this.capacidade = setCapacidade(larguraCorte);
		}


		public double setPeso(double larguraCorte) {
			return larguraCorte * 50;
		}


		public double setCapacidade(double larguraCorte) {
			return 0;
		}

}
