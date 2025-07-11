package exercises;

import java.util.Arrays;
import java.util.Scanner;

class InsereUltimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String[] array = entrada.split(" ");
		
		int[] nums = new int[array.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(array[i]);	
		}
		System.out.println(insereUltimo(nums));
		
	}
	
	public static String insereUltimo(int[] nums) {
		int j = nums.length - 1;
		while((j >= 1) && (nums[j] < nums[j - 1])) {
			swap(nums, j, j -1);
			j--;
		}
		return Arrays.toString(nums);
	}

	private static void swap(int[] nums, int j, int i) {
		int aux = nums[i];
		nums[i] = nums[j];
		nums[j] = aux;		
	}
	
}
