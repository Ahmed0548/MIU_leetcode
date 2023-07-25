class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int [nums1.length];
        int index = 0;
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    index = j;
                }
                while(index < nums2.length) {
                    if(nums2[index] > nums1[i]) {
                        result[i] = nums2[index];
                        break;
                    }
                    index++;
                    result[i] = -1;
                }
            }
        }
        return result;
    }
}
