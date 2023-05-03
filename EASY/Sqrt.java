class Solution {
    public int mySqrt(int x) {
        
        long number = x;
        while(number * number > x) {
            number = (number + x/number)/2;
            
        }
        return (int)number;
    }
   
}
