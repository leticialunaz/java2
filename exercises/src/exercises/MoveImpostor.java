package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MoveImpostor {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		
		String[] array = entrada.split(" ");
		
		int[] v = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			v[i] = Integer.parseInt(array[i]);
		}
		
		System.out.println(Arrays.toString(moveImpostor(v)));
	}
	
	
	public static int[] moveImpostor(int[] v) {
				
		if(v.length <= 1)
			return v;
		
		boolean encontrouImpostor = false;
		int i = 0;
		while (encontrouImpostor == false){
			if(v[i] > v[i+1])
				encontrouImpostor = true;
			else
				i++;
		}
		
		for(int j = i; j >= 1; j--) {
			if(v[j] <= v[j - 1]) {
				swap(v, j, j -1);
			}
		}
		
		return v;
		
	}

	private static void swap(int[] v, int j, int i) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	}
}
