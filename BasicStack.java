public class stackImplementation{
	public static void main(String[] args){
		    Stack s = new Stack();
		    s.push(10);
		    s.push(11);
		    System.out.println(s.peek());
		    System.out.println(s.pop() + "pop");
		     System.out.println(s.size());
		      System.out.println(s.peek());
		      System.out.println(s.pop() + "pop");
		      //System.out.println(s.pop() + "pop");
		    

	}



}

class Stack{
	Node top;
	int size = 0;
	void push(int data){
		Node n = new Node(data);
		n.next = top;
		top = n;
		size++;
	
	}

	int pop(){
		if(top != null){
			int temp = top.data;
			top = top.next;
			size--;
			return temp;
}else{
			throw new NullPointerException("Stack is Empty");
		}


	}
	int peek(){
		if(top != null){
		return top.data;

		}else{
			throw new NullPointerException("");
		}

		
	}
	int size(){
		return size;
	}

}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}

}
