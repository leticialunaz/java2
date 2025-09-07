package exercises;

import java.util.Scanner;

public class ElementAtPilha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		int index = sc.nextInt();
		
		String[] array = entrada.split(" ");
		
		Pilha pilha = new Pilha(array.length);
		for (int i = array.length -1; i >= 0; i--) {
			pilha.push(Integer.parseInt(array[i]));	
		}
		
		getElement(index, pilha);
	}
	
	public static void getElement(int index, Pilha pilha) {
		if(index < 0 || index > pilha.size()) {
			System.out.println("indice invalido");
			return;
		}
		if(index == 0) {
			System.out.println(pilha.peek());
			return;
		}
		Pilha stack = new Pilha(index + 1);
		desempilha(index, pilha, stack);
		System.out.println(stack.peek());
		while(!stack.isEmpty()) {
			pilha.push(stack.pop());
		}
		return;
	}

	private static void desempilha(int index, Pilha pilha, Pilha stack) {
		while(index != -1) {
			stack.push(pilha.pop());
			index--;
			
		}
	}
}

//class Pilha{
//	
//	int topo;
//	int[] pilha;
//	
//	public Pilha(int capacidade) {
//		this.topo = -1;
//		this.pilha = new int[capacidade]; 
//	}
//	
//	
//	public int size() {
//		return topo + 1;
//	}
//
//
//	public boolean isEmpty() {
//		return this.topo == -1;
//	}
//	
//	public void push(int valor) {
//		pilha[++topo] = valor;
//	}
//	
//	public int pop() {
//		return pilha[topo--];
//	}
//	
//	public int peek() {
//		return pilha[topo];
//	}
//	
//}