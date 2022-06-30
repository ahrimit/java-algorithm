package programmers.kit.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Solution1 {
	
	@Test
	public void test_가장큰수() {
		assertEquals(solution(new int[] {6, 10, 2}), "6210");
		assertEquals(solution(new int[] {0,0,0,0,0,0}), "0");
		assertEquals(solution(new int[] {3, 30, 34, 5, 9}), "9534330");
	}

	
    public String solution(int[] numbers) {
        String answer = "";
        List<String> numList = new LinkedList<String>();
        for(int n : numbers) {
            numList.add(Integer.toString(n));
        }
        
        numList.sort((n1,n2) -> (n2+n1).compareTo(n1+n2));
        
        for(String s : numList) {
            answer += s;
        }

        if(answer.charAt(0) == '0') return "0";
        else return answer;
    }
}
