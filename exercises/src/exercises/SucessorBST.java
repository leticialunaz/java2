package exercises;

import java.util.ArrayList;
import java.util.Scanner;

class SucessorBST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numsString = sc.nextLine();
		int key = sc.nextInt();
		
		String[] arrayNums = numsString.split(" ");
		BST bst = new BST();
		
		for(int i = 0; i < arrayNums.length; i++) 
			bst.add(Integer.parseInt(arrayNums[i]));
	
		System.out.println(bst.sucessorPath(key));
		
	}
}



class BST {
    private Node root;
    

    public boolean isEmpty() {
    	return this.root == null;
    }
    
    
    public void add(int element) {
    	Node toAdd = new Node(element);
    	
    	if(isEmpty()) this.root = toAdd;
    	else {
    		Node aux = this.root;
    		
    		while(aux != null) {
    			if(toAdd.value > aux.value) {
    				if(aux.right == null) {
    					aux.right = toAdd;
    					toAdd.parent = aux;
    					return;
    				}
    				else aux = aux.right;
    			} else {
    				if(aux.left == null) { 
    					aux.left = toAdd;
    					toAdd.parent = aux;
    					return;
    				}
    				else aux = aux.left;
    			}
    		}
    	}
    }
    
    
    public Node search(int element) {
    	Node aux = this.root;
    	 while(aux != null) {
    		 if(aux.value == element) return aux;
    		 else if(aux.value > element) aux = aux.left;
    		 else aux = aux.right;
    	 }
    	return null;
    }
    
    public ArrayList<Integer> sucessorPath(int element){
    	ArrayList<Integer> caminho = new ArrayList<>();
    	
    	Node current = search(element);
    	 
    	if(current == null) return caminho;
    	else if(current.right != null) {
    		caminho.add(current.value);
    		Node aux = current.right;
    		while(aux != null) {
    			if(aux.left == null) { 
    				caminho.add(aux.value);
    				return caminho;
    			}
    			else {
    				caminho.add(aux.value);
    				aux = aux.left;
    			}
    				
    		}
    		
    	} else {
    		Node aux = current.parent;
    		caminho.add(current.value);
    		while(aux != null) {
    			if(aux.value < current.value) {
    				caminho.add(aux.value);
    				return caminho;
    			} else {
    				caminho.add(aux.value);
    				aux = aux.parent;
    			}
    		}
    	}
    	
    	return caminho;
    	
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

    public boolean hasTwochilds() {
    	return this.left != null && this.right != null;
    }

    public boolean hasOnlyLeftchild() {
    	return this.left != null && this.right == null;
    }

    public boolean hasOnlyRightchild() {
    	return this.left == null && this.right != null;
    }
}

