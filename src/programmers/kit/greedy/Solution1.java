package programmers.kit.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Solution1 {
	
	@Test
	public void test() {
		assertEquals(solution(5, new int[] {2,4}, new int[] {1,3,5}), 5);
		assertEquals(solution(5, new int[] {2,4}, new int[] {3}), 4);
		assertEquals(solution(5, new int[] {1, 2, 4}, new int[] {2,4,5}), 4);
		assertEquals(solution(5, new int[] {1, 2, 4}, new int[] {2,3,4,5}), 4);
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] remains = new int[n];
        Arrays.fill(remains, 1);
        
        for(int ind : reserve) {
            remains[ind - 1]++;
        }
        
        for(int ind : lost) {
            remains[ind - 1]-- ;
        }
        
         for(int ind = 0; ind < remains.length; ind++) {
             if(remains[ind] == 0) {
                 if(ind > 0 && remains[ind - 1] > 1) {
                     remains[ind - 1]--; 
                     remains[ind] += 1;
                 } else if (ind < (n-1) && remains[ind + 1] > 1) {
                     remains[ind + 1] -= 1;
                     remains[ind] += 1;
                 }
             }
         }
                        
        for(int r : remains) {
            if(r > 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
