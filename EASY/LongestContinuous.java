class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int length = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                count++;
                length = Math.max(length, count);
            }else{
                count = 1;
            }
        }
        return length;
    }
}

