class Solution {
    public int mostFrequentEven(int[] nums) {
      int max = 0;
      int element = -1;
      int count = 0;
      Arrays.sort(nums);
      for(int i = 0; i < nums.length; i++) {
          if(i == 0 && nums[i] % 2 == 0) {
              count++;
            }else if(nums[i] % 2 == 0 && nums[i] != nums[i -1]) {
                count = 0;
                count++;
            }else if(nums[i] % 2 == 0 && nums[i] == nums[i -1]) {
                count++;
            }
            if(count > max) {
                max = count;
                element = nums[i];
            }
        }  
        return element;
    }
}
