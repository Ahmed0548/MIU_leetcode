class Solution {
    public int isBean(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean found = false;
            int n = arr[i];
            int n1 = 2*n;
            int n2 = 2*n + 1;
            int n3 = n/2;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == n1 || arr[j] == n2 || arr[j] == n3) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return 0;
            }
        }
        return 1;
    }
}
