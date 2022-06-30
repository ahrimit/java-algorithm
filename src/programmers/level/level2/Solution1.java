package programmers.level.level2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class Solution1 {
	@Test
	public void test() {
//		[1, 4, 2]	[5, 4, 4]	29
//		[1,2]	[3,4]	10
//		assertEquals(solution(new int[] {1,4,2}, new int[] {5,4,4}), 29);
		assertEquals(solution(new int[] {1,2}, new int[] {3,4}), 10);
	}
	
    public int solution(int []A, int []B)
    {
        int size = A.length;
        boolean[] bUsed = new boolean[size];
        Queue<Integer> pq = new PriorityQueue<Integer>();
        
        subMin(pq, A, B, bUsed, 0, 0);
         
        return pq.poll();
    }
    
    public void subMin(Queue<Integer> pq, int []A, int []B, boolean[] bUsed, int idx, int sum) {
        int size = A.length;
        if (idx >= size) {
            pq.offer(sum);
            return ;
        }
        
        for(int i = 0; i < size ; i++) {
            // 사용안한 것 중에 하나 선택하고 
            if(!bUsed[i]) {
            	boolean[] tmp = Arrays.copyOf(bUsed, size);
            	tmp[i] = true;
                subMin(pq, A, B, tmp, idx+1, sum + A[idx] * B[i]);
            }
        }
        
        return ;
    }
}