class Solution {
    public int isMadhavArray(int[] arr) {
        int n = (int)Math.sqrt(arr.length*2);
        if(n*(n+1)/2 != arr.length) return 0;
        int position = 1;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = 1; j <= i; j++) {
                sum += arr[position++];
            }
            if(sum != arr[0]) {
                return 0;
            }
        }
        return 1;
    }
}
