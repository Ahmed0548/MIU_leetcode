class Solution {
	public int IsCentered(int[] nums) {
		if(nums.length == 0 || nums.length % 2 == 0) {
			return 0;
		}
		int midIndex = nums.length/2;
		int midItem = nums[midIndex];
		for(int i = 0; i < nums.length/2; i++) {
			if(i != midIndex && midItem >= nums[i]) {
				return 0;
			}
			return 1;
		}
	}
