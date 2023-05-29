class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0;
        int sum = 0;
        int min = 0;
        for(int num :nums) {
            sum += num;
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }
        return max - min;
    }
}
