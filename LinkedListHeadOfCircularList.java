
public class LinkedListHeadOfCircularList{ // This program gives the head of the circular loop in a linkedlist
	    public static void main(String args[ ]){
	    	LinkedList temp,n1 = null;
	    	int array1[] = new int[10];
	    	for(int i = 0; i< 10;i++){ // creating an array to hold the values in the linkedlist
	    		array1[i] = i;
	    	}
	    	int circularNodePosition = 0; // this is the head position of the circular linked list
	    	temp = createLinkedList(n1,array1,0); // usual linkedlist
	    	n1 = createCircularList(temp,circularNodePosition); //  circular LinkedList is created
	    	
	    	int i = 0;
	    	//check if linkedList has a loop 
	    	
	    	LinkedList slow; // slow pointer which moves one step
	    	LinkedList fast; //fast pointer which moves two steps
	    	slow = n1.next; // need to check for null condition here
	    	fast = n1.next.next;
	    	while(slow!= fast && slow!= null && fast!= null){ // if a case arises where slow == fast then that means that the linkedlist has a loop
	    		slow = slow.next;
	    		fast = fast.next.next;
	    	} 
	    		slow = n1; //move the slow pointer to the head of the linkedlist
	    		while(slow != fast){ // to get the head of the circular loop in the list
	    			slow = slow.next;
	    			fast = fast.next;
	    		}

	    	System.out.println(slow.data); //prints the head of the circular loop in the linked list
	    	

	    	
	    	
	    }  
	    
		public static void printList(LinkedList a){ //print the linked list
			
			if(a!=null){
				System.out.println(a.data);
				printList(a.next);
				
			}
		}
		
		public static LinkedList createLinkedList(LinkedList a, int[] array1,int count){
			if(count < array1.length){
				a = new LinkedList(array1[count]);
				a.next = createLinkedList( a.next, array1,count+1);
				
			}
			return a;
		}
	
		public static LinkedList createCircularList(LinkedList a, int position){
			int count = 0;
			LinkedList head = a;
			while(count < position ){
				a = a.next;
				count++;
			}
			LinkedList temp  = a;
			while(a.next != null){
				a = a.next;
			}
			a.next = temp;
			return head;
		}
		
}
class LinkedList{
	LinkedList next;
	int data;
	LinkedList(int d){
		data = d;
		next = null;
	}
	
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}


/*	//adding elements
	public  void add(int data){
		LinkedList h = this;
		
		while(h.next!=null){
			h = h.next;
		}
		
		LinkedList n = new LinkedList(data);
		h.next = n;

		
	}
*/
}

 
