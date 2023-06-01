class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] ans = new int [nums.length];
        int posIndex = 0;
        int minusIndex = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans[posIndex] = nums[i];
                posIndex+= 2;
            }else{
                ans[minusIndex] = nums[i];
                minusIndex+= 2;
            }
        }
        return ans;
    }
}
