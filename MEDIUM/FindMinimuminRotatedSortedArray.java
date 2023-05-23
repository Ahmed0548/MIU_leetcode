/*
 * The loop evenually ends when the left and right pointers
 * converge to the same index
 */
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]) {
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}

