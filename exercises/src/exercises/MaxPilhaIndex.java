package exercises;

import java.util.Scanner;

public class MaxPilhaIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		int index = sc.nextInt();

		String[] array = entrada.split(" ");
		
		Pilha pilha = new Pilha(array.length);
		for (int i = 0; i < array.length; i++) {
			pilha.push(Integer.parseInt(array[i]));	
		}
		
		Pilha aux = desempilha(pilha, index);
		
		int maiorElemento = maiorElemento(aux, pilha);
		System.out.println(maiorElemento);
	}

	private static int maiorElemento(Pilha aux, Pilha pilhaOriginal) {
		int maiorElem = 0;
		while(!(aux.isEmpty())) {
			if(aux.peek() >= maiorElem) {
				maiorElem = aux.peek();
				pilhaOriginal.push(aux.pop());
		    } else {
		    	aux.pop();
		    }	
		}
		while(!(aux.isEmpty())) 
			pilhaOriginal.push(aux.pop());

		
		return maiorElem;
	}


	private static Pilha desempilha(Pilha pilha, int index) {
		Pilha aux = new Pilha(index + 1);
		while(index > -1) {
			aux.push(pilha.pop());
			index--;
		}
		
		return aux;
	}

}


