package programmers.kit.dynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution2 {

	@Test
	public void test() {
		assertEquals(solution(new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}), 30);
	}
	
	public int solution(int[][] triangle) {
        int answer = 0;
        
     //   triangle[i]
     //       triangle[i+1][i] triangle[i+1][i+1]
        
        for(int i = triangle.length-1 ; i > 0; i--) {
            for(int j = 0 ; j < triangle[i].length-1; j++) {
                triangle[i-1][j] += Math.max(triangle[i][j], triangle[i][j+1]);
            }
        } 
        
        answer = triangle[0][0];
        
        return answer;
    }
}
