package datastucture.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 *  Heap 최댓값, 최솟값 구하기 
 */
public class HeapTest {
	
	public static void main(String[] args) {
		sortAsc();
		sortDesc();
	}
	
	private static void sortAsc() {
		Queue<Integer> heap = new PriorityQueue<Integer>();
		Random rand = new Random();
		for(int i = 0 ; i < 10; i++) {
			heap.offer(rand.nextInt(100));
		}
		
		System.out.println(heap);
		while(!heap.isEmpty()) {
			System.out.println(heap.poll());
		}
	}
	
	private static void sortDesc() {
		Queue<Integer> heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
		Random rand = new Random();
		for(int i = 0 ; i < 10; i++) {
			heap.offer(rand.nextInt(100));
		}
		
		System.out.println(heap);
		while(!heap.isEmpty()) {
			System.out.println(heap.poll());
		}
	}
}


