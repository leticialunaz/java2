package exercises;

import java.lang.annotation.ElementType;
import java.util.Scanner;

public class OrdenaPilhaInvertendo {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int tamPilha = sc.nextInt();
			sc.nextLine(); 
			String entrada = sc.nextLine();
			String[] array = entrada.split(" ");
			
			Pilha pilha = new Pilha(tamPilha);
	        for (int i = 0; i < array.length; i++) {
	            pilha.push(Integer.parseInt(array[i]));
	        }
			
	        ordenaPilha(pilha, array.length);
	        System.out.println("-");
	        for (int i = 0; i <= pilha.topo; i++) {
	            System.out.println(pilha.pilha[i]);
	        }
		
		}
	
	private static void ordenaPilha(Pilha pilha, int tamanhoOriginal) {
		Pilha ordenada = new Pilha(pilha.length);

        for (int i = 0; i < tamanhoOriginal; i++) {
            int elementosRestantes = pilha.topo + 1;
            int indexMaior = pilha.getMax(elementosRestantes);

            pilha.inverte(indexMaior);
            ordenada.push(pilha.pop());
            pilha.inverte(elementosRestantes - 1);
        }

        while (!ordenada.isEmpty()) {
            pilha.push(ordenada.pop());
        }
    }

}
	
	
class Pilha{
		public int length;
		int topo;
		int[] pilha;
	
		Pilha(int capacidade){
			this.pilha = new int[capacidade];
			this.topo = -1;
			this.length = capacidade;
		}
	

		public int peek() {
			if (isEmpty()) {
		        throw new IllegalStateException("Tentativa de peek em pilha vazia");
		    }
		    return pilha[topo];
		}


		boolean isEmpty() {
			return topo == -1;
		}
	
		void push(int value) {
			pilha[++topo] = value;
		}
	
		int pop() {
			if (isEmpty()) {
		        throw new IllegalStateException("Tentativa de pop em pilha vazia");
		    }
		    return pilha[topo--];
		}
		
		
		void inverte(int index) {
		    if (index < 0 || index > topo) {
	            throw new IllegalArgumentException("Index de inversão maior que o tamanho atual da pilha");
	        }

	        Pilha aux1 = new Pilha(this.length);
	        Pilha aux2 = new Pilha(this.length);

	        int reais = index + 1;

	        for (int i = 0; i < reais && !this.isEmpty(); i++) {
	            aux1.push(this.pop());
	        }

	        while (!this.isEmpty()) {
	            aux2.push(this.pop());
	        }

	        while (!aux1.isEmpty()) {
	            this.push(aux1.pop());
	        }

	        while (!aux2.isEmpty()) {
	            this.push(aux2.pop());
	        }
		    }
		 
		 
		 int getMax(int limite) {
		        if (limite <= 0 || limite > this.topo + 1) {
		            throw new IllegalArgumentException("Limite inválido para getMax: " + limite);
		        }

		        Pilha aux = new Pilha(this.length);
		        int max = Integer.MIN_VALUE;
		        int indexMax = 0;

		        for (int i = 0; i < limite; i++) {
		            int val = this.pop();
		            aux.push(val);
		            if (val > max) {
		                max = val;
		                indexMax = i;
		            }
		        }

		        while (!aux.isEmpty()) {
		            this.push(aux.pop());
		        }

		        return indexMax;
		    }
}


