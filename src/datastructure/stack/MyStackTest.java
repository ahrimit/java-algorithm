package datastructure.stack;

import java.util.Stack;

import org.junit.Test;

public class MyStackTest {
	@Test
	public void utilStackTest() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("===============java.util.Stack============");
		System.out.println("peek : " + stack.peek());
		System.out.println("pop : " + stack.pop());
		System.out.println("pop : " + stack.pop());
		System.out.println("pop : " + stack.pop());
		System.out.println(stack.isEmpty() ? "stack is empty!" : "stack is not empty!");
	}

	@Test
	public void myStackTest() {
		int stackSize = 10;
		MyStack stack = new MyStack(stackSize);
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("===============MyStack============");
		System.out.println("peek : " + stack.peek());
		System.out.println("pop : " + stack.pop());
		System.out.println("pop : " + stack.pop());
		System.out.println("pop : " + stack.pop());
		System.out.println(stack.isEmpty() ? "stack is empty!" : "stack is not empty!");
	}
}
