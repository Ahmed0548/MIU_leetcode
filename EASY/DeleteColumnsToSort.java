class Solution {
    public int minDeletionSize(String[] strs) {
        int deleteCount = 0;
        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    deleteCount++;
                    break;
                }
            }
        }
       return deleteCount; 
    }
}
