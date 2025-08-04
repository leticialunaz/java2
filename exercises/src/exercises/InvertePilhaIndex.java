package exercises;

import java.util.Scanner;

public class InvertePilhaIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamPilha = sc.nextInt();
		sc.nextLine(); 
		String entrada = sc.nextLine();
		int index = sc.nextInt();

		String[] array = entrada.split(" ");
		
		Pilha pilha = new Pilha(array.length);
		for (int i = 0; i < array.length; i++) {
			pilha.push(Integer.parseInt(array[i]));	
		}
		
		invertePilhaIndex(tamPilha, pilha, index);
		System.out.println("-");
		while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
	}

	private static void invertePilhaIndex(int tamPilha, Pilha pilha, int index) {
		Fila aux = desempilha(pilha, index);
		while(!(aux.size == 0)) {
			pilha.push(aux.remove());
		}
	}

	private static Fila desempilha(Pilha pilha, int index) {
		Fila aux = new Fila(index + 1);
		while(index > -1) {
			aux.add(pilha.pop());
			index--;
		}
		
		return aux;
	}

}
