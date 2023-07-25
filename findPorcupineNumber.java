class Solution {
    public int isPrime(int num) {
        if(num <= 0) {
            return 0;
        }
        for(int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public int findPorcupineNumber(int n) {
        int num = n + 1;
        while(true) {
            if(isPrime(num) == 1 && num % 10 == 9) {
                if(isPrime(num + 1) == 1 && (num + 1) % 10 == 9) {
                    return num;
                }
            }
        }
        num++;
    }
}
