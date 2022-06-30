package programmers.kit.hash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class Solution3 {
	@Test
	public void testHash3_전화번호목록_개선() {
		String[][] clothes1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes2  = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		assertEquals(solution(clothes1), 5);
		assertEquals(solution(clothes2), 3);
	}
	

	private int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> clothMap = new HashMap<String, Integer>();
		
		for(String[] cloth: clothes) {
			String type = cloth[1];
			
			if(clothMap.containsKey(type)) {
				clothMap.put(type, clothMap.get(type) + 1);
			} else {
				clothMap.put(type, 1);
			}
		}

		Set<String> keySet = clothMap.keySet();
		for(String key : keySet) {
			int cnt = clothMap.get(key) + 1;
			answer = answer  * cnt;
		}
		
		return answer - 1;
	}

}
