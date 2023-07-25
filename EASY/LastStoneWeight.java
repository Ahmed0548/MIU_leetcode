class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        while(n > 1) {
            Arrays.sort(stones);
            int result = stones[n-1] - stones[n-2];
            n--;
            stones[n-1] = result;
        }
        return stones[0];
    }
}
