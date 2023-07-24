class Solution {
    public int arrangeCoins(int n) {
        if(n == 1) {
            return 1;
        }
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
            count++;
            n--;
            if(sum >= n) {
                return count;
            } 
        }
        return count; 
    }
}
