package programmers.kit.stackQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class Solution2 {

	@Test
	public void testStackQueue_기능개발() {
		assertEquals(solution(new int[] {1, 1, 9, 1, 1, 1} , 0), 5);
		assertEquals(solution(new int[] {2, 1, 3, 2} , 2), 1);
		
	}
	
    public int solution(int[] priorities, int location) {
        Queue<Integer> indQueue = new LinkedList<Integer>();
         Queue<Integer> maxQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
         
         for(int i = 0; i < priorities.length ; i++) {
             indQueue.offer(i);
             maxQueue.offer(priorities[i]);
         }
         
         int answer = 0;
         while(!maxQueue.isEmpty()) {
             int max = maxQueue.peek();
             int ind = indQueue.poll();
             int peek = priorities[ind];
             
             if(peek == max) {
             	answer++;
                 maxQueue.poll();
                 if(ind == location) {
                     break;
                 }
             } else if(peek < max) {
                 indQueue.offer(ind);
             }   
             
         }
                   
         return answer;
     }
}
