package algorithm.search;

public class LinearSearch {
	public static void main(String[] args) {
		int target = 7;
		int[] nums = {1,2,3,4,5,6,7,8,9};
		
		int index = search(target,nums);
		if(search(target,nums) > 0) {
			System.out.println("target index: " + index);
		} else {
			System.out.println("not Found!");
		}

	}
	
	private static int search(int target, int[] nums) {
		int length = nums.length;
		for(int i = 0; i < length; i++) {
			int n = nums[i];
			if(target == n) {
				return i;
			}
		}
		
		return -1;
	}
}
