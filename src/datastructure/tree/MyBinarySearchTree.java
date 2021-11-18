package datastructure.tree;

public class MyBinarySearchTree {
	
	private Node root;
	
	public class Node {
		Node right;
		Node left;
		int data;
		
		public Node(int data) {
			this.right = null;
			this.left = null;
			this.data = data;
		}
		
	}
	
	public MyBinarySearchTree() {
		this.root = null;
	}

	public void addNode(int data) {
		if(this.root == null) {
			Node newNode = new Node(data);
			this.root = newNode;
		} else {
			addNode(this.root, data);			
		}
	}

	private Node addNode(Node root, int data) {
		if(root == null) {
			root = new Node(data);
		} else {
			if(root.data > data) {
				root.left = addNode(root.left, data);
			} else {
				root.right = addNode(root.right, data);
			}
		}
		
		return root;
	}
	
	public void removeNode(int data) {
		if(this.root != null) {
			this.root = removeNode(this.root, data);
		}
	}
	
	private Node removeNode(Node root, int data) {
		if(root == null) {
			return null;
		}
		
		if(root.data > data) {
			root.left = removeNode(root.left, data);
		} else if(root.data < data) {
			root.right = removeNode(root.right, data);
		} else {
			
			if(root.left != null && root.right != null) {
				// 자식이 둘 다 있는 경우 오른쪽 서브트리의 최소값과 삭제할 값의 위치를 바꿔준 후 삭제한다.
				Node temp =	findMinData(root.right);
				removeNode(temp.data);
				root.data = temp.data;
				return root;
			} else if (root.left != null) {
				return root.left;
			} else if (root.right != null) {
				return root.right;
			} else {
				return null;
			}
			
		}
		
		return root;
		
	}
	
	private Node findMinData(Node root) {
		if(root.left == null) {
			return root;
		}
		
		Node current = root;
		while(true) {
			if(current.left == null) {
				return current;
			}
			
			current = current.left;
		}
		
	}
	
	//전위 순회 
	public void preorderTraversal() {
		preorderTraversal(this.root);
	}
	
	//전위 순회 
	public void preorderTraversal(Node node) {
		if(node != null) {
			System.out.println(node.data);
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}
	
	
	//중위 순회
	public void inorderTraversal() {
		inorderTraversal(this.root);
	}

	public void inorderTraversal(Node node) {
		if(node != null) {
			inorderTraversal(node.left);
			System.out.println(node.data);
			inorderTraversal(node.right);
		}			
	}
		
	//후위 순회
	public void postorderTraversal() {
		postorderTraversal(this.root);
	}

	private void postorderTraversal(Node node) {
		if(node != null) {
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.println(node.data);
		}
	}
	

	
	
}
