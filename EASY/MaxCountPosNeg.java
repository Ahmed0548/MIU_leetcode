class Solution {
    public int maximumCount(int[] nums) {
        int posNum = 0;
        int negNum = 0;
        for(int num: nums) {
            if(num > 0) {
                posNum++;
            }else if(num < 0) {
                negNum++;
            }
        }
        return posNum > negNum ? posNum : negNum;
    }
}
