class Solution {
    public double isMeera(int[] arr) {
        boolean containOne = false;
        boolean containNine = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                containOne = true;
            }else if(arr[i] == 9) {
                containNine = true;
            }
        }
        if(containOne && containNine) {
            return 1;
        }else{
            return 0;
        }
    }
}

