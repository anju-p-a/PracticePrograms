import java.util.*;

class Main{
    public static void main(String args[]){
        int[] array1 = {5,3,1,4,7,6,8};
        Node n1 = new Node(array1[0]);
        Node n = makeBST(array1,1,n1,n1);
        //trouble shoot it by yourself
          //printInOrder(n);
          printLeft(n,n,false);
          printRight(n.right,n.right);
          
        
    }
    
  
    public static void  printLeft(Node n,Node root,boolean movedLeft){ //prints the left haf boundary
        if(n!= null){
            if(n == root && movedLeft == false){
                 movedLeft = true;
                }
            if(movedLeft == true){
                if(n.left != null){
                   System.out.println(n.data);
                 
                }else{
                    movedLeft = false;
                }
             }
            if(n.left == null && n.right == null && movedLeft == false){
                 System.out.println(n.data);
            }
             
                printLeft(n.left,root,movedLeft);
                if(n != root){
                printLeft(n.right,root,false);
                }
                
             }
             
             
        
        
    }
    
    public static void printRight(Node n, Node root){ //prints the right half boundary
        if(n != null){
           
           
             if(root == n &&  (n.right != null || n.left != null)){ // to printthe right boundary, i.e remebering the right nodes
                 
                 root = root.right;
                
             }

             printRight(n.left,root);
             printRight(n.right,root);
                 if(n.left == null && n.right == null){ // print the leaf nodes
                 System.out.println(n.data);
                 }else{
                     if(n.right == root){ //only print the root node if it is the right boundary
                         System.out.println(n.data);
                     }
                 }
             
        }
        
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
            Node temp = new Node(array1[index]);
            if( array1[index] <= n.data ){
                if(n.left == null){
                    n.left = temp;
                
                    
                     makeBST(array1,index+1,root,root);
                }else{
                    makeBST(array1,index,n.left,root);
                }
                
            }else if(array1[index] > n.data){
                if(n.right == null){
                    n.right = temp;
                     makeBST(array1,index+1,root,root);
                }else{
                    makeBST(array1,index,n.right,n);
                }
                
            }
        }
        return root;
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
