class Solution {
    public int countSquares(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(isSquare(arr[i] + arr[j])) {
                    count++;
                }
            }
        }
        return count;
        
        public boolean isSquare(int n) {
            int sqrt = (int)Math.sqrt(n);
            return sqrt * sqrt == n;
        }
    }
}
