/*
 * The code implements the approach of two pointers
 * (i) keeps track of the index where a unique element should be placedin array
 * other pointer (j) loops througth the array to check for duplicates
 * if the element at index (j) not equal to element at index (i) it means
 * that it is a new unique element and it should be placed at index i + 1
 */
class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length == 0) {
	       return 0;
       }
       int i = 0;
       for (int j = 1; j < nums.length; j++){
           if (nums[j] != nums[i]){
               i++;
	       nums[i] = nums[j];
           }

       }
       return i + 1;
    }
}
