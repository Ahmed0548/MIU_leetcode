class Solution {
    public int minCostToMoveChips(int[] position) {
        int costZero = 0;
        int costOne = 0;
        for(int i = 0; i < position.length; i++) {
            if(position[i] % 2 == 0) {
                costZero++;
            }else{
                costOne++;
            }
        }
        return Math.min(costZero, costOne);
    }
}
