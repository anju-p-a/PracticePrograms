import java.util.*;

class Main{
    public static void main(String args[]){
        int[] array1 = {5,3,1,4,7,6,8};
        Node n1 = new Node(array1[0]);
        Node n = makeBST(array1,1,n1,n1);
            // printSpiral( n, new Stack<Node>(), new LinkedList<Node>() );
          // printInOrder(n);
          
          //printSpiralRecursive2(n,0,true); //call this function height number of times, where level indicates the level you need to print; change the boolean true in loop after each call;
      
        
    }
    
    public static void printSpiralRecursive1(Node n,int level,boolean s){
        if(level == 0 && n!= null){
            System.out.println(n.data);
            return;
        }
        if(s == true){
         printSpiralRecursive(n.left,level-1,s);
         printSpiralRecursive(n.right,level-1,s);
        }else{
              printSpiralRecursive(n.right,level-1,s);
               printSpiralRecursive(n.left,level-1,s);
        }
    }
    
    

    
    public static Queue<Node> addToQueue(Stack<Node> s,Queue<Node> q){ //spiral traversal iterative
         while(s.size() > 0){
                Node temp = s.pop();
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                
                System.out.println(temp.data);
                
         }
        return q;
    }
    
     public static Stack<Node> addToStack(Stack<Node> s,Queue<Node> q){
         while(q.size() > 0){
                Node temp = q.remove();
                if(temp.left != null){
                    s.add(temp.left);
                }
                if(temp.right != null){
                    s.add(temp.right);
                }
                
                System.out.println(temp.data);
                
         }
       
        return s;
    }
    public static void printSpiral(Node n,Stack<Node> myStack,Queue<Node> myQueue ){
        if(myStack.size()>0 || myQueue.size() > 0){
                addToQueue(myStack,myQueue);
                addToStack(myStack,myQueue);
                printSpiral(n,myStack,myQueue);
                
            
            
            
        }else{
            if(n!=null){
            myStack.add(n);
            printSpiral(null,myStack,myQueue);
            
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
