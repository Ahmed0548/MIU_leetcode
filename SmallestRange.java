class Solution {
    public int smallestRangeI(int[] nums, int k) {
       Arrays.sort(nums);
       return nums[0] + k >= nums[nums.length -1] -k ? 0 
       : (nums[nums.length -1] -k) - (nums[0] + k);
    }
}
