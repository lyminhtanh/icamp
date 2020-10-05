package icamp;

// Given an array of integers that can be both +ve and -ve, find the contiguous subarray
// with the largest sum.
// For example: [1,2,-1,2,-3,2,-5] -> first 4 elements have the largest sum. Return (0,3)
public class Kadane {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 8, -1, 2, -3, 2, -5};
    maxContiguousSum(arr);
  }

  private static void maxContiguousSum(int[] arr) {
    int maxTilHere = 0;
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      int sumTilHere = maxTilHere + arr[i];
      maxTilHere = arr[i] > sumTilHere ? arr[i] : sumTilHere;
      result = result > maxTilHere ? result : maxTilHere;
    }
    System.out.println(result);
  }
}
