/*
The function IsCentered accepts an integer array numsas input 
and returns integer as result;
# first 
if the array has an even length, it cannot be centered so the function 
returns 0;
####Otherwise####
# second 
The function iterates over all elements of the array using for loop
and checks if each elements (except the midlle one) is strictly greater
than the middle element.
if any elements fails this test the function immediately returns 0;
if all elements pass the test the function returns 1;

*/
class Solution {
	public int IsCentered(int[] nums) {
		if(nums.length == 0 || nums.length % 2 == 0) {
			return 0;
		}
		int midIndex = nums.length/2;
		int midItem = nums[midIndex];
		for(int i = 0; i < nums.length; i++) {
			if(i != midIndex && midItem >= nums[i]) {
				return 0;
			}
			return 1;
		}
	}
