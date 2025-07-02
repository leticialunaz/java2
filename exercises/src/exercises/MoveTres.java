package exercises;

import java.util.Arrays;
import java.util.Scanner;

class MoveTres {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		
		String[] array = entrada.split(" ");
		int[] nums = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			nums[i] = Integer.parseInt(array[i]);	
		}
		moveTres(nums);

		
	}
	
	public static int[] moveTres(int[] v) {
		int k = 0;
		for(int i = 0; i< v.length; i++, k++) {
			if(v[i] > v[i+1]) {
				k++;
				break;
			}
		}	
		for(int j = k; j <= k + 2; j++) {
			for(int l = k; l >= 1; l--) {
				if(v[k] < v[k - 1]) {
					swap(v, l, l - 1);
					System.out.println(Arrays.toString(v));
				}
			}
		}
			
		
		return v;
		
	}

	private static void swap(int[] v, int j, int i) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;		
	}
}
