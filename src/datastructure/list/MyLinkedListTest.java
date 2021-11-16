package datastructure.list;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {
	
	private MyLinkedList<String> myList = null;
	
	@Before
	public void initMyList() {
		myList =  new MyLinkedList<String>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
	}

	@Test
	public void testLinkedListAdd() {
		myList.add(1, "A1");
		myList.add(3, "B1");
		myList.add(5, "Last");
		
		System.out.println(myList.toString());
		
		try {
			myList.add(999, "error");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void testLinkedListRemove() {
		myList.remove(1);
		
		System.out.println(myList.toString());
		
		try {
			myList.remove(999);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void testLinkedListGet() {
		System.out.print(myList.get(1).getData());
	}
}
