package exercises;

import java.util.Scanner;

public class Parenteses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		
		System.out.println(checaParenteses(entrada));
	}

	private static String checaParenteses(String entrada) {
		if((entrada.length() % 2) == 1) return "N";

		Pilha pilha = new Pilha(entrada.length());
		for(int i = 0; i < entrada.length(); i++) {
			if(entrada.charAt(i) == '(') {
				pilha.push("(");
			} else if(pilha.isEmpty()) {
				return "N";
			} else pilha.pop();
		}
		return "S";
	}
}
