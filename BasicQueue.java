public class queueimplementation{
	public static void main(String args[]){

	Queue testQueue = new Queue();
	testQueue.enqueue(1);
	testQueue.enqueue(2);

	testQueue.dequeue();
	System.out.println(testQueue.size());
	System.out.println(testQueue.peek());
	System.out.println(testQueue.dequeue());
	System.out.println(testQueue.size());
	System.out.println(testQueue.peek());
	


}
}
class Queue{
	Node first,last;
	int size = 0;
	void enqueue(Object data){
		if(first == null){
			last = new Node(data);
			first = last;
			size++;
		}else{
			Node n  = new Node(data);
			last.next = n;
			size++;
		}
	}

	Object dequeue(){
		
		if(first != null){
            Object temp = first.data;
			first = first.next;
			size--;
			return temp;
		}
		return null;

	}
	int size(){
	    return size;
	    
	}

	Object peek(){
		if(first!= null){
			return first.data;

		}
		return null;
	}


}

class Node{
	Object data;
	Node next;
	Node(Object data1){
		data = data1;
		next = null;
	}
}
