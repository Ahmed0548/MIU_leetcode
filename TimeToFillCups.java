class Solution {
    public int fillCups(int[] amount) {
       int count = 0;
       while(amount[0] > 0 || amount[1] > 0 || amount[2] > 0) {
          if(amount[0] >= amount[1] && amount[2] >= amount[1]) {
              amount[0]--;
              amount[2]--;
            }else if(amount[1] >= amount[0] && amount[2] >= amount[0]) {
                amount[1]--;
                amount[2]--;
            }else if(amount[0] >= amount[2] && amount[1] >= amount[2]) {
                amount[0]--;
                amount[1]--;
            } 
            count++;
       } 
       return count;
    }
}
