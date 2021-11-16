package datastructure.list;

import java.util.Arrays;

public class MyArrayList<T> {

	private Object[] data;
	private int size;
	private final int DEFAULT_SIZE = 10;
	private final Object[] DEFAULT_ARRAY = {};
	
	public MyArrayList () {
		data = DEFAULT_ARRAY;
	}
	
	public MyArrayList (int initSize) {
		data = new Object[initSize];
	}
	
	public void add(T e) {
		if(this.size >= this.data.length) {
			grow();
		}
		
		data[size] = e;
		this.size++;
		
	}
	
	public void remove(int index) {
		rangeCheck(index);
		
		int numMoved = (size - index -1);
		if(numMoved > 0) {
			System.arraycopy(data, index + 1, data, index, numMoved);
		}
		
		data[--size] = null;
	}
	
	public void clear() {
		for(int i = 0 ; i < size; i++) {
			data[i] = null;
		}
		
		this.size = 0;
	}
	
	public Object get(int index) {
		rangeCheck(index);
		return data[index];
	}
	
	public int size() {
		return this.size;
	}
	
	public int contains(Object o) {
		for(int i = 0 ; i < size; i++) {
			if(data[i].equals(o)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private void grow() {
		this.data = Arrays.copyOf(this.data, size +  DEFAULT_SIZE);
	}
	
	private void rangeCheck(int index) {
		if(index >= 0 && index < size) {
			return ;
		} else {
			throw new ArrayIndexOutOfBoundsException(
					String.format("ArrayIndexOutOfBoundsException : %d", index));
		}
	}
}