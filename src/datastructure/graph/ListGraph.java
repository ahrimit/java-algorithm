package datastructure.graph;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * adjacency list
 */
public class ListGraph extends MyGraph{
	ArrayList<ArrayList<Integer>> list;

	public ListGraph() {
		this(MAX_DEFAULT_SIZE);
	}


	public ListGraph(int size) {
		this.size = size;
		this.list = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0 ; i < size ; i++) {
			list.add(new ArrayList<Integer>());
		}
	}

	
	@Override
	public void putDirectedEdge(int x, int y) {
		addEdge(x, y);
	}


	@Override
	public void putUndirectedEdge(int x, int y) {
		addEdge(x, y);
		addEdge(y, x);
	}


	@Override
	public void removeDirectedEdge(int x, int y) {
		removeEdge(x, y);
	}


	@Override
	public void removeUndirectedEdge(int x, int y) {
		removeEdge(x, y);
		removeEdge(y, x);
	}


	@Override
	public void print() {
		int xInd = 0;
		for(ArrayList<Integer> xs : list) {
			System.out.print(xInd);

			if(xs.isEmpty() == false) {
				xs.forEach(x -> {
					System.out.print(" -> " + x);
				});
			}
	
			System.out.println();
			xInd++;
		}
	}
	
	private void addEdge(int x, int y) {
		validIndex(x);
		validIndex(y);
		
		if(list.get(x).contains(y) == false) {
			list.get(x).add(y);
		}
	}
	
	private void removeEdge(int x, int y) {
		validIndex(x);
		validIndex(y);
		int ind = list.get(x).indexOf(y);
		if(ind > -1) {
			list.get(x).remove(ind);
		}
		
		
		
	}
}
