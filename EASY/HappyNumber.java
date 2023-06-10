class Solution {
    public boolean isHappy(int n) {
        if(n < 10) {
            if(n==1 || n==7) {
                return true;
            }else{
                return false;
            }
        }
        int digit = 0;
        int sum = 0;
        int square = 0;
        while(n > 0) {
            digit = n % 10;
            square = digit * digit;
            sum += square;
            n/= 10;
        }
        return isHappy(sum);
    }
}
