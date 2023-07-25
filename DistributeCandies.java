class Solution {
    public int distributeCandies(int[] candyType) {
        int count = 1;
        int length = candyType.length/2;
        Arrays.sort(candyType);
        for(int i = 0; i < candyType.length-1; i++) {
            if(candyType[i] != candyType[i+1]) {
                count++;
            }
        }
        if(count > length) {
            return length;
        }
        return count;
    }
}
