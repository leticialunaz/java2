package exercises;

import java.util.*;

public class WordCloud {
	
		private HashMap<String, Integer> frequencias;
		
		public WordCloud() {
			this.frequencias = new HashMap<String, Integer>();
		}
		
		public  void registraFreq(String texto) {
			String[] palavras = texto.split(" ");
			
			for(String palavra : palavras) {
				this.frequencias.put(palavra, frequencias.getOrDefault(palavra, 0) + 1);
			}
		}
		
		public int getFreq(String palavra) {
			return this.frequencias.getOrDefault(palavra, 0);
		}
		
		

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        WordCloud wc = new WordCloud();

	        String linha = sc.nextLine();

	        wc.registraFreq(linha);
	      

	        while (sc.hasNextLine()) {
	            String consulta = sc.nextLine();
	            if (consulta.equals("fim")) break;

	            System.out.println(wc.getFreq(consulta));
	        }

	        sc.close();
	    }
	
	    

}
