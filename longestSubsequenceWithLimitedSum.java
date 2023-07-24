class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] result = new int [queries.length];
        int count = 1;
        Arrays.sort(nums);
        for(int i = 0; i < queries.length; i++) {
            int queray = queries[i];
            count = 0;
            int sum = 0;
            for(int j = 0; j < nums.length; j++) {
                    sum += nums[j];
                    if(sum > queray) {
                    break;
                }
                count++;
            }
            result[i] = count; 
        }
        return result;
    }
}
