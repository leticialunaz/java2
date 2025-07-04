package exercises;

import java.util.Arrays;
import java.util.Scanner;

class InsertionSortRecursivo {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String[] array = entrada.split(" ");
		
		int[] nums = new int[array.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(array[i]);	
		}
		insertionSort(nums);
}

	public static void insertionSort(int[] nums) {
		if(nums == null || nums.length <= 1)
			return;
		
		insereOrdenado(nums, 1);
	}

	private static void insereOrdenado(int[] nums, int i) {
		if(i >= nums.length) {
			return;
		}
		
		
		int atual = i;
				
	    while((atual > 0) && (nums[atual] < nums[atual - 1])) {
	    	swap(nums, atual, atual - 1);
	    	atual--;
	    }
	    
    	System.out.println(Arrays.toString(nums));

	    insereOrdenado(nums, i + 1);
	}
	
		
		private static void swap(int[] nums, int k, int i) {
		int aux = nums[k];
		nums[k] = nums[i];
		nums[i] = aux;
	}
		
		
}
