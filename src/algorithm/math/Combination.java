package algorithm.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Combination {

	@Test
	public void combinationTest() {
		assertEquals(combination(3,2), 3);
		assertEquals(combination(4,2), 6);
	}
	
	// 조합 구하기
	private int combination(int n, int r) {
		if(r == 0 || n == r) {
			return 1;
		} else {
			return combination(n-1, r-1) +  combination(n-1, r);
		}
	}
	
	
}
