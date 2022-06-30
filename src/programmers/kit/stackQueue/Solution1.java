package programmers.kit.stackQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class Solution1 {

	@Test
	public void testStackQueue_기능개발() {
		int[] result1 = solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});		// [2, 1]
		assertEquals(result1.length , 2);
		assertEquals(result1[0] , 2);
		assertEquals(result1[1] , 1);
		
		int[] result2 = solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});		// [2, 1]
		assertEquals(result2.length , 3);
		assertEquals(result2[0] , 1);
	}
	
    public int[] solution(int[] progresses, int[] speeds) {
        // Queue
        List<Integer> answerList = new ArrayList<Integer>();
        Queue<Integer> deployQueue = new LinkedList<Integer>();
        int len = progresses.length;
        for(int i = 0; i < len ; i++) {
        	int days = (100 - progresses[i]) / speeds[i];
        	int offset = ((100 - progresses[i]) % speeds[i]) > 0 ? 1 : 0;
        	days = days + offset; 
        	
        	int queueInd = deployQueue.size();
        	deployQueue.offer(days);
        	deployQueue.peek();
        	int head = deployQueue.peek();
        	if(head < days) {
        		for(int j = 0; j < queueInd; j++) {
        			deployQueue.poll();
        		}
        		answerList.add(queueInd);
        	} 
        }
        
        if(deployQueue.size() > 0) {
        	answerList.add(deployQueue.size());
        }
        
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
