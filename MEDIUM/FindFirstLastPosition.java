/*
 * in firstPosition we check if nums[mid] >= target
 * in secondPosition we check if nums[mid] <= target
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = new int [2];
        result[0] = firstPosition(nums, target);
        result[1] = secondPosition(nums, target);
        return result;
    }
        public int firstPosition(int[]nums, int target) {
            int left = 0;
            int right = nums.length -1;
            int index = -1;
            while(left <= right) {
                int mid = left + (right - left) / 2;
                if(nums[mid] >= target) {
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
                if(nums[mid] == target) {
                    index = mid;
                }
            }
            return index;
        }

        public int secondPosition(int[]nums, int target) {
            int left = 0;
            int right = nums.length -1;
            int index = -1;
            while(left <= right) {
                int mid = left + (right - left) / 2;
                if(nums[mid] <= target) {
                    left = mid +1;
                }else{
                right = mid - 1;
            }
            if(nums[mid] == target) {
                index = mid;
            }
         }
            
        return index;
    }
}
