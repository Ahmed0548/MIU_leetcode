class Solution {
    public int[] finalPrices(int[] prices) {
        int flag = 0;
        int [] answer = new int [prices.length];
        for(int i = 0; i <= prices.length -1; i++) {
                flag = 0;
            for(int j = i+1; j < prices.length; j++) {
                if(prices[i] >= prices[j]) {
                  answer[i] = prices[i] - prices[j];
                  flag = 1;
                  break;
                  
                }
            }
            if(flag != 1) {
                answer[i] = prices[i];
            }
            
        }
        return answer;
    }
}
