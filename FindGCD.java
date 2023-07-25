class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length -1];
        while(large % small != 0) {
            int tmp = large;
            large = small;
            small = tmp % small;
        }
        return small;
        
    }
}
