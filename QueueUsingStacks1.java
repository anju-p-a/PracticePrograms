

public class myQueue{
	
	public static void main(String args[]){
		myQueue1 q = new myQueue1();
	//	q.enqueue(1);
	//	q.enqueue(5);
		q.enqueue(3);
		if(q.size() > 0){
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		}
	}
}
 class myQueue1{
	Stack s1 = new Stack();
	Stack s2 = new Stack();
	int size = 0;
	
	void enqueue(int data){
		s1.push(data);
		size++;
	}
	int size(){
	    return size;
	}
	int dequeue(){
		if(s2.size() == 0){
			while(s1.size() != 0){
				s2.push(s1.pop());
			}
			size--;
			return s2.pop();
		}else{
		    size--;
			return s2.pop();
		}
	}
	

}

class Stack{
	Node top;
	int size = 0;
	void push(int data){
		Node n  = new Node(data);
		n.next = top;
		top = n;
		size++;
		
	}
	int pop() {
		if(top != null){
			int t = top.data;
			top = top.next;
			size--;
			return t;
			
		}
		throw new NullPointerException("Size is empty");
		//return -1;
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
	}
}
