package datastructure.graph.impl;

import java.util.Arrays;

/**
 * adjacency maxtrix
 */

public class ArrayGraph extends MyGraph{

	private int[][] matrix;
	
	public ArrayGraph() {
		this(MAX_DEFAULT_SIZE);
	}
	
	public ArrayGraph(int size) {
		this.matrix = new int[size][size];
		this.size = size;
	}

	@Override
	public void putDirectedEdge(int x, int y) {
		validIndex(x);
		validIndex(y);
		
		matrix[x][y] = 1;
	}

	@Override
	public void putUndirectedEdge(int x, int y) {
		validIndex(x);
		validIndex(y);
		
		matrix[x][y] = 1;
		matrix[y][x] = 1;
	}

	@Override
	public void removeDirectedEdge(int x, int y) {
		validIndex(x);
		validIndex(y);
		
		matrix[x][y] = 0;
	}
	
	@Override
	public void removeUndirectedEdge(int x, int y) {
		validIndex(x);
		validIndex(y);
		
		matrix[x][y] = 0;
		matrix[y][x] = 0;
	}

	@Override
	public void print() {
		Arrays.stream(matrix).forEach(arr -> {
			Arrays.stream(arr).forEach(x -> {
				System.out.print(x + " ");
			});
			System.out.println();
		});		
	}
	
}
