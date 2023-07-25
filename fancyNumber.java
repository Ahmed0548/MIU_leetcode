class Solution {
    public double isFancy(int n) {
        int first = 1;
        int second = 1;
        int third = 1;
        while(third < n) {
            third = 3*second + 2*first;
            if(third == n) {
                return 1;
            }
            first = second;
            second = third;
        }
        return 0;
    }
}
