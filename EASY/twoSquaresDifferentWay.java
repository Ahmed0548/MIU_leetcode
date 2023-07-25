class Solution {
    public int answerOne(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(n == i * i + j * j) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
