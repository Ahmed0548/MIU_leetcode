class Solution {
    public int distinctAverages(int[] nums) {
        boolean[] sum = new boolean [201];
        int distinct = 0;
        Arrays.sort(nums);
        int right = nums.length -1;
        int left = 0;
        while(left < right) {
            if(!sum[nums[left] + nums[right]]) {
                distinct++;
            }
            sum[nums[left] + nums[right]] = true;
            left++;
            right--;
        }
        return distinct;
    }
}
