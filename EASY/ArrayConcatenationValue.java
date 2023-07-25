class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long result = 0;
        int left = 0; 
        int right = nums.length-1;
        while(left <= right) {
            if(left == right) {
                result+= nums[left];
            }else{
                long shift = 1;
                int num = nums[right];
                while(num != 0) {
                    shift *= 10;
                    num /= 10;
                }
                result += shift * nums[left] + nums[right];
            }
            left++;
            right--;
        }
        return result;
    }
}
