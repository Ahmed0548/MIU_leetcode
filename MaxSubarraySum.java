class Solution {
    public int maxAscendingSum(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                sum+= nums[i];
            }else{
               
                result = Math.max(result, sum);
                sum = nums[i]; 
            }
        }
        result = Math.max(result, sum);
        return result;
    }
}
