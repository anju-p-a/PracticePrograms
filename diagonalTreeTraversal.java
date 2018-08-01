import java.util.*;

class Main{
    public static void main(String args[]){
        int[] array1 = {5,3,1,4,7,6,8};
        Node n1 = new Node(array1[0]);
        Node n = makeBST(array1,1,n1,n1);
        
          //printInOrder(n);
         //create a hashMap
         
        /* HashMap<Integer,Vector<Integer>> hm = new HashMap<Integer,Vector<Integer>>(); understanding vector 
         Vector<Integer> k = new Vector();
         k.add(1);
         k.add(2);
         hm.put(0,k);//non*/
        // System.out.println(hm.get(0));
         
         HashMap<Integer,ArrayList<Integer>> nodeMap = new HashMap<Integer, ArrayList<Integer>>();
         // how to traverse through and add the nodes;
         getHashMap(n,  nodeMap, 0);
         
         for (Map.Entry<Integer,ArrayList<Integer>> entry : nodeMap.entrySet()) {
            int key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            System.out.println(value.toString()); // diagonal but a spiral diagonal;
}
         
          
        
    }
    
    
        
       
        
    

    public static void getHashMap(Node n, HashMap<Integer,ArrayList<Integer>> hm, int index){
        if(n!= null){
         ArrayList<Integer> a;
            if(hm.get(index) == null){
            a = new ArrayList<Integer>();
         }else{
            a = hm.get(index);
         }
            a.add(n.data);
            hm.put(index,a);
             getHashMap(n.right,hm,index+1); // to get a spiral diagonal , call left node and then the right node, for slope of -1 simply add the index for the left node; 
            getHashMap(n.left,hm,index);
           
            
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
