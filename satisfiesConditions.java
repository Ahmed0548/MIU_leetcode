class Solution {
    public int checkArray(int[] arr) {
        int n = arr.length;
        if(n % 2 != 0) {
            return 0;
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n/2; i++) {
            sum1 += arr[i];
            sum2 += arr[i + n/2];
        }
        if(sum1 == sum2) {
            retrun 1;
        }else{
            return 0;
        }
    }
}
