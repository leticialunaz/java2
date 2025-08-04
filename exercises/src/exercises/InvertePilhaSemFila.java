package exercises;

import java.util.Scanner;

public class InvertePilhaSemFila {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamPilha = sc.nextInt();
		sc.nextLine(); 
		String entrada = sc.nextLine();
		String[] array = entrada.split(" ");
		
		int[] pilha = new int[array.length];
		for (int i = 0; i < pilha.length; i++) {
			pilha[i] = Integer.parseInt(array[i]);	
		}
		
		invertePilha(tamPilha, pilha);
	}
	
	public static void invertePilha(int tamanho, int[] nums) {
		Pilha pilha = new Pilha(tamanho);
		for(int i = 0; i < nums.length; i++) {
			pilha.push(nums[i]);
		} 
		Pilha pilhaAux = desempilha(pilha);
		while(!pilhaAux.isEmpty()) {
			System.out.println(pilhaAux.pop());
		}
	}

	private static Pilha desempilha(Pilha pilha) {
		Pilha auxiliar = new Pilha(pilha.topo + 1);
		while(!pilha.isEmpty()) {
			auxiliar.push(pilha.pop());
		}
		return auxiliar;
	}

	
}

//class Pilha{
//	public int length;
//	int topo;
//	int[] pilha;
//	
//	Pilha(int capacidade){
//		this.pilha = new int[capacidade];
//		this.topo = -1;
//		this.length = capacidade;
//	}
//	
//	boolean isEmpty() {
//		return topo == -1;
//	}
//	
//	void push(int value) {
//		pilha[++topo] = value;
//	}
//	
//	int pop() {
//		return pilha[topo--];
//	}
//}
