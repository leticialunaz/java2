package exercises;

import java.util.Arrays;
import java.util.Scanner;

class MoveN {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String[] array = entrada.split(" ");
		
		int[] nums = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			nums[i] = Integer.parseInt(array[i]);
		}
		
		moveN(nums);
	}
	
	
	public static void moveN(int[] nums) {
		int parada = -1;

		for(int i = 0; i < nums.length - 1; i++)
			if(nums[i + 1] < nums[i]) {
				parada = i + 1;
				break;
			}
		
		for(int j = parada; j < nums.length; j++) {
			int k = j;
			while((k > 0) && (nums[k] < nums[k - 1])){
					swap(nums, k, k-1);
					System.out.println(Arrays.toString(nums));
					k--;
			}
		}
	}


	private static void swap(int[] nums, int k, int i) {
		int aux = nums[k];
		nums[k] = nums[i];
		nums[i] = aux;
	}
}
