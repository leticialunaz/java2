package exercises;

import java.util.ArrayList;
import java.util.Scanner;

class TresNMaisUm {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		ArrayList<Integer> tamanhos= new ArrayList<>();

		if(i <= j) {
			while(j>i) {
				int tam = tamArray(j--);
				tamanhos.add(tam);
			}
		} else {
			while(j<i) {
				int tam = tamArray(i--);
				tamanhos.add(tam);
			}
		}
		
		int result = getMaiorTam(tamanhos);
		System.out.println(result);
	}
	
	
	private static int getMaiorTam(ArrayList<Integer> tamanhos) {
		int maiorIndex = 0;
		for(int i = 0; i < tamanhos.size(); i++) {
			if(tamanhos.get(i) > tamanhos.get(maiorIndex)) {
				maiorIndex = i;
			}
		}
		return tamanhos.get(maiorIndex);
		
	}


	public static int tamArray(int i) {
		ArrayList<Integer> nums= new ArrayList<>();
		
		nums.add(i);
		while(i != 1) {
			if(i%2 == 0) {
				i = i/ 2;
			} else {
				i = (3*i) + 1;
			}
			
			nums.add(i);
		}
		
		int tam = nums.size();
		return tam;		
	}
	
	

}
