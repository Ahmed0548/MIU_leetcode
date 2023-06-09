class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if(sum % 3 != 0) {
            return false;
        }
        int part = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            part += arr[i];
            if(part == sum / 3) {
                part = 0;
                count++;
            }
            if(count == 3) {
                return true;
            }
        }
        return false;
    }
}
