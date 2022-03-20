package datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class GrapSearchTest {

	public static void main(String[] args) {
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		
		a.link(b);
		a.link(c);
		b.link(a);
		b.link(c);
		b.link(d);
		c.link(b);
		c.link(d);
		c.link(e);
		d.link(b);
		d.link(c);
		d.link(e);
		
		GraphSearch.bfs(a, e);
		a.initVisit();
		b.initVisit();
		c.initVisit();
		d.initVisit();
		e.initVisit();
		
		GraphSearch.dfs(a, e);
	
	}
	
}

class GraphSearch {
	public static void bfs(Node start, Node target) {
		System.out.println("=============bfs=============== ");
		if(target == null) return ;

		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			
			Node node = queue.poll();
			node.visit();
			System.out.println(node.toString());
			
			if(target.equals(node)) {
				System.out.println("Found node " + node.toString());
				break;
			}

			for(Node n : node.edges) {
				if(n.isVisited) continue;
				if(queue.contains(n)) continue;
				
				queue.offer(n);
			}
		}
		
	}
	
	public static void dfs(Node start, Node target) {
		System.out.println("=============dfs=============== ");
		if(target == null) return ;

		Stack<Node> stack = new Stack<Node>();
		stack.push(start);
		
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			node.visit();
			System.out.println(node.toString());
			
			if(target.equals(node)) {
				System.out.println("Found node " + node.toString());
				break;
			}

			for(Node n : node.edges) {
				if(n.isVisited) continue;
				if(stack.contains(n)) continue;
				
				stack.push(n);
			}
		}
	}

}

class Node {
	String name;
	LinkedList<Node> edges;
	boolean isVisited;
	
	public Node(String name) {
		this.name = name;
		edges = new LinkedList<Node>();
	}
	
	public void link(Node node) {
		edges.add(node);
	}
	
	public void visit() {
		this.isVisited = true;
	}
	
	public void initVisit() {
		this.isVisited = false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || this.getClass() != obj.getClass()) return false;
		
		Node node = (Node) obj;
		return Objects.equals(this.name, node.name);
	}

	@Override
	public String toString() {
		return name;
	}
}