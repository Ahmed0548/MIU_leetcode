class Solution {
    public int nextPerfectSquare(int number) {
        public static boolean isPerfectSquare(int number) {
            int sqrt = int Math.sqrt(number);
            return sqrt * sqrt == number;
        }
        int i = (int)Math.sqrt(number) +  1;
        while(i * i <= Integer.MAX_VALUE && !isPerfectSquare(i*i)) {
            i++;
        }
        return i * i;
    }
}
