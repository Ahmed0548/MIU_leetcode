class Solution {
    public boolean check(int[] nums) {
        int pointOfChange = 0;
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            if(nums[i] < nums[i-1]) {
                pointOfChange++;
            }
        }
        if(pointOfChange == 0) {
            return true;
        }
        if(pointOfChange == 1 && nums[0] >= nums[n-1]) {
            return true;
        }
        return false;
    }
}
