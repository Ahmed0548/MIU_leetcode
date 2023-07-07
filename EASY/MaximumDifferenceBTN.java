class Solution {
    public int maximumDifference(int[] nums) {
        int minElement = nums[0];
        int maxDiff = -1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > minElement) {
                maxDiff = Math.max(maxDiff, (nums[i] - minElement));
            }else{
                minElement = nums[i];
            }
        }
        return maxDiff;
    }
}
