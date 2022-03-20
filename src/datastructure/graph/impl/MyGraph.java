package datastructure.graph.impl;

abstract class MyGraph {
	protected static final int MAX_DEFAULT_SIZE = 10;
	protected int size = MAX_DEFAULT_SIZE;
	
    public abstract void putDirectedEdge(int x, int y);
	public abstract void putUndirectedEdge(int x, int y);
	public abstract void removeDirectedEdge(int x, int y);
	public abstract void removeUndirectedEdge(int x, int y);
	public abstract void print();
	
	protected void validIndex(int x) {
		if(size < 0 || x >= size) {
			throw new IndexOutOfBoundsException("OutOfBounds : " +  x);
		} 
	}

}
