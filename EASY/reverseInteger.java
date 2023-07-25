public class Solutions {
	public int reverseInteger(int number) {
        int sign = 1;
        if (number == 0) return 0;
        if (number < 0) {
            sign = -1;
            number = -number;
        }
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return sign * reverse;
    }
}
