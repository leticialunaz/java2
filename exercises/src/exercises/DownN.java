package exercises;

import java.util.Scanner;

class DownN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numsString = sc.nextLine();
		int k = sc.nextInt();
		
		String[] arrayNums = numsString.split(" ");
		int[] nums = new int[arrayNums.length];
		
		for(int i = 0; i < nums.length; i++) 
			nums[i] = Integer.parseInt(arrayNums[i]);
	
		ordenaNums(nums);
		System.out.println(downN(nums, k));
		
	}
	
	public static String downN(int[] v, int k) {
		String saida = String.valueOf(v[0]);
		for(int i = 1; i < k; i++) {
			saida += " " + String.valueOf(v[i]);
		}
		return saida;
	}
	
	
	public static void ordenaNums(int[] v) {
		for(int i = 0; i < v.length - 1; i++) {
			int indexMenor = i;
			for(int j = i +1; j < v.length; j++) {
				if(v[j] < v[indexMenor]) {
					indexMenor = j;
				}
			}
			swap(v, i, indexMenor);
		}
	}


	private static void swap(int[] v, int j, int indexMenor) {
		int aux = v[j];
		v[j] = v[indexMenor];
		v[indexMenor] = aux;
	}
}
