package exercises;

import java.util.Scanner;

class MarianaELivros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String[] livros = entrada.split(",");
		
		ordenaLivros(livros);
	}
	
	public static void ordenaLivros(String[] livros) {
		System.out.println(saida(livros));

		for(int i = 1; i < livros.length; i++) {
			int j = i;
			while((j >= 1) && (livros[j].compareTo(livros[j - 1]) < 0)){
				swap(livros, j, j - 1);
				
				j--;
			}
			System.out.println(saida(livros));
		}
	}

	public static String saida(String[] livros) {
		String saida = livros[0];
		for(int i = 1; i < livros.length; i++) {
			saida += ", " + livros[i];
		}
		return saida;
	}
	
	private static void swap(String[] livros, int j, int i) {
		String aux = livros[i];
		livros[i] = livros[j];
		livros[j] = aux;
	}
}
