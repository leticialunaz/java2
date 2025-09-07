package exercises;

import java.util.Scanner;

class ContaNosInternosBST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numsString = sc.nextLine();
		
		String[] arrayNums = numsString.split(" ");
		BST bst = new BST();
		
		for(int i = 0; i < arrayNums.length; i++) 
			bst.add(Integer.parseInt(arrayNums[i]));
	
		System.out.println(bst.contaNosInternos());
		
	}
}



class BST {
    private Node root;
    

    public boolean isEmpty() {
    	return this.root == null;
    }
    



	public int contaNosInternos() {
    	if(isEmpty()) return 0;
		return contaNosInternos(this.root);
	}


	private int contaNosInternos(Node current) {
		if(current == null || current.isLeaf()) return 0;
		return 1 + contaNosInternos(current.left) + contaNosInternos(current.right);
	}


	public void add(int element) {
		Node toAdd = new Node(element);
		
		if(isEmpty()) {
			this.root = toAdd;
			return;
		}
		
		Node aux = this.root;
		while(aux != null) {
			if(element > aux.value) {
				if(aux.right == null) {
					aux.right = toAdd;
					toAdd.parent = aux;
					return;
				} else {
					aux = aux.right;
				}
			} else {
				if(aux.left == null) {
					aux.left = toAdd;
					toAdd.parent = aux;
					return;
				} else aux = aux.left;
			}
		}
    }
}




class Node {
    int value;
    Node left;
    Node right;
    Node parent;


    public Node(int v) {
    	this.value = v;
    }


    public boolean isLeaf() {
    	return this.left == null && this.right == null;
    }

}


