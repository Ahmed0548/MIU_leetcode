public static int[] commonElements(int[] arr1, int[] arr2) {
    int[] result = new int[Math.min(arr1.length, arr2.length)];
    int count = 0;
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j]) {
                boolean alreadyAdded = false;
                for (int k = 0; k < count; k++) {
                    if (result[k] == arr1[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    result[count++] = arr1[i];
                }
                break;
            }
        }
    }
    return Arrays.copyOf(result, count);
} 
