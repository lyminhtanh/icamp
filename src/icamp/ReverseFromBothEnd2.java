package icamp;

import java.util.Arrays;

public class ReverseFromBothEnd2 {
  public static void main(String[] args) {
    int[] arr = new int[] {-4, -2, -1, 0, 3, 5};
    System.out.println(Arrays.toString(squareNonDecreasing(arr)));
  }

  private static int[] squareNonDecreasing(int[] arr) {
    int start = 0, end = arr.length - 1;
    int[] results = new int[arr.length];
    int resultIdx = results.length - 1;
    while (start < end) {
      if (Math.abs(arr[start]) > Math.abs(arr[end])) {
        results[resultIdx] = square(arr[start]);
        resultIdx--;
        results[resultIdx] = square(arr[end]);
        resultIdx--;
      } else {
        results[resultIdx] = square(arr[end]);
        resultIdx--;
        results[resultIdx] = square(arr[start]);
        resultIdx--;
      }
      end--;
      start++;
    }
    return results;
  }

  private static int square(int i) {
    // TODO Auto-generated method stub
    return i * i;
  }
}
