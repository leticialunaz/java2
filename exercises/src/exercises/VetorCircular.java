package exercises;

import java.util.Arrays;
import java.util.Scanner;

class VetorCircular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String lista = sc.nextLine();
		int n = sc.nextInt();
		
		String[] array = lista.split(" ");
		int[] nums = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			nums[i] = Integer.parseInt(array[i]);	
		}
		
		
		int[] vetor = vetorCircular(nums, n);
		
		
		System.out.println(arrayEmString(vetor));
		
	}
	
	public static int[] vetorCircular(int[] nums, int n) {
		int[] vetor = new int[n];
		
		int i = 0;
		int k = 0;
		while((i < nums.length) && (i < n)) {
			vetor[i++] = nums[k++]; 
		} 
		
		int j = 0;
		while(i < n) {
			int pos = j%nums.length;
			j++;
			vetor[i++] = nums[pos];
		}
		
		
		return vetor;
		
	}
	
	
	public static String arrayEmString(int[] nums) {
		String saida = String.valueOf(nums[0]);
		for(int i = 1; i < nums.length; i++) {
			saida += " " + nums[i];
		}
		
		
		return saida;
	}
}

