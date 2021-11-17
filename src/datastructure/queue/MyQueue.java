package datastructure.queue;

public class MyQueue<E>{
	
	private MyNode first;
	private MyNode last;
	
	private int size;
	
	private class MyNode{
		E data;
		MyNode nextNode;
		
		protected MyNode() {
			this.data = null;
			this.nextNode = null;
		}
		
		protected MyNode(E data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	
	public MyQueue() {
		this.first = new MyNode();
		this.size = 0;
	}
	
	
	public void enqueue(E data) {
		MyNode newNode = new MyNode(data);
		if(size == 0) {
			first = newNode;
			last = first;
		} else {
			last.nextNode = newNode;
			last = newNode;
		}
		
		size ++;
	}
	
	public E dequeue() throws Exception {
		if(size == 0) {
			throw new Exception("Exception:OutOfBound");
		}
		
		MyNode removeNode = first; 
		first = first.nextNode;
		size --;

		return removeNode.data;
	}
	
	public E peek() {
		return this.first.data;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if(size > 0) {
			MyNode tmp = first;
			
			for(int i = 0; i < size; i++) {
				sb.append(tmp.data.toString());
				
				tmp = tmp.nextNode;
				if(tmp != null) {
					sb.append(",");
				}
			}
			
		}
		return sb.toString();
	}
	
	
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}

}
