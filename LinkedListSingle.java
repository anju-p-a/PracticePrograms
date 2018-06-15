package anjuPractice;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.soap.Node;

public class LinkedListSingle{ // rotates array by one position
	    public static void main(String args[ ]){
	    	
	    	
	    	LinkedList n = new LinkedList("hello");
	    	n.add("How");
	    	n.add("Are");
	    	n = n.delete(0);
	    	while(n != null){
	    		System.out.println(n.data);
	    		n = n.next;
	    	}
	    		    
	    }
	    
	
	    
}

class LinkedList{
	String data;
	LinkedList next;
	LinkedList(String d){
		data = d;
		next = null;
	}
	//add data
	public  void add(String data){
		LinkedList n = this;
		while(n.next !=null){
			n = n.next;
		}
		LinkedList N = new LinkedList(data);
		n.next = N;
	//	N.next = null;
		
	}
	//delete a node
	public LinkedList delete(int position){
		int count = 0;
		LinkedList n = this;
		LinkedList previous = null;
		while(n.next != null && count!=position){
			previous = n;
			n = n.next;
			
			count++;
		}
		if(previous!=null){
			previous.next = n.next;
			return n;
		}else{
			return n.next;
		}
		
	}
 }

 
