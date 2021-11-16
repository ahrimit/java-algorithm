package datastructure.stack;

public class MyStack {

	private int top;
	private int size;
	private Object[] myStack;
	
	public MyStack(int size) {
		this.myStack = new Object[size];
		this.top = -1;
		this.size = size;
	}
	
	public void push(Object obj) {
		if(isFull()) {
			throw new ArrayIndexOutOfBoundsException(top);
		}
		
		myStack[++top] = obj;
	}

	public Object pop() {
		Object item = new Object();
		item = peek();
		top--;
		
		return item;
	}
	
	public Object peek() {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException(top);
		}

		return myStack[top];
	}

	public boolean isEmpty() {
		if(top < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(top >= (size-1)) {
			return true;
		} else {
			return false;
		}
	}

}
