package exercises;

import java.util.Arrays;
import java.util.Scanner;

class SelectionPasso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String[] array = entrada.split(" ");
		
		int[] nums = new int[array.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(array[i]);	
		}
		selection(nums);
	}
		
	public static void selection(int[] nums) {
		
		for(int j = 0; j < nums.length - 1; j ++) {
			int indexMenor = j;
			for(int i = j + 1; i < nums.length; i++)
				if(nums[i] < nums[indexMenor]) 
					indexMenor = i;
			if(indexMenor != j) {
				swap(nums, j, indexMenor);
				System.out.println(Arrays.toString(nums));
			}
		}
			
	}
	
	
	private static void swap(int[] nums, int k, int i) {
		int aux = nums[k];
		nums[k] = nums[i];
		nums[i] = aux;
	}
}
