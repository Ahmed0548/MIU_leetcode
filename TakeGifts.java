class Solution {
    public long pickGifts(int[] gifts, int k) {
        for(int i = 0; i < k; i++) {
            int maxIndex = 0;
            for(int j = 1; j < gifts.length; j++) {
                if(gifts[j] > gifts[maxIndex]) {
                    maxIndex = j;
                }
            }
             gifts[maxIndex] = (int)Math.floor(Math.sqrt(gifts[maxIndex]));
        }
        long sum = 0;
        for(int gift : gifts) {
            sum+= gift;
        }
        return sum;
    }
}
