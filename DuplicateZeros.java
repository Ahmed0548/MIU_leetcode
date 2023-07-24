class Solution {
    public void duplicateZeros(int[] arr) {
        int indexAfterZero = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                indexAfterZero = i+1;
                for(int k = arr.length -1; k != indexAfterZero; k--) {
                    arr[k] = arr[k-1];
                }
                arr[indexAfterZero] = 0;
                i = indexAfterZero;
            }
        }
    }
}
