class Solution {
    public boolean findSubarrays(int[] nums) {
        for(int i = 1; i < nums.length-1; i++) {
            int sum = nums[i-1] + nums[i];
            for(int j = i; j < nums.length-1; j++) {
                if(nums[j] + nums[j+1] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
}
