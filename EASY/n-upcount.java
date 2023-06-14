class solution {
    public static int nUpCount(int[] arr, int n) {
    int count = 0;
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
        sum += arr[i];
        if(sum > n && sum - arr[i] <= n) {
            count++;
            }
    }
    return count;
    }
}
