package exercises;

import java.util.Arrays;
import java.util.Scanner;

class TrocaVizinhos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		
		String[] array = entrada.split(" ");
		int[] nums = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			nums[i] = Integer.parseInt(array[i]);
		
		}
		trocaVizinhos(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	
	
	public static int[] trocaVizinhos(int[] nums) {
		for(int i = 1; i < nums.length; i += 2) {
			int aux = nums[i];
			nums[i] = nums[i - 1];
			nums[i - 1] = aux;
		}
		return nums;
	}

}
