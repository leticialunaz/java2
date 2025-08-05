package exercises;

import java.util.Scanner;

public class RemoveIndexLL {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		String entrada = sc.nextLine();
		int index = sc.nextInt();
			
		String[] array = entrada.split(" ");
			
		LinkedList ll = new LinkedList();
		for (int i = 0; i < array.length; i++) {
			ll.addLast(Integer.parseInt(array[i]));	
		}
			
		remove(index, ll);
			
			
		}

		private static void remove(int index, LinkedList ll) {
			if(index == ll.size() -1) {
				ll.removeLast();
			} else {
				ll.remove(index);
			}
			System.out.println(ll.toString());
			
		}

}
