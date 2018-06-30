

public class LinkedListPalendrome{ // Finds out whether the values held by a linkedlist form a palendrome
	    public static void main(String args[ ]){
	    	LinkedList temp,n1 = null;
	    	int array1[] = new int[10];
	    	for(int i = 0; i< 5;i++){ // creating an array to hold the values in the linkedlist
	    		array1[i] = i;
	    	}
	    	for(int i = 4; i>=0 ;i--){ // creating an array to hold the values in the linkedlist
	    		array1[9-i] = i;
	    	}
	    	
	    	n1 = createLinkedList(n1,array1,0); //  linkedlist has been created
	    	printList(n1);
	    	System.out.println("testing");
	    	//findPalendrome(n1,n1);
	    	int count = 5;
	    	temp = n1;
	    	while(count > 0){
	    		temp = temp.next;
	    		count--;
	    	}
	    	findPalendrome2(n1,temp,5);
	    		    	
	    }  
	    
		public static void printList(LinkedList a){ //print the linked list
			
			if(a!=null){
				System.out.println(a.data);
				printList(a.next);
				
			}
		}

		public static LinkedList findPalendrome2(LinkedList b,LinkedList c,int length){ // finding if is is palendrome by checking one half of the list,c points to midway
			if(length>0){
				LinkedList a =  findPalendrome2(b.next,c,length-1);
				System.out.println(a.data + " " + b.data);
				if(a.data == b.data){
					
				}else{
					//System.out.println("Not a Palendrome");
				}
				return a.next;
			}else{
				return c;
			}		}
		
		public static LinkedList findPalendrome(LinkedList b,LinkedList c){ // helps find if the linkedlist is a palendrome; goes through the entire list , b ,c are the same head
			if(b!= null){
				LinkedList a =  findPalendrome(b.next,c);
				System.out.println(a.data + " " + b.data);
				if(a.data == b.data){
					
				}else{
					//System.out.println("Not a Palendrome");
				}
				return a.next;
			}else{
				return c;
			}
			
			
		
			

		
		}
		public static LinkedList createLinkedList(LinkedList a, int[] array1,int count){
			if(count < array1.length){
				a = new LinkedList(array1[count]);
				a.next = createLinkedList( a.next, array1,count+1);
				
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

 
