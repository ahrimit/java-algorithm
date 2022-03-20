package datastructure.graph.impl;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class MyGraphTest {
	
	@Rule
	public final TestName name = new TestName();
	
	@Before
	public void printMethodName() {
		System.out.println("##############" + name.getMethodName() + "###########");
	}
	
	@Test
	public void ArrayGraphTest() {
		MyGraph graph = new ArrayGraph(3);
		graph.putDirectedEdge(1, 2);
		graph.putUndirectedEdge(0, 2);
		graph.removeDirectedEdge(2, 0);
		graph.print();
	}
	
	@Test
	public void ListGraphTest() {
		MyGraph graph= new ListGraph(5);
		graph.putUndirectedEdge(0, 1);
		graph.putUndirectedEdge(3, 1);
		graph.putDirectedEdge(2, 4);
		graph.putDirectedEdge(0, 1);
		graph.removeDirectedEdge(1, 3);
		
		graph.print();
	}
	
}
