package exercises;

import java.util.Scanner;

class TopN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entradaArray = sc.nextLine();
		int quant = sc.nextInt();
		
		String[] array = entradaArray.split(" ");
		
		int[] nums = new int[array.length];
		for(int i = 0; i < array.length; i++)
			nums[i] = Integer.parseInt(array[i]);
		
		
		ordenaInversamente(nums);
		System.out.println(topN(nums, quant));
		
	}
	
	public static String topN(int[] nums, int k) {
		String saida = String.valueOf(nums[0]);
		for(int i = 1; i < k; i++) {
			saida += " " + String.valueOf(nums[i]);
		}
		return saida;
	}
	
	public static void ordenaInversamente(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			int indexMaior = i;
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[indexMaior] < nums[j]) {
					indexMaior = j;
				}
			}
			swap(nums, i, indexMaior);
		}
	}


	private static void swap(int[] nums, int i, int indexMaior) {
		int aux = nums[i];
		nums[i] = nums[indexMaior];
		nums[indexMaior] = aux;
		
	}
	
	
	
	
}
