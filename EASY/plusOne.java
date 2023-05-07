class Solution {
    public int[] plusOne(int[] digits) {
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] == 9) {
            digits[i] = 0;
            return digits;
        }else{
        
            digits[i]++;
            return digits;
        }
    }
    // if we reach here, it means all digits are 9
    int[] newDigits = new int [n+1];
    newDigits[0] = 1;
    
    return newDigits;
        
    }
}
