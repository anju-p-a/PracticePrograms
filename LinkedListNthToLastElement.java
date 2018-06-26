package anjuPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class LinkedListNthToLastElement{ // rotates array by one position
	    public static void main(String args[ ]){
	    LinkedList n = new LinkedList(3); //adding elements
	    n.add(3);
	    n.add(4);
	    n.add(4);
	    n.add(3);
	    n.add(5);
	    n.add(7);
	    n.add(10);
	    //givelistfromNth(n,4); // different methods to get say 4rth to last element and last 4 elements
	   // givelistRecursion(n,4,1);
	    //givelistRecursion2(n,2);
	    //LinkedList head =  givelistIteration(n,2);
	    LinkedList head =  givelistRecursion3(n,2,0);
	    while(head!=null){
	    	System.out.println(head.data);
	    	head = head.next;
	    }
	    
	    
	  System.out.println("Ususal list");
	    printList(n);
	    	
	    }  
	    
		public static void printList(LinkedList a){ //print he linked list
			
			if(a!=null){
				System.out.println(a.data);
				printList(a.next);
				
			}
		}
		
		public static void givelistfromNth(LinkedList a, int n){ //prints the list from nth to last
			int count = 1;
			while(a!=null){
				if(count >= n){
					System.out.println(a.data);
				}
				
				a = a.next;
				count++;
				
			}
		}
			
		
		public static void givelistRecursion(LinkedList a, int n,int count){   
			if(a!= null){
				count++;
				givelistRecursion(a.next,n,count);
				//if(count >= 8) { System.out.println(count + "Count");}
				count--;
				if(count  >= n){
					System.out.println(a.data);
					
				}
				
			}
			
		}
		
		public static int givelistRecursion2(LinkedList a, int n){ // prints last n elements using recursion
			if(a == null){
				return 0;
			}
			else{
				
				int i =  givelistRecursion2(a.next,n)+1;
				if(i <= n){
					System.out.println(a.data);
				}
				return i;
				//if(count >= 8) { System.out.println(count + "Count");}

					
				}
				
			
			
		}
		
		public static LinkedList givelistIteration(LinkedList a, int n){ // gives head node from last n elements using iteration
			LinkedList first = a;
			int count  = 0;
			while(count < n){
			first = first.next;
			count++;	
			}
			while(first!=null){
				first = first.next;
				a = a.next;
			}
			
			return a;
			
		}
		
		public static LinkedList givelistRecursion3(LinkedList a, int n,int count){ returns head node using iteration for last n elements
			if(a != null){
				count++;
				givelistRecursion3(a.next,n,count);
				if(count-- == n){
					return a;
				}
			}
			return a;
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

 
