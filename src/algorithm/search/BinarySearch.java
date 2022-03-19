package algorithm.search;

public class BinarySearch {

	public static void main(String[] args) {
		int target = 9;
		int[] nums = {1,2,3,4,5,6,7,8,9};
		
		int index = search(target,nums);
		if(search(target,nums) > 0) {
			System.out.println("target index: " + index);
		} else {
			System.out.println("not Found!");
		}

	}
	
	private static int search(int target, int[] nums) {
		int start = 0;
		int end = nums.length;
		while(start < end) {
			int mid = (start + end) / 2;
			int curNum = nums[mid];
			if(curNum == target) {
				return mid;
			} else if (curNum < target) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		
		return -1;
	}

}
