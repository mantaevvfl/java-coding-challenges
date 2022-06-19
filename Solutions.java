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

// Given a square matrix, return the absolute difference between the sum of its diagonals.
public static int diagonalDifference(List<List<Integer>> arr) {
    int n = arr.size();
    int leftDiagonal = 0, rightDiagonal = 0;
    for (int i = 0; i < n; i++) {
        leftDiagonal += arr.get(i).get(i);
        rightDiagonal += arr.get(i).get(n-1-i);
    }
    return Math.abs(rightDiagonal - leftDiagonal);
}

// You are given a ist of integers. Create and return an array whose index range covers all the values in the input list. Each time a value occurs in the input list, increment the counter at that specific index in the new list.
public static List<Integer> countingSort(List<Integer> arr) {
    ArrayList<Integer> freqArray = new ArrayList<Integer>(Arrays.asList(new Integer[100]));
    Collections.fill(freqArray, 0);
    for (int value: arr) {
        freqArray.set(value, freqArray.get(value) + 1);
    }
    return freqArray;
}