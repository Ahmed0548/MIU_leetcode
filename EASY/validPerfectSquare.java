# two approches
#
# first 

class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start <= end) {
            int mid = start + (end -start)/2;
            if(mid * mid == num) {
                return true;
            }else if(mid * mid < num) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}

#############

# second 

# perfect square is a sum of consective odd numbers


class Solution {
    public boolean isPerfectSquare(int num) {
       int i = 1;
     while (num > 0) {
         num -= i;
         i += 2;
     }
     return num == 0; 
    }
}
