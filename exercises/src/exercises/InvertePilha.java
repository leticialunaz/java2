package exercises;

import java.util.Scanner;

public class InvertePilha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamPilha = sc.nextInt();
		sc.nextLine(); 
		String entrada = sc.nextLine();
		String[] array = entrada.split(" ");
		
		Pilha pilha = new Pilha(array.length);
		for (int i = 0; i < array.length; i++) {
			pilha.push(Integer.parseInt(array[i]));	
		}
		
		invertePilha(tamPilha, pilha);
		while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
	}

	private static void invertePilha(int tamPilha, Pilha pilha) {
		Fila fila = new Fila(pilha.size());
		while(!pilha.isEmpty()) {
			fila.add(pilha.pop());
		}
		
		while(!(fila.size == 0)) {
			pilha.push(fila.remove());
		}
	}
}


class Fila{
	
	int tail;
	int head;
	int size;
	int[] fila;
	
	public Fila(int capacidade) {
		this.fila = new int[capacidade];
		this.tail = -1;
		this.head = -1;
		this.size = 0;
	}
	
	
	public void add(int value) {
		if(size == 0) {
			this.head = 0;
			this.tail = 0;
			fila[head] = value;
			this.size++;
		} else {
			this.fila[++tail] = value;
			this.size++;
		}
	}
	
	public int remove() {
        int valorRemovido = fila[head];

		if(size == 1) {
			this.head = -1;
			this.tail = -1;
		} else {
			this.head++;			
		}
		this.size--;
		return valorRemovido;
		
	}
	
	
	
}
