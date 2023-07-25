class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int zeroCount = k;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroCount++;
            }else{
                if(zeroCount < k) {
                    return false;
                }
                zeroCount = 0;
            }
        }
        return true;
    }
}
