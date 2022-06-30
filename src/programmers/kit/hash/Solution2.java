package programmers.kit.hash;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Solution2 {
	@Test
	public void testHash2_전화번호목록_개선() {
		String[] phoneBook = {"119", "97674223", "1195524421"};
		String[] phoneBook1 = {"123","456","789"};
		
		assertFalse(solution(phoneBook));
		assertTrue(solution(phoneBook1)) ;
	}
	
	private boolean solution(String[] phoneBook ) {
		boolean answer = true;
		Arrays.sort(phoneBook);
		int len = phoneBook.length;
		
		for(int i = 1 ; i < len ; i++ ) {
			if(phoneBook[i].startsWith(phoneBook[i-1])) {
				answer = false;
				break;
			}
			
		}
		
		return answer;
	}

}
