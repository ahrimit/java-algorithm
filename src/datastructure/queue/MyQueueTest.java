package datastructure.queue;

import org.junit.Test;

public class MyQueueTest {
	
	@Test
	public void myQueueTest() throws Exception {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		System.out.println("===============java.util.Stack============");
		try {
			System.out.println("pop : " + queue.dequeue());
			System.out.println("pop : " + queue.dequeue());
			System.out.println("pop : " + queue.dequeue());
			System.out.println("pop : " + queue.dequeue());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(queue.isEmpty() ? "Queue is empty!" : "Queue is not empty!");
	}	

}
