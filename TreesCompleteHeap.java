import java.util.*;

class Main{
	public static void main(String args[]){
		Node tree = new Node(8);
		tree.left = new Node(3);
	    tree.left.right = new Node(2);
	   tree.left.left = new Node(1);
	tree.right = new Node(5);
	//	tree.right.right = new Node(6);
	//	tree.right.left = new Node(8);
		printTree(tree);
		boolean hasBigParent = findIfRootHeap(tree,99999);
		
		System.out.println("Is it a Heap ??" + hasBigParent);
		System.out.println("No of nodes is " +findNumberofNodes(tree));
		boolean isComplete = findComplete_Iterative(tree);
		System.out.println("Iterative Solution tells that the tree is" + findComplete_Iterative(tree) + "complete"); // check id the given tree is a complete tree, i.e all the levels except the last are filled and last level nodes are filled from left to right..
	    System.out.println("Recursive Solution tells that the tree is" + findComplete_Recursive(tree,0,findNumberofNodes(tree)) + "complete");
	    
	    if(isComplete && hasBigParent){
	        System.out.println("This tree is a HEAP!!!HURRAY");
	    }
	}
	
	
public static boolean findIfRootHeap(Node n,int parent){
    if(n == null){
        return true;
    }
    if(parent < n.data){
        return false;
    }
    return findIfRootHeap(n.left,n.data) && findIfRootHeap(n.right,n.data);
}
public static int findNumberofNodes(Node n){
   
    if(n==null){
        return 0;
    }else{
        int a = 1+ findNumberofNodes(n.left)+findNumberofNodes(n.right);
       return a;
    }
   
}	
public static boolean findComplete_Recursive(Node n, int index,int total){ // using recursion 
    // assigning each left child as 2i + 1 and right child as 2i + 2, where i is the index of the parent , index of the root is 0; so no of nodes is > index of the any child if it is a complete tree. 
    if(n == null){
        return true;
    }
    if(index >= total){
        return false;
    }
    return findComplete_Recursive(n.left,2*index+1,total)&&findComplete_Recursive(n.right,2*index+2,total);
}

public static boolean findBalanced(Node n, int height){
    return true; 
}
public static boolean findComplete_Iterative(Node n){
	Queue<Node> myQ = new LinkedList<Node>();
	myQ.add(n);
	boolean isBalanced = true;
	while(myQ.size() > 0 ){
		Node temp = myQ.remove();
		if(temp.left != null && temp.right!= null){
			myQ.add(temp.left);
			myQ.add(temp.right);
		}else if(temp.left == null && temp.right!= null){
		
			return false;
		}else if(temp.left != null && temp.right == null){ // case when left child existed and right child did not, which means if any more children existed for the left child the tree will become unbalanced
		    myQ.add(temp.left);
			while(myQ.size() > 0){
			  
				Node s = myQ.remove();
			
				if(s.left != null || s.right != null){
					return false;
				
				}
			
			}
		
		}else if(temp.left == null && temp.right == null){
		    	while(myQ.size() > 0){
				Node s = myQ.remove();
				if(s.left != null || s.right != null){
					return false;
				
				}
			
			}
		    
		}
		
	
	}
	return true;
		
	}
		
	
	
	

public static void printTree(Node n){
	if(n!= null){
		printTree(n.left);
		printTree(n.right);
		System.out.println(n.data);
	}

}

}




class Node {
 	Node left;
 	Node right;
 	int data;
	Node(int data){
		this.data = data;
		left = right = null;
	}
}

 
