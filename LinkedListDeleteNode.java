
public class LinkedListDeleteNode{ 
	    public static void main(String args[ ]){
	    LinkedList n = new LinkedList(3); //adding elements
	    n.add(1);
	    n.add(9);
	    n.add(4);
	    n.add(3);
	    n.add(5);
	    n.add(7);
	    n.add(10);
	    LinkedList temp = n;
	    int nodePosition = 8;
	    for(int i = 1; i< nodePosition; i++){ //selecting the node to be deleted
	    	
	    	temp = temp.next;
	    	
	    }
	    System.out.println("Ususal list");
	    printList(n);
	    	
	    
	    deleteNode(temp); // deleting the node given the node reference of the node to be deleted
	    
	  System.out.println("After Deletion list");
	    printList(n);
	    	
	    }  
	    
		public static void printList(LinkedList a){ //print he linked list
			
			if(a!=null){
				System.out.println(a.data);
				printList(a.next);
				
			}
		}
		
		public static void deleteNode(LinkedList a){
			
			if(a!= null){
				System.out.println("I am here");
				if(a.next!= null){ 
					
					a.data = a.next.data; //copy the next data
					a.next = a.next.next; // remove the duplicate node
			
				}
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

 
