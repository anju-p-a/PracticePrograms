package anjuPractice;


public class LinkedListNumberAddition{ // Adds two linkedlist and returns the result of the linkedlist;
	    public static void main(String args[ ]){
	    LinkedList n1 = new LinkedList(3); //adding elements
	    n1.add(3);
	    n1.add(3);
	    n1.add(3);
	    LinkedList n2 = new LinkedList(9);
	    n2.add(9);
	    n2.add(7);
	    n2.add(7);
	    n2.add(9);
	    
	   

	    System.out.println("Given list");
	    printList(n1);
	    	
	    
	   LinkedList temp =  addNodes(n1,n2);
	    //LinkedList temp = addNodesByRecursion(n1,n2,0);
	  System.out.println("Result after addition");
	   printList(temp);
	    	
	    }  
	    
		public static void printList(LinkedList a){ //print the linked list
			
			if(a!=null){
				System.out.println(a.data);
				printList(a.next);
				
			}
		}
	
		
		public static LinkedList addNodesByRecursion(LinkedList a,LinkedList b, int carry){ // adding two linkedlist numbers by recursion
			if(a == null && b == null && carry == 0){
				return a;
			}
			int value = carry;
			if(a != null){
				value+=a.data;
			}
			if(b != null){
				value+=b.data;
			}
			
			LinkedList result = new LinkedList(value%10);
			
			if(a != null || b !=null || value >= 10){
				
				result.next = addNodesByRecursion(a ==null ? null : a.next,b== null ? null :b.next, value >= 10? 1:0);
			}
			return result;
		}
		public static LinkedList addNodes(LinkedList a,LinkedList b){ // adding two linkedlist numbers by iteration
			int aValue = 0;
			int result  = 0;
			int bValue = 0;
			int carry = 0;
			LinkedList temp = null;
			LinkedList temp2 = temp;; 
			while(a != null || b != null){ //should continue till either of the list is exhausted
				if (a != null){
					aValue = a.data;
					a = a.next;
				}else{
					aValue = 0;
				}
				if( b  != null){
					bValue = b.data;
					b = b.next;
				}else{
					bValue = 0;
				}
				result = aValue+bValue; // add this to get the result
				System.out.println(carry + "results");
					if(temp == null){
						temp = new LinkedList(result%10); // since each node holds a single digit mod 10 gives the units place
						temp2 = temp; // to return the result
						carry = result/10; //initially no carry will be there but we add carry from the next digit;
	
						}else{
							temp.next = new LinkedList((result + carry )%10) ; 
							
							carry = (result+carry)/10  ;
						
							temp = temp.next;
							
					}
				
			}
			if(carry > 0){
				temp.next = new LinkedList(carry); // if there was a carry
			}
			
			
			
			
			return temp2;
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

 
