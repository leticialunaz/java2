package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ValorMaisProx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numsString = sc.nextLine();
		int element = sc.nextInt();
		
		String[] arrayNums = numsString.split(" ");
		BST bst = new BST();
		
		for(int i = 0; i < arrayNums.length; i++) 
			bst.add(Integer.parseInt(arrayNums[i]));
	
		
		
		String[] preOrdem = bst.preOrder().split(" ");
		int[] preOrdemInt = new int[preOrdem.length];
		
		for(int i = 0; i < arrayNums.length; i++) 
			preOrdemInt[i] = Integer.parseInt(preOrdem[i]);
			
		System.out.println(Arrays.toString(preOrdemInt));
		System.out.println(bst.valorProx(element));
		
	}

}


class BST {
	
	Node root;
	int size;
	
	public boolean isEmpty() {
    	return this.root == null;
    }
    

	public int valorProx(int element) {
		if(isEmpty()) return -1;
		
		Node current = this.root;
		int elementoProx= current.value;

	
		if(current.value == element) return current.value;
		
		while(current != null) {
			if(Math.abs(current.value - element) < Math.abs(elementoProx - element)) {
				elementoProx = current.value;
			}
			
			if(element > current.value)
				current = current.right;
			else if(element < current.value)
				current = current.left;
			else
				return current.value;
		}
				
				
		return elementoProx;
		
	}


	public String preOrder() {
	    return preOrder(this.root).trim();
	}

	private String preOrder(Node current) {
	    if (current == null) return "";
	    return current.value + " " 
	         + preOrder(current.left) 
	         + preOrder(current.right);
	}


	public void add(int element) {
		Node toAdd = new Node(element);
	
		if(isEmpty()) {
			this.root = toAdd;
			return;
		}
		
		Node aux = this.root;
		
		while(aux != null) {
			if(toAdd.value > aux.value) {
				if(aux.right == null) {
					aux.right = toAdd;
					toAdd.parent = aux;
					size++;
					return;
				} else aux = aux.right;
			} else {
				if(aux.left == null) {
					aux.left = toAdd;
					toAdd.parent = aux;
					size++;
					return;
				} else aux = aux.left;
			}
		}
		
		
	}
	
	
}


class Node{
	Node right;
	Node left;
	Node parent;
	int value;
	
		
	public Node(int element) {
		this.value = element;
	}

	public boolean isLeaf() {
    	return this.left == null && this.right == null;
    }
}