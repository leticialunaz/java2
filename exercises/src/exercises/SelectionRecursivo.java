package exercises;

import java.util.Arrays;
import java.util.Scanner;

class SelectionRecursivo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String[] array = entrada.split(" ");
		
		int[] nums = new int[array.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(array[i]);	
		}
		sortRecursivo(nums);
	}
	public static void sortRecursivo(int[] v) {
		selection(v,0);
	}
		
	public static void selection(int[] nums, int i) {
		if(i >= nums.length - 1) return;
		
		int indexMenor = i;
		for(int j = i + 1; j < nums.length; j++)
			if(nums[j] < nums[indexMenor]) 
				indexMenor = j;
			swap(nums, i, indexMenor);
			System.out.println(Arrays.toString(nums));
			selection(nums, i + 1);
	
	}
	
	
	private static void swap(int[] nums, int k, int i) {
		int aux = nums[k];
		nums[k] = nums[i];
		nums[i] = aux;
	}
}
