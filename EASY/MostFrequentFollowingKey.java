class Solution {
    public int mostFrequent(int[] nums, int key) {
        int maxTarget = 0;
        int number = 0;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == key) {
                int target = nums[i+1];
                int count = 0;
                for(int j = i; j < nums.length-1; j++) {
                    if(nums[j] == key && nums[j+1] == target) {
                        count++;
                    }
                    if(count > maxTarget) {
                        maxTarget = count;
                        number = target;
                    }
                }
            }
        }
        return number;
        
    }
}
