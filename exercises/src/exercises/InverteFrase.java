package exercises;

import java.util.Scanner;

public class InverteFrase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		
		int tamPilha = 0;
		for(int i = 0; i < entrada.length(); i++) {
			if(entrada.charAt(i) == ' ') {
				tamPilha++;
			}
			tamPilha++;
		}
		
		Pilha pilha = new Pilha(tamPilha);
		for(int i = 0; i < entrada.length(); i++) {
			String palavra = "";
			while(i < entrada.length() && entrada.charAt(i) != ' ') {
				palavra += entrada.charAt(i);
				i++;
			} 
			
			pilha.push(palavra);
			
		}
							
			String saida = "";
			while (!pilha.isEmpty()) {
				saida += pilha.pop() + " ";
        }
			System.out.println(saida.trim());
	}

}

//class Pilha{
//	
//	int topo;
//	String[] pilha;
//	
//	public Pilha(int capacidade) {
//		this.topo = -1;
//		this.pilha = new String[capacidade]; 
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
//	public void push(String chave) {
//		pilha[++topo] = chave;
//	}
//	
//	public String pop() {
//		return pilha[topo--];
//	}
//	
//	public String peek() {
//		return pilha[topo];
//	}
//}
//	
