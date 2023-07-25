class Solution {
    public static boolean isInertial(int[] arr) {
        int max = Integer.MIN_VALUE;
        boolean hasOdd = false;
        boolean hasEven = false;
        boolean result = true;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1) {
                hasOdd = true;
                if(arr[i] <= max && arr[i] != arr[arr.length -1]) {
                    result = false;
                }
            }else{
                hasEven = true;
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
            if(!hasOdd ||(!hasEven && arr[arr.length - 1] % 2 == 0)) {
                result = false;
            }
        }
        return result;
    }
}
