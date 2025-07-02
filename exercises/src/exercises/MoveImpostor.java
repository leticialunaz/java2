package exercises;

import java.util.Arrays;
import java.util.Scanner;

class MoveImpostor {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		
		String[] array = entrada.split(" ");
		int[] nums = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			nums[i] = Integer.parseInt(array[i]);	
		}
		
		System.out.println(Arrays.toString(moveImpostor(nums)));
		
	}

	
	public static int[] moveImpostor(int[] v) {
		
		int k = 0;
		for(int i = 0; i < v.length - 1; i++, k++) {
			if(v[i] > v[i + 1])
				break;
		}
		
		for(int l = k + 1; l >= 1; l--) {
			if(v[l] < v[l - 1]) {
				swap(v, l, l-1);
			}
		}
		
		return v;
	}
	
	public static void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	}
}
