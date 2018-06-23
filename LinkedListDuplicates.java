package anjuPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class LinkedListDuplicates{ // rotates array by one position
	    public static void main(String args[ ]){
	    LinkedList n = new LinkedList(3); //adding elements
	    n.add(3);
	    n.add(3);
	    n.add(4);
	    n.add(3);
	    removeDuplicates(n); //calling function to remove duplicates
	    printList(n);
	    	
	    	
	
	    }  
	    
		public static void printList(LinkedList a){ //print he linked list
			
			if(a!=null){
				System.out.println(a.data);
				printList(a.next);
				
			}
		}
		//function that runs through a hashmap and removes duplicates. 
		public static void removeDuplicates(LinkedList a){
			HashMap <Integer,Boolean> myMap = new HashMap<Integer,Boolean>();
			LinkedList returnValue =  a;
			LinkedList temp = null;
			while(a!=null){
			
			if(myMap.containsKey(a.data)){ //if there is a duplicate  element in the hashmap then remove it 
				a = temp.remove();
			}else{   
				myMap.put(a.data, true);
			}
			
			temp = a;
			a = a.next;
			//if(a!=null){
			//System.out.println(a.data);}
			}
			
}
}
class LinkedList{
	LinkedList next;
	int data;
	LinkedList(int d){
		data = d;
		next = null;
	}
	
	
	//adding elements
	public  void add(int data){
		LinkedList h = this;
		while(h.next!=null){
			h = h.next;
		}
		LinkedList n = new LinkedList(data);
		h.next = n;
		
	}
	//removing elements
	
	public LinkedList remove(){
		LinkedList node = this;
		
		LinkedList a = node.next;
			
			node.next = a.next; //adjusting the node connection by skipping the removed element. same as node.next = node.next.next;
			return node;
		
	}

}

 
