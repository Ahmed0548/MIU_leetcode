public class sumEvenOdd {
	static int sumEvenOdd(int[] items) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0)
                sumEven += items[i];
            else
                sumOdd += items[i];
        }
        return sumOdd - sumEven;
    }
}
