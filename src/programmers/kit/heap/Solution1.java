package programmers.kit.heap;

import static org.junit.Assert.assertEquals;

import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class Solution1 {
	
	@Test
	public void testHeap_더맵게() {
		assertEquals(solution(new int[]{1, 2, 3, 9, 10, 12}, 7), 2);
		assertEquals(solution(new int[]{1, 3, 10, 20}, 60), 3);
	}
	
	
    public int solution(int[] scoville, int K) {

    	Queue<Integer> scvq = new PriorityQueue<Integer>();
        
    	for(int n : scoville) {
    		scvq.offer(n);
    	}
    	
        int len = scvq.size() - 1;
        for(int i = 0; i < len; i++) {
        	if(scvq.peek() >= K) {
        		return i;
        	}
        	
        	int scv = scvq.poll() + scvq.poll() * 2;
        	scvq.offer(scv);
        }
        
    	if(scvq.peek() >= K) {
    		return len;
    	} else {
    		return -1;
    	}
        
    }
}
