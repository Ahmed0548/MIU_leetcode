class Solution {
    public static boolean isInertial(int[] arr) {
        boolean hasOdd = false;
        boolean hasMaxEven = false;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                hasOdd = true;
                if(arr[i] >= max) {
                    max = arr[i];
                }else{
                    return false;
                }
            }else{
                if(arr[i] >= max) {
                    hasMaxEven = true;
                    max = arr[i];
                }
            }
        }
        return hasOdd && hasMaxEven;
    }
}
