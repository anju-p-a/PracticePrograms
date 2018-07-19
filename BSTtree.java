import java.util.*;

class Main{
    public static void main(String args[]){
        int[] array1 = {8,10,3,4,9,2,7,6,5};
        Node n = new Node(array1[0]);
        makeBST(array1,1,n,n);
        printInOrder(n);
        
    }
    
    public static void printInOrder(Node n){
        if(n!= null){
       
        printInOrder(n.left);
         System.out.println(n.data);
        printInOrder(n.right);
        }
    }
    public static Node makeBST(int[] array1,int index,Node n,Node root){
        if(index < array1.length && n!= null){
            if( array1[index] <= n.data ){
                if(n.left == null){
                    n.left = new Node(array1[index]);
                    n = root;
                    index = index+1;
                     makeBST(array1,index,n,root);
                }else{
                    makeBST(array1,index,n.left,root);
                }
                
            }else if(array1[index] > n.data){
                if(n.right == null){
                    n.right = new Node(array1[index]);
                    n = root;
                    index = index+1;
                     makeBST(array1,index,n,root);
                }else{
                    makeBST(array1,index,n.right,n);
                }
                
            }
        }
        return null;
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }

}
