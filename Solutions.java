// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the value of each fraction on a new line with 6 decimal places.
public static void plusMinus(List<Integer> arr) {
    double positive = 0, negative = 0, zero = 0, n = arr.size();
    for (int i = 0; i < n; i++) {
        int x = arr.get(i);
        if (x > 0) {
            positive++;
        } else if (x < 0) {
            negative++;
        } else {
            zero++;
        }
    }
    System.out.println(positive/n);
    System.out.println(negative/n);
    System.out.println(zero/n);
}

// Given an array of integers where all but one integer appears twice, find the unique integer.
public static int lonelyinteger(List<Integer> a) {
    Set<Integer> uniqueNumbers = new HashSet<Integer>(a);
    int uniqueSum = 0, doubledSum = 0, sum = 0;
    for (Integer number: uniqueNumbers) {
        uniqueSum += number;
    }
    doubledSum = uniqueSum * 2;
    for (int i = 0; i < a.size(); i++) {
        sum += a.get(i);
    }
    return doubledSum - sum;
}