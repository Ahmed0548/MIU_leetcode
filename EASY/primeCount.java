class solutions {
    public static int primeCount(int start, int end) {
        int count = 0;
        for(int i = start; i < end; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
