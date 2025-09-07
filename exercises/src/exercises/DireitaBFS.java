package exercises;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class DireitaBFS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numsString = sc.nextLine();
		
		String[] arrayNums = numsString.split(" ");
		BST bst = new BST();
		
		for(int i = 0; i < arrayNums.length; i++) 
			bst.add(Integer.parseInt(arrayNums[i]));
	
		System.out.println(bst.direitaBFS().trim());
		
	}
}



class BST {
    private Node root;
    

    public boolean isEmpty() {
    	return this.root == null;
    }
    



	public String direitaBFS() {
		Deque<Node> queue = new LinkedList<Node>();
		String saida = "";
		
	
		if(isEmpty()) return saida;
		
		queue.addLast(this.root);
		
		while(!queue.isEmpty()) {
			Node current = queue.removeFirst();
			saida += current.value + " ";
			
			if(current.right != null) queue.addLast(current.right);
			if(current.left != null) queue.addLast(current.left);
		
		}
		return saida;
	
	}

	public void add(int element) {
		Node toAdd = new Node(element);
		
		if(isEmpty()) {
			this.root = toAdd;
			return;
		}
		
		Node aux = this.root;
		
		while(aux != null) {
			if(aux.value > toAdd.value) {
				if(aux.left == null) {
					aux.left = toAdd;
					toAdd.parent = aux;
					return;
				} else aux = aux.left;
			} else {
				if(aux.right == null) {
					aux.right = toAdd;
					toAdd.parent = aux;
					return;
				} else aux = aux.right;
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
