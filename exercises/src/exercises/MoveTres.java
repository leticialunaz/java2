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
	
	public static void moveTres(int[] v) {
		int i = 0;
		while(i < v.length - 1) {
			if(v[i] > v[i + 1])
				break;
			i++;
		}
		
		for(int k = 0; k < 3; k++) {
			int pos = i + 1 + k;
			while((pos >= 1) && (v[pos] < v[pos -1])) {
				swap(v, pos, pos -1);
				System.out.println(Arrays.toString(v));
				pos--;
			}
		}
	}

	private static void swap(int[] v, int j, int i) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;		
	}
}
