package exercises;

import java.util.Scanner;

public class PilhaComArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamPilha = sc.nextInt();
		
		PilhaArray pilhaMain = new PilhaArray(tamPilha);
		
		boolean fim = false;
		while(!fim) {
			String[] comando = sc.nextLine().split(" ");
			if(comando[0].equals("end"))  fim = true; 
			if(comando[0].equals("pop")) popMain(pilhaMain);
			if(comando[0].equals("push")) pushMain(pilhaMain, comando[1]);
			if(comando[0].equals("peek")) peekMain(pilhaMain);
			if(comando[0].equals("print")) print(pilhaMain, tamPilha); 
		}
		
		
		
		
	}

	private static void print(PilhaArray pilhaMain, int tamPilha) {
		if(pilhaMain.isEmpty()) System.out.println("empty");
		
		
		PilhaArray pilhaReserva = empilha(pilhaMain, tamPilha);
		String saida = "";
		
		while(!(pilhaReserva.isEmpty())) {
			saida += pilhaReserva.peek() + " ";
			pilhaMain.push(pilhaReserva.peek());
			pilhaReserva.pop();
		}
		System.out.println(saida.trim());
	}

	private static PilhaArray empilha(PilhaArray pilhaMain, int tamPilha) {
		PilhaArray aux = new PilhaArray(tamPilha);
		while(!(pilhaMain.isEmpty())) {
			aux.push(pilhaMain.peek());
			pilhaMain.pop();
		}
		return aux;
	}

	private static void pushMain(PilhaArray pilhaMain, String value) {
		pilhaMain.push(Integer.parseInt(value));
		
	}

	private static void peekMain(PilhaArray pilhaMain) {
		int retorno = pilhaMain.peek();
		System.out.println(retorno);
	}

	private static void popMain(PilhaArray pilhaMain) {
		pilhaMain.pop();
	}
	
	
	
}


class PilhaArray{
	
	int topo;
	int[] pilha;
	
	public PilhaArray(int capacidade) {
		this.topo = -1;
		this.pilha = new int[capacidade];
	}
	
	
	public boolean isEmpty() {
		return this.topo == -1;
	}
	
	public boolean isFull() {
		return this.topo == pilha.length - 1;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("full");
			return;
		}
		this.pilha[++topo] = value; 
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("empty");
		return;
		}
		this.topo--;
	}
	
	public int peek() {
		return this.pilha[topo];
	}
	

}


