class Solution {
   public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int closetSum = nums[0] + nums[1] + nums[2];
       for(int i = 0; i < nums.length -2; i++) {
           int left = i + 1;
           int right = nums.length -1;
           while(left < right) {
               int currentSum = nums[i] + nums[left] + nums[right];
               if(currentSum == target) {
                   return target;
               }else if(Math.abs(currentSum - target) <
                Math.abs(closetSum -target)) {
                   closetSum = currentSum;
                }
                if(currentSum < target) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closetSum;
    }
}
