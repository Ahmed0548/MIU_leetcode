class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        for(int alice : aliceSizes) {
            sumA += alice;
        }
        for(int bob : bobSizes) {
            sumB += bob;
        }
        int dif  = (sumA - sumB) / 2;
        for(int i = 0; i < aliceSizes.length; i++) {
            for(int j = 0; j < bobSizes.length; j++) {
                if(aliceSizes[i] - bobSizes[j] == dif) {
                    return new int[] {aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return null;
    }
}
