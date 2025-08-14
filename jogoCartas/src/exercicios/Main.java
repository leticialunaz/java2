package exercicios;

import java.util.Random;


public class Main {

	public static void main(String[] args) {
		Random rd = new Random();
		int soma_final = 0;
		while (soma_final < 21) {
				for (int i = 0; i < 3; i++) {
					int carta_sorteada = rd.nextInt(12) + 1;
					soma_final += carta_sorteada;
					int naipe = rd.nextInt(NAIPES.length);
					System.out.println("A carta sorteada foi: " + carta_sorteada +" de " + NAIPES[naipe]);
				}
				System.out.println("A soma total foi: " + soma_final);
				if (soma_final == 21) {
					System.out.println("Parabéns você ganhou!");
				} else if (soma_final > 21) {
					System.out.println("Perdeu a vez!");
				} else {
					soma_final = 0;
				}
		}

	}
	public static final String[] NAIPES = {"Ouro", "Copas", "Espada", "Paus"};
}
