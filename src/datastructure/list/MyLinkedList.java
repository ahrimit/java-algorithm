package datastructure.list;

public class MyLinkedList<T> {

	private MyNode head;
	private int size;
	
	class MyNode{
		private T data;
		private MyNode nextNode;
		
		public MyNode() {
			this.data = null;
			this.nextNode = null;
		}
		
		public MyNode(T data) {
			this.data = data;
			this.nextNode = null;
		}
		
		public T getData() {
			return this.data;
		}
	}

	
	public MyLinkedList() {
		this.head = new MyNode(null);
		this.size = 0;
	}

	public void add(T data) {
		add(size, data);
	}

	
	public void add(int index, T data) {
		MyNode newNode = new MyNode(data);
		
		if(index < 0) {
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
		}
		
		if(index == 0) {
			newNode.nextNode = this.head.nextNode;
			this.head.nextNode = newNode;
			
		} else {
			MyNode prev = get(index - 1);
			newNode.nextNode = prev.nextNode; 
			prev.nextNode = newNode;
		}
		
		size++;
	}
	
	public void remove(int index) {
		if(index < 0 || index > (size - 1)) {
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
		}
		
		if(index == 0) {
			MyNode first = head.nextNode;
			head.nextNode = first.nextNode;
		} else {
			MyNode prev = get(index-1);
			MyNode removeNode = get(index);
			prev.nextNode = removeNode.nextNode;
		}
		
		size--;
	}
	
	
	public MyNode get(int index) {
		if(index < 0 || index > (size - 1)) {
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
		}
		
		MyNode tmp = head.nextNode;
		for(int i = 0; i < index; i++) {
			tmp = tmp.nextNode;
		}
		 
		return tmp;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		if(size > 0) {
			MyNode tmp = head.nextNode;
			
			for(int i = 0; i < size; i++) {
				if(tmp != null) {
					sb.append(",");
				}

				sb.append(tmp.data.toString());
				tmp = tmp.nextNode;
				
			}
			
		}
		return sb.toString();
	}
	
}


