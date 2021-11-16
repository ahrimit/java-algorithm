package datastructure.list;

import org.junit.Test;

public class MyArrayListTest {
	
	@Test
	public void myArrsyListTest() {
		MyArrayList<String> list = new MyArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		System.out.println("size : " + list.size());
		System.out.println(list.get(2));
		
		try {
			list.remove(11);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(list.contains("5"));
		System.out.println(list.contains("99"));
	}
}
