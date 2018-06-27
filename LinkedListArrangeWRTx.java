
public class LinkedListArrangeWRTx{ // Arranges the linkedlist such that values less than x is to its left and values greater than x is to its right.Allows duplicates
	    public static void main(String args[ ]){
	    LinkedList n = new LinkedList(3); //adding elements
	    n.add(3);
	    n.add(3);
	    n.add(5);
	    n.add(3);
	    n.add(3);
	    n.add(5);
	    n.add(3);
	    int xValue = 3;

	    System.out.println("Ususal list");
	    printList(n);
	    	
	    
	    LinkedList temp =  arrangeNodes(n,xValue);
	    
	  System.out.println("After arrangement of  list");
	   printList(temp);
	    	
	    }  
	    
		public static void printList(LinkedList a){ //print he linked list
			
			if(a!=null){
				System.out.println(a.data);
				printList(a.next);
				
			}
		}
		
		public static LinkedList arrangeNodes(LinkedList a,int x){
			LinkedList small = null;
			LinkedList big = null;
			LinkedList bigHead = null;
			LinkedList smallHead = null;
			LinkedList element = null;
			LinkedList elementHead = null; // to hold duplicate values of the x
			while(a != null){
				if(a.data <x){
					if(small == null){ // for the first small value less than x
						small = new LinkedList(a.data);
						smallHead = small;
						
					}else{
						LinkedList smallNext = new LinkedList(a.data); // next values of first small value
						small.next = smallNext;
						small = smallNext;
						System.out.println("in small after adding");
						//printList(small);
					}
					
				}else if(a.data >x){ // for values bigger than x
					
					if(big == null){ // for first big value
						big = new LinkedList(a.data);
						 bigHead = big;
					}else{
						LinkedList bigNext = new LinkedList(a.data); //for next values of first big value
						big.next = bigNext;
						big = bigNext;
					}
				}else{
					if(element == null){ //if value is equal to x and first value equal to x
						element = a;
						elementHead = element;
					}else{
						element.next= new LinkedList(a.data); //for next values equal to x
						element = element.next;
					}
					 
					 
					 if(smallHead == null && bigHead == null && a.next == null){ // if the linkedlist contained only one value 
						 System.out.println("I returned as there was only one element");
						 return elementHead;
					 }
			}
				a =a.next;
			}
			
			if(smallHead==null){ // if the smallest value was x
				element.next = bigHead;
				return elementHead;
			}else if(bigHead== null){//if the biggest value was x
				 small.next = elementHead;
				 return smallHead;
			}else{
				small.next = elementHead; //other wise
				element.next = bigHead;
				
				return smallHead;
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
	
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
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

}

 
