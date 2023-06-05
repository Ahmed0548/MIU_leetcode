class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] result = new int [nums.length];
        int pivotIndex = 0; 
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot) {
                result[index] = nums[i];
                index++;
            }else if(nums[i] == pivot) {
                pivotIndex++;
            }
        }
        while(pivotIndex > 0) {
            result[index] = pivot;
            index++;
            pivotIndex--;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > pivot) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }
}

