package programmers.kit.hash;


import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;


public class Solution1 {

	@Test
	public void testHash1_완주하지못한선수() {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion =  {"stanko", "ana", "mislav"};
		
		assertTrue("mislav".equals(solution(participant, completion)));
	}
	
	private String solution(String[] participant, String[] completion) {
		
		String answer = "";
		
		HashMap<String, Integer> cMap = new HashMap<String, Integer>();
		for(String cKey : completion) {
			if(cMap.containsKey(cKey)) {
				cMap.put(cKey, cMap.get(cKey) + 1);
			} else {
				cMap.put(cKey, 1);
			}
		}
		
		for(String pKey : participant) {
			if(cMap.containsKey(pKey)) {
				int cnt = cMap.get(pKey);
				if(cMap.get(pKey) > 0) {
					cMap.put(pKey, --cnt);
				} else {
					answer = pKey;
					break;
				}
			} else {
				answer = pKey;
				break;
			}
		}

		return answer;
	}

}
