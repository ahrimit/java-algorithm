package datastructure.tree;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class MyBinarySearchTreeTest {
	
	public static MyBinarySearchTree tree;

	@Rule
	public final TestName name = new TestName();
	
	@BeforeClass
	public static void init() {
		tree = new MyBinarySearchTree();
		tree.addNode(20);
		tree.addNode(12);
		tree.addNode(56);
		tree.addNode(3);
		tree.addNode(40);
		tree.addNode(72);

	}

	@Before
	public void printMethodName() {
		System.out.println("##############" + name.getMethodName() + "###########");
	}
	
	@Test
	public void removeNodeTest() {
		tree.removeNode(20);
		tree.preorderTraversal();
	}

	@Test
	public void preorderTraversalTest() {
		tree.preorderTraversal();
	}
	
	@Test
	public void inorderTraversalTest() {
		tree.inorderTraversal();
	}

	@Test
	public void postorderTraversalTest() {
		tree.postorderTraversal();
	}


	
}
